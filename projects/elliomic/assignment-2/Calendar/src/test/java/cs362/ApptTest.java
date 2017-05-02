package cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
	private Appt testAppt;
	
	
	/**
	 * Test that the gets methods work as expected.
	 */
	@Test
	public void test01()  throws Throwable  {
		testAppt = new Appt(13,30,10,4,2017, "Birthday Party",
		                    "This is my birthday party.");
		
		// assertions
		assertTrue(testAppt.getValid());
		assertEquals(13, testAppt.getStartHour());
		assertEquals(30, testAppt.getStartMinute());
		assertEquals(10, testAppt.getStartDay());
		assertEquals(04, testAppt.getStartMonth());
		assertEquals(2017, testAppt.getStartYear());
		assertEquals("Birthday Party", testAppt.getTitle());
		assertEquals("This is my birthday party.", testAppt.getDescription());         		
	}
	
	
	/**
	 * Test that ensures the set methods work as expected.
	 */
	@Test
	public void test02()  throws Throwable  {
		testAppt = new Appt(13,30,10,4,2017, "Birthday Party",
		                    "This is my birthday party.");
		
		testAppt.setStartHour(14);
		testAppt.setStartMinute(31);
		testAppt.setStartDay(11);
		testAppt.setStartMonth(5);
		testAppt.setStartYear(1752);
		testAppt.setTitle("Surprise Birthday Party");
		testAppt.setDescription("This is not your birthday party.");
		
		assertTrue(testAppt.getValid());
		assertEquals(14, testAppt.getStartHour());
		assertEquals(31, testAppt.getStartMinute());
		assertEquals(11, testAppt.getStartDay());
		assertEquals(5, testAppt.getStartMonth());
		assertEquals(1752, testAppt.getStartYear());
		assertEquals("Surprise Birthday Party", testAppt.getTitle());
		assertEquals("This is not your birthday party.", testAppt.getDescription());
		testAppt.setTitle(null);
		testAppt.setDescription(null);
		assertEquals("", testAppt.getTitle());
		assertEquals("", testAppt.getDescription());
	}
	
	
	/**
	 * Test that ensures the isValid method works as expected.
	 */
	@Test
	public void test03()  throws Throwable  {
		testAppt = new Appt(13,30,10,4,2017, "Birthday Party",
		                    "This is my birthday party.");
		
		testAppt.setStartHour(-1);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartHour(24);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartHour(13);
		assertTrue(testAppt.getValid());
		testAppt.setStartMinute(-1);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartMinute(60);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartMinute(30);
		assertTrue(testAppt.getValid());
		testAppt.setStartDay(0);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartDay(32);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartDay(11);
		assertTrue(testAppt.getValid());
		testAppt.setStartMonth(0);
		assertFalse(testAppt.getValid());
		
		testAppt.setStartMonth(13);
		assertFalse(testAppt.getValid());
	}
	
	/**
	 * Test that ensures the toString method works as expected.
	 */
	@Test
	public void test04()  throws Throwable  {
		testAppt = new Appt(13,30,10,4,2017, "Birthday Party",
		                    "This is my birthday party.");
		
		assertEquals(
			"\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n",
			testAppt.toString());
		
		testAppt.setStartHour(-1);
		assertNull(testAppt.toString());
		
		testAppt.setStartHour(11);
		assertTrue(testAppt.getValid());
		assertEquals(
			"\t4/10/2017 at 11:30am ,Birthday Party, This is my birthday party.\n",
			testAppt.toString());
		
		testAppt.setStartHour(0);
		assertTrue(testAppt.getValid());		 
		assertEquals(
			"\t4/10/2017 at 12:30am ,Birthday Party, This is my birthday party.\n",
			testAppt.toString());
	}
	
}
