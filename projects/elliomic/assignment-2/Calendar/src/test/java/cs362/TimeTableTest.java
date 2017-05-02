package cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.*;

import static org.junit.Assert.*;

public class TimeTableTest {
	public static Appt validAppt = new Appt(13,30,20,4,2017, "Birthday Party",
	                                        "This is my birthday party.");
	public static Appt validAppt2 = new Appt(12,30,21,4,2017, "Birthday Party",
	                                         "This is my birthday party.");
	public static Appt invalidAppt = new Appt(-1,30,21,4,2017, "Birthday Party",
	                                         "This is my birthday party.");
	private LinkedList<Appt> appts;

	@Before
	public void setUp() throws Exception {
		appts = new LinkedList<Appt>();
		appts.add(validAppt);
		appts.add(validAppt2);
	}
	
	/**
	 * Tests that the getApptRange method works as expected.
	 */
	@Test
	public void test01()  throws Throwable  {
		TimeTable table = new TimeTable();
		appts.add(invalidAppt);
		
		try {
			table.getApptRange(appts, new GregorianCalendar(2017,4,21),
			                   new GregorianCalendar(2017,4,18));
			fail("Second date specified is not " +
			     "before the first date specified.");
		} catch (IllegalArgumentException e) {}

		LinkedList<CalDay> range = table.getApptRange(appts,
		                                              new GregorianCalendar(2017,4,18),
		                                              new GregorianCalendar(2017,4,22));
		assertEquals(4, range.size());
		assertEquals(validAppt, range.get(2).getAppts().get(0));
	}

	/**
	 * Tests that the deleteAppt method works as expected.
	 */
	@Test
	public void test02()  throws Throwable  {
		TimeTable table = new TimeTable();
		assertNull(table.deleteAppt(null, null));
		assertNull(table.deleteAppt(appts, null));
		assertNull(table.deleteAppt(appts, invalidAppt));
		assertEquals(1, table.deleteAppt(appts, validAppt).size());
		assertNull(table.deleteAppt(appts, validAppt));
	}
}
