/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;

/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */

public class UrlValidatorTest extends TestCase {

	private boolean printStatus = false;
	private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

	public UrlValidatorTest(String testName) {
		super(testName);
	}

	public void testManualValidTest()
		{
			UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

			assertTrue(urlValidator.isValid("http://foo.com/blah_blah"));
			assertTrue(urlValidator.isValid("http://foo.com/blah_blah/"));
			assertTrue(urlValidator.isValid("http://foo.com/blah_blah_(wikipedia)"));
			assertTrue(urlValidator.isValid("http://foo.com/blah_blah_(wikipedia)_(again)"));
			assertTrue(urlValidator.isValid("http://www.example.com/wpstyle/?p=364"));
			assertTrue(urlValidator.isValid("https://www.example.com/foo/?bar=baz&inga=42&quux"));
			assertTrue(urlValidator.isValid("http://✪df.ws/123"));
			assertTrue(urlValidator.isValid("http://userid:password@example.com:8080"));
			assertTrue(urlValidator.isValid("http://userid:password@example.com:8080/"));
			assertTrue(urlValidator.isValid("http://userid@example.com"));
			assertTrue(urlValidator.isValid("http://userid@example.com/"));
			assertTrue(urlValidator.isValid("http://userid@example.com:8080"));
			assertTrue(urlValidator.isValid("http://userid@example.com:8080/"));
			assertTrue(urlValidator.isValid("http://userid:password@example.com"));
			assertTrue(urlValidator.isValid("http://userid:password@example.com/"));
			assertTrue(urlValidator.isValid("http://142.42.1.1/"));
			assertTrue(urlValidator.isValid("http://142.42.1.1:8080/"));
			assertTrue(urlValidator.isValid("http://➡.ws/䨹"));
			assertTrue(urlValidator.isValid("http://⌘.ws"));
			assertTrue(urlValidator.isValid("http://⌘.ws/"));
			assertTrue(urlValidator.isValid("http://foo.com/blah_(wikipedia)#cite-1"));
			assertTrue(urlValidator.isValid("http://foo.com/blah_(wikipedia)_blah#cite-1"));
			assertTrue(urlValidator.isValid("http://foo.com/unicode_(✪)_in_parens"));
			assertTrue(urlValidator.isValid("http://foo.com/(something)?after=parens"));
			assertTrue(urlValidator.isValid("http://☺.damowmow.com/"));
			assertTrue(urlValidator.isValid("http://code.google.com/events/#&product=browser"));
			assertTrue(urlValidator.isValid("http://j.mp"));
			assertTrue(urlValidator.isValid("ftp://foo.bar/baz"));
			assertTrue(urlValidator.isValid("http://foo.bar/?q=Test%20URL-encoded%20stuff"));
			assertTrue(urlValidator.isValid("http://مثال.إختبار"));
			assertTrue(urlValidator.isValid("http://例子.测试"));
			assertTrue(urlValidator.isValid("http://उदाहरण.परीक्षा"));
			assertTrue(urlValidator.isValid("http://-.~_!$&'()*+,;=:%40:80%2f::::::@example.com"));
			assertTrue(urlValidator.isValid("http://1337.net"));
			assertTrue(urlValidator.isValid("http://a.b-c.de"));
			assertTrue(urlValidator.isValid("http://223.255.255.254"));
			assertTrue(urlValidator.isValid("http://223.255.255.254:65535"));
		}

	public void testManualInvalidTest()
		{
			UrlValidator urlValidator = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);

			assertFalse(urlValidator.isValid("http://"));
			assertFalse(urlValidator.isValid("http://."));
			assertFalse(urlValidator.isValid("http://.."));
			assertFalse(urlValidator.isValid("http://../"));
			assertFalse(urlValidator.isValid("http://?"));
			assertFalse(urlValidator.isValid("http://??"));
			assertFalse(urlValidator.isValid("http://??/"));
			assertFalse(urlValidator.isValid("http://#"));
			assertFalse(urlValidator.isValid("http://##"));
			assertFalse(urlValidator.isValid("http://##/"));
			assertFalse(urlValidator.isValid("http://foo.bar?q=Spaces should be encoded"));
			assertFalse(urlValidator.isValid("//"));
			assertFalse(urlValidator.isValid("//a"));
			assertFalse(urlValidator.isValid("///a"));
			assertFalse(urlValidator.isValid("///"));
			assertFalse(urlValidator.isValid("http:///a"));
			assertFalse(urlValidator.isValid("foo.com"));
			assertFalse(urlValidator.isValid("rdar://1234"));
			assertFalse(urlValidator.isValid("h://test"));
			assertFalse(urlValidator.isValid("http:// shouldfail.com"));
			assertFalse(urlValidator.isValid(":// should fail"));
			assertFalse(urlValidator.isValid("http://foo.bar/foo(bar)baz quux"));
			assertFalse(urlValidator.isValid("ftps://foo.bar/"));
			assertFalse(urlValidator.isValid("http://-error-.invalid/"));
			assertFalse(urlValidator.isValid("http://a.b--c.de/"));
			assertFalse(urlValidator.isValid("http://-a.b.co"));
			assertFalse(urlValidator.isValid("http://a.b-.co"));
			assertFalse(urlValidator.isValid("http://3628126748"));
			assertFalse(urlValidator.isValid("http://.www.foo.bar/"));
			assertFalse(urlValidator.isValid("http://www.foo.bar./"));
			assertFalse(urlValidator.isValid("http://.www.foo.bar./"));
			assertFalse(urlValidator.isValid("http://255.256.256.256"));
			assertFalse(urlValidator.isValid("http://254.255.252.253:65536"));
		}

	public void testPartitionNoFragmentsTest() {
		String[] schemes = {"http","https"};
		UrlValidator urlValidator = new UrlValidator(schemes, UrlValidator.NO_FRAGMENTS);
		//UrlValidator urlValidator = new UrlValidator(schemes, UrlValidator.ALLOW_ALL_SCHEMES);
		assertTrue(urlValidator.isValid("http://www.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.logoworks.comwww.org"));
	}

	public void testPartitionCustomSchemesTest() {
		String[] schemes = {"http","https"};
		UrlValidator urlValidator = new UrlValidator(schemes);
		assertTrue(urlValidator.isValid("http://tech.yahoo.com/rc/desktops/102;_ylt=Ao8yevQHlZ4On0O3ZJGXLEQFLZA5"));
	}

	public void testPartitionTwoSlashesTest() {
		UrlValidator validator = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
		assertTrue("parentheses should be valid in URLs",
		           validator.isValid("http://somewhere.com/pathxyz/file(1).html"));
	}

	public void testPartitionAllowLocalUrls1() {
		RegexValidator regex = new RegexValidator(new String[] {"localhost", ".*\\.my-testing"});
		UrlValidator validator = new UrlValidator(regex, 0);

		assertTrue("localhost URL should validate",
		           validator.isValid("http://localhost/test/index.html"));
		assertTrue("first.my-testing should validate",
		           validator.isValid("http://first.my-testing/test/index.html"));
		assertTrue("sup3r.my-testing should validate",
		           validator.isValid("http://sup3r.my-testing/test/index.html"));

		assertFalse("broke.my-test should not validate",
		            validator.isValid("http://broke.my-test/test/index.html"));

		assertTrue("www.apache.org should still validate",
		           validator.isValid("http://www.apache.org/test/index.html"));

		// Now check using options
		validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);

		assertTrue("localhost URL should validate",
		           validator.isValid("http://localhost/test/index.html"));

		assertTrue("machinename URL should validate",
		           validator.isValid("http://machinename/test/index.html"));

		assertTrue("www.apache.org should still validate",
		           validator.isValid("http://www.apache.org/test/index.html"));
	}

	public void testPartitionAllowLocalUrls2() {
		UrlValidator validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);

		assertTrue("hostname should validate",
		           validator.isValid("http://hostname"));

		assertTrue("hostname with path should validate",
		           validator.isValid("http://hostname/test/index.html"));

		assertTrue("localhost URL should validate",
		           validator.isValid("http://localhost/test/index.html"));

		assertFalse("first.my-testing should not validate",
		            validator.isValid("http://first.my-testing/test/index.html"));


		assertTrue("www.apache.org should still validate",
		           validator.isValid("http://www.apache.org/test/index.html"));

		// Turn it off, and check
		validator = new UrlValidator(0);

		assertFalse("hostname should no longer validate",
		            validator.isValid("http://hostname"));

		assertFalse("localhost URL should no longer validate",
		            validator.isValid("http://localhost/test/index.html"));

		assertTrue("www.apache.org should still validate",
		           validator.isValid("http://www.apache.org/test/index.html"));
	}

	public void testPartitionAllowLocalUrls3() {
		// file:// isn't allowed by default
		UrlValidator validator = new UrlValidator();

		assertTrue("http://apache.org/ should be allowed by default",
		           validator.isValid("http://www.apache.org/test/index.html"));

		assertFalse("file:///c:/ shouldn't be allowed by default",
		            validator.isValid("file:///C:/some.file"));

		assertFalse("file:///c:\\ shouldn't be allowed by default",
		            validator.isValid("file:///C:\\some.file"));

		assertFalse("file:///etc/ shouldn't be allowed by default",
		            validator.isValid("file:///etc/hosts"));

		assertFalse("file://localhost/etc/ shouldn't be allowed by default",
		            validator.isValid("file://localhost/etc/hosts"));

		assertFalse("file://localhost/c:/ shouldn't be allowed by default",
		            validator.isValid("file://localhost/c:/some.file"));

		// Turn it on, and check
		// Note - we need to enable local urls when working with file:
		validator = new UrlValidator(new String[] {"http","file"}, UrlValidator.ALLOW_LOCAL_URLS);

		assertTrue("http://apache.org/ should be allowed by default",
		           validator.isValid("http://www.apache.org/test/index.html"));

		assertTrue("file:///c:/ should now be allowed",
		           validator.isValid("file:///C:/some.file"));

		// Currently, we don't support the c:\ form
		assertFalse("file:///c:\\ shouldn't be allowed",
		            validator.isValid("file:///C:\\some.file"));

		assertTrue("file:///etc/ should now be allowed",
		           validator.isValid("file:///etc/hosts"));

		assertTrue("file://localhost/etc/ should now be allowed",
		           validator.isValid("file://localhost/etc/hosts"));

		assertTrue("file://localhost/c:/ should now be allowed",
		           validator.isValid("file://localhost/c:/some.file"));

		// These are never valid
		assertFalse("file://c:/ shouldn't ever be allowed, needs file:///c:/",
		            validator.isValid("file://C:/some.file"));

		assertFalse("file://c:\\ shouldn't ever be allowed, needs file:///c:/",
		            validator.isValid("file://C:\\some.file"));
	}

	public void testPartitionKnownBugs1(){
		//http://www.google.com:80/test1?action=view true
		UrlValidator validator = new UrlValidator();
		assertTrue(validator.isValid("http://www.google.com:81/test1?action=view"));
	}

	public void testPartitionKnownBugs2(){
		//http://www.google.com:80/test1?action=view true
		UrlValidator validator = new UrlValidator();
		assertTrue(validator.isValid("http://0.0.0.0:80/test1?action=view"));
	}

	public void testIsValid() {
		UrlValidator validator = new UrlValidator();
		assertFalse(validator.isValid(null));
		assertFalse(validator.isValid("\u001B[0m"));
		assertFalse(validator.isValid("4ttp://"));
		assertFalse(validator.isValid("http:"));
		assertFalse(validator.isValid("http:/"));
		assertFalse(validator.isValid("://"));
		assertFalse(validator.isValid("http:///?#a"));
		assertFalse(validator.isValid("-1.-1.-1.-1"));
		assertFalse(validator.isValid("256.256.256.256"));
		assertFalse(validator.isValid("1.2.3.4."));
		assertFalse(validator.isValid(".1.2.3.4"));
		assertFalse(validator.isValid("1.2.3.4.5"));
		assertFalse(validator.isValid("test.a"));
		assertFalse(validator.isValid("test.1"));
		assertFalse(validator.isValid("test.a1a"));
		assertFalse(validator.isValid("test."));
		assertFalse(validator.isValid(".test"));
		assertFalse(validator.isValid("test.com:-1"));
		assertFalse(validator.isValid("test.com:a"));
		assertFalse(validator.isValid("http://a?#a"));
	}

	/**
	 * Create set of tests by taking the testUrlXXX arrays and
	 * running through all possible permutations of their combinations.
	 *
	 * @param testObjects Used to create a url.
	 */


}
