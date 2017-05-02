package cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {
	public static Appt validAppt = new Appt(13,30,10,4,2017, "Birthday Party",
	                                        "This is my birthday party.");
	public static Appt validAppt2 = new Appt(12,30,10,4,2017, "Birthday Party",
	                                         "This is my birthday party.");
	public static Appt invalidAppt = new Appt(-1,30,10,4,2017, "Birthday Party",
	                                         "This is my birthday party.");

	
	/**
	 * Tests that the CalDay constructors work as expected.
	 */
	@Test
	public void test01()  throws Throwable  {
		CalDay cal = new CalDay();
		assertFalse(cal.isValid());

		cal = new CalDay(new GregorianCalendar());
		assertTrue(cal.isValid());
	}

	/**
	 * Tests that the addAppt method works as expected.
	 * Tests that the getSizeAppts method works as expected.
	 */
	@Test
	public void test02()  throws Throwable  {
		CalDay cal = new CalDay(new GregorianCalendar());

		cal.addAppt(validAppt);
		cal.addAppt(validAppt2);
		cal.addAppt(invalidAppt);

		assertEquals(2, cal.getSizeAppts());
		assertEquals(2, cal.getAppts().size());
	}

	/**
	 * Tests that the isValid method works as expected.
	 */
	@Test
	public void test03()  throws Throwable  {
		CalDay cal = new CalDay();
		assertEquals(cal.valid, cal.isValid());
	}

	/**
	 * Tests that the CalDay iterator constructor works as expected.
	 */
	@Test
	public void test04()  throws Throwable  {
		CalDay cal = new CalDay();
		Iterator<?> iter = cal.iterator();
		assertNull(iter);

		cal = new CalDay(new GregorianCalendar());
		iter = cal.iterator();
		assertNotNull(iter);
	}

	/**
	 * Tests that the CalDay gets methods work as expected.
	 */
	@Test
	public void test05()  throws Throwable  {
		CalDay cal = new CalDay(new GregorianCalendar(2017, 4, 10));

		assertEquals(10, cal.getDay());
		assertEquals(4, cal.getMonth());
		assertEquals(2017, cal.getYear());
	}

	/**
	 * Tests that the toString method works as expected.
	 */
	@Test
	public void test06()  throws Throwable  {
		CalDay cal = new CalDay(new GregorianCalendar(2017, 4, 10));

		cal.addAppt(validAppt);
		cal.addAppt(validAppt2);

		assertEquals("\t --- 4/10/2017 --- \n --- -------- Appointments ------------ --- \n"
		             + validAppt2.toString() + " " + validAppt.toString() + " \n",
		             cal.toString());

		cal = new CalDay();
		assertEquals("", cal.toString());
	}
}
