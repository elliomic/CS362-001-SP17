import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMonth(35);
        appt7.setStartYear((int) (byte) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartDay();
        java.lang.String str18 = appt7.getTitle();
        int i19 = appt7.getStartHour();
        boolean b20 = appt7.getValid();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
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
        java.lang.String str24 = appt7.toString();
        int i25 = appt7.getStartMinute();
        int i26 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
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
        org.junit.Assert.assertNull(iterator_wildcard24);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getMonth();
        java.lang.String str8 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
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
        appt12.setDescription("");
        appt12.setTitle("hi!");
        java.lang.String str28 = appt12.getDescription();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        cs362.Appt appt7 = new cs362.Appt(10, (int) (byte) 0, (int) '#', (-1), 0, "hi!", "");
        appt7.setStartHour((int) (byte) 1);
        int i10 = appt7.getStartMinute();
        java.lang.String str11 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartMinute(0);
        boolean b18 = appt7.getValid();
        appt7.setDescription("hi!");
        appt7.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        int i10 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard11 = calDay0.iterator();
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
        org.junit.Assert.assertNull(iterator_wildcard11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getDescription();
        java.lang.String str16 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) '4');
        boolean b16 = appt7.getValid();
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
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
        boolean b24 = calDay0.isValid();
        int i25 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
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
        int i21 = appt7.getStartHour();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.getDescription();
        int i14 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        appt7.setStartYear((int) (byte) 0);
        int i21 = appt7.getStartMinute();
        java.lang.String str22 = appt7.toString();
        appt7.setStartDay((int) (short) 10);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 100, (-1), (int) ' ', (int) (byte) 10, "hi!", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 32);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
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
        java.util.Iterator<?> iterator_wildcard39 = calDay0.iterator();
        int i40 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt41 = calDay0.getAppts();
        int i42 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(linkedlist_appt38);
        org.junit.Assert.assertNull(iterator_wildcard39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNull(linkedlist_appt41);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
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
        appt10.setTitle("hi!");
        java.lang.String str22 = appt10.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartHour();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartYear(100);
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
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
        appt11.setStartYear((int) 'a');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100, 0, "hi!", "hi!");
        appt7.setStartMinute((int) (byte) -1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
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
        java.lang.String str37 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        cs362.Appt appt7 = new cs362.Appt((int) 'a', 10, (int) (short) 1, (int) '#', (int) (short) 10, "hi!", "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, 52, (int) 'a', 97, (int) (byte) 0, "\t1/10/97 at 1:1am ,, \n", "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 10);
        appt7.setStartMinute((int) (byte) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
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
        int i22 = appt12.getStartMonth();
        java.lang.String str23 = appt12.getTitle();
        appt12.setTitle("hi!");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) 10, 97, (int) (short) 10, 0, "hi!", "hi!");
        java.lang.String str8 = appt7.toString();
        boolean b9 = appt7.getValid();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
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
        int i22 = appt12.getStartHour();
        java.lang.String str23 = appt12.getDescription();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        boolean b17 = appt7.getValid();
        appt7.setTitle("hi!");
        int i20 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMinute();
        appt12.setStartHour((int) '4');
        int i20 = appt12.getStartDay();
        java.lang.String str21 = appt12.toString();
        appt12.setTitle("");
        appt12.setStartYear(1);
        int i26 = appt12.getStartHour();
        int i27 = appt12.getStartDay();
        calDay0.addAppt(appt12);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i20 == 52);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i26 == 52);
        org.junit.Assert.assertTrue(i27 == 52);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        int i14 = appt7.getStartMonth();
        java.lang.String str15 = appt7.toString();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
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
        java.util.Iterator<?> iterator_wildcard63 = calDay0.iterator();
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
        org.junit.Assert.assertNull(iterator_wildcard63);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.lang.String str6 = calDay0.toString();
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(iterator_wildcard9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartDay();
        java.lang.String str17 = appt7.getDescription();
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
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
        appt12.setDescription("");
        appt12.setTitle("hi!");
        int i28 = appt12.getStartDay();
        java.lang.String str29 = appt12.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i28 == 52);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        cs362.CalDay calDay4 = new cs362.CalDay();
        int i5 = calDay4.getYear();
        java.lang.String str6 = calDay4.toString();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        int i20 = appt14.getStartYear();
        boolean b21 = appt14.getValid();
        appt14.setStartMinute((int) (byte) -1);
        calDay4.addAppt(appt14);
        appt14.setStartYear((int) (byte) 10);
        calDay0.addAppt(appt14);
        java.lang.String str28 = appt14.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
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
        boolean b67 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        appt7.setStartDay((int) '4');
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getYear();
        int i9 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        int i6 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getYear();
        boolean b25 = calDay0.isValid();
        cs362.CalDay calDay26 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard27 = calDay26.iterator();
        cs362.CalDay calDay28 = new cs362.CalDay();
        int i29 = calDay28.getYear();
        int i30 = calDay28.getYear();
        cs362.Appt appt38 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt38.setStartHour(1);
        appt38.setStartMonth((int) (short) -1);
        int i43 = appt38.getStartMonth();
        calDay28.addAppt(appt38);
        appt38.setStartHour(0);
        calDay26.addAppt(appt38);
        java.lang.String str48 = calDay26.toString();
        cs362.Appt appt56 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt56.setStartHour(1);
        int i59 = appt56.getStartYear();
        java.lang.String str60 = appt56.toString();
        int i61 = appt56.getStartHour();
        calDay26.addAppt(appt56);
        java.lang.String str63 = appt56.getTitle();
        appt56.setStartDay((int) '4');
        appt56.setStartMinute((int) (short) 100);
        calDay0.addAppt(appt56);
        appt56.setStartYear((int) (byte) 0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(iterator_wildcard27);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(i59 == 97);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
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
        appt47.setStartMinute(1);
        appt47.setTitle("");
        appt47.setStartYear((-1));
        java.lang.String str62 = appt47.toString();
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
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "\t1/10/-1 at 1:1am ,, \n" + "'", str62.equals("\t1/10/-1 at 1:1am ,, \n"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
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
        appt7.setStartHour((int) '#');
        appt7.setStartDay(0);
        int i27 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue(i27 == 35);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
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
        cs362.Appt appt17 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt17.setStartHour(1);
        appt17.setStartMinute((int) (byte) 10);
        appt17.setStartDay((-1));
        appt17.setDescription("");
        int i26 = appt17.getStartYear();
        java.lang.String str27 = appt17.getDescription();
        int i28 = appt17.getStartDay();
        appt17.setStartHour((int) (short) 100);
        appt17.setStartMonth((int) 'a');
        appt17.setStartMonth((int) (byte) 0);
        int i35 = appt17.getStartMinute();
        appt17.setDescription("hi!");
        appt17.setStartHour((int) 'a');
        calDay0.addAppt(appt17);
        int i41 = calDay0.getMonth();
        int i42 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i26 == 97);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(i28 == (-1));
        org.junit.Assert.assertTrue(i35 == 10);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 1, 52, (int) (short) -1, (int) (short) 100, "", "hi!");
        int i8 = appt7.getStartYear();
        int i9 = appt7.getStartHour();
        int i10 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i8 == 100);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 100, (int) (short) -1, (int) (byte) 0, 100, "\t1/10/97 at 1:1am ,, \n", "\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
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
        java.lang.String str29 = calDay0.toString();
        boolean b30 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard31 = calDay0.iterator();
        boolean b32 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(iterator_wildcard31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartDay();
        appt7.setStartHour((int) (short) 100);
        appt7.setStartMonth((int) 'a');
        int i23 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i23 == 97);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
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
        cs362.CalDay calDay38 = new cs362.CalDay();
        int i39 = calDay38.getYear();
        int i40 = calDay38.getYear();
        cs362.Appt appt48 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt48.setStartHour(1);
        appt48.setStartMonth((int) (short) -1);
        int i53 = appt48.getStartMonth();
        calDay38.addAppt(appt48);
        boolean b55 = appt48.getValid();
        java.lang.String str56 = appt48.getDescription();
        boolean b57 = appt48.getValid();
        appt48.setTitle("");
        appt48.setStartHour((int) '4');
        boolean b62 = appt48.getValid();
        java.lang.String str63 = appt48.getDescription();
        calDay0.addAppt(appt48);
        int i65 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        cs362.Appt appt7 = new cs362.Appt(10, (int) (byte) 10, 10, (int) (short) 100, (int) (byte) 100, "\t1/10/-1 at 1:1am ,, \n", "\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        cs362.Appt appt15 = new cs362.Appt(52, (-1), (int) ' ', (int) (short) -1, (int) (short) 0, "", "");
        calDay0.addAppt(appt15);
        appt15.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 10, 100, (int) (short) -1, (int) (short) 1, "\t1/10/-1 at 1:1am ,, \n", "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
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
        java.lang.String str61 = appt46.getDescription();
        int i62 = appt46.getStartHour();
        appt46.setStartMonth(10);
        boolean b65 = appt46.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue(i62 == 1);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        int i17 = appt11.getStartYear();
        int i18 = appt11.getStartYear();
        java.lang.String str19 = appt11.getTitle();
        java.lang.String str20 = appt11.toString();
        calDay0.addAppt(appt11);
        boolean b22 = calDay0.isValid();
        cs362.CalDay calDay23 = new cs362.CalDay();
        int i24 = calDay23.getYear();
        int i25 = calDay23.getYear();
        java.lang.String str26 = calDay23.toString();
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        appt34.setStartMonth((int) (short) -1);
        int i39 = appt34.getStartMinute();
        appt34.setStartHour((int) '4');
        calDay23.addAppt(appt34);
        cs362.Appt appt50 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt50.setStartHour(1);
        appt50.setStartMinute((int) (byte) 10);
        appt50.setStartYear(0);
        int i57 = appt50.getStartMonth();
        calDay23.addAppt(appt50);
        appt50.setStartYear(97);
        int i61 = appt50.getStartMonth();
        appt50.setStartMinute((int) (short) -1);
        calDay0.addAppt(appt50);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i57 == 1);
        org.junit.Assert.assertTrue(i61 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setStartYear(100);
        int i19 = appt7.getStartHour();
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
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
        int i22 = appt7.getStartHour();
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 52);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMonth();
        appt7.setStartMonth((int) 'a');
        appt7.setStartDay((int) (byte) -1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
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
        appt47.setStartDay((int) '4');
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
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        appt7.setStartDay((-1));
        int i22 = appt7.getStartDay();
        appt7.setStartMonth((int) '4');
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (int) (byte) 0, (int) (short) -1, (int) '4', "", "hi!");
        appt7.setStartHour((int) (short) 0);
        int i10 = appt7.getStartYear();
        appt7.setStartMonth((int) (byte) 0);
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
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
        java.lang.String str26 = appt7.getDescription();
        java.lang.String str27 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
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
        java.lang.String str38 = calDay0.toString();
        boolean b39 = calDay0.isValid();
        cs362.Appt appt47 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        appt47.setStartYear((int) (byte) 0);
        calDay0.addAppt(appt47);
        int i51 = appt47.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i51 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
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
        boolean b27 = appt12.getValid();
        boolean b28 = appt12.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
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
        int i27 = appt12.getStartDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(i27 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
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
        int i22 = calDay0.getDay();
        cs362.Appt appt30 = new cs362.Appt((int) (byte) 10, (int) ' ', (int) 'a', 0, (int) (short) 100, "", "hi!");
        calDay0.addAppt(appt30);
        int i32 = appt30.getStartHour();
        appt30.setStartHour((int) 'a');
        appt30.setStartDay((int) (byte) 1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i32 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        java.lang.String str22 = appt7.toString();
        boolean b23 = appt7.getValid();
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
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
        java.lang.String str29 = calDay0.toString();
        boolean b30 = calDay0.isValid();
        java.lang.String str31 = calDay0.toString();
        int i32 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        appt7.setStartMonth((int) ' ');
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        java.lang.String str15 = appt7.toString();
        appt7.setStartMinute((int) (short) 1);
        appt7.setTitle("hi!");
        int i20 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
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
        appt7.setStartMinute((int) 'a');
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartMinute();
        int i13 = appt7.getStartHour();
        appt7.setStartMonth(52);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        java.lang.String str15 = appt7.toString();
        int i16 = appt7.getStartMinute();
        int i17 = appt7.getStartHour();
        appt7.setDescription("");
        int i20 = appt7.getStartMinute();
        java.lang.String str21 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
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
        int i26 = calDay0.getYear();
        boolean b27 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard28 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(iterator_wildcard28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str14 = appt7.toString();
        java.lang.String str15 = appt7.getTitle();
        int i16 = appt7.getStartYear();
        appt7.setTitle("");
        int i19 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i19 == 52);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, (int) '#', (int) (short) 10, (int) (byte) 1, 0, "", "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
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
        appt10.setStartHour(0);
        appt10.setStartYear((int) (byte) 1);
        int i26 = appt10.getStartDay();
        appt10.setStartMonth(52);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i26 == 52);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 100, (-1), (int) ' ', (int) (byte) 10, "hi!", "");
        int i8 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
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
        java.lang.String str38 = appt27.toString();
        java.lang.String str39 = appt27.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        cs362.Appt appt7 = new cs362.Appt((int) 'a', (int) (short) 100, (int) ' ', 1, (int) '#', "hi!", "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        cs362.Appt appt7 = new cs362.Appt((-1), 32, 52, (int) '#', (int) 'a', "\t1/10/97 at 1:1am ,, \n", "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        int i13 = appt7.getStartMinute();
        int i14 = appt7.getStartYear();
        appt7.setStartMinute(1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour(100);
        appt7.setStartMonth((int) ' ');
        appt7.setStartYear((int) ' ');
        int i21 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i21 == 32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
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
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        int i34 = appt31.getStartYear();
        boolean b35 = appt31.getValid();
        appt31.setTitle("hi!");
        appt31.setTitle("");
        appt31.setStartDay(0);
        calDay0.addAppt(appt31);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i34 == 97);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        int i19 = appt7.getStartMinute();
        appt7.setStartMinute((int) ' ');
        appt7.setStartMinute((int) (byte) 1);
        int i24 = appt7.getStartDay();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
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
        int i30 = appt14.getStartDay();
        java.lang.String str31 = appt14.getTitle();
        java.lang.String str32 = appt14.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue(i30 == 52);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
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
        int i20 = calDay0.getMonth();
        int i21 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
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
        int i20 = calDay0.getYear();
        cs362.CalDay calDay21 = new cs362.CalDay();
        int i22 = calDay21.getYear();
        int i23 = calDay21.getYear();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        appt31.setStartMonth((int) (short) -1);
        int i36 = appt31.getStartMonth();
        calDay21.addAppt(appt31);
        boolean b38 = appt31.getValid();
        java.lang.String str39 = appt31.getTitle();
        appt31.setStartMinute((int) '4');
        int i42 = appt31.getStartYear();
        calDay0.addAppt(appt31);
        appt31.setStartYear(0);
        appt31.setDescription("hi!");
        appt31.setStartYear((int) (short) 0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(i42 == 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
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
        int i29 = appt27.getStartMonth();
        appt27.setStartYear((int) (byte) -1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 1, 10, (int) 'a', 97, (int) (byte) -1, "hi!", "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        appt7.setStartDay(97);
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        appt7.setStartMinute((int) 'a');
        appt7.setStartMinute(1);
        boolean b20 = appt7.getValid();
        int i21 = appt7.getStartDay();
        java.lang.String str22 = appt7.toString();
        java.lang.String str23 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 10);
        int i20 = appt7.getStartYear();
        java.lang.String str21 = appt7.getDescription();
        appt7.setStartDay((int) '4');
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.toString();
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
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
        int i22 = calDay0.getMonth();
        int i23 = calDay0.getDay();
        boolean b24 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
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
        appt12.setDescription("");
        int i26 = appt12.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
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
        int i24 = calDay0.getDay();
        int i25 = calDay0.getDay();
        java.lang.String str26 = calDay0.toString();
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
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
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
        java.lang.String str27 = appt12.toString();
        appt12.setStartDay((int) (byte) 1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
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
        cs362.CalDay calDay22 = new cs362.CalDay();
        int i23 = calDay22.getYear();
        int i24 = calDay22.getYear();
        java.lang.String str25 = calDay22.toString();
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        appt33.setStartMonth((int) (short) -1);
        int i38 = appt33.getStartMinute();
        appt33.setStartHour((int) '4');
        calDay22.addAppt(appt33);
        cs362.Appt appt49 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt49.setStartHour(1);
        appt49.setStartMinute((int) (byte) 10);
        appt49.setStartYear(0);
        int i56 = appt49.getStartMonth();
        calDay22.addAppt(appt49);
        appt49.setStartYear(97);
        int i60 = appt49.getStartMonth();
        calDay0.addAppt(appt49);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(i56 == 1);
        org.junit.Assert.assertTrue(i60 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        appt7.setStartMinute(52);
        java.lang.String str17 = appt7.getTitle();
        java.lang.String str18 = appt7.getTitle();
        int i19 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt67 = calDay0.getAppts();
        int i68 = calDay0.getMonth();
        boolean b69 = calDay0.isValid();
        int i70 = calDay0.getDay();
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
        org.junit.Assert.assertNull(linkedlist_appt67);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(i70 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        boolean b15 = appt7.getValid();
        appt7.setStartDay((int) (short) 10);
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
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
        boolean b24 = calDay0.isValid();
        int i25 = calDay0.getYear();
        int i26 = calDay0.getYear();
        int i27 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getDay();
        java.lang.String str4 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartDay();
        java.lang.String str19 = appt7.getTitle();
        appt7.setStartYear((int) (short) 100);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        appt7.setStartMinute(0);
        java.lang.String str16 = appt7.getTitle();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i19 = appt7.getStartDay();
        appt7.setStartYear(0);
        int i22 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
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
        java.util.GregorianCalendar gregorianCalendar79 = null;
        java.util.GregorianCalendar gregorianCalendar80 = null;
        try {
            java.util.LinkedList<cs362.CalDay> linkedlist_calDay81 = timeTable0.getApptRange(linkedlist_appt78, gregorianCalendar79, gregorianCalendar80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getMonth();
        int i8 = calDay0.getDay();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        appt7.setStartMinute((-1));
        java.lang.String str22 = appt7.toString();
        java.lang.String str23 = appt7.toString();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
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
        int i22 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) 1, (int) (byte) 1, 97, 1, "", "\t1/10/97 at 1:1am ,, \n");
        appt7.setStartMinute(0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear(1);
        appt7.setStartYear(1);
        int i17 = appt7.getStartMinute();
        appt7.setStartMinute((int) 'a');
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
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
        int i11 = calDay0.getMonth();
        boolean b12 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        int i14 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i14 == 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
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
        int i24 = calDay0.getYear();
        cs362.CalDay calDay25 = new cs362.CalDay();
        int i26 = calDay25.getYear();
        int i27 = calDay25.getYear();
        cs362.Appt appt35 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt35.setStartHour(1);
        appt35.setStartMonth((int) (short) -1);
        int i40 = appt35.getStartMonth();
        calDay25.addAppt(appt35);
        appt35.setStartHour(0);
        appt35.setStartMinute((int) (byte) 0);
        int i46 = appt35.getStartMonth();
        calDay0.addAppt(appt35);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(i46 == (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        appt7.setStartYear(35);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
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
        appt14.setStartHour((int) (short) 0);
        appt14.setStartMinute((int) (short) 0);
        appt14.setStartYear((int) (short) 10);
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getYear();
        java.lang.String str25 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard26 = calDay0.iterator();
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        appt34.setStartMonth((int) (short) -1);
        int i39 = appt34.getStartMonth();
        int i40 = appt34.getStartYear();
        boolean b41 = appt34.getValid();
        appt34.setTitle("hi!");
        appt34.setTitle("");
        appt34.setStartYear(1);
        java.lang.String str48 = appt34.getTitle();
        int i49 = appt34.getStartMonth();
        calDay0.addAppt(appt34);
        int i51 = calDay0.getDay();
        boolean b52 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard26);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i40 == 97);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(i49 == (-1));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
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
        appt7.setTitle("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
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
        int i21 = appt14.getStartYear();
        java.lang.String str22 = appt14.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        java.lang.String str16 = appt11.toString();
        java.lang.String str17 = appt11.getDescription();
        appt11.setStartYear(0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth((int) (byte) 100);
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartHour();
        int i22 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i22 == 52);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        cs362.Appt appt7 = new cs362.Appt((int) (short) -1, (int) 'a', (int) '4', (int) (short) -1, (int) '#', "", "");
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setStartMinute(1);
        appt7.setStartMonth(35);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        appt7.setStartHour((int) (byte) 10);
        appt7.setDescription("hi!");
        appt7.setStartYear(10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        appt7.setStartYear((int) (byte) 0);
        int i21 = appt7.getStartMinute();
        java.lang.String str22 = appt7.toString();
        int i23 = appt7.getStartYear();
        appt7.setStartYear((int) (byte) 10);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt4 = calDay0.getAppts();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMinute();
        appt12.setStartYear((int) (short) 100);
        boolean b20 = appt12.getValid();
        java.lang.String str21 = appt12.toString();
        int i22 = appt12.getStartYear();
        java.lang.String str23 = appt12.getDescription();
        calDay0.addAppt(appt12);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 100);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        int i23 = appt7.getStartMonth();
        java.lang.String str24 = appt7.getDescription();
        appt7.setDescription("hi!");
        appt7.setStartYear(52);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
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
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        int i36 = appt33.getStartYear();
        java.lang.String str37 = appt33.toString();
        int i38 = appt33.getStartMinute();
        appt33.setStartYear((int) (byte) 10);
        java.lang.String str41 = appt33.getTitle();
        appt33.setStartYear((int) 'a');
        calDay0.addAppt(appt33);
        int i45 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertTrue(i36 == 97);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str14 = appt7.getDescription();
        int i15 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 52);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
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
        int i30 = appt14.getStartDay();
        java.lang.String str31 = appt14.getTitle();
        appt14.setDescription("");
        int i34 = appt14.getStartMinute();
        appt14.setStartYear(100);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue(i30 == 52);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(i34 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (int) (byte) 0, (int) (short) -1, (int) '4', "", "hi!");
        int i8 = appt7.getStartHour();
        int i9 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        int i20 = appt14.getStartYear();
        boolean b21 = appt14.getValid();
        appt14.setStartMinute((int) (byte) -1);
        int i24 = appt14.getStartYear();
        int i25 = appt14.getStartYear();
        int i26 = appt14.getStartDay();
        appt14.setTitle("");
        calDay0.addAppt(appt14);
        appt14.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue(i25 == 97);
        org.junit.Assert.assertTrue(i26 == 52);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
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
        int i27 = appt11.getStartDay();
        appt11.setStartMonth((int) (byte) 0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i27 == 52);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
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
        cs362.CalDay calDay24 = new cs362.CalDay();
        int i25 = calDay24.getYear();
        java.lang.String str26 = calDay24.toString();
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        appt34.setStartMonth((int) (short) -1);
        int i39 = appt34.getStartMonth();
        int i40 = appt34.getStartYear();
        boolean b41 = appt34.getValid();
        appt34.setStartMinute((int) (byte) -1);
        calDay24.addAppt(appt34);
        appt34.setStartHour((int) (short) 10);
        appt34.setTitle("");
        calDay0.addAppt(appt34);
        int i50 = appt34.getStartMonth();
        int i51 = appt34.getStartDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i40 == 97);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i50 == (-1));
        org.junit.Assert.assertTrue(i51 == 52);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
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
        java.lang.String str29 = appt12.toString();
        appt12.setStartMonth((int) (byte) -1);
        appt12.setTitle("hi!");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartYear(100);
        int i16 = appt7.getStartHour();
        int i17 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.getDescription();
        appt7.setDescription("hi!");
        appt7.setStartYear((int) (short) 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        cs362.Appt appt13 = new cs362.Appt(52, 0, 0, (int) '#', (int) (short) 10, "", "hi!");
        calDay0.addAppt(appt13);
        int i15 = appt13.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertTrue(i15 == 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        int i8 = calDay0.getYear();
        int i9 = calDay0.getYear();
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        appt7.setStartMinute((-1));
        int i22 = appt7.getStartMinute();
        boolean b23 = appt7.getValid();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        appt7.setDescription("");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay(1);
        appt7.setStartHour(1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
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
        int i38 = appt27.getStartMinute();
        int i39 = appt27.getStartMonth();
        int i40 = appt27.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i38 == 10);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(i40 == 10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        java.lang.String str17 = calDay0.toString();
        int i18 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt19 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(linkedlist_appt19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt67 = calDay0.getAppts();
        cs362.Appt appt75 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt75.setStartHour(1);
        appt75.setStartMinute((int) (byte) 10);
        appt75.setStartYear(0);
        appt75.setTitle("");
        java.lang.String str84 = appt75.getDescription();
        appt75.setStartMinute(0);
        int i87 = appt75.getStartMonth();
        java.lang.String str88 = appt75.getDescription();
        calDay0.addAppt(appt75);
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
        org.junit.Assert.assertNull(linkedlist_appt67);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        org.junit.Assert.assertTrue(i87 == 1);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "" + "'", str88.equals(""));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setStartMinute((int) (byte) 0);
        appt7.setStartYear((int) (short) 1);
        int i21 = appt7.getStartMonth();
        java.lang.String str22 = appt7.getDescription();
        appt7.setStartHour((int) (byte) -1);
        int i25 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i25 == 52);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        appt7.setStartDay(52);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartDay(1);
        appt7.setTitle("hi!");
        java.lang.String str22 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        java.lang.String str22 = appt7.getDescription();
        int i23 = appt7.getStartMinute();
        java.lang.String str24 = appt7.toString();
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
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
        java.lang.String str24 = appt12.getDescription();
        appt12.setTitle("hi!");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
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
        appt10.setStartHour(0);
        appt10.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
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
        int i22 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt24 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertNull(linkedlist_appt24);
        org.junit.Assert.assertNull(linkedlist_appt25);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (int) (byte) 0, (int) (short) -1, (int) '4', "", "hi!");
        int i8 = appt7.getStartHour();
        int i9 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(i9 == 32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        cs362.Appt appt7 = new cs362.Appt(0, (int) '4', 52, (int) '#', 1, "hi!", "");
        appt7.setStartHour((int) (short) 0);
        boolean b10 = appt7.getValid();
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartDay();
        appt7.setStartMinute(1);
        appt7.setStartDay((int) (byte) 100);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 52);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 1, (int) 'a', (int) (byte) 0, 0, "hi!", "hi!");
        int i8 = appt7.getStartDay();
        appt7.setStartMonth((int) (byte) 100);
        appt7.setDescription("");
        java.lang.String str13 = appt7.getDescription();
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartDay();
        appt7.setStartDay((int) (byte) 1);
        int i19 = appt7.getStartMinute();
        appt7.setStartYear(32);
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue(i19 == 10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        boolean b3 = calDay0.isValid();
        int i4 = calDay0.getYear();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        cs362.Appt appt7 = new cs362.Appt(0, (int) '4', 52, (int) '#', 1, "hi!", "");
        appt7.setStartHour((int) (short) 0);
        appt7.setTitle("");
        appt7.setStartMonth((-1));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
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
        java.lang.String str21 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(100);
        int i14 = appt7.getStartHour();
        int i15 = appt7.getStartYear();
        int i16 = appt7.getStartMonth();
        appt7.setStartMinute(0);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 1, 52, (int) (short) -1, (int) (short) 100, "", "hi!");
        int i8 = appt7.getStartYear();
        appt7.setStartDay(97);
        appt7.setTitle("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i8 == 100);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        boolean b14 = appt7.getValid();
        appt7.setStartHour((int) 'a');
        appt7.setStartYear((int) (byte) 100);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        java.lang.String str6 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
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
        java.lang.String str22 = appt10.toString();
        appt10.setStartMonth(97);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        int i23 = appt7.getStartMonth();
        java.lang.String str24 = appt7.getDescription();
        appt7.setDescription("hi!");
        appt7.setStartHour(100);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getYear();
        boolean b25 = calDay0.isValid();
        cs362.CalDay calDay26 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard27 = calDay26.iterator();
        cs362.CalDay calDay28 = new cs362.CalDay();
        int i29 = calDay28.getYear();
        int i30 = calDay28.getYear();
        cs362.Appt appt38 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt38.setStartHour(1);
        appt38.setStartMonth((int) (short) -1);
        int i43 = appt38.getStartMonth();
        calDay28.addAppt(appt38);
        appt38.setStartHour(0);
        calDay26.addAppt(appt38);
        java.lang.String str48 = calDay26.toString();
        cs362.Appt appt56 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt56.setStartHour(1);
        int i59 = appt56.getStartYear();
        java.lang.String str60 = appt56.toString();
        int i61 = appt56.getStartHour();
        calDay26.addAppt(appt56);
        java.lang.String str63 = appt56.getTitle();
        appt56.setStartDay((int) '4');
        appt56.setStartMinute((int) (short) 100);
        calDay0.addAppt(appt56);
        appt56.setStartYear(0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(iterator_wildcard27);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i43 == (-1));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue(i59 == 97);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue(i61 == 1);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartMonth();
        appt7.setTitle("");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
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
        java.lang.String str30 = appt12.getTitle();
        int i31 = appt12.getStartMonth();
        appt12.setStartMinute((int) (short) 0);
        int i34 = appt12.getStartMinute();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(i31 == 32);
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
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
        int i27 = appt12.getStartHour();
        appt12.setDescription("");
        java.lang.String str30 = appt12.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartMonth();
        appt7.setTitle("hi!");
        int i19 = appt7.getStartMinute();
        appt7.setTitle("");
        java.lang.String str22 = appt7.getTitle();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
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
        int i22 = appt12.getStartHour();
        int i23 = appt12.getStartMonth();
        int i24 = appt12.getStartHour();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (-1), (int) (byte) -1, 0, (int) (byte) -1, "hi!", "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
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
        int i41 = appt27.getStartHour();
        appt27.setTitle("\t1/10/97 at 1:1am ,, \n");
        appt27.setStartMinute(0);
        appt27.setDescription("");
        int i48 = appt27.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i40 == 10);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i48 == 97);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (byte) -1);
        appt7.setStartMonth((int) (byte) 1);
        int i14 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        appt7.setStartMonth(97);
        appt7.setStartMinute((int) (short) 0);
        appt7.setDescription("");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        appt7.setStartDay(0);
        appt7.setStartHour((int) (short) 10);
        java.lang.String str12 = appt7.getTitle();
        int i13 = appt7.getStartMinute();
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        java.lang.String str16 = appt11.toString();
        int i17 = appt11.getStartDay();
        appt11.setDescription("hi!");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartYear();
        int i22 = appt7.getStartMonth();
        boolean b23 = appt7.getValid();
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
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
        java.lang.String str22 = appt10.getDescription();
        int i23 = appt10.getStartDay();
        appt10.setStartYear(97);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 52);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMonth();
        int i18 = appt7.getStartYear();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 97);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) (short) 100);
        java.lang.String str16 = appt7.getDescription();
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getDay();
        boolean b9 = calDay0.isValid();
        int i10 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        int i17 = appt7.getStartMonth();
        java.lang.String str18 = appt7.toString();
        int i19 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(i19 == 52);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartHour();
        appt7.setStartYear((int) (byte) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(linkedlist_appt25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        int i17 = appt11.getStartYear();
        boolean b18 = appt11.getValid();
        appt11.setStartMinute((int) (byte) -1);
        int i21 = appt11.getStartYear();
        boolean b22 = appt11.getValid();
        boolean b23 = appt11.getValid();
        calDay0.addAppt(appt11);
        java.util.Iterator<?> iterator_wildcard25 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(iterator_wildcard25);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        java.lang.String str8 = appt7.toString();
        appt7.setStartMinute((int) (short) 10);
        appt7.setStartMonth(52);
        appt7.setStartMinute(1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        boolean b17 = appt10.getValid();
        java.lang.String str18 = appt10.getDescription();
        java.lang.String str19 = appt10.getTitle();
        int i20 = appt10.getStartMonth();
        appt10.setStartYear((int) (short) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartYear();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i18 == 97);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
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
        int i38 = appt27.getStartDay();
        int i39 = appt27.getStartMonth();
        appt27.setStartMinute((int) (byte) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i38 == 52);
        org.junit.Assert.assertTrue(i39 == 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartDay();
        appt7.setStartDay(0);
        int i18 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getMonth();
        cs362.Appt appt32 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt32.setStartHour(1);
        appt32.setStartMonth((int) (short) -1);
        int i37 = appt32.getStartMinute();
        appt32.setStartYear((int) (short) 100);
        boolean b40 = appt32.getValid();
        appt32.setStartMinute((int) 'a');
        appt32.setStartMinute(1);
        java.lang.String str45 = appt32.getDescription();
        calDay0.addAppt(appt32);
        appt32.setStartMinute((int) 'a');
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
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
        java.lang.String str69 = appt54.toString();
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
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        appt7.setStartHour((int) ' ');
        appt7.setStartHour(35);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartDay();
        appt7.setStartYear(97);
        int i19 = appt7.getStartDay();
        appt7.setStartYear((int) (byte) 0);
        int i22 = appt7.getStartMinute();
        int i23 = appt7.getStartYear();
        int i24 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartMinute();
        int i17 = appt7.getStartYear();
        appt7.setStartDay((int) (short) 1);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
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
        appt10.setStartMonth(0);
        int i25 = appt10.getStartYear();
        appt10.setDescription("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i25 == 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
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
        int i26 = calDay0.getMonth();
        int i27 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
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
        appt31.setStartDay((int) (byte) 10);
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        boolean b8 = calDay0.isValid();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
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
        java.lang.String str24 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, 0, (int) (byte) 10, 1, (int) '#', "", "hi!");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartYear((int) (short) 0);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        int i16 = appt7.getStartMinute();
        java.lang.String str17 = appt7.getDescription();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        int i8 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
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
        boolean b27 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard28 = calDay0.iterator();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(iterator_wildcard28);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        appt7.setStartHour((int) (byte) 10);
        int i12 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) (short) 10, "", "");
        appt7.setTitle("");
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(100);
        int i14 = appt7.getStartHour();
        appt7.setStartHour(0);
        int i17 = appt7.getStartDay();
        appt7.setStartYear((int) (byte) 100);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
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
        int i24 = calDay0.getMonth();
        int i25 = calDay0.getDay();
        java.lang.String str26 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        int i15 = appt7.getStartMonth();
        appt7.setStartHour((int) '4');
        appt7.setStartHour(100);
        appt7.setTitle("hi!");
        appt7.setStartYear(97);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
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
        java.lang.String str23 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt24 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt24);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
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
        appt27.setDescription("");
        int i38 = appt27.getStartDay();
        int i39 = appt27.getStartMinute();
        int i40 = appt27.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i38 == 52);
        org.junit.Assert.assertTrue(i39 == 10);
        org.junit.Assert.assertTrue(i40 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
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
        int i30 = appt14.getStartDay();
        int i31 = appt14.getStartYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue(i30 == 52);
        org.junit.Assert.assertTrue(i31 == 97);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
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
        java.lang.String str23 = appt7.toString();
        java.lang.String str24 = appt7.getTitle();
        appt7.setStartHour((int) (byte) 10);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (byte) 10);
        appt7.setStartMinute(0);
        int i17 = appt7.getStartHour();
        appt7.setStartHour((int) (short) 1);
        appt7.setStartMinute(10);
        appt7.setStartMinute((int) (byte) 10);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        appt7.setStartMonth((int) ' ');
        appt7.setDescription("hi!");
        appt7.setStartMinute(97);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (byte) 10, 0, (int) (short) 0, (int) (short) 0, "", "hi!");
        java.lang.String str8 = appt7.getTitle();
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
        java.lang.String str11 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\t1/10/-1 at 1:1am ,, \n" + "'", str11.equals("\t1/10/-1 at 1:1am ,, \n"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
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
        int i42 = appt31.getStartYear();
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
        org.junit.Assert.assertTrue(i42 == 97);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getDay();
        int i6 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
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
        int i13 = calDay0.getDay();
        cs362.Appt appt21 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt21.setStartHour(1);
        appt21.setStartMinute((int) (byte) 10);
        appt21.setStartYear(0);
        java.lang.String str28 = appt21.getDescription();
        appt21.setStartYear(0);
        int i31 = appt21.getStartYear();
        calDay0.addAppt(appt21);
        java.util.LinkedList<cs362.Appt> linkedlist_appt33 = calDay0.getAppts();
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
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNull(linkedlist_appt33);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
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
        int i23 = calDay0.getMonth();
        int i24 = calDay0.getMonth();
        boolean b25 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.getTitle();
        appt7.setStartMinute((int) (short) -1);
        int i19 = appt7.getStartYear();
        java.lang.String str20 = appt7.getDescription();
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getYear();
        cs362.Appt appt13 = new cs362.Appt((int) (short) 0, 10, (-1), 97, 1, "\t1/10/-1 at 1:1am ,, \n", "\t1/10/97 at 1:1am ,, \n");
        calDay0.addAppt(appt13);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setTitle("");
        appt7.setStartDay(0);
        appt7.setStartHour((int) (short) 100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        int i8 = appt7.getStartDay();
        appt7.setStartMinute(97);
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        java.lang.String str20 = appt7.getTitle();
        appt7.setStartMonth(35);
        appt7.setStartYear(10);
        boolean b25 = appt7.getValid();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
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
        cs362.Appt appt22 = null;
        try {
            calDay0.addAppt(appt22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartDay();
        appt7.setStartHour(35);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 52);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        int i17 = appt7.getStartMonth();
        appt7.setDescription("");
        int i20 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 0);
        int i23 = appt7.getStartMinute();
        int i24 = appt7.getStartYear();
        boolean b25 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartMinute();
        java.lang.String str15 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        cs362.Appt appt14 = new cs362.Appt((int) '#', 10, (int) 'a', (int) (short) 0, (int) (short) 0, "", "");
        calDay0.addAppt(appt14);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertNull(linkedlist_appt25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str17 = appt7.getTitle();
        int i18 = appt7.getStartYear();
        java.lang.String str19 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartHour(0);
        appt10.setStartMonth((int) (byte) 10);
        int i21 = appt10.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i21 == 97);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
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
        cs362.Appt appt28 = new cs362.Appt(35, (int) (short) 10, (int) (short) 100, (int) '#', (int) '4', "", "hi!");
        calDay0.addAppt(appt28);
        boolean b30 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        int i13 = appt7.getStartHour();
        int i14 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
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
        boolean b24 = calDay0.isValid();
        int i25 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard26 = calDay0.iterator();
        boolean b27 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(iterator_wildcard26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        cs362.Appt appt7 = new cs362.Appt(35, 0, (int) ' ', (int) (short) -1, (int) (byte) -1, "hi!", "hi!");
        int i8 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
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
        java.lang.String str22 = calDay0.toString();
        boolean b23 = calDay0.isValid();
        int i24 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
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
        int i22 = appt12.getStartMonth();
        java.lang.String str23 = appt12.getDescription();
        int i24 = appt12.getStartYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == 97);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        appt7.setStartYear((int) 'a');
        java.lang.String str24 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
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
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
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
        boolean b46 = calDay0.isValid();
        int i47 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt48 = calDay0.getAppts();
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
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNull(linkedlist_appt48);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        java.lang.String str8 = appt7.toString();
        int i9 = appt7.getStartHour();
        appt7.setStartMonth(32);
        int i12 = appt7.getStartMinute();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        java.lang.String str16 = appt7.getDescription();
        int i17 = appt7.getStartDay();
        int i18 = appt7.getStartMinute();
        int i19 = appt7.getStartMinute();
        int i20 = appt7.getStartYear();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i18 == 10);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((-1));
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartMonth();
        int i18 = appt7.getStartHour();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
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
        int i21 = calDay0.getYear();
        int i22 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setStartYear(100);
        appt7.setStartHour((int) (byte) 100);
        appt7.setStartMonth(35);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        boolean b8 = calDay0.isValid();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
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
        java.lang.String str23 = appt7.toString();
        java.lang.String str24 = appt7.getTitle();
        appt7.setStartYear(32);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
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
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        appt33.setStartMonth((int) (short) -1);
        int i38 = appt33.getStartMinute();
        appt33.setStartHour((int) '4');
        boolean b41 = appt33.getValid();
        calDay0.addAppt(appt33);
        java.lang.String str43 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        appt7.setStartHour((int) (short) 1);
        appt7.setDescription("");
        appt7.setDescription("");
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        int i15 = appt7.getStartHour();
        java.lang.String str16 = appt7.toString();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setTitle("hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getYear();
        int i6 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
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
        appt9.setStartMinute((int) ' ');
        int i23 = appt9.getStartDay();
        int i24 = appt9.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i23 == 52);
        org.junit.Assert.assertTrue(i24 == 32);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getDay();
        int i7 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        cs362.Appt appt15 = new cs362.Appt(52, (-1), (int) ' ', (int) (short) -1, (int) (short) 0, "", "");
        calDay0.addAppt(appt15);
        int i17 = appt15.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        appt7.setStartHour((int) (short) 1);
        int i17 = appt7.getStartHour();
        appt7.setStartHour(100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        cs362.Appt appt7 = new cs362.Appt((int) '4', (int) (byte) 10, (int) ' ', (int) (byte) 0, 52, "\t1/10/-1 at 1:1am ,, \n", "\t1/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        java.lang.String str13 = appt7.getTitle();
        java.lang.String str14 = appt7.getDescription();
        int i15 = appt7.getStartHour();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartYear(100);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
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
        int i23 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        int i25 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.toString();
        java.lang.String str16 = appt7.getDescription();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getYear();
        java.lang.String str25 = calDay0.toString();
        int i26 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth((-1));
        int i17 = appt7.getStartDay();
        appt7.setStartMinute((int) (short) 0);
        appt7.setStartYear((int) (byte) -1);
        java.lang.String str22 = appt7.toString();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((-1));
        java.lang.String str16 = appt7.getTitle();
        java.lang.String str17 = appt7.toString();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
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
        appt10.setStartYear((int) '4');
        int i27 = appt10.getStartMinute();
        appt10.setStartYear(52);
        int i30 = appt10.getStartMonth();
        appt10.setStartYear(1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue(i30 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
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
        int i22 = calDay0.getDay();
        int i23 = calDay0.getYear();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        appt31.setStartMonth((int) (short) -1);
        int i36 = appt31.getStartMonth();
        int i37 = appt31.getStartYear();
        boolean b38 = appt31.getValid();
        appt31.setStartMinute((int) (byte) -1);
        int i41 = appt31.getStartYear();
        int i42 = appt31.getStartYear();
        int i43 = appt31.getStartYear();
        appt31.setStartYear((int) (byte) -1);
        calDay0.addAppt(appt31);
        appt31.setStartHour((int) '#');
        java.lang.String str49 = appt31.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(i37 == 97);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 97);
        org.junit.Assert.assertTrue(i42 == 97);
        org.junit.Assert.assertTrue(i43 == 97);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        int i4 = calDay0.getDay();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
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
        int i63 = calDay0.getDay();
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
        org.junit.Assert.assertTrue(i63 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartYear();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
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
        int i21 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        appt7.setStartMinute((int) (byte) 100);
        boolean b18 = appt7.getValid();
        appt7.setTitle("");
        java.lang.String str21 = appt7.getTitle();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, (int) (byte) 0, 0, (int) (byte) 10, (int) (short) 10, "", "");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt4 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertNull(linkedlist_appt5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 1, 0, (int) '#', 35, "\t1/10/-1 at 1:1am ,, \n", "hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt11 = calDay0.getAppts();
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
        org.junit.Assert.assertNull(linkedlist_appt11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 10, 0, (int) (short) 100, (int) (byte) 10, "", "");
        appt7.setStartMinute((int) '#');
        boolean b10 = appt7.getValid();
        appt7.setStartMinute(1);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartDay();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartDay(100);
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
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
        java.lang.String str37 = appt17.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
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
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        boolean b39 = calDay0.isValid();
        boolean b40 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartHour((int) (short) 0);
        int i14 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i14 == 52);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
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
        java.lang.String str21 = appt10.toString();
        appt10.setStartHour(52);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
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
        appt7.setTitle("\t1/10/-1 at 1:1am ,, \n");
        appt7.setStartMinute((int) (byte) 10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartMonth((int) (short) 10);
        appt10.setStartMonth((int) (byte) 100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        appt7.setStartHour((int) (short) 1);
        appt7.setStartHour((int) (short) 10);
        appt7.setDescription("hi!");
        int i21 = appt7.getStartMinute();
        boolean b22 = appt7.getValid();
        appt7.setStartMonth(32);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
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
        int i36 = appt27.getStartDay();
        int i37 = appt27.getStartYear();
        appt27.setStartMinute(100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 52);
        org.junit.Assert.assertTrue(i37 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        appt7.setStartMinute(1);
        int i17 = appt7.getStartMonth();
        appt7.setStartHour((int) (byte) 0);
        int i20 = appt7.getStartDay();
        java.lang.String str21 = appt7.getDescription();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i20 == 52);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        int i4 = calDay0.getDay();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMinute((int) (byte) 10);
        appt12.setStartDay((-1));
        appt12.setDescription("");
        int i21 = appt12.getStartYear();
        java.lang.String str22 = appt12.getDescription();
        int i23 = appt12.getStartDay();
        appt12.setStartHour((int) (short) 100);
        appt12.setStartMonth((int) 'a');
        appt12.setStartMonth((int) (byte) 0);
        calDay0.addAppt(appt12);
        int i31 = appt12.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(i31 == 10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 10, (-1), 0, (int) 'a', "\t1/10/-1 at 1:1am ,, \n", "\t1/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
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
        cs362.CalDay calDay10 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard11 = calDay10.iterator();
        cs362.CalDay calDay12 = new cs362.CalDay();
        int i13 = calDay12.getYear();
        int i14 = calDay12.getYear();
        cs362.Appt appt22 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt22.setStartHour(1);
        appt22.setStartMonth((int) (short) -1);
        int i27 = appt22.getStartMonth();
        calDay12.addAppt(appt22);
        appt22.setStartHour(0);
        calDay10.addAppt(appt22);
        appt22.setStartYear(0);
        appt22.setStartDay(1);
        java.lang.String str36 = appt22.getTitle();
        appt22.setStartMonth((int) ' ');
        calDay0.addAppt(appt22);
        appt22.setStartDay((int) (byte) 1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator_wildcard11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        cs362.Appt appt7 = new cs362.Appt(35, 100, 0, 1, (int) '#', "hi!", "\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        int i8 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
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
        appt9.setStartMinute((int) ' ');
        boolean b23 = appt9.getValid();
        int i24 = appt9.getStartYear();
        appt9.setDescription("hi!");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        boolean b7 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        java.lang.String str14 = appt7.getTitle();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 52, 100, (int) (byte) 0, 0, "", "\t1/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartDay();
        java.lang.String str19 = appt7.getTitle();
        int i20 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (-1), (int) ' ', (int) (short) 100, "", "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
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
        int i20 = calDay0.getYear();
        cs362.CalDay calDay21 = new cs362.CalDay();
        int i22 = calDay21.getYear();
        int i23 = calDay21.getYear();
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour(1);
        appt31.setStartMonth((int) (short) -1);
        int i36 = appt31.getStartMonth();
        calDay21.addAppt(appt31);
        boolean b38 = appt31.getValid();
        java.lang.String str39 = appt31.getTitle();
        appt31.setStartMinute((int) '4');
        int i42 = appt31.getStartYear();
        calDay0.addAppt(appt31);
        int i44 = calDay0.getMonth();
        int i45 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i36 == (-1));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue(i42 == 97);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue(i45 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
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
        int i24 = calDay0.getYear();
        int i25 = calDay0.getYear();
        int i26 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
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
        int i27 = appt12.getStartHour();
        int i28 = appt12.getStartMinute();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == (-1));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        int i14 = appt7.getStartMonth();
        appt7.setStartMinute(10);
        appt7.setStartHour((int) (byte) 0);
        appt7.setStartMinute((int) (byte) 100);
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setTitle("");
        int i19 = appt7.getStartDay();
        appt7.setDescription("");
        boolean b22 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getMonth();
        java.lang.String str9 = calDay0.toString();
        java.lang.String str10 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard11 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
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
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        int i36 = appt33.getStartYear();
        java.lang.String str37 = appt33.toString();
        int i38 = appt33.getStartMinute();
        appt33.setStartYear((int) (byte) 10);
        java.lang.String str41 = appt33.getTitle();
        appt33.setStartYear((int) 'a');
        calDay0.addAppt(appt33);
        java.lang.String str45 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertTrue(i36 == 97);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str14 = appt7.toString();
        java.lang.String str15 = appt7.getTitle();
        int i16 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
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
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
        appt7.setStartMinute((int) (short) 10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        cs362.Appt appt7 = new cs362.Appt(52, (-1), 10, (int) 'a', (int) (short) 10, "hi!", "");
        appt7.setStartHour(1);
        appt7.setStartDay(0);
        appt7.setStartHour((int) (byte) 100);
        java.lang.String str14 = appt7.toString();
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
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
        int i24 = calDay0.getMonth();
        int i25 = calDay0.getMonth();
        int i26 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt27 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(linkedlist_appt27);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.toString();
        appt7.setStartHour(0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getMonth();
        cs362.CalDay calDay6 = new cs362.CalDay();
        int i7 = calDay6.getYear();
        int i8 = calDay6.getYear();
        java.lang.String str9 = calDay6.toString();
        cs362.Appt appt17 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt17.setStartHour(1);
        appt17.setStartMonth((int) (short) -1);
        int i22 = appt17.getStartMinute();
        appt17.setStartHour((int) '4');
        calDay6.addAppt(appt17);
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        appt33.setStartMinute((int) (byte) 10);
        appt33.setStartYear(0);
        int i40 = appt33.getStartMonth();
        calDay6.addAppt(appt33);
        boolean b42 = calDay6.isValid();
        java.util.Iterator<?> iterator_wildcard43 = calDay6.iterator();
        java.util.Iterator<?> iterator_wildcard44 = calDay6.iterator();
        int i45 = calDay6.getYear();
        cs362.Appt appt53 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt53.setStartHour(1);
        int i56 = appt53.getStartYear();
        java.lang.String str57 = appt53.toString();
        calDay6.addAppt(appt53);
        int i59 = appt53.getStartMonth();
        appt53.setStartDay(10);
        int i62 = appt53.getStartMinute();
        appt53.setTitle("hi!");
        calDay0.addAppt(appt53);
        appt53.setStartHour((int) (byte) 0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i40 == 1);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(iterator_wildcard43);
        org.junit.Assert.assertNull(iterator_wildcard44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i56 == 97);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue(i59 == 1);
        org.junit.Assert.assertTrue(i62 == (-1));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 10);
        boolean b20 = appt7.getValid();
        java.lang.String str21 = appt7.getDescription();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
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
        boolean b22 = calDay0.isValid();
        int i23 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMinute();
        appt14.setStartHour((int) '4');
        java.lang.String str22 = appt14.toString();
        calDay0.addAppt(appt14);
        boolean b24 = calDay0.isValid();
        cs362.Appt appt32 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt32.setStartHour(1);
        appt32.setStartMinute((int) (byte) 10);
        appt32.setStartYear(0);
        appt32.setTitle("");
        java.lang.String str41 = appt32.getDescription();
        appt32.setStartMinute(0);
        int i44 = appt32.getStartMonth();
        calDay0.addAppt(appt32);
        int i46 = calDay0.getDay();
        cs362.Appt appt54 = new cs362.Appt((int) '#', (int) (byte) -1, (int) ' ', 10, 0, "hi!", "");
        appt54.setStartDay((-1));
        appt54.setStartMinute((int) (byte) 0);
        int i59 = appt54.getStartHour();
        calDay0.addAppt(appt54);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i59 == 35);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        int i8 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == 52);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
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
        cs362.Appt appt65 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt65.setStartHour(1);
        appt65.setStartMinute((int) (byte) 10);
        appt65.setStartYear(0);
        appt65.setTitle("hi!");
        java.lang.String str74 = appt65.getDescription();
        calDay0.addAppt(appt65);
        java.lang.String str76 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        int i15 = appt7.getStartMonth();
        appt7.setStartHour((int) '4');
        appt7.setStartYear((int) ' ');
        java.lang.String str20 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
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
        int i23 = calDay0.getDay();
        java.lang.String str24 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMinute((int) (byte) 10);
        appt10.setStartYear(0);
        appt10.setTitle("");
        calDay0.addAppt(appt10);
        java.lang.String str20 = appt10.getDescription();
        appt10.setStartDay((int) (short) 0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMonth();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
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
        java.lang.String str25 = appt12.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
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
        int i27 = appt12.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        int i16 = appt7.getStartMinute();
        int i17 = appt7.getStartYear();
        appt7.setStartYear(0);
        java.lang.String str20 = appt7.getDescription();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        boolean b7 = calDay0.isValid();
        cs362.Appt appt15 = new cs362.Appt(35, 0, 1, (int) (short) 100, (int) '#', "hi!", "");
        calDay0.addAppt(appt15);
        int i17 = calDay0.getDay();
        cs362.Appt appt25 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt25.setStartHour(1);
        appt25.setStartMonth((int) (short) -1);
        int i30 = appt25.getStartMinute();
        appt25.setStartHour((int) '4');
        appt25.setStartHour((int) (short) 0);
        boolean b35 = appt25.getValid();
        appt25.setStartDay(1);
        int i38 = appt25.getStartYear();
        appt25.setStartMonth((int) 'a');
        appt25.setStartMinute(0);
        calDay0.addAppt(appt25);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == 97);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartDay((int) ' ');
        appt7.setTitle("");
        appt7.setStartHour(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartDay();
        appt7.setDescription("hi!");
        appt7.setStartDay(1);
        int i15 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 52);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
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
        int i27 = appt17.getStartHour();
        int i28 = appt17.getStartYear();
        calDay0.addAppt(appt17);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 97);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
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
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        cs362.Appt appt7 = new cs362.Appt((int) (short) -1, (-1), 0, (-1), (int) '#', "", "hi!");
        int i8 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
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
        int i21 = calDay0.getDay();
        java.lang.String str22 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        cs362.Appt appt7 = new cs362.Appt((int) (short) -1, (int) (byte) -1, 97, (int) '#', (int) '4', "hi!", "");
        int i8 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.getTitle();
        appt7.setStartMinute((int) (short) -1);
        int i19 = appt7.getStartYear();
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.toString();
        java.lang.String str22 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
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
        int i21 = appt11.getStartDay();
        appt11.setDescription("hi!");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt39 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertNull(linkedlist_appt39);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        cs362.Appt appt7 = new cs362.Appt((int) '#', (int) (byte) -1, (int) ' ', 10, 0, "hi!", "");
        int i8 = appt7.getStartHour();
        java.lang.String str9 = appt7.getDescription();
        int i10 = appt7.getStartYear();
        appt7.setStartDay((-1));
        int i13 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == 35);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (byte) 10, 0, (int) (short) 0, (int) (short) 0, "", "hi!");
        appt7.setStartYear((int) (byte) 1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
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
        appt7.setStartHour(100);
        int i26 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i26 == 97);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartDay();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 10);
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        appt7.setStartHour((int) (short) 1);
        appt7.setStartHour((int) (short) 10);
        boolean b19 = appt7.getValid();
        appt7.setStartMinute((int) '#');
        int i22 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
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
        int i19 = appt11.getStartMinute();
        appt11.setStartYear((int) (byte) 1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMinute(52);
        appt7.setStartDay((int) (short) 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 10);
        appt7.setTitle("hi!");
        appt7.setDescription("");
        int i24 = appt7.getStartMonth();
        int i25 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertTrue(i25 == 10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
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
        int i89 = appt75.getStartYear();
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
        org.junit.Assert.assertTrue(i89 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartMonth();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
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
        appt16.setDescription("\t1/10/97 at 1:1am ,, \n");
        int i26 = appt16.getStartMinute();
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
        org.junit.Assert.assertTrue(i26 == (-1));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        int i25 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
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
        int i27 = appt17.getStartDay();
        java.lang.String str28 = appt17.getDescription();
        appt17.setDescription("");
        appt17.setTitle("hi!");
        int i33 = appt17.getStartDay();
        calDay0.addAppt(appt17);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i27 == 52);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue(i33 == 52);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartHour((-1));
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth((-1));
        int i17 = appt7.getStartDay();
        boolean b18 = appt7.getValid();
        appt7.setStartYear((int) (short) 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        cs362.Appt appt7 = new cs362.Appt((int) '#', (int) (byte) -1, (int) ' ', 10, 0, "hi!", "");
        appt7.setStartDay((-1));
        appt7.setStartMinute((int) (byte) 0);
        appt7.setStartDay((int) (byte) 100);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartDay();
        int i17 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 100);
        org.junit.Assert.assertTrue(i16 == 100);
        org.junit.Assert.assertTrue(i17 == 35);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        java.lang.String str6 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
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
        cs362.Appt appt56 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt56.setStartHour(1);
        appt56.setStartMonth((int) (short) -1);
        int i61 = appt56.getStartMinute();
        appt56.setStartHour((int) '4');
        appt56.setStartHour((int) (short) 0);
        boolean b66 = appt56.getValid();
        calDay0.addAppt(appt56);
        java.util.LinkedList<cs362.Appt> linkedlist_appt68 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard69 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard70 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(linkedlist_appt68);
        org.junit.Assert.assertNull(iterator_wildcard69);
        org.junit.Assert.assertNull(iterator_wildcard70);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartDay(1);
        appt7.setDescription("hi!");
        appt7.setTitle("hi!");
        int i24 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 1, (int) 'a', (int) (byte) 0, 0, "hi!", "hi!");
        int i8 = appt7.getStartDay();
        java.lang.String str9 = appt7.toString();
        appt7.setStartDay((int) (short) 10);
        org.junit.Assert.assertTrue(i8 == 97);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, 35, (int) (short) 1, (int) 'a', (int) (short) 10, "", "");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setStartMinute(1);
        java.lang.String str15 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
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
        appt7.setStartMinute(52);
        boolean b31 = appt7.getValid();
        appt7.setStartDay((int) (short) 10);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        cs362.Appt appt7 = new cs362.Appt(0, 10, (int) (short) 100, 100, (int) 'a', "\t1/10/-1 at 1:1am ,, \n", "\t1/10/97 at 1:1am ,, \n");
        int i8 = appt7.getStartYear();
        appt7.setStartYear((-1));
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getDay();
        cs362.Appt appt15 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt15.setStartHour(1);
        appt15.setStartMinute((int) (byte) 10);
        appt15.setStartYear(0);
        appt15.setTitle("");
        appt15.setStartMonth(97);
        appt15.setStartMonth(1);
        appt15.setStartMonth((int) (byte) 0);
        int i30 = appt15.getStartYear();
        appt15.setTitle("hi!");
        appt15.setStartMinute((int) (short) 0);
        appt15.setStartYear((int) (byte) 10);
        appt15.setTitle("hi!");
        calDay0.addAppt(appt15);
        int i40 = calDay0.getYear();
        boolean b41 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartDay((-1));
        calDay0.addAppt(appt11);
        boolean b19 = appt11.getValid();
        java.lang.String str20 = appt11.toString();
        appt11.setStartYear((int) (short) -1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) -1, (int) (byte) 0, 97, (int) (byte) 100, "hi!", "");
        appt7.setStartMonth(97);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        java.lang.String str15 = appt7.toString();
        appt7.setStartHour((int) (byte) 0);
        java.lang.String str18 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartYear();
        java.lang.String str18 = appt7.getDescription();
        java.lang.String str19 = appt7.toString();
        java.lang.String str20 = appt7.getTitle();
        int i21 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 100);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartYear();
        java.lang.String str16 = appt7.getDescription();
        appt7.setStartHour((int) ' ');
        boolean b19 = appt7.getValid();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((-1));
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
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
        int i21 = appt10.getStartYear();
        int i22 = appt10.getStartHour();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
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
        java.lang.String str26 = appt7.getDescription();
        int i27 = appt7.getStartMonth();
        appt7.setStartYear(1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartMinute();
        int i19 = appt7.getStartMinute();
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
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
        java.lang.String str30 = appt12.getTitle();
        int i31 = appt12.getStartMonth();
        java.lang.String str32 = appt12.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(i31 == 32);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
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
        appt47.setTitle("hi!");
        appt47.setTitle("hi!");
        appt47.setStartMinute(10);
        int i59 = appt47.getStartDay();
        appt47.setTitle("\t1/10/-1 at 1:1am ,, \n");
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
        org.junit.Assert.assertTrue(i59 == 52);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        java.lang.String str9 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt10 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt1 = null;
        cs362.Appt appt2 = null;
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = timeTable0.deleteAppt(linkedlist_appt1, appt2);
        org.junit.Assert.assertNull(linkedlist_appt3);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
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
        int i29 = appt13.getStartYear();
        appt13.setStartMonth((int) (byte) 0);
        appt13.setStartMonth((int) ' ');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (short) -1);
        appt7.setTitle("\t1/10/-1 at 1:1am ,, \n");
        java.lang.String str19 = appt7.getTitle();
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\t1/10/-1 at 1:1am ,, \n" + "'", str19.equals("\t1/10/-1 at 1:1am ,, \n"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
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
        int i24 = appt12.getStartMinute();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartDay();
        java.lang.String str18 = appt7.getTitle();
        int i19 = appt7.getStartHour();
        appt7.setStartYear((int) (short) 10);
        appt7.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
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
        appt7.setStartMinute(100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
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
        int i23 = appt10.getStartDay();
        java.lang.String str24 = appt10.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(i23 == 52);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (byte) 10);
        appt7.setStartMinute(0);
        int i17 = appt7.getStartHour();
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMinute((int) (byte) 10);
        appt10.setStartYear(0);
        appt10.setTitle("");
        calDay0.addAppt(appt10);
        int i20 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setDescription("hi!");
        appt7.setStartHour((int) (byte) 100);
        appt7.setStartMonth((int) 'a');
        int i23 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i23 == 97);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 52, (int) (byte) 10, 10, 0, "", "");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test402");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartHour((-1));
        boolean b17 = appt7.getValid();
        appt7.setStartYear(0);
        int i20 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test403");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth((-1));
        appt7.setStartHour((int) (byte) 0);
        appt7.setStartHour((int) 'a');
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test404");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        appt7.setStartMinute((int) (byte) 100);
        int i18 = appt7.getStartMinute();
        appt7.setStartDay((int) (short) 10);
        java.lang.String str21 = appt7.getDescription();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test405");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        int i19 = appt7.getStartMinute();
        appt7.setStartYear(1);
        appt7.setStartMonth((int) (short) -1);
        int i24 = appt7.getStartHour();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test406");
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
        appt9.setStartMinute((int) ' ');
        int i23 = appt9.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test407");
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
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        appt33.setStartMonth((int) (short) -1);
        int i38 = appt33.getStartMinute();
        appt33.setStartHour((int) '4');
        boolean b41 = appt33.getValid();
        calDay0.addAppt(appt33);
        int i43 = calDay0.getDay();
        int i44 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test408");
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
        int i23 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt24 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(linkedlist_appt24);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test409");
        cs362.Appt appt7 = new cs362.Appt((int) '4', 0, (-1), 10, 35, "", "hi!");
        int i8 = appt7.getStartDay();
        appt7.setStartMinute(10);
        int i11 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(i11 == 10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test410");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        appt7.setStartMinute((int) (byte) 100);
        boolean b18 = appt7.getValid();
        appt7.setTitle("");
        appt7.setStartDay((int) '4');
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test411");
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
        appt11.setStartMonth((int) (short) 100);
        java.lang.String str27 = appt11.getDescription();
        java.lang.String str28 = appt11.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test412");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        appt7.setStartHour((int) (short) 1);
        appt7.setStartHour((int) '4');
        int i23 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i23 == 10);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test413");
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
        cs362.CalDay calDay10 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard11 = calDay10.iterator();
        cs362.CalDay calDay12 = new cs362.CalDay();
        int i13 = calDay12.getYear();
        int i14 = calDay12.getYear();
        cs362.Appt appt22 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt22.setStartHour(1);
        appt22.setStartMonth((int) (short) -1);
        int i27 = appt22.getStartMonth();
        calDay12.addAppt(appt22);
        appt22.setStartHour(0);
        calDay10.addAppt(appt22);
        appt22.setStartYear(0);
        appt22.setStartDay(1);
        java.lang.String str36 = appt22.getTitle();
        appt22.setStartMonth((int) ' ');
        calDay0.addAppt(appt22);
        appt22.setStartYear(52);
        int i42 = appt22.getStartYear();
        appt22.setStartDay((int) (short) 100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator_wildcard11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i27 == (-1));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        org.junit.Assert.assertTrue(i42 == 52);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test414");
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
        boolean b27 = appt12.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test415");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartHour();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test416");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartDay((-1));
        java.lang.String str20 = appt7.toString();
        int i21 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(i21 == 97);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test417");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test418");
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
        cs362.CalDay calDay38 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard39 = calDay38.iterator();
        cs362.CalDay calDay40 = new cs362.CalDay();
        int i41 = calDay40.getYear();
        int i42 = calDay40.getYear();
        cs362.Appt appt50 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt50.setStartHour(1);
        appt50.setStartMonth((int) (short) -1);
        int i55 = appt50.getStartMonth();
        calDay40.addAppt(appt50);
        appt50.setStartHour(0);
        calDay38.addAppt(appt50);
        int i60 = appt50.getStartHour();
        appt50.setTitle("hi!");
        calDay0.addAppt(appt50);
        java.lang.String str64 = appt50.getTitle();
        appt50.setStartHour((int) (byte) -1);
        appt50.setStartDay((-1));
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard39);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i55 == (-1));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test419");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        appt7.setDescription("");
        appt7.setStartHour((int) '#');
        appt7.setStartMinute((int) 'a');
        int i17 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test420");
        cs362.Appt appt7 = new cs362.Appt(0, (int) '4', 52, (int) '#', 1, "hi!", "");
        appt7.setStartMonth((int) (byte) -1);
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test421");
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
        cs362.Appt appt86 = new cs362.Appt(10, (int) (byte) 0, (int) '#', (-1), 0, "hi!", "");
        java.lang.String str87 = appt86.getTitle();
        java.util.LinkedList<cs362.Appt> linkedlist_appt88 = timeTable0.deleteAppt(linkedlist_appt78, appt86);
        java.lang.String str89 = appt86.getDescription();
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
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "hi!" + "'", str87.equals("hi!"));
        org.junit.Assert.assertNull(linkedlist_appt88);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "" + "'", str89.equals(""));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test422");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        java.lang.String str15 = appt7.toString();
        appt7.setStartHour((int) (byte) 0);
        int i18 = appt7.getStartYear();
        appt7.setStartDay((int) (byte) 100);
        appt7.setStartYear((int) (short) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i18 == 97);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test423");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getYear();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test424");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartMinute();
        appt7.setStartHour((int) (short) 1);
        boolean b21 = appt7.getValid();
        appt7.setStartHour((int) (short) 100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test425");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, (int) (byte) 100, 0, (int) (short) 0, 10, "", "");
        boolean b8 = appt7.getValid();
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test426");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartYear();
        int i16 = appt7.getStartHour();
        boolean b17 = appt7.getValid();
        java.lang.String str18 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test427");
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
        java.util.Iterator<?> iterator_wildcard22 = calDay0.iterator();
        boolean b23 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(iterator_wildcard24);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test428");
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
        int i22 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 52);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test429");
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
        int i38 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test430");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test431");
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
        appt12.setStartDay(0);
        int i26 = appt12.getStartDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test432");
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
        java.lang.String str22 = appt7.getDescription();
        appt7.setStartMonth(10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test433");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(linkedlist_appt22);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test434");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getYear();
        cs362.Appt appt14 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt14.setStartHour(1);
        appt14.setStartMonth((int) (short) -1);
        int i19 = appt14.getStartMonth();
        int i20 = appt14.getStartYear();
        boolean b21 = appt14.getValid();
        appt14.setStartMinute((int) (byte) -1);
        int i24 = appt14.getStartYear();
        int i25 = appt14.getStartYear();
        int i26 = appt14.getStartDay();
        appt14.setTitle("");
        calDay0.addAppt(appt14);
        int i30 = appt14.getStartMonth();
        appt14.setStartDay(32);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue(i25 == 97);
        org.junit.Assert.assertTrue(i26 == 52);
        org.junit.Assert.assertTrue(i30 == (-1));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test435");
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
        cs362.Appt appt74 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt74.setStartHour(1);
        appt74.setStartMinute((int) (byte) 10);
        appt74.setStartYear(0);
        appt74.setTitle("hi!");
        int i83 = appt74.getStartHour();
        calDay0.addAppt(appt74);
        java.lang.String str85 = calDay0.toString();
        boolean b86 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(i83 == 1);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "" + "'", str85.equals(""));
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test436");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        int i16 = appt7.getStartMinute();
        appt7.setStartDay((int) (byte) 10);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test437");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartHour();
        appt7.setTitle("hi!");
        int i21 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test438");
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
        appt7.setStartDay(35);
        java.lang.String str23 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test439");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setStartDay(35);
        int i19 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test440");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        appt7.setStartDay(0);
        appt7.setStartHour((int) (short) 10);
        int i12 = appt7.getStartDay();
        java.lang.String str13 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test441");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((int) (byte) 10);
        int i14 = appt7.getStartMonth();
        appt7.setStartMinute(10);
        appt7.setStartHour((int) (byte) 0);
        int i19 = appt7.getStartHour();
        appt7.setTitle("");
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test442");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getMonth();
        int i8 = calDay0.getMonth();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test443");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        cs362.CalDay calDay10 = new cs362.CalDay();
        int i11 = calDay10.getYear();
        int i12 = calDay10.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt13 = calDay10.getAppts();
        cs362.Appt appt21 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt21.setStartHour(1);
        appt21.setStartMinute((int) (byte) 10);
        appt21.setStartYear(0);
        appt21.setTitle("");
        appt21.setStartMonth(97);
        appt21.setStartMonth((int) '4');
        calDay10.addAppt(appt21);
        appt21.setStartMonth((int) (short) 100);
        java.lang.String str37 = appt21.getDescription();
        appt21.setStartMonth((-1));
        calDay0.addAppt(appt21);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(linkedlist_appt9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNull(linkedlist_appt13);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test444");
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
        appt7.setStartMinute((int) (short) 0);
        java.lang.String str27 = appt7.getDescription();
        int i28 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test445");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        appt7.setStartHour((-1));
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test446");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        java.lang.String str7 = calDay0.toString();
        cs362.Appt appt15 = new cs362.Appt(10, (int) (short) 0, 97, (int) 'a', 97, "hi!", "hi!");
        calDay0.addAppt(appt15);
        java.lang.String str17 = appt15.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test447");
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
        java.lang.String str38 = calDay0.toString();
        java.lang.String str39 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard40 = calDay0.iterator();
        boolean b41 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt42 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(linkedlist_appt42);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test448");
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
        boolean b58 = calDay0.isValid();
        cs362.CalDay calDay59 = new cs362.CalDay();
        int i60 = calDay59.getYear();
        int i61 = calDay59.getYear();
        cs362.Appt appt69 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt69.setStartHour(1);
        appt69.setStartMonth((int) (short) -1);
        int i74 = appt69.getStartMonth();
        calDay59.addAppt(appt69);
        appt69.setTitle("hi!");
        calDay0.addAppt(appt69);
        boolean b79 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard80 = calDay0.iterator();
        int i81 = calDay0.getYear();
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
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(i74 == (-1));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(iterator_wildcard80);
        org.junit.Assert.assertTrue(i81 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test449");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartHour();
        appt7.setTitle("hi!");
        appt7.setStartDay((int) '4');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test450");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        int i3 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt4 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(linkedlist_appt4);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test451");
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
        int i27 = appt12.getStartHour();
        java.lang.String str28 = appt12.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test452");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 0, 10, 97, (int) ' ', "\t1/10/97 at 1:1am ,, \n", "\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test453");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setStartMonth((int) (short) 10);
        appt7.setDescription("hi!");
        appt7.setStartHour((int) (short) 1);
        boolean b21 = appt7.getValid();
        java.lang.String str22 = appt7.getTitle();
        int i23 = appt7.getStartDay();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == (-1));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test454");
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
        java.lang.String str38 = calDay0.toString();
        boolean b39 = calDay0.isValid();
        cs362.Appt appt47 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        appt47.setStartYear((int) (byte) 0);
        calDay0.addAppt(appt47);
        java.lang.String str51 = appt47.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test455");
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
        java.lang.String str23 = appt11.toString();
        appt11.setStartMonth((int) (short) 100);
        appt11.setStartHour((int) (short) 0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test456");
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
        appt27.setDescription("");
        appt27.setTitle("hi!");
        appt27.setDescription("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test457");
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
        cs362.Appt appt28 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt28.setStartHour(1);
        appt28.setStartMinute((int) (byte) 10);
        appt28.setStartYear(0);
        appt28.setTitle("hi!");
        int i37 = appt28.getStartMonth();
        appt28.setDescription("");
        calDay0.addAppt(appt28);
        int i41 = calDay0.getMonth();
        int i42 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt43 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNull(linkedlist_appt43);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test458");
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
        java.lang.String str23 = calDay0.toString();
        java.lang.String str24 = calDay0.toString();
        cs362.Appt appt32 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt32.setStartHour(1);
        appt32.setStartMinute((int) (byte) 10);
        appt32.setStartDay((-1));
        boolean b39 = appt32.getValid();
        int i40 = appt32.getStartMonth();
        calDay0.addAppt(appt32);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test459");
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
        appt11.setStartHour(52);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test460");
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
        boolean b24 = calDay0.isValid();
        int i25 = calDay0.getYear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test461");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) (short) 100, 0, (int) (byte) -1, (int) (byte) 10, "", "");
        appt7.setStartMinute((int) ' ');
        appt7.setStartYear(1);
        int i12 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test462");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMinute((int) (byte) 10);
        appt10.setStartYear(0);
        appt10.setTitle("");
        calDay0.addAppt(appt10);
        int i20 = calDay0.getDay();
        cs362.CalDay calDay21 = new cs362.CalDay();
        int i22 = calDay21.getYear();
        int i23 = calDay21.getYear();
        java.lang.String str24 = calDay21.toString();
        cs362.Appt appt32 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt32.setStartHour(1);
        appt32.setStartMonth((int) (short) -1);
        int i37 = appt32.getStartMinute();
        appt32.setStartHour((int) '4');
        calDay21.addAppt(appt32);
        cs362.Appt appt48 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt48.setStartHour(1);
        appt48.setStartMinute((int) (byte) 10);
        appt48.setStartYear(0);
        int i55 = appt48.getStartMonth();
        calDay21.addAppt(appt48);
        int i57 = calDay21.getYear();
        java.util.Iterator<?> iterator_wildcard58 = calDay21.iterator();
        cs362.Appt appt66 = new cs362.Appt((-1), (int) (short) 0, 97, (int) (byte) 100, (int) (short) 1, "", "hi!");
        appt66.setTitle("");
        calDay21.addAppt(appt66);
        java.lang.String str70 = appt66.getTitle();
        int i71 = appt66.getStartHour();
        calDay0.addAppt(appt66);
        appt66.setStartDay((int) (byte) 10);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(i37 == (-1));
        org.junit.Assert.assertTrue(i55 == 1);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNull(iterator_wildcard58);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        org.junit.Assert.assertTrue(i71 == (-1));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test463");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        appt7.setStartMonth(97);
        appt7.setStartDay((int) (short) -1);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test464");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) -1, (int) (short) 1, 0, (-1), (int) (byte) 10, "\t1/10/-1 at 1:1am ,, \n", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test465");
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
        java.lang.String str24 = appt10.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i23 == 52);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test466");
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
        appt14.setStartMinute((int) (byte) -1);
        int i31 = appt14.getStartHour();
        int i32 = appt14.getStartYear();
        java.lang.String str33 = appt14.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 97);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test467");
        cs362.Appt appt7 = new cs362.Appt(52, 0, 0, (int) '#', (int) (short) 10, "", "hi!");
        int i8 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test468");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test469");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        boolean b18 = appt7.getValid();
        boolean b19 = appt7.getValid();
        appt7.setStartHour((int) (byte) 0);
        appt7.setStartDay(1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test470");
        cs362.Appt appt7 = new cs362.Appt(10, (int) 'a', 52, (int) 'a', (int) ' ', "hi!", "");
        appt7.setStartHour(35);
        int i10 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test471");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        int i17 = appt7.getStartMinute();
        int i18 = appt7.getStartHour();
        appt7.setTitle("hi!");
        appt7.setStartHour((int) (byte) 10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test472");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getDay();
        cs362.Appt appt15 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt15.setStartHour(1);
        appt15.setStartMinute((int) (byte) 10);
        appt15.setStartYear(0);
        appt15.setTitle("");
        appt15.setStartMonth(97);
        appt15.setStartMonth(1);
        appt15.setStartMonth((int) (byte) 0);
        int i30 = appt15.getStartYear();
        appt15.setTitle("hi!");
        appt15.setStartMinute((int) (short) 0);
        appt15.setStartYear((int) (byte) 10);
        appt15.setTitle("hi!");
        calDay0.addAppt(appt15);
        java.util.Iterator<?> iterator_wildcard40 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(iterator_wildcard40);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test473");
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
        int i22 = appt10.getStartHour();
        appt10.setStartMinute(0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test474");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) (short) 100, 0, (int) (byte) -1, (int) (byte) 10, "", "");
        int i8 = appt7.getStartHour();
        appt7.setStartYear(10);
        int i11 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test475");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        java.lang.String str14 = appt7.getDescription();
        appt7.setStartMonth((int) (byte) 1);
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test476");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getDay();
        java.lang.String str8 = calDay0.toString();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test477");
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
        int i38 = appt30.getStartMinute();
        appt30.setDescription("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(i38 == (-1));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test478");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str14 = appt7.toString();
        appt7.setStartDay((int) 'a');
        java.lang.String str17 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test479");
        cs362.Appt appt7 = new cs362.Appt(10, 1, (int) (short) 1, (-1), (int) (short) 10, "hi!", "");
        int i8 = appt7.getStartYear();
        appt7.setStartHour((int) (short) 10);
        org.junit.Assert.assertTrue(i8 == 10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test480");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 0, (int) (byte) 0, (int) (short) -1, (int) '4', "", "hi!");
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test481");
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
        appt10.setStartDay((-1));
        java.lang.String str24 = appt10.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test482");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getYear();
        cs362.CalDay calDay25 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard26 = calDay25.iterator();
        java.lang.String str27 = calDay25.toString();
        java.util.Iterator<?> iterator_wildcard28 = calDay25.iterator();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMonth();
        int i42 = appt36.getStartYear();
        boolean b43 = appt36.getValid();
        java.lang.String str44 = appt36.getTitle();
        java.lang.String str45 = appt36.getTitle();
        calDay25.addAppt(appt36);
        appt36.setStartDay((int) (byte) 100);
        int i49 = appt36.getStartMonth();
        calDay0.addAppt(appt36);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(iterator_wildcard26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard28);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(i42 == 97);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue(i49 == (-1));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test483");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth((-1));
        int i17 = appt7.getStartHour();
        appt7.setDescription("hi!");
        int i20 = appt7.getStartMonth();
        appt7.setStartDay((int) (short) 10);
        appt7.setStartYear((int) (byte) 100);
        int i25 = appt7.getStartYear();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i25 == 100);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test484");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        appt7.setStartMinute(0);
        int i16 = appt7.getStartHour();
        appt7.setTitle("hi!");
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test485");
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
        int i27 = appt12.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i27 == 10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test486");
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
        int i23 = calDay0.getYear();
        int i24 = calDay0.getMonth();
        boolean b25 = calDay0.isValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test487");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        int i6 = calDay0.getMonth();
        boolean b7 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        int i9 = calDay0.getMonth();
        java.lang.String str10 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test488");
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
        java.util.Iterator<?> iterator_wildcard38 = calDay0.iterator();
        cs362.Appt appt46 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt46.setStartHour(1);
        appt46.setStartMinute((int) (byte) 10);
        appt46.setStartYear(0);
        appt46.setStartHour((int) '#');
        appt46.setStartHour((int) (short) 10);
        appt46.setStartHour((int) (short) 1);
        appt46.setStartDay((-1));
        java.lang.String str61 = appt46.getDescription();
        calDay0.addAppt(appt46);
        appt46.setStartYear(1);
        java.lang.String str65 = appt46.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test489");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        int i18 = appt7.getStartDay();
        appt7.setStartYear((int) (short) 10);
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test490");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartHour();
        java.lang.String str18 = appt7.toString();
        int i19 = appt7.getStartMinute();
        int i20 = appt7.getStartDay();
        appt7.setStartMonth((int) '4');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test491");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        int i10 = appt7.getStartHour();
        int i11 = appt7.getStartMinute();
        appt7.setStartMinute((int) (short) 100);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 100);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i14 == 100);
        org.junit.Assert.assertTrue(i15 == 100);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test492");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        int i15 = appt12.getStartYear();
        boolean b16 = appt12.getValid();
        appt12.setStartMonth((int) (short) -1);
        int i19 = appt12.getStartDay();
        calDay0.addAppt(appt12);
        int i21 = appt12.getStartDay();
        int i22 = appt12.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i15 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue(i22 == (-1));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test493");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        appt7.setStartYear((int) (short) -1);
        appt7.setDescription("hi!");
        int i18 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test494");
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
        appt46.setStartDay((int) (short) -1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i58 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test495");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        java.lang.String str16 = appt11.toString();
        appt11.setDescription("");
        java.lang.String str19 = appt11.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test496");
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
        boolean b58 = calDay0.isValid();
        cs362.CalDay calDay59 = new cs362.CalDay();
        int i60 = calDay59.getYear();
        int i61 = calDay59.getYear();
        cs362.Appt appt69 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt69.setStartHour(1);
        appt69.setStartMonth((int) (short) -1);
        int i74 = appt69.getStartMonth();
        calDay59.addAppt(appt69);
        appt69.setTitle("hi!");
        calDay0.addAppt(appt69);
        boolean b79 = calDay0.isValid();
        int i80 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt81 = calDay0.getAppts();
        int i82 = calDay0.getDay();
        java.lang.String str83 = calDay0.toString();
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
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue(i74 == (-1));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNull(linkedlist_appt81);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test497");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartHour();
        appt7.setStartYear((int) (short) -1);
        java.lang.String str17 = appt7.getDescription();
        appt7.setStartYear((int) (short) 100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test498");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        java.lang.String str8 = calDay0.toString();
        java.lang.String str9 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test499");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setDescription("hi!");
        appt7.setStartHour((int) (byte) 100);
        java.lang.String str21 = appt7.getTitle();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test500");
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
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        appt33.setStartMonth((int) (short) -1);
        int i38 = appt33.getStartMinute();
        appt33.setStartHour((int) '4');
        boolean b41 = appt33.getValid();
        calDay0.addAppt(appt33);
        int i43 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard44 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(iterator_wildcard44);
    }
}

