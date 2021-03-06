import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        cs362.CalendarMain calendarMain0 = new cs362.CalendarMain();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.GregorianCalendar gregorianCalendar0 = null;
        try {
            cs362.CalDay calDay1 = new cs362.CalDay(gregorianCalendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartYear((int) (short) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMinute((int) (byte) 100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMinute((-1));
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        appt7.setStartHour(100);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartHour(0);
        java.lang.String str19 = appt10.getDescription();
        appt10.setDescription("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        java.lang.String str17 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt4 = null;
        try {
            calDay0.addAppt(appt4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.lang.String str22 = calDay0.toString();
        cs362.Appt appt30 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt30.setStartHour(1);
        int i33 = appt30.getStartYear();
        java.lang.String str34 = appt30.toString();
        int i35 = appt30.getStartHour();
        calDay0.addAppt(appt30);
        java.util.LinkedList<cs362.Appt> linkedlist_appt37 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertNull(linkedlist_appt37);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartMinute();
        int i17 = appt7.getStartYear();
        java.lang.String str18 = appt7.getDescription();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        java.lang.String str18 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, (int) (short) 10, (int) (short) 10, (int) (byte) 1, 1, "", "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        java.lang.String str15 = appt7.getTitle();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        java.lang.String str8 = appt7.getTitle();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setDescription("hi!");
        int i19 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartMinute();
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartDay((-1));
        int i20 = appt7.getStartYear();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.getDescription();
        java.lang.String str16 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str17 = appt7.getTitle();
        appt7.setStartHour((int) (byte) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        boolean b10 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        int i15 = appt7.getStartMonth();
        appt7.setStartHour((int) '4');
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartMonth();
        appt7.setStartMinute(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        boolean b23 = calDay0.isValid();
        java.lang.String str24 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartYear((int) (short) 100);
        boolean b19 = appt11.getValid();
        appt11.setStartMinute((int) 'a');
        calDay0.addAppt(appt11);
        boolean b23 = appt11.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        int i22 = appt12.getStartDay();
        java.lang.String str23 = appt12.getDescription();
        java.lang.String str24 = appt12.getDescription();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (byte) 10, 0, (int) (short) 0, (int) (short) 0, "", "hi!");
        int i8 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartYear(0);
        appt11.setTitle("");
        appt11.setStartMonth(97);
        appt11.setStartMonth((int) '4');
        calDay0.addAppt(appt11);
        appt11.setStartYear((int) (byte) -1);
        java.lang.String str27 = appt11.getDescription();
        appt11.setStartHour((int) (short) -1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        appt7.setStartDay((int) (short) 100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) -1, 10, (int) (short) 0, (int) (short) 0, 52, "hi!", "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartMonth();
        appt7.setStartMinute((-1));
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        int i20 = appt7.getStartDay();
        java.lang.String str21 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i20 == 52);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 52);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        boolean b3 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartYear((int) (byte) -1);
        appt7.setDescription("hi!");
        java.lang.String str20 = appt7.getTitle();
        int i21 = appt7.getStartMonth();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt1 = null;
        java.util.GregorianCalendar gregorianCalendar2 = null;
        java.util.GregorianCalendar gregorianCalendar3 = null;
        try {
            java.util.LinkedList<cs362.CalDay> linkedlist_calDay4 = timeTable0.getApptRange(linkedlist_appt1, gregorianCalendar2, gregorianCalendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 10, (int) (byte) 0, (int) (byte) 1, (int) 'a', "", "");
        appt7.setStartMonth((int) (short) 100);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        appt14.setStartYear((int) 'a');
        appt14.setDescription("");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 1, (int) 'a', (int) (byte) 0, 0, "hi!", "hi!");
        int i8 = appt7.getStartDay();
        java.lang.String str9 = appt7.getDescription();
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        appt7.setStartMinute((int) (byte) 100);
        int i15 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        appt7.setStartMinute(0);
        appt7.setStartDay((int) (short) 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartYear((int) (short) 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getYear();
        int i6 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        appt11.setStartMinute((int) (short) -1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setTitle("hi!");
        java.lang.String str21 = appt7.toString();
        java.lang.String str22 = appt7.getTitle();
        int i23 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue(i23 == 52);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        cs362.Appt appt7 = new cs362.Appt(52, (-1), 10, (int) 'a', (int) (short) 10, "hi!", "");
        appt7.setTitle("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setDescription("");
        appt7.setStartMinute((int) '#');
        appt7.setStartYear(100);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        cs362.Appt appt46 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt46.setStartHour(1);
        appt46.setStartMinute((int) (byte) 10);
        appt46.setStartYear(0);
        appt46.setTitle("hi!");
        appt46.setDescription("");
        calDay0.addAppt(appt46);
        appt46.setStartHour((int) (byte) 100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        java.lang.String str13 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        int i36 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt37 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt38 = calDay0.getAppts();
        int i39 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(linkedlist_appt37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        int i4 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.lang.String str22 = calDay0.toString();
        cs362.Appt appt30 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt30.setStartHour(1);
        int i33 = appt30.getStartYear();
        java.lang.String str34 = appt30.toString();
        int i35 = appt30.getStartHour();
        calDay0.addAppt(appt30);
        java.lang.String str37 = appt30.getTitle();
        appt30.setStartDay((int) '4');
        appt30.setStartMinute((int) (short) 100);
        boolean b42 = appt30.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        appt7.setStartMonth(97);
        int i10 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        java.util.LinkedList<cs362.Appt> linkedlist_appt21 = calDay0.getAppts();
        java.lang.String str22 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        cs362.Appt appt7 = new cs362.Appt(10, (int) (short) 100, 10, (int) 'a', 0, "", "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) 10, 0, (-1), (int) (byte) -1, "hi!", "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        appt10.setStartHour((int) (short) 10);
        boolean b23 = appt10.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        appt7.setStartMinute(1);
        int i17 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        int i22 = appt12.getStartDay();
        int i23 = appt12.getStartHour();
        int i24 = appt12.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getYear();
        int i9 = calDay0.getYear();
        int i10 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        java.lang.String str17 = appt7.getDescription();
        java.lang.String str18 = appt7.getTitle();
        java.lang.String str19 = appt7.toString();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, 52, (-1), (int) (byte) 0, (int) (byte) 10, "", "hi!");
        appt7.setStartMonth((int) ' ');
        int i10 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) (short) 100);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartMonth((int) (short) 10);
        appt10.setStartDay(0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        appt7.setStartMinute((int) (short) 0);
        appt7.setStartYear((int) (byte) 10);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt1 = null;
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMonth((int) (short) -1);
        int i14 = appt9.getStartMonth();
        int i15 = appt9.getStartYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt16 = timeTable0.deleteAppt(linkedlist_appt1, appt9);
        java.util.LinkedList<cs362.Appt> linkedlist_appt17 = null;
        java.util.GregorianCalendar gregorianCalendar18 = null;
        java.util.GregorianCalendar gregorianCalendar19 = null;
        try {
            java.util.LinkedList<cs362.CalDay> linkedlist_calDay20 = timeTable0.getApptRange(linkedlist_appt17, gregorianCalendar18, gregorianCalendar19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertNull(linkedlist_appt16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        int i36 = calDay0.getYear();
        int i37 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        cs362.CalDay calDay39 = new cs362.CalDay();
        int i40 = calDay39.getYear();
        int i41 = calDay39.getYear();
        java.util.Iterator<?> iterator_wildcard42 = calDay39.iterator();
        boolean b43 = calDay39.isValid();
        java.lang.String str44 = calDay39.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt45 = calDay39.getAppts();
        cs362.Appt appt53 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt53.setStartHour(1);
        int i56 = appt53.getStartYear();
        boolean b57 = appt53.getValid();
        java.lang.String str58 = appt53.toString();
        calDay39.addAppt(appt53);
        appt53.setDescription("");
        calDay0.addAppt(appt53);
        java.lang.String str63 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(iterator_wildcard42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt45);
        org.junit.Assert.assertTrue(i56 == 97);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setTitle("");
        appt7.setStartYear(1);
        int i21 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) (short) 100);
        java.lang.String str16 = appt7.getDescription();
        appt7.setStartYear((int) '#');
        appt7.setStartMinute((int) (byte) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartMinute((int) 'a');
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartDay((int) (short) 0);
        int i22 = appt7.getStartYear();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i22 == 97);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartHour((-1));
        boolean b17 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) -1, (int) (short) 10, 100, (int) ' ', 10, "hi!", "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str14 = appt7.toString();
        java.lang.String str15 = appt7.getTitle();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        java.lang.String str14 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        int i20 = appt11.getStartMinute();
        boolean b21 = appt11.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        int i17 = appt7.getStartMonth();
        appt7.setStartDay(97);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getDay();
        int i6 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((-1));
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartDay();
        java.lang.String str18 = appt7.toString();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour((int) (byte) 10);
        appt7.setStartHour((int) (short) 1);
        int i12 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        boolean b20 = calDay0.isValid();
        boolean b21 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        java.lang.String str23 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        appt7.setStartYear(1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartDay();
        int i11 = appt7.getStartYear();
        java.lang.String str12 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i11 == 97);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartHour((int) 'a');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMinute((int) (byte) 10);
        appt9.setStartYear(0);
        appt9.setDescription("hi!");
        int i18 = appt9.getStartMonth();
        int i19 = appt9.getStartMonth();
        calDay0.addAppt(appt9);
        int i21 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str14 = appt7.toString();
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartDay(10);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 10);
        appt7.setStartMonth((int) (byte) 10);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 10, (int) ' ', 10, (int) (byte) 10, (int) (short) -1, "hi!", "");
        appt7.setStartMinute(1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartYear((int) (byte) -1);
        appt7.setDescription("hi!");
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, (int) 'a', (int) (byte) 1, (int) 'a', (int) (short) 10, "hi!", "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartMinute((int) 'a');
        appt7.setStartMinute(1);
        boolean b20 = appt7.getValid();
        int i21 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        cs362.Appt appt7 = new cs362.Appt(10, (int) 'a', 52, (int) 'a', (int) ' ', "hi!", "");
        appt7.setStartHour(35);
        appt7.setStartMinute((int) (short) 10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (int) (byte) 0, (int) (short) -1, (int) '4', "", "hi!");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        java.lang.String str16 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        boolean b17 = appt7.getValid();
        appt7.setStartDay((int) (byte) 1);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartYear();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 10);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        appt7.setStartHour((int) (short) 1);
        boolean b17 = appt7.getValid();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        int i4 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        int i14 = appt7.getStartMinute();
        appt7.setStartYear(35);
        org.junit.Assert.assertTrue(i14 == 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartHour();
        appt7.setStartHour((int) 'a');
        int i13 = appt7.getStartMinute();
        java.lang.String str14 = appt7.toString();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartHour();
        java.lang.String str22 = appt7.getDescription();
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        int i23 = calDay0.getDay();
        java.lang.String str24 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard25 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt26 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertNull(linkedlist_appt26);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        appt27.setStartYear(97);
        appt27.setStartMonth(1);
        int i40 = appt27.getStartMinute();
        appt27.setStartHour(35);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i40 == 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        int i11 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        cs362.CalDay calDay5 = new cs362.CalDay();
        int i6 = calDay5.getYear();
        int i7 = calDay5.getYear();
        cs362.Appt appt15 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt15.setStartHour(1);
        appt15.setStartMonth((int) (short) -1);
        int i20 = appt15.getStartMonth();
        calDay5.addAppt(appt15);
        appt15.setStartHour(0);
        int i24 = appt15.getStartYear();
        calDay0.addAppt(appt15);
        appt15.setTitle("");
        java.lang.String str28 = appt15.getDescription();
        appt15.setStartHour((int) (short) 0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        appt7.setStartMonth((int) (byte) 100);
        java.lang.String str18 = appt7.toString();
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        appt7.setStartYear((int) '4');
        java.lang.String str14 = appt7.getTitle();
        appt7.setTitle("hi!");
        appt7.setStartMonth((int) ' ');
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        appt7.setTitle("hi!");
        appt7.setStartHour((-1));
        appt7.setStartMonth(52);
        int i29 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i29 == 52);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        int i19 = appt11.getStartMonth();
        int i20 = appt11.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getDay();
        int i7 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartDay();
        appt7.setStartMinute(52);
        java.lang.String str22 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setStartYear(1);
        appt7.setStartDay((int) ' ');
        java.lang.String str23 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        appt27.setStartYear(97);
        appt27.setStartMonth(1);
        int i40 = appt27.getStartMinute();
        int i41 = appt27.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i40 == 10);
        org.junit.Assert.assertTrue(i41 == 97);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        appt7.setStartHour((int) ' ');
        appt7.setDescription("");
        appt7.setStartDay(97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        cs362.CalDay calDay0 = new cs362.CalDay();
        cs362.CalDay calDay1 = new cs362.CalDay();
        int i2 = calDay1.getYear();
        int i3 = calDay1.getYear();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        calDay1.addAppt(appt11);
        appt11.setStartHour(0);
        int i20 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        int i22 = calDay0.getYear();
        java.lang.String str23 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt24 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt24);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartDay();
        appt7.setStartYear(97);
        int i19 = appt7.getStartDay();
        int i20 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        appt11.setStartMinute((int) (byte) 100);
        appt11.setStartMonth(10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        java.util.Iterator<?> iterator_wildcard25 = calDay0.iterator();
        boolean b26 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        cs362.CalDay calDay0 = new cs362.CalDay();
        cs362.CalDay calDay1 = new cs362.CalDay();
        int i2 = calDay1.getYear();
        int i3 = calDay1.getYear();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        calDay1.addAppt(appt11);
        appt11.setStartHour(0);
        int i20 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        int i22 = calDay0.getYear();
        boolean b23 = calDay0.isValid();
        cs362.Appt appt31 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        java.lang.String str32 = appt31.getTitle();
        calDay0.addAppt(appt31);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        int i18 = appt7.getStartDay();
        int i19 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.toString();
        java.lang.String str16 = appt7.getDescription();
        boolean b17 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        java.lang.String str20 = appt7.getTitle();
        appt7.setStartMonth(35);
        int i23 = appt7.getStartMinute();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i23 == 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setTitle("hi!");
        boolean b21 = appt7.getValid();
        appt7.setStartMonth(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.toString();
        int i16 = appt7.getStartDay();
        appt7.setStartMonth(97);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        int i6 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartDay((-1));
        int i20 = appt7.getStartYear();
        appt7.setStartYear((int) (short) 0);
        appt7.setStartDay((int) (short) -1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        int i39 = calDay0.getYear();
        cs362.Appt appt47 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt47.setStartHour(1);
        int i50 = appt47.getStartYear();
        java.lang.String str51 = appt47.toString();
        calDay0.addAppt(appt47);
        int i53 = appt47.getStartMonth();
        appt47.setStartDay(10);
        appt47.setStartMonth(35);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i50 == 97);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue(i53 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        cs362.Appt appt7 = new cs362.Appt(35, 52, 1, (int) '4', (int) (short) 0, "", "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        appt7.setStartMinute(1);
        appt7.setStartDay((int) (byte) 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        int i22 = appt12.getStartDay();
        int i23 = appt12.getStartMonth();
        appt12.setDescription("");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setTitle("hi!");
        appt10.setStartDay((int) (short) 100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        java.lang.String str16 = appt7.getDescription();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartHour((int) (byte) 10);
        int i19 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        cs362.Appt appt7 = new cs362.Appt(10, (int) 'a', 52, (int) 'a', (int) ' ', "hi!", "");
        appt7.setStartHour(35);
        boolean b10 = appt7.getValid();
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartMonth(100);
        appt7.setTitle("");
        int i24 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i24 == 97);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getDay();
        boolean b26 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        cs362.Appt appt7 = new cs362.Appt(10, (int) (byte) 0, (int) ' ', (int) (byte) 1, 100, "", "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt4 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        appt7.setStartYear((int) (byte) 0);
        int i21 = appt7.getStartMinute();
        java.lang.String str22 = appt7.getTitle();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartMonth();
        appt7.setDescription("");
        int i19 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartYear(0);
        appt11.setDescription("hi!");
        int i20 = appt11.getStartMonth();
        int i21 = appt11.getStartDay();
        calDay0.addAppt(appt11);
        java.util.LinkedList<cs362.Appt> linkedlist_appt23 = calDay0.getAppts();
        java.lang.String str24 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.getDescription();
        appt7.setStartHour(35);
        appt7.setStartMinute(52);
        int i26 = appt7.getStartMonth();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        appt7.setStartMonth((int) 'a');
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getDay();
        int i26 = calDay0.getDay();
        java.lang.String str27 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartMinute((int) 'a');
        appt7.setStartMinute(1);
        java.lang.String str20 = appt7.getDescription();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        appt7.setStartMinute((int) (byte) 100);
        appt7.setStartDay(0);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getDay();
        cs362.Appt appt13 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt13.setStartHour(1);
        appt13.setStartMonth((int) (short) -1);
        int i18 = appt13.getStartMonth();
        int i19 = appt13.getStartYear();
        boolean b20 = appt13.getValid();
        java.lang.String str21 = appt13.getTitle();
        calDay0.addAppt(appt13);
        appt13.setStartDay(52);
        java.lang.String str25 = appt13.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        appt7.setStartMonth(35);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        boolean b17 = appt7.getValid();
        appt7.setStartDay((int) (short) 100);
        appt7.setTitle("");
        java.lang.String str22 = appt7.getTitle();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 10, 0, (int) (short) 100, (int) (byte) 10, "", "");
        appt7.setStartMinute((int) '#');
        int i10 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth((-1));
        int i17 = appt7.getStartHour();
        appt7.setDescription("hi!");
        appt7.setStartYear((int) 'a');
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartHour();
        appt7.setStartHour((int) 'a');
        int i13 = appt7.getStartMinute();
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        java.lang.String str16 = appt7.getDescription();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, (int) ' ', 0, 0, 1, "", "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartHour();
        int i17 = appt7.getStartYear();
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) -1);
        appt7.setStartHour((int) 'a');
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.getDescription();
        boolean b16 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        int i22 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        int i34 = appt31.getStartYear();
        boolean b35 = appt31.getValid();
        appt31.setStartMonth((int) (short) -1);
        int i38 = appt31.getStartMonth();
        int i39 = appt31.getStartYear();
        appt31.setStartYear((int) (short) -1);
        calDay0.addAppt(appt31);
        int i43 = appt31.getStartHour();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(i39 == 97);
        org.junit.Assert.assertTrue(i43 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        java.lang.String str15 = appt11.toString();
        int i16 = appt11.getStartHour();
        java.lang.String str17 = appt11.getDescription();
        calDay0.addAppt(appt11);
        int i19 = calDay0.getDay();
        cs362.Appt appt20 = null;
        try {
            calDay0.addAppt(appt20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        int i19 = appt7.getStartHour();
        int i20 = appt7.getStartHour();
        int i21 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(i20 == 52);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt38 = calDay0.getAppts();
        cs362.Appt appt46 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt46.setStartHour(1);
        appt46.setStartMinute((int) (byte) 10);
        appt46.setStartYear(0);
        appt46.setTitle("");
        appt46.setStartMonth(97);
        appt46.setStartMonth(1);
        appt46.setStartMonth((int) (byte) 0);
        int i61 = appt46.getStartYear();
        int i62 = appt46.getStartMinute();
        calDay0.addAppt(appt46);
        int i64 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(i62 == 10);
        org.junit.Assert.assertTrue(i64 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        appt7.setDescription("hi!");
        appt7.setStartMinute((int) (short) 100);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) (short) 100, 0, (int) (byte) -1, (int) (byte) 10, "", "");
        appt7.setTitle("hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getYear();
        boolean b6 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        appt7.setStartDay((int) (byte) 10);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        appt12.setStartYear(0);
        appt12.setStartDay(1);
        int i26 = appt12.getStartMonth();
        appt12.setTitle("hi!");
        appt12.setDescription("");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        int i22 = appt12.getStartDay();
        java.lang.String str23 = appt12.getDescription();
        appt12.setStartDay(97);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getYear();
        java.lang.String str26 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartHour(0);
        int i19 = appt10.getStartYear();
        int i20 = appt10.getStartYear();
        int i21 = appt10.getStartHour();
        appt10.setDescription("hi!");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        int i22 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        java.lang.String str24 = calDay0.toString();
        int i25 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartDay();
        appt7.setTitle("hi!");
        int i19 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue(i19 == 52);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 35, (int) 'a', 97, (int) (byte) 100, "hi!", "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartYear();
        appt7.setStartYear((int) (short) -1);
        int i18 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        int i19 = appt7.getStartMinute();
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        java.util.LinkedList<cs362.Appt> linkedlist_appt21 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard22 = calDay0.iterator();
        int i23 = calDay0.getDay();
        int i24 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        appt7.setStartMinute(0);
        int i16 = appt7.getStartDay();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getMonth();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartYear(0);
        appt12.setTitle("");
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        boolean b24 = appt12.getValid();
        appt12.setTitle("");
        appt12.setStartHour(1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        boolean b20 = calDay0.isValid();
        java.lang.String str21 = calDay0.toString();
        int i22 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        int i36 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        int i38 = calDay0.getMonth();
        int i39 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        java.lang.String str17 = appt12.toString();
        int i18 = appt12.getStartMonth();
        appt12.setStartMinute(0);
        int i21 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        int i23 = appt12.getStartMinute();
        java.lang.String str24 = appt12.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        boolean b17 = appt7.getValid();
        appt7.setStartHour((int) '4');
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getDay();
        int i6 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        java.lang.String str15 = appt11.toString();
        int i16 = appt11.getStartHour();
        java.lang.String str17 = appt11.getDescription();
        calDay0.addAppt(appt11);
        int i19 = appt11.getStartHour();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartMinute((int) 'a');
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        boolean b5 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        java.lang.String str21 = appt10.getDescription();
        java.lang.String str22 = appt10.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        appt10.setStartHour((int) (short) 10);
        appt10.setTitle("");
        int i25 = appt10.getStartMinute();
        appt10.setTitle("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        boolean b8 = calDay0.isValid();
        int i9 = calDay0.getDay();
        int i10 = calDay0.getDay();
        java.lang.String str11 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        boolean b22 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 1, 52, (int) (short) -1, (int) (short) 100, "", "hi!");
        int i8 = appt7.getStartYear();
        java.lang.String str9 = appt7.toString();
        java.lang.String str10 = appt7.getTitle();
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getMonth();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartYear(0);
        appt12.setTitle("");
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        int i24 = appt12.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i24 == 10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        java.lang.String str8 = calDay0.toString();
        cs362.Appt appt16 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt16.setStartHour(1);
        int i19 = appt16.getStartYear();
        java.lang.String str20 = appt16.toString();
        java.lang.String str21 = appt16.toString();
        boolean b22 = appt16.getValid();
        calDay0.addAppt(appt16);
        boolean b24 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartMonth(100);
        appt7.setStartYear((int) '#');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        cs362.Appt appt7 = new cs362.Appt(100, 52, (int) (short) -1, 100, 52, "hi!", "");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        boolean b20 = calDay0.isValid();
        int i21 = calDay0.getMonth();
        boolean b22 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(iterator_wildcard23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        boolean b17 = appt10.getValid();
        java.lang.String str18 = appt10.getTitle();
        boolean b19 = appt10.getValid();
        appt10.setStartDay(52);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMonth();
        boolean b15 = appt7.getValid();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 10, (int) ' ', 10, (int) (byte) 10, (int) (short) -1, "hi!", "");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getYear();
        cs362.CalDay calDay26 = new cs362.CalDay();
        int i27 = calDay26.getYear();
        int i28 = calDay26.getYear();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMonth();
        calDay26.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartYear();
        calDay0.addAppt(appt36);
        int i46 = appt36.getStartYear();
        appt36.setStartYear((int) (byte) 0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 97);
        org.junit.Assert.assertTrue(i46 == 97);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        cs362.Appt appt7 = new cs362.Appt(0, 35, (int) (short) 1, (int) '#', (int) (short) 1, "", "");
        appt7.setTitle("hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getMonth();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartYear(0);
        appt12.setTitle("");
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        int i24 = calDay0.getDay();
        cs362.CalDay calDay25 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard26 = calDay25.iterator();
        cs362.CalDay calDay27 = new cs362.CalDay();
        int i28 = calDay27.getYear();
        int i29 = calDay27.getYear();
        cs362.Appt appt37 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt37.setStartHour(1);
        appt37.setStartMonth((int) (short) -1);
        int i42 = appt37.getStartMonth();
        calDay27.addAppt(appt37);
        appt37.setStartHour(0);
        calDay25.addAppt(appt37);
        appt37.setStartYear(0);
        appt37.setStartDay(1);
        java.lang.String str51 = appt37.getTitle();
        java.lang.String str52 = appt37.toString();
        calDay0.addAppt(appt37);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(iterator_wildcard26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        boolean b23 = calDay0.isValid();
        int i24 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartDay();
        appt7.setStartYear(97);
        appt7.setDescription("");
        appt7.setStartMonth((int) 'a');
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        int i20 = calDay0.getDay();
        int i21 = calDay0.getMonth();
        int i22 = calDay0.getYear();
        cs362.CalDay calDay23 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard24 = calDay23.iterator();
        cs362.CalDay calDay25 = new cs362.CalDay();
        int i26 = calDay25.getYear();
        int i27 = calDay25.getYear();
        cs362.Appt appt35 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt35.setStartHour(1);
        appt35.setStartMonth((int) (short) -1);
        int i40 = appt35.getStartMonth();
        calDay25.addAppt(appt35);
        appt35.setStartHour(0);
        calDay23.addAppt(appt35);
        int i45 = appt35.getStartHour();
        int i46 = appt35.getStartMonth();
        appt35.setDescription("hi!");
        calDay0.addAppt(appt35);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        boolean b17 = appt7.getValid();
        java.lang.String str18 = appt7.getDescription();
        java.lang.String str19 = appt7.toString();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        boolean b8 = calDay0.isValid();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        boolean b6 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        appt7.setTitle("hi!");
        appt7.setStartHour((-1));
        appt7.setStartMonth(52);
        boolean b29 = appt7.getValid();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartDay();
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        java.lang.String str20 = appt7.getTitle();
        boolean b21 = appt7.getValid();
        appt7.setStartHour((int) 'a');
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartYear((int) (byte) -1);
        appt7.setDescription("hi!");
        int i20 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i20 == 10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        java.lang.String str10 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        cs362.Appt appt7 = new cs362.Appt(35, 52, 0, (int) 'a', 10, "", "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        int i10 = appt7.getStartHour();
        int i11 = appt7.getStartMinute();
        appt7.setStartHour(0);
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        boolean b17 = appt10.getValid();
        java.lang.String str18 = appt10.getTitle();
        appt10.setStartMinute((int) '4');
        int i21 = appt10.getStartYear();
        java.lang.String str22 = appt10.getTitle();
        java.lang.String str23 = appt10.toString();
        appt10.setTitle("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        int i20 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        int i22 = calDay0.getMonth();
        java.lang.String str23 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((-1));
        java.lang.String str16 = appt7.getTitle();
        int i17 = appt7.getStartYear();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getDay();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setDescription("hi!");
        appt7.setStartHour((int) (byte) 100);
        appt7.setStartMonth((int) 'a');
        int i23 = appt7.getStartYear();
        appt7.setStartYear((int) ' ');
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) '4');
        int i16 = appt7.getStartMinute();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getDay();
        java.lang.String str9 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt10 = calDay0.getAppts();
        int i11 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.lang.String str22 = calDay0.toString();
        boolean b23 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt24 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard26 = calDay0.iterator();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(linkedlist_appt24);
        org.junit.Assert.assertNull(linkedlist_appt25);
        org.junit.Assert.assertNull(iterator_wildcard26);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        cs362.TimeTable timeTable1 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = null;
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt17 = timeTable1.deleteAppt(linkedlist_appt2, appt10);
        cs362.Appt appt25 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt25.setStartHour(1);
        appt25.setStartMinute((int) (byte) 10);
        appt25.setStartHour((int) (byte) 0);
        cs362.Appt appt39 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt39.setStartHour(1);
        appt39.setStartMinute((int) (byte) 10);
        appt39.setStartYear(0);
        int i46 = appt39.getStartMonth();
        int i47 = appt39.getStartDay();
        appt39.setStartMinute(1);
        cs362.Appt appt57 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt57.setStartHour(1);
        appt57.setStartMonth((int) (short) -1);
        int i62 = appt57.getStartMonth();
        int i63 = appt57.getStartYear();
        boolean b64 = appt57.getValid();
        appt57.setStartMonth(35);
        cs362.Appt[] appt_array67 = new cs362.Appt[] { appt25, appt39, appt57 };
        java.util.LinkedList<cs362.Appt> linkedlist_appt68 = new java.util.LinkedList<cs362.Appt>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<cs362.Appt>) linkedlist_appt68, appt_array67);
        cs362.Appt appt77 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        java.util.LinkedList<cs362.Appt> linkedlist_appt78 = timeTable1.deleteAppt(linkedlist_appt68, appt77);
        cs362.Appt appt86 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt86.setStartHour(1);
        appt86.setStartMinute((int) (byte) 10);
        appt86.setStartDay((-1));
        appt86.setDescription("");
        appt86.setStartMonth((int) (byte) 100);
        java.util.LinkedList<cs362.Appt> linkedlist_appt97 = timeTable0.deleteAppt(linkedlist_appt68, appt86);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNull(linkedlist_appt17);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertTrue(i47 == 52);
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertTrue(i63 == 97);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(appt_array67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(linkedlist_appt78);
        org.junit.Assert.assertNull(linkedlist_appt97);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        boolean b19 = appt7.getValid();
        int i20 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        appt11.setStartMinute((int) (byte) 100);
        java.lang.String str22 = appt11.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        cs362.Appt appt13 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt13.setStartHour(1);
        appt13.setStartMinute((int) (byte) 10);
        appt13.setStartYear(0);
        appt13.setTitle("hi!");
        appt13.setStartYear((int) (byte) -1);
        appt13.setDescription("hi!");
        java.lang.String str26 = appt13.getTitle();
        boolean b27 = appt13.getValid();
        calDay0.addAppt(appt13);
        java.util.Iterator<?> iterator_wildcard29 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(iterator_wildcard29);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        appt7.setStartYear((int) '4');
        java.lang.String str14 = appt7.getTitle();
        appt7.setStartMinute((-1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        int i19 = appt7.getStartMinute();
        appt7.setStartMinute((int) ' ');
        int i22 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i22 == 97);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setStartYear(1);
        appt7.setStartDay((int) ' ');
        boolean b23 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        int i27 = calDay0.getDay();
        int i28 = calDay0.getYear();
        int i29 = calDay0.getMonth();
        java.lang.String str30 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        int i20 = calDay0.getDay();
        int i21 = calDay0.getMonth();
        int i22 = calDay0.getYear();
        int i23 = calDay0.getMonth();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        appt31.setStartMonth((int) (short) -1);
        int i36 = appt31.getStartMinute();
        appt31.setStartYear((int) (short) 100);
        boolean b39 = appt31.getValid();
        java.lang.String str40 = appt31.toString();
        int i41 = appt31.getStartYear();
        int i42 = appt31.getStartMinute();
        calDay0.addAppt(appt31);
        java.lang.String str44 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        appt7.setDescription("");
        boolean b13 = appt7.getValid();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setDescription("hi!");
        boolean b15 = appt7.getValid();
        appt7.setStartDay((int) ' ');
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        appt12.setStartYear(0);
        appt12.setStartDay(1);
        boolean b26 = appt12.getValid();
        java.lang.String str27 = appt12.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        appt7.setStartHour((int) ' ');
        appt7.setStartMonth((int) (short) 0);
        int i17 = appt7.getStartMonth();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getMonth();
        int i4 = calDay0.getDay();
        cs362.Appt appt5 = null;
        try {
            calDay0.addAppt(appt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        boolean b17 = appt7.getValid();
        appt7.setStartDay((int) (short) 100);
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        cs362.CalDay calDay0 = new cs362.CalDay();
        cs362.CalDay calDay1 = new cs362.CalDay();
        int i2 = calDay1.getYear();
        int i3 = calDay1.getYear();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        calDay1.addAppt(appt11);
        appt11.setStartHour(0);
        int i20 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        int i22 = calDay0.getYear();
        java.lang.String str23 = calDay0.toString();
        java.lang.String str24 = calDay0.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartHour((int) (byte) 100);
        int i18 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartHour();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (byte) -1, 100, (int) (short) 10, 100, "", "");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        cs362.TimeTable timeTable1 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = null;
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt17 = timeTable1.deleteAppt(linkedlist_appt2, appt10);
        cs362.Appt appt25 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt25.setStartHour(1);
        appt25.setStartMinute((int) (byte) 10);
        appt25.setStartHour((int) (byte) 0);
        cs362.Appt appt39 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt39.setStartHour(1);
        appt39.setStartMinute((int) (byte) 10);
        appt39.setStartYear(0);
        int i46 = appt39.getStartMonth();
        int i47 = appt39.getStartDay();
        appt39.setStartMinute(1);
        cs362.Appt appt57 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt57.setStartHour(1);
        appt57.setStartMonth((int) (short) -1);
        int i62 = appt57.getStartMonth();
        int i63 = appt57.getStartYear();
        boolean b64 = appt57.getValid();
        appt57.setStartMonth(35);
        cs362.Appt[] appt_array67 = new cs362.Appt[] { appt25, appt39, appt57 };
        java.util.LinkedList<cs362.Appt> linkedlist_appt68 = new java.util.LinkedList<cs362.Appt>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<cs362.Appt>) linkedlist_appt68, appt_array67);
        cs362.Appt appt77 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        java.util.LinkedList<cs362.Appt> linkedlist_appt78 = timeTable1.deleteAppt(linkedlist_appt68, appt77);
        cs362.Appt appt86 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt86.setStartHour(1);
        int i89 = appt86.getStartYear();
        java.lang.String str90 = appt86.toString();
        java.lang.String str91 = appt86.toString();
        appt86.setStartHour((int) ' ');
        appt86.setStartHour(52);
        java.util.LinkedList<cs362.Appt> linkedlist_appt96 = timeTable0.deleteAppt(linkedlist_appt68, appt86);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertNull(linkedlist_appt17);
        org.junit.Assert.assertTrue(i46 == 1);
        org.junit.Assert.assertTrue(i47 == 52);
        org.junit.Assert.assertTrue(i62 == (-1));
        org.junit.Assert.assertTrue(i63 == 97);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(appt_array67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(linkedlist_appt78);
        org.junit.Assert.assertTrue(i89 == 97);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNull(linkedlist_appt96);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        appt7.setStartMinute(10);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        appt7.setStartMinute(1);
        int i17 = appt7.getStartMonth();
        appt7.setStartHour((int) (byte) 0);
        java.lang.String str20 = appt7.getDescription();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartMinute();
        appt7.setStartHour((int) (short) -1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        appt7.setStartHour((int) ' ');
        appt7.setStartMonth((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartMonth(0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        boolean b20 = calDay0.isValid();
        boolean b21 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        int i23 = calDay0.getDay();
        boolean b24 = calDay0.isValid();
        int i25 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getMonth();
        int i9 = calDay0.getYear();
        int i10 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        boolean b17 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        appt7.setStartYear((int) '4');
        java.lang.String str14 = appt7.getTitle();
        java.lang.String str15 = appt7.getDescription();
        java.lang.String str16 = appt7.getTitle();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        appt10.setStartHour((int) (short) 10);
        appt10.setTitle("");
        int i25 = appt10.getStartYear();
        int i26 = appt10.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i25 == 97);
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        int i21 = appt10.getStartYear();
        appt10.setDescription("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 97);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        java.lang.String str17 = calDay0.toString();
        int i18 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartMonth(100);
        appt7.setStartDay((int) (short) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        int i20 = calDay0.getDay();
        int i21 = calDay0.getMonth();
        int i22 = calDay0.getYear();
        int i23 = calDay0.getMonth();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        appt31.setStartMonth((int) (short) -1);
        int i36 = appt31.getStartMinute();
        appt31.setStartYear((int) (short) 100);
        boolean b39 = appt31.getValid();
        java.lang.String str40 = appt31.toString();
        int i41 = appt31.getStartYear();
        int i42 = appt31.getStartMinute();
        calDay0.addAppt(appt31);
        appt31.setStartMonth((int) (short) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(i42 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        boolean b18 = appt7.getValid();
        java.lang.String str19 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        java.lang.String str17 = appt12.toString();
        int i18 = appt12.getStartMonth();
        appt12.setStartMinute(0);
        int i21 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        boolean b23 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        int i39 = calDay0.getYear();
        cs362.CalDay calDay40 = new cs362.CalDay();
        int i41 = calDay40.getYear();
        int i42 = calDay40.getYear();
        java.util.Iterator<?> iterator_wildcard43 = calDay40.iterator();
        boolean b44 = calDay40.isValid();
        java.lang.String str45 = calDay40.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt46 = calDay40.getAppts();
        cs362.Appt appt54 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt54.setStartHour(1);
        int i57 = appt54.getStartYear();
        boolean b58 = appt54.getValid();
        java.lang.String str59 = appt54.toString();
        calDay40.addAppt(appt54);
        appt54.setDescription("");
        appt54.setStartHour((int) (short) 0);
        calDay0.addAppt(appt54);
        appt54.setStartMinute((int) (byte) 10);
        int i68 = appt54.getStartYear();
        appt54.setStartMinute((-1));
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(iterator_wildcard43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt46);
        org.junit.Assert.assertTrue(i57 == 97);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue(i68 == 97);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartYear(0);
        appt11.setTitle("");
        appt11.setStartMonth(97);
        appt11.setStartMonth((int) '4');
        calDay0.addAppt(appt11);
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertNull(linkedlist_appt25);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        appt27.setStartYear(97);
        int i38 = appt27.getStartMonth();
        appt27.setStartYear((int) '4');
        appt27.setStartYear((int) '4');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i38 == 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMinute((int) (byte) 10);
        appt9.setStartYear(0);
        appt9.setDescription("hi!");
        int i18 = appt9.getStartMonth();
        int i19 = appt9.getStartMonth();
        calDay0.addAppt(appt9);
        appt9.setDescription("hi!");
        int i23 = appt9.getStartDay();
        int i24 = appt9.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i23 == 52);
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setDescription("hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        java.lang.String str17 = appt7.getDescription();
        appt7.setDescription("");
        int i20 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) -1);
        int i16 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        appt7.setTitle("hi!");
        boolean b25 = appt7.getValid();
        appt7.setDescription("hi!");
        java.lang.String str28 = appt7.getTitle();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        boolean b16 = appt7.getValid();
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (byte) 10);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 0, 97, (int) (byte) 100, (int) (short) 1, "", "hi!");
        appt7.setTitle("");
        boolean b10 = appt7.getValid();
        appt7.setStartMonth((int) '#');
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartMonth(0);
        appt7.setStartDay((int) (short) 100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) (short) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        appt14.setDescription("");
        appt14.setStartMinute((int) (short) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getYear();
        cs362.CalDay calDay26 = new cs362.CalDay();
        int i27 = calDay26.getYear();
        int i28 = calDay26.getYear();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMonth();
        calDay26.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartYear();
        calDay0.addAppt(appt36);
        java.util.Iterator<?> iterator_wildcard46 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 97);
        org.junit.Assert.assertNull(iterator_wildcard46);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartMonth(100);
        appt7.setTitle("");
        appt7.setStartMinute((int) 'a');
        java.lang.String str26 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        java.lang.String str27 = appt14.toString();
        appt14.setStartHour(35);
        boolean b30 = appt14.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getMonth();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartYear(0);
        appt12.setTitle("");
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        boolean b24 = appt12.getValid();
        appt12.setStartMonth((int) (byte) -1);
        appt12.setStartMonth((int) (short) 1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        int i14 = appt7.getStartYear();
        appt7.setStartMinute((-1));
        appt7.setStartMonth((int) (short) 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        int i3 = calDay0.getYear();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartYear(0);
        appt11.setTitle("");
        appt11.setStartMonth(97);
        calDay0.addAppt(appt11);
        boolean b23 = appt11.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, (int) (byte) 10, (int) '4', 10, 1, "", "hi!");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        boolean b37 = calDay0.isValid();
        int i38 = calDay0.getDay();
        cs362.Appt appt39 = null;
        try {
            calDay0.addAppt(appt39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        boolean b17 = appt7.getValid();
        appt7.setDescription("");
        appt7.setStartYear((int) (short) 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getMonth();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartYear(0);
        appt12.setTitle("");
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        boolean b25 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard26 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(iterator_wildcard26);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        appt7.setStartMonth((int) ' ');
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setTitle("hi!");
        int i21 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) 1, (int) (byte) 1, 52, (int) '#', "hi!", "");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        boolean b19 = calDay0.isValid();
        int i20 = calDay0.getYear();
        boolean b21 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        appt10.setStartHour((int) (short) 10);
        int i23 = appt10.getStartDay();
        appt10.setTitle("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i23 == 52);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        appt12.setStartYear(0);
        appt12.setStartDay(1);
        boolean b26 = appt12.getValid();
        int i27 = appt12.getStartYear();
        appt12.setStartYear(97);
        appt12.setTitle("hi!");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        appt11.setStartDay(0);
        int i21 = appt11.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        java.lang.String str20 = appt7.getTitle();
        int i21 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        int i39 = calDay0.getYear();
        int i40 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i19 = appt7.getStartMonth();
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 10);
        appt7.setTitle("hi!");
        int i22 = appt7.getStartMinute();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i22 == 10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        java.util.LinkedList<cs362.Appt> linkedlist_appt27 = calDay0.getAppts();
        cs362.CalDay calDay28 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard29 = calDay28.iterator();
        cs362.CalDay calDay30 = new cs362.CalDay();
        int i31 = calDay30.getYear();
        int i32 = calDay30.getYear();
        cs362.Appt appt40 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt40.setStartHour(1);
        appt40.setStartMonth((int) (short) -1);
        int i45 = appt40.getStartMonth();
        calDay30.addAppt(appt40);
        appt40.setStartHour(0);
        calDay28.addAppt(appt40);
        appt40.setStartYear(0);
        appt40.setStartDay(1);
        appt40.setStartMinute((int) (short) 100);
        calDay0.addAppt(appt40);
        int i57 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertNull(iterator_wildcard29);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        int i19 = calDay0.getMonth();
        cs362.Appt appt27 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        calDay0.addAppt(appt27);
        appt27.setStartMinute((int) (byte) 0);
        int i31 = appt27.getStartYear();
        appt27.setStartDay((int) '#');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i31 == 52);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        cs362.Appt appt7 = new cs362.Appt(52, (-1), 10, (int) 'a', (int) (short) 10, "hi!", "");
        appt7.setStartHour(1);
        boolean b10 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        int i36 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        cs362.Appt appt45 = new cs362.Appt((-1), (int) (short) 0, 97, (int) (byte) 100, (int) (short) 1, "", "hi!");
        appt45.setTitle("");
        calDay0.addAppt(appt45);
        appt45.setStartHour((int) (short) 10);
        int i51 = appt45.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i51 == 100);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        boolean b8 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getYear();
        int i9 = calDay0.getYear();
        cs362.Appt appt17 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt17.setStartHour(1);
        appt17.setStartMinute((int) (byte) 10);
        appt17.setStartYear(0);
        appt17.setTitle("hi!");
        int i26 = appt17.getStartHour();
        appt17.setStartMinute((int) '4');
        calDay0.addAppt(appt17);
        java.util.LinkedList<cs362.Appt> linkedlist_appt30 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt31 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNull(linkedlist_appt30);
        org.junit.Assert.assertNull(linkedlist_appt31);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(iterator_wildcard8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        java.lang.String str3 = calDay0.toString();
        java.lang.String str4 = calDay0.toString();
        int i5 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartMinute((int) 'a');
        appt7.setStartMinute(1);
        java.lang.String str20 = appt7.getDescription();
        int i21 = appt7.getStartMonth();
        appt7.setStartMinute((int) '#');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartDay((int) (short) 0);
        int i22 = appt7.getStartYear();
        boolean b23 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i22 == 97);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) (short) 10, "", "");
        appt7.setTitle("");
        int i10 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        boolean b17 = appt12.getValid();
        java.lang.String str18 = appt12.getDescription();
        appt12.setStartMonth((-1));
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartDay();
        calDay0.addAppt(appt12);
        boolean b24 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        boolean b20 = calDay0.isValid();
        int i21 = calDay0.getMonth();
        boolean b22 = calDay0.isValid();
        int i23 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertNull(linkedlist_appt25);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        java.lang.String str17 = appt7.toString();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth((int) (byte) 100);
        appt7.setStartHour((-1));
        appt7.setStartYear((int) (short) 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartMonth();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartMonth((int) '#');
        java.lang.String str20 = appt7.toString();
        int i21 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(i21 == 35);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        boolean b17 = appt10.getValid();
        java.lang.String str18 = appt10.getTitle();
        appt10.setStartMinute((int) '4');
        int i21 = appt10.getStartYear();
        int i22 = appt10.getStartDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue(i22 == 52);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartHour((int) (byte) 100);
        appt7.setStartMonth(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMinute((int) (byte) 10);
        appt9.setStartYear(0);
        appt9.setDescription("hi!");
        int i18 = appt9.getStartMonth();
        int i19 = appt9.getStartMonth();
        calDay0.addAppt(appt9);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard22 = calDay0.iterator();
        int i23 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        java.util.LinkedList<cs362.Appt> linkedlist_appt27 = calDay0.getAppts();
        cs362.CalDay calDay28 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard29 = calDay28.iterator();
        cs362.CalDay calDay30 = new cs362.CalDay();
        int i31 = calDay30.getYear();
        int i32 = calDay30.getYear();
        cs362.Appt appt40 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt40.setStartHour(1);
        appt40.setStartMonth((int) (short) -1);
        int i45 = appt40.getStartMonth();
        calDay30.addAppt(appt40);
        appt40.setStartHour(0);
        calDay28.addAppt(appt40);
        appt40.setStartYear(0);
        appt40.setStartDay(1);
        appt40.setStartMinute((int) (short) 100);
        calDay0.addAppt(appt40);
        java.lang.String str57 = appt40.getTitle();
        int i58 = appt40.getStartDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertNull(iterator_wildcard29);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i45 == (-1));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        org.junit.Assert.assertTrue(i58 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        cs362.Appt appt7 = new cs362.Appt((int) (short) -1, (int) (short) 1, (int) (byte) 0, (int) (byte) -1, (int) ' ', "", "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartDay(1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setTitle("");
        appt7.setStartYear(1);
        java.lang.String str21 = appt7.getTitle();
        int i22 = appt7.getStartMonth();
        int i23 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getMonth();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartYear(0);
        appt12.setTitle("");
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartHour();
        calDay0.addAppt(appt12);
        boolean b24 = appt12.getValid();
        appt12.setStartMonth((int) (byte) -1);
        appt12.setStartDay(52);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getYear();
        cs362.CalDay calDay26 = new cs362.CalDay();
        int i27 = calDay26.getYear();
        int i28 = calDay26.getYear();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMonth();
        calDay26.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartYear();
        calDay0.addAppt(appt36);
        int i46 = appt36.getStartYear();
        int i47 = appt36.getStartHour();
        appt36.setStartHour((int) (byte) -1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 97);
        org.junit.Assert.assertTrue(i46 == 97);
        org.junit.Assert.assertTrue(i47 == 1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setDescription("");
        appt7.setTitle("");
        int i20 = appt7.getStartMinute();
        boolean b21 = appt7.getValid();
        org.junit.Assert.assertTrue(i20 == 10);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (byte) 10);
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartYear((int) 'a');
        appt7.setStartDay((int) (short) 100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 0, 97, (int) (byte) 100, (int) (short) 1, "", "hi!");
        java.lang.String str8 = appt7.getTitle();
        appt7.setDescription("");
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        cs362.Appt appt7 = new cs362.Appt(10, (int) 'a', 52, (int) 'a', (int) ' ', "hi!", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str14 = appt7.toString();
        appt7.setStartDay((int) 'a');
        java.lang.String str17 = appt7.toString();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        java.lang.String str8 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        int i10 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay(1);
        appt7.setStartHour(35);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        int i36 = calDay0.getDay();
        int i37 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        appt7.setStartMinute(10);
        appt7.setStartHour(97);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartMonth();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartYear();
        appt7.setStartDay((-1));
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartMinute();
        boolean b17 = appt7.getValid();
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt1 = null;
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMonth((int) (short) -1);
        int i14 = appt9.getStartMonth();
        int i15 = appt9.getStartYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt16 = timeTable0.deleteAppt(linkedlist_appt1, appt9);
        cs362.Appt appt24 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt24.setStartHour(1);
        appt24.setStartMinute((int) (byte) 10);
        appt24.setStartHour((int) (byte) 0);
        cs362.Appt appt38 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt38.setStartHour(1);
        appt38.setStartMinute((int) (byte) 10);
        appt38.setStartYear(0);
        int i45 = appt38.getStartMonth();
        int i46 = appt38.getStartDay();
        appt38.setStartMinute(1);
        cs362.Appt appt56 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt56.setStartHour(1);
        appt56.setStartMonth((int) (short) -1);
        int i61 = appt56.getStartMonth();
        int i62 = appt56.getStartYear();
        boolean b63 = appt56.getValid();
        appt56.setStartMonth(35);
        cs362.Appt[] appt_array66 = new cs362.Appt[] { appt24, appt38, appt56 };
        java.util.LinkedList<cs362.Appt> linkedlist_appt67 = new java.util.LinkedList<cs362.Appt>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<cs362.Appt>) linkedlist_appt67, appt_array66);
        cs362.Appt appt76 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        java.util.LinkedList<cs362.Appt> linkedlist_appt77 = timeTable0.deleteAppt(linkedlist_appt67, appt76);
        int i78 = appt76.getStartMonth();
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertNull(linkedlist_appt16);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue(i46 == 52);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue(i62 == 97);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(appt_array66);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(linkedlist_appt77);
        org.junit.Assert.assertTrue(i78 == 10);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        int i22 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        java.lang.String str24 = calDay0.toString();
        cs362.Appt appt32 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt32.setStartHour(1);
        appt32.setStartMonth((int) (short) -1);
        int i37 = appt32.getStartMonth();
        int i38 = appt32.getStartYear();
        int i39 = appt32.getStartYear();
        java.lang.String str40 = appt32.toString();
        java.lang.String str41 = appt32.getDescription();
        calDay0.addAppt(appt32);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(i38 == 97);
        org.junit.Assert.assertTrue(i39 == 97);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        boolean b18 = appt7.getValid();
        int i19 = appt7.getStartMonth();
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt38 = calDay0.getAppts();
        cs362.CalDay calDay39 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard40 = calDay39.iterator();
        cs362.CalDay calDay41 = new cs362.CalDay();
        int i42 = calDay41.getYear();
        int i43 = calDay41.getYear();
        cs362.Appt appt51 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt51.setStartHour(1);
        appt51.setStartMonth((int) (short) -1);
        int i56 = appt51.getStartMonth();
        calDay41.addAppt(appt51);
        appt51.setStartHour(0);
        calDay39.addAppt(appt51);
        appt51.setStartYear(0);
        appt51.setStartDay(1);
        int i65 = appt51.getStartMonth();
        calDay0.addAppt(appt51);
        java.util.Iterator<?> iterator_wildcard67 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard68 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertNull(iterator_wildcard40);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertNull(iterator_wildcard67);
        org.junit.Assert.assertNull(iterator_wildcard68);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        appt27.setStartYear(97);
        int i38 = appt27.getStartMonth();
        int i39 = appt27.getStartHour();
        int i40 = appt27.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i38 == 1);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(i40 == 10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        int i19 = appt11.getStartMonth();
        appt11.setStartMonth(1);
        java.lang.String str22 = appt11.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setStartMinute((int) (byte) 0);
        appt7.setStartYear((int) (short) 1);
        java.lang.String str21 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getDay();
        cs362.Appt appt13 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt13.setStartHour(1);
        appt13.setStartMonth((int) (short) -1);
        int i18 = appt13.getStartMonth();
        int i19 = appt13.getStartYear();
        boolean b20 = appt13.getValid();
        java.lang.String str21 = appt13.getTitle();
        calDay0.addAppt(appt13);
        appt13.setStartHour((int) 'a');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        int i17 = calDay0.getYear();
        int i18 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        cs362.Appt appt7 = new cs362.Appt(97, (int) (byte) 10, (int) 'a', (int) (short) 0, 97, "", "");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour(100);
        appt7.setStartMinute((int) (short) 100);
        appt7.setStartYear((int) '4');
        int i21 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        int i14 = appt7.getStartMonth();
        appt7.setStartDay((int) (short) 1);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 1, (int) 'a', (int) (byte) 0, 0, "hi!", "hi!");
        int i8 = appt7.getStartDay();
        appt7.setStartMonth((int) (byte) 100);
        java.lang.String str11 = appt7.getDescription();
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        boolean b19 = appt7.getValid();
        int i20 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMinute((int) (byte) 10);
        appt9.setStartYear(0);
        appt9.setDescription("hi!");
        int i18 = appt9.getStartMonth();
        int i19 = appt9.getStartMonth();
        calDay0.addAppt(appt9);
        boolean b21 = calDay0.isValid();
        boolean b22 = calDay0.isValid();
        boolean b23 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        cs362.Appt appt7 = new cs362.Appt((int) '4', 35, 10, (int) ' ', (int) (byte) 100, "", "");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        int i20 = appt7.getStartMinute();
        appt7.setStartDay((int) '#');
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        int i17 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        int i19 = appt7.getStartMinute();
        appt7.setStartMinute((int) ' ');
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) '4');
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartHour();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (short) -1);
        int i20 = appt7.getStartHour();
        java.lang.String str21 = appt7.getDescription();
        int i22 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(100);
        int i14 = appt7.getStartDay();
        appt7.setStartHour(97);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        appt7.setStartHour((int) (byte) 10);
        boolean b18 = appt7.getValid();
        int i19 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 52);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        int i14 = appt7.getStartMonth();
        appt7.setStartHour((int) (byte) 10);
        boolean b17 = appt7.getValid();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMinute((int) (byte) 10);
        appt14.setStartDay((-1));
        appt14.setDescription("");
        int i23 = appt14.getStartMinute();
        calDay0.addAppt(appt14);
        int i25 = calDay0.getYear();
        cs362.CalDay calDay26 = new cs362.CalDay();
        int i27 = calDay26.getYear();
        int i28 = calDay26.getYear();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMonth();
        calDay26.addAppt(appt36);
        boolean b43 = appt36.getValid();
        int i44 = appt36.getStartYear();
        calDay0.addAppt(appt36);
        int i46 = appt36.getStartYear();
        appt36.setStartMonth(52);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 97);
        org.junit.Assert.assertTrue(i46 == 97);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        cs362.Appt appt7 = new cs362.Appt(0, (int) '4', 52, (int) '#', 1, "hi!", "");
        appt7.setDescription("hi!");
        java.lang.String str10 = appt7.toString();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        int i14 = appt7.getStartYear();
        appt7.setStartMinute((-1));
        int i17 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        boolean b21 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard22 = calDay0.iterator();
        int i23 = calDay0.getDay();
        cs362.Appt appt24 = null;
        try {
            calDay0.addAppt(appt24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100, 0, "hi!", "hi!");
        appt7.setDescription("");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartDay();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartMinute(10);
        appt7.setStartYear(32);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 10, (int) ' ', 10, (int) (byte) 10, (int) (short) -1, "hi!", "");
        int i8 = appt7.getStartYear();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.lang.String str22 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        java.lang.String str25 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth((-1));
        int i17 = appt7.getStartDay();
        int i18 = appt7.getStartDay();
        int i19 = appt7.getStartYear();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i18 == 52);
        org.junit.Assert.assertTrue(i19 == 32);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt38 = calDay0.getAppts();
        cs362.CalDay calDay39 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard40 = calDay39.iterator();
        cs362.CalDay calDay41 = new cs362.CalDay();
        int i42 = calDay41.getYear();
        int i43 = calDay41.getYear();
        cs362.Appt appt51 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt51.setStartHour(1);
        appt51.setStartMonth((int) (short) -1);
        int i56 = appt51.getStartMonth();
        calDay41.addAppt(appt51);
        appt51.setStartHour(0);
        calDay39.addAppt(appt51);
        appt51.setStartYear(0);
        appt51.setStartDay(1);
        int i65 = appt51.getStartMonth();
        calDay0.addAppt(appt51);
        java.util.Iterator<?> iterator_wildcard67 = calDay0.iterator();
        int i68 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertNull(iterator_wildcard40);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertNull(iterator_wildcard67);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (byte) 10);
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        boolean b17 = appt7.getValid();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartDay();
        java.lang.String str20 = appt7.getTitle();
        appt7.setStartMinute(35);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        java.lang.String str4 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        int i22 = appt12.getStartDay();
        int i23 = appt12.getStartHour();
        boolean b24 = appt12.getValid();
        int i25 = appt12.getStartMinute();
        appt12.setTitle("hi!");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setStartYear(1);
        int i21 = appt7.getStartHour();
        appt7.setStartDay((int) (byte) 1);
        appt7.setStartDay((int) (byte) 100);
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 100, (-1), (int) ' ', (int) (byte) 10, "hi!", "");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        appt12.setStartYear(0);
        appt12.setStartDay(1);
        int i26 = appt12.getStartYear();
        boolean b27 = appt12.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartYear(0);
        appt11.setTitle("");
        appt11.setStartMonth(97);
        appt11.setStartMonth((int) '4');
        calDay0.addAppt(appt11);
        java.lang.String str25 = calDay0.toString();
        java.lang.String str26 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartMonth();
        int i18 = appt7.getStartHour();
        int i19 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartDay();
        appt7.setStartYear(97);
        appt7.setDescription("");
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 0, (int) (byte) -1, (int) 'a', 100, "", "");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        appt14.setDescription("");
        appt14.setStartMonth((int) (byte) 1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartMinute();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        boolean b3 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt38 = calDay0.getAppts();
        cs362.CalDay calDay39 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard40 = calDay39.iterator();
        cs362.CalDay calDay41 = new cs362.CalDay();
        int i42 = calDay41.getYear();
        int i43 = calDay41.getYear();
        cs362.Appt appt51 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt51.setStartHour(1);
        appt51.setStartMonth((int) (short) -1);
        int i56 = appt51.getStartMonth();
        calDay41.addAppt(appt51);
        appt51.setStartHour(0);
        calDay39.addAppt(appt51);
        appt51.setStartYear(0);
        appt51.setStartDay(1);
        int i65 = appt51.getStartMonth();
        calDay0.addAppt(appt51);
        java.util.Iterator<?> iterator_wildcard67 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt68 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertNull(iterator_wildcard40);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertNull(iterator_wildcard67);
        org.junit.Assert.assertNull(linkedlist_appt68);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        appt7.setStartMinute((int) (short) 0);
        boolean b16 = appt7.getValid();
        appt7.setStartMonth(100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        appt7.setStartMonth(97);
        java.lang.String str10 = appt7.toString();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartMinute(10);
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i14 == 10);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, 52, (-1), (int) (byte) 0, (int) (byte) 10, "", "hi!");
        int i8 = appt7.getStartMinute();
        int i9 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 52);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        appt10.setStartHour((int) (short) 10);
        appt10.setTitle("");
        int i25 = appt10.getStartMinute();
        boolean b26 = appt10.getValid();
        appt10.setStartYear(97);
        java.lang.String str29 = appt10.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        boolean b23 = calDay0.isValid();
        boolean b24 = calDay0.isValid();
        java.lang.String str25 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt26 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt26);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (int) (byte) 0, (int) (short) -1, (int) '4', "", "hi!");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setTitle("hi!");
        java.lang.String str19 = appt10.getTitle();
        appt10.setStartHour((int) (short) 10);
        int i22 = appt10.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getYear();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) 'a', 97, (int) '#', (int) (short) -1, "", "");
        appt7.setStartMonth((int) (byte) 0);
        java.lang.String str10 = appt7.toString();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        int i16 = appt10.getStartYear();
        boolean b17 = appt10.getValid();
        appt10.setStartMinute((int) (byte) -1);
        calDay0.addAppt(appt10);
        appt10.setStartYear((int) (byte) 10);
        appt10.setDescription("");
        int i25 = appt10.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i25 == 10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        appt7.setStartMonth((int) (short) 1);
        appt7.setStartHour(100);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        cs362.Appt appt7 = new cs362.Appt(52, (int) 'a', 97, (int) (short) 1, (int) (short) 100, "", "hi!");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        boolean b17 = appt10.getValid();
        java.lang.String str18 = appt10.getTitle();
        appt10.setStartMinute((int) '4');
        int i21 = appt10.getStartYear();
        java.lang.String str22 = appt10.getTitle();
        java.lang.String str23 = appt10.toString();
        appt10.setStartMinute((int) (short) 100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        java.lang.String str15 = appt7.toString();
        appt7.setDescription("");
        java.lang.String str18 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartYear(0);
        appt11.setTitle("");
        appt11.setStartMonth(97);
        appt11.setStartMonth((int) '4');
        calDay0.addAppt(appt11);
        appt11.setTitle("hi!");
        appt11.setDescription("hi!");
        int i29 = appt11.getStartMonth();
        java.lang.String str30 = appt11.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i29 == 52);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartDay(1);
        int i20 = appt7.getStartYear();
        appt7.setStartMonth((int) 'a');
        java.lang.String str23 = appt7.getTitle();
        int i24 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        appt7.setStartMonth(10);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setDescription("");
        appt7.setStartHour(100);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartMonth();
        boolean b18 = appt7.getValid();
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartYear((int) (byte) -1);
        appt7.setDescription("hi!");
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.toString();
        java.lang.String str22 = appt7.toString();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getDay();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        int i11 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard12 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard13 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard14 = calDay0.iterator();
        int i15 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(iterator_wildcard12);
        org.junit.Assert.assertNull(iterator_wildcard13);
        org.junit.Assert.assertNull(iterator_wildcard14);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) 10, 97, (int) (short) 10, 0, "hi!", "hi!");
        java.lang.String str8 = appt7.toString();
        int i9 = appt7.getStartMinute();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartYear((int) (short) 100);
        boolean b19 = appt11.getValid();
        appt11.setStartMinute((int) 'a');
        calDay0.addAppt(appt11);
        java.lang.String str23 = calDay0.toString();
        java.lang.String str24 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        java.lang.String str22 = calDay0.toString();
        cs362.Appt appt30 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt30.setStartHour(1);
        int i33 = appt30.getStartYear();
        java.lang.String str34 = appt30.toString();
        int i35 = appt30.getStartHour();
        calDay0.addAppt(appt30);
        int i37 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartYear((int) (short) 10);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        appt7.setStartDay((int) 'a');
        appt7.setTitle("");
        appt7.setTitle("hi!");
        appt7.setStartDay((int) ' ');
        appt7.setStartDay((int) (byte) 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        int i19 = calDay0.getMonth();
        cs362.Appt appt27 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        calDay0.addAppt(appt27);
        appt27.setStartMinute((int) (byte) 0);
        appt27.setStartDay((int) (short) 10);
        appt27.setDescription("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartDay();
        appt7.setStartDay((int) (byte) 100);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 1, 52, (int) (short) -1, (int) (short) 100, "", "hi!");
        int i8 = appt7.getStartYear();
        int i9 = appt7.getStartYear();
        appt7.setStartDay((int) '4');
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == 100);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        int i22 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        int i34 = appt31.getStartYear();
        boolean b35 = appt31.getValid();
        appt31.setStartMonth((int) (short) -1);
        int i38 = appt31.getStartMonth();
        int i39 = appt31.getStartYear();
        appt31.setStartYear((int) (short) -1);
        calDay0.addAppt(appt31);
        java.util.LinkedList<cs362.Appt> linkedlist_appt43 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(i39 == 97);
        org.junit.Assert.assertNull(linkedlist_appt43);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) -1, 97, (int) 'a', 100, (int) (byte) 100, "hi!", "");
        boolean b8 = appt7.getValid();
        java.lang.String str9 = appt7.getTitle();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        boolean b3 = calDay0.isValid();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        java.lang.String str15 = appt11.toString();
        appt11.setStartYear((int) (short) 100);
        calDay0.addAppt(appt11);
        appt11.setStartMonth((int) (short) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.getDescription();
        appt7.setStartHour(35);
        appt7.setStartMinute(52);
        int i26 = appt7.getStartYear();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        appt14.setStartHour((int) '#');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (byte) 0, (int) (byte) 0, (int) (byte) -1, (int) (short) -1, "", "hi!");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setTitle("");
        appt7.setStartYear(1);
        int i21 = appt7.getStartHour();
        appt7.setStartDay((int) (byte) 1);
        java.lang.String str24 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) (short) 100);
        java.lang.String str16 = appt7.getDescription();
        appt7.setTitle("");
        boolean b19 = appt7.getValid();
        int i20 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        cs362.CalDay calDay5 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard6 = calDay5.iterator();
        cs362.CalDay calDay7 = new cs362.CalDay();
        int i8 = calDay7.getYear();
        int i9 = calDay7.getYear();
        cs362.Appt appt17 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt17.setStartHour(1);
        appt17.setStartMonth((int) (short) -1);
        int i22 = appt17.getStartMonth();
        calDay7.addAppt(appt17);
        appt17.setStartHour(0);
        calDay5.addAppt(appt17);
        appt17.setStartYear(0);
        appt17.setStartDay(1);
        int i31 = appt17.getStartMonth();
        appt17.setDescription("hi!");
        appt17.setStartHour((int) '4');
        calDay0.addAppt(appt17);
        int i37 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        int i19 = appt7.getStartYear();
        appt7.setStartMonth(100);
        appt7.setTitle("");
        appt7.setStartMinute((int) 'a');
        appt7.setStartMonth((int) (short) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setDescription("");
        int i17 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartDay(1);
        int i20 = appt7.getStartYear();
        appt7.setStartMonth((int) 'a');
        appt7.setStartMinute(0);
        appt7.setStartDay(1);
        appt7.setStartHour(10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getDay();
        java.lang.String str9 = calDay0.toString();
        int i10 = calDay0.getMonth();
        int i11 = calDay0.getDay();
        int i12 = calDay0.getMonth();
        cs362.CalDay calDay13 = new cs362.CalDay();
        int i14 = calDay13.getYear();
        int i15 = calDay13.getYear();
        cs362.Appt appt23 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt23.setStartHour(1);
        appt23.setStartMonth((int) (short) -1);
        int i28 = appt23.getStartMonth();
        calDay13.addAppt(appt23);
        appt23.setStartHour(0);
        int i32 = appt23.getStartYear();
        int i33 = appt23.getStartYear();
        int i34 = appt23.getStartYear();
        calDay0.addAppt(appt23);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(i32 == 97);
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertTrue(i34 == 97);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        cs362.Appt appt7 = new cs362.Appt(10, (int) 'a', 52, (int) 'a', (int) ' ', "hi!", "");
        int i8 = appt7.getStartHour();
        appt7.setStartDay((int) 'a');
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        boolean b17 = appt10.getValid();
        java.lang.String str18 = appt10.getTitle();
        int i19 = appt10.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        int i19 = calDay0.getDay();
        int i20 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt21 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(linkedlist_appt21);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getYear();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        cs362.Appt appt46 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt46.setStartHour(1);
        appt46.setStartMinute((int) (byte) 10);
        appt46.setStartYear(0);
        appt46.setTitle("hi!");
        appt46.setDescription("");
        calDay0.addAppt(appt46);
        int i58 = appt46.getStartMonth();
        appt46.setStartDay((int) '4');
        int i61 = appt46.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertTrue(i61 == 10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        int i27 = calDay0.getDay();
        int i28 = calDay0.getYear();
        int i29 = calDay0.getMonth();
        cs362.Appt appt37 = new cs362.Appt(52, (-1), 10, (int) 'a', (int) (short) 10, "hi!", "");
        appt37.setStartHour(1);
        appt37.setStartDay((int) (byte) -1);
        calDay0.addAppt(appt37);
        int i43 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        java.lang.String str17 = appt7.getDescription();
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        cs362.Appt appt27 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt27.setStartHour(1);
        appt27.setStartMinute((int) (byte) 10);
        appt27.setStartYear(0);
        int i34 = appt27.getStartMonth();
        calDay0.addAppt(appt27);
        boolean b36 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard37 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt38 = calDay0.getAppts();
        cs362.CalDay calDay39 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard40 = calDay39.iterator();
        cs362.CalDay calDay41 = new cs362.CalDay();
        int i42 = calDay41.getYear();
        int i43 = calDay41.getYear();
        cs362.Appt appt51 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt51.setStartHour(1);
        appt51.setStartMonth((int) (short) -1);
        int i56 = appt51.getStartMonth();
        calDay41.addAppt(appt51);
        appt51.setStartHour(0);
        calDay39.addAppt(appt51);
        appt51.setStartYear(0);
        appt51.setStartDay(1);
        int i65 = appt51.getStartMonth();
        calDay0.addAppt(appt51);
        java.util.Iterator<?> iterator_wildcard67 = calDay0.iterator();
        cs362.Appt appt75 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt75.setStartHour(1);
        appt75.setStartMinute((int) (byte) 10);
        appt75.setStartYear(0);
        appt75.setStartHour((int) '#');
        appt75.setStartHour((int) (short) 10);
        int i86 = appt75.getStartDay();
        int i87 = appt75.getStartMinute();
        calDay0.addAppt(appt75);
        int i89 = appt75.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertNull(iterator_wildcard40);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i56 == (-1));
        org.junit.Assert.assertTrue(i65 == (-1));
        org.junit.Assert.assertNull(iterator_wildcard67);
        org.junit.Assert.assertTrue(i86 == 52);
        org.junit.Assert.assertTrue(i87 == 10);
        org.junit.Assert.assertTrue(i89 == 1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 1, 52, (int) (short) -1, (int) (short) 100, "", "hi!");
        int i8 = appt7.getStartYear();
        int i9 = appt7.getStartHour();
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        appt7.setStartMonth(97);
        appt7.setStartDay(52);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        cs362.CalDay calDay0 = new cs362.CalDay();
        cs362.CalDay calDay1 = new cs362.CalDay();
        int i2 = calDay1.getYear();
        int i3 = calDay1.getYear();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        calDay1.addAppt(appt11);
        appt11.setStartHour(0);
        int i20 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        boolean b22 = calDay0.isValid();
        int i23 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 0, 97, (int) (byte) 100, (int) (short) 1, "", "hi!");
        appt7.setTitle("");
        boolean b10 = appt7.getValid();
        appt7.setStartMinute((int) (short) 1);
        appt7.setStartMonth(52);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour((int) (byte) 10);
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartYear((int) (byte) 0);
        int i13 = appt7.getStartMinute();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        appt7.setTitle("");
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        int i17 = appt11.getStartYear();
        boolean b18 = appt11.getValid();
        java.lang.String str19 = appt11.getTitle();
        java.lang.String str20 = appt11.getTitle();
        calDay0.addAppt(appt11);
        appt11.setStartDay(10);
        int i24 = appt11.getStartHour();
        appt11.setStartMonth(0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        appt12.setStartYear(0);
        appt12.setStartDay(1);
        int i26 = appt12.getStartMonth();
        appt12.setDescription("hi!");
        boolean b29 = appt12.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, 32, (int) (byte) 100, (int) (short) 1, "hi!", "");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.lang.String str6 = calDay0.toString();
        java.lang.String str7 = calDay0.toString();
        cs362.Appt appt15 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt15.setStartHour(1);
        appt15.setStartMinute((int) (byte) 10);
        appt15.setStartYear(0);
        int i22 = appt15.getStartMonth();
        int i23 = appt15.getStartDay();
        appt15.setStartMinute(1);
        calDay0.addAppt(appt15);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i23 == 52);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        int i8 = calDay0.getYear();
        int i9 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        boolean b16 = appt7.getValid();
        java.lang.String str17 = appt7.getDescription();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        java.lang.String str13 = appt7.getTitle();
        appt7.setTitle("hi!");
        java.lang.String str16 = appt7.getDescription();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartHour(0);
        int i19 = appt10.getStartYear();
        appt10.setStartYear((int) (byte) 0);
        java.lang.String str22 = appt10.toString();
        int i23 = appt10.getStartHour();
        int i24 = appt10.getStartDay();
        appt10.setStartDay(1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 52);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        appt7.setStartYear((int) '4');
        java.lang.String str14 = appt7.getTitle();
        boolean b15 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setDescription("");
        int i17 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        cs362.Appt appt13 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt13.setStartHour(1);
        appt13.setStartMinute((int) (byte) 10);
        appt13.setStartYear(0);
        appt13.setTitle("hi!");
        appt13.setStartYear((int) (byte) -1);
        appt13.setDescription("hi!");
        java.lang.String str26 = appt13.getTitle();
        boolean b27 = appt13.getValid();
        calDay0.addAppt(appt13);
        cs362.CalDay calDay29 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard30 = calDay29.iterator();
        cs362.CalDay calDay31 = new cs362.CalDay();
        int i32 = calDay31.getYear();
        int i33 = calDay31.getYear();
        cs362.Appt appt41 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt41.setStartHour(1);
        appt41.setStartMonth((int) (short) -1);
        int i46 = appt41.getStartMonth();
        calDay31.addAppt(appt41);
        appt41.setStartHour(0);
        calDay29.addAppt(appt41);
        appt41.setStartYear(0);
        appt41.setStartDay(1);
        java.lang.String str55 = appt41.getTitle();
        java.lang.String str56 = appt41.toString();
        calDay0.addAppt(appt41);
        appt41.setDescription("hi!");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(iterator_wildcard30);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getDay();
        int i7 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        int i6 = calDay4.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        calDay4.addAppt(appt14);
        appt14.setStartHour(0);
        java.lang.String str23 = appt14.getDescription();
        appt14.setStartMonth(100);
        calDay0.addAppt(appt14);
        int i27 = appt14.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i27 == 100);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.getDescription();
        appt7.setDescription("hi!");
        appt7.setStartYear(10);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartHour();
        int i17 = appt7.getStartMonth();
        appt7.setStartDay(32);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMinute();
        appt11.setStartHour((int) '4');
        calDay0.addAppt(appt11);
        boolean b20 = calDay0.isValid();
        java.lang.String str21 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        java.lang.String str23 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        appt7.setStartMinute(52);
        java.lang.String str22 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        int i17 = appt14.getStartYear();
        boolean b18 = appt14.getValid();
        java.lang.String str19 = appt14.toString();
        calDay0.addAppt(appt14);
        java.util.Iterator<?> iterator_wildcard21 = calDay0.iterator();
        boolean b22 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        appt31.setStartMinute((int) (byte) 10);
        boolean b36 = appt31.getValid();
        java.lang.String str37 = appt31.getDescription();
        appt31.setStartMonth((-1));
        java.lang.String str40 = appt31.getTitle();
        calDay0.addAppt(appt31);
        int i42 = appt31.getStartHour();
        int i43 = appt31.getStartDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue(i43 == 52);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        cs362.Appt appt7 = new cs362.Appt(10, (int) 'a', 52, (int) 'a', (int) ' ', "hi!", "");
        appt7.setStartHour(35);
        appt7.setTitle("");
        int i12 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == 32);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 100, (int) 'a', 1, (int) '4', "", "");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 1, (int) 'a', (int) (byte) 0, 0, "hi!", "hi!");
        int i8 = appt7.getStartDay();
        java.lang.String str9 = appt7.getTitle();
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        appt7.setStartDay((int) (byte) 1);
        int i10 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.getDescription();
        appt7.setStartHour(35);
        appt7.setStartMinute(52);
        int i26 = appt7.getStartYear();
        java.lang.String str27 = appt7.toString();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartHour();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        appt12.setStartHour(0);
        calDay0.addAppt(appt12);
        appt12.setStartYear(0);
        appt12.setStartDay(1);
        java.lang.String str26 = appt12.getTitle();
        appt12.setStartMonth((int) ' ');
        java.lang.String str29 = appt12.getTitle();
        int i30 = appt12.getStartDay();
        appt12.setStartHour((int) (short) 0);
        appt12.setStartMinute(1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(i30 == 1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartYear(100);
        int i16 = appt7.getStartHour();
        appt7.setStartDay(32);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartHour(0);
        java.lang.String str19 = appt10.getDescription();
        appt10.setStartMonth(100);
        int i22 = appt10.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i22 == 100);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setStartYear(100);
        appt7.setStartMonth(100);
        appt7.setStartYear((int) (byte) 100);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartDay();
        int i14 = appt7.getStartYear();
        int i15 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 52);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(i15 == 1);
    }
}

