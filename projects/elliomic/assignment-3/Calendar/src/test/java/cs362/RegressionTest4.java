import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
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
        java.lang.String str23 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt24 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt24);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour(100);
        java.lang.String str17 = appt7.getTitle();
        int i18 = appt7.getStartMonth();
        appt7.setStartYear(0);
        appt7.setStartDay(52);
        int i23 = appt7.getStartDay();
        int i24 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i23 == 52);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
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
        java.lang.String str21 = appt10.getTitle();
        appt10.setStartHour((int) (short) 0);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
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
        int i23 = appt10.getStartMinute();
        java.lang.String str24 = appt10.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 52);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
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
        java.lang.String str38 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(linkedlist_appt37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
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
        int i69 = calDay0.getYear();
        int i70 = calDay0.getDay();
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
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setDescription("hi!");
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartYear();
        appt7.setTitle("");
        java.lang.String str21 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 10, 0, (int) (short) 100, (int) (byte) 10, "", "");
        appt7.setStartMinute((int) '#');
        appt7.setStartYear((int) (byte) 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
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
        appt7.setDescription("");
        int i27 = appt7.getStartHour();
        appt7.setDescription("hi!");
        int i30 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertTrue(i30 == 10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
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
        appt7.setStartMinute(1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        java.lang.String str4 = calDay0.toString();
        int i5 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
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
        int i26 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 1, (int) (short) 0, 100, 1, "", "\t1/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartMonth();
        java.lang.String str17 = appt7.getDescription();
        java.lang.String str18 = appt7.toString();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
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
        int i23 = appt9.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        appt7.setStartYear((int) (byte) 0);
        int i21 = appt7.getStartMinute();
        appt7.setStartDay(0);
        appt7.setStartHour((-1));
        appt7.setStartDay((int) (short) 1);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
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
        int i30 = appt25.getStartMonth();
        int i31 = appt25.getStartYear();
        boolean b32 = appt25.getValid();
        appt25.setStartMinute((int) (byte) -1);
        int i35 = appt25.getStartMinute();
        int i36 = appt25.getStartHour();
        calDay0.addAppt(appt25);
        appt25.setStartMinute((int) (byte) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(i31 == 97);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(i36 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 10, (int) (short) 1, (-1), (int) (short) -1, "hi!", "");
        appt7.setStartMonth((int) (byte) -1);
        int i10 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
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
        int i69 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt70 = calDay0.getAppts();
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
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNull(linkedlist_appt70);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setDescription("");
        appt7.setTitle("");
        appt7.setTitle("");
        int i22 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
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
        int i69 = calDay0.getYear();
        cs362.Appt appt77 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt77.setStartHour(1);
        int i80 = appt77.getStartYear();
        boolean b81 = appt77.getValid();
        appt77.setStartMonth((int) (short) -1);
        appt77.setStartDay((int) 'a');
        appt77.setTitle("");
        appt77.setTitle("hi!");
        appt77.setStartDay((int) ' ');
        appt77.setTitle("");
        calDay0.addAppt(appt77);
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
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i80 == 97);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
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
        int i22 = appt7.getStartMonth();
        java.lang.String str23 = appt7.getTitle();
        int i24 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == 35);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
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
        appt74.setStartMonth((int) ' ');
        java.lang.String str87 = appt74.getDescription();
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
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "" + "'", str87.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
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
        boolean b30 = calDay0.isValid();
        boolean b31 = calDay0.isValid();
        int i32 = calDay0.getDay();
        int i33 = calDay0.getMonth();
        boolean b34 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
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
        int i82 = calDay0.getMonth();
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
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str17 = appt7.getTitle();
        appt7.setTitle("");
        int i20 = appt7.getStartDay();
        appt7.setStartMonth((int) (byte) -1);
        appt7.setStartYear((int) (byte) 10);
        appt7.setStartHour((int) 'a');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 52);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 1, (int) (short) 0, 0, 35, (-1), "", "");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
        cs362.Appt appt7 = new cs362.Appt((int) '4', (int) '4', (-1), 32, 52, "", "hi!");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
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
        boolean b30 = calDay0.isValid();
        cs362.CalDay calDay31 = new cs362.CalDay();
        int i32 = calDay31.getYear();
        int i33 = calDay31.getYear();
        java.lang.String str34 = calDay31.toString();
        cs362.Appt appt42 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt42.setStartHour(1);
        appt42.setStartMonth((int) (short) -1);
        int i47 = appt42.getStartMinute();
        appt42.setStartHour((int) '4');
        calDay31.addAppt(appt42);
        cs362.Appt appt58 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt58.setStartHour(1);
        appt58.setStartMinute((int) (byte) 10);
        appt58.setStartYear(0);
        int i65 = appt58.getStartMonth();
        calDay31.addAppt(appt58);
        boolean b67 = calDay31.isValid();
        java.util.Iterator<?> iterator_wildcard68 = calDay31.iterator();
        java.util.Iterator<?> iterator_wildcard69 = calDay31.iterator();
        int i70 = calDay31.getYear();
        cs362.Appt appt78 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt78.setStartHour(1);
        int i81 = appt78.getStartYear();
        java.lang.String str82 = appt78.toString();
        calDay31.addAppt(appt78);
        calDay0.addAppt(appt78);
        int i85 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt86 = calDay0.getAppts();
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
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue(i65 == 1);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(iterator_wildcard68);
        org.junit.Assert.assertNull(iterator_wildcard69);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(i81 == 97);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertNull(linkedlist_appt86);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setStartMonth(10);
        int i15 = appt7.getStartHour();
        int i16 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(i16 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
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
        cs362.Appt appt53 = new cs362.Appt(10, (int) 'a', (int) '#', 0, 97, "hi!", "hi!");
        calDay0.addAppt(appt53);
        java.util.LinkedList<cs362.Appt> linkedlist_appt55 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard56 = calDay0.iterator();
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
        org.junit.Assert.assertNull(linkedlist_appt55);
        org.junit.Assert.assertNull(iterator_wildcard56);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.lang.String str6 = calDay0.toString();
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getMonth();
        cs362.CalDay calDay9 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard10 = calDay9.iterator();
        java.lang.String str11 = calDay9.toString();
        int i12 = calDay9.getMonth();
        java.lang.String str13 = calDay9.toString();
        java.util.Iterator<?> iterator_wildcard14 = calDay9.iterator();
        int i15 = calDay9.getYear();
        int i16 = calDay9.getDay();
        int i17 = calDay9.getDay();
        cs362.CalDay calDay18 = new cs362.CalDay();
        int i19 = calDay18.getYear();
        int i20 = calDay18.getYear();
        java.lang.String str21 = calDay18.toString();
        cs362.Appt appt29 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt29.setStartHour(1);
        appt29.setStartMonth((int) (short) -1);
        int i34 = appt29.getStartMinute();
        appt29.setStartHour((int) '4');
        calDay18.addAppt(appt29);
        appt29.setStartMinute((int) (byte) 100);
        calDay9.addAppt(appt29);
        int i41 = appt29.getStartMinute();
        int i42 = appt29.getStartYear();
        calDay0.addAppt(appt29);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(iterator_wildcard10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i34 == (-1));
        org.junit.Assert.assertTrue(i41 == 100);
        org.junit.Assert.assertTrue(i42 == 97);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        appt7.setStartYear((int) (short) 1);
        int i22 = appt7.getStartMonth();
        appt7.setStartDay((int) 'a');
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        int i25 = calDay0.getYear();
        int i26 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
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
        java.util.Iterator<?> iterator_wildcard30 = calDay0.iterator();
        int i31 = calDay0.getYear();
        int i32 = calDay0.getDay();
        java.lang.String str33 = calDay0.toString();
        boolean b34 = calDay0.isValid();
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
        org.junit.Assert.assertNull(iterator_wildcard30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (byte) 10);
        appt7.setStartDay((int) (byte) -1);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
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
        cs362.Appt appt86 = new cs362.Appt((int) (byte) 10, (int) (byte) -1, (-1), (int) (byte) 10, (int) (byte) 0, "hi!", "");
        java.util.LinkedList<cs362.Appt> linkedlist_appt87 = timeTable0.deleteAppt(linkedlist_appt78, appt86);
        int i88 = appt86.getStartMinute();
        appt86.setStartDay(10);
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
        org.junit.Assert.assertNull(linkedlist_appt87);
        org.junit.Assert.assertTrue(i88 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt30 = calDay0.getAppts();
        java.lang.String str31 = calDay0.toString();
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
        org.junit.Assert.assertNull(linkedlist_appt30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        int i23 = appt7.getStartMinute();
        java.lang.String str24 = appt7.getDescription();
        appt7.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
        cs362.Appt appt7 = new cs362.Appt(1, 52, (int) (short) 10, (int) (byte) 10, 52, "", "hi!");
        appt7.setStartMinute(32);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
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
        java.lang.String str21 = appt9.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        int i5 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        appt7.setStartMinute(1);
        int i17 = appt7.getStartMonth();
        int i18 = appt7.getStartMinute();
        appt7.setStartDay(0);
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
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
        java.lang.String str22 = calDay0.toString();
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
        appt35.setStartYear(0);
        appt35.setStartDay(1);
        java.lang.String str49 = appt35.getTitle();
        appt35.setStartMonth((int) ' ');
        java.lang.String str52 = appt35.getTitle();
        appt35.setTitle("");
        calDay0.addAppt(appt35);
        java.lang.String str56 = appt35.toString();
        java.lang.String str57 = appt35.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
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
        appt7.setStartHour(0);
        appt7.setStartDay((int) (byte) 1);
        java.lang.String str27 = appt7.getDescription();
        appt7.setStartMinute((int) (byte) 100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartMonth();
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
        appt7.setStartMinute((int) (short) 0);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 10, (int) '4', 1, (int) (byte) 1, (int) (byte) -1, "", "hi!");
        int i8 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt40 = calDay0.getAppts();
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
        org.junit.Assert.assertNull(linkedlist_appt40);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
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
        int i22 = calDay0.getDay();
        int i23 = calDay0.getMonth();
        boolean b24 = calDay0.isValid();
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
        boolean b51 = appt37.getValid();
        calDay0.addAppt(appt37);
        int i53 = calDay0.getYear();
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
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(iterator_wildcard26);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i42 == (-1));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i53 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
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
        int i20 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartYear(100);
        appt7.setStartYear((int) (short) 0);
        appt7.setDescription("hi!");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartHour((int) (byte) 0);
        java.lang.String str14 = appt7.getTitle();
        appt7.setStartMonth(52);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
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
        int i24 = appt7.getStartMonth();
        appt7.setStartYear((int) (byte) -1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getDay();
        boolean b9 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        appt7.setStartDay((-1));
        int i22 = appt7.getStartMinute();
        appt7.setDescription("\t10/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i22 == 10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setStartMonth(10);
        java.lang.String str15 = appt7.getTitle();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartMinute();
        int i10 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        appt7.setStartMinute(52);
        int i22 = appt7.getStartMinute();
        appt7.setStartDay(1);
        org.junit.Assert.assertTrue(i22 == 52);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
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
        boolean b68 = appt54.getValid();
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
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour(100);
        appt7.setStartMinute((int) (short) 100);
        appt7.setStartHour((int) (short) 100);
        java.lang.String str21 = appt7.getTitle();
        appt7.setStartMinute(0);
        appt7.setStartHour((int) (short) 10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
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
        int i22 = appt7.getStartDay();
        java.lang.String str23 = appt7.getTitle();
        java.lang.String str24 = appt7.getDescription();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
        cs362.Appt appt7 = new cs362.Appt(97, 52, (int) 'a', 52, 0, "", "");
        java.lang.String str8 = appt7.getTitle();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.toString();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 97);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
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
        appt12.setTitle("");
        appt12.setTitle("");
        java.lang.String str31 = appt12.getTitle();
        appt12.setStartDay(32);
        java.lang.String str34 = appt12.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
        cs362.Appt appt7 = new cs362.Appt(97, (int) (byte) 100, (int) '#', (int) (byte) -1, (-1), "hi!", "");
        boolean b8 = appt7.getValid();
        java.lang.String str9 = appt7.getTitle();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
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
        appt11.setStartDay((int) (byte) 0);
        appt11.setStartMinute((int) (byte) 10);
        appt11.setStartMinute((int) (short) 1);
        java.lang.String str26 = appt11.getDescription();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
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
        int i25 = calDay0.getMonth();
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        appt33.setStartMonth((int) (short) -1);
        int i38 = appt33.getStartMinute();
        appt33.setStartHour((int) '4');
        int i41 = appt33.getStartDay();
        java.lang.String str42 = appt33.toString();
        appt33.setTitle("");
        appt33.setStartYear(1);
        int i47 = appt33.getStartHour();
        appt33.setStartDay((int) (byte) 1);
        appt33.setStartDay((int) (byte) 100);
        java.lang.String str52 = appt33.getDescription();
        int i53 = appt33.getStartMonth();
        calDay0.addAppt(appt33);
        cs362.Appt appt62 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt62.setStartHour(1);
        appt62.setStartMinute((int) (byte) 10);
        appt62.setStartYear(0);
        appt62.setTitle("");
        boolean b71 = appt62.getValid();
        appt62.setDescription("hi!");
        appt62.setStartHour((int) (byte) 100);
        appt62.setStartMonth((int) 'a');
        appt62.setStartDay(0);
        int i80 = appt62.getStartMonth();
        calDay0.addAppt(appt62);
        int i82 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard83 = calDay0.iterator();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertTrue(i41 == 52);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue(i47 == 52);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        org.junit.Assert.assertTrue(i53 == (-1));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(i80 == 97);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNull(iterator_wildcard83);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        boolean b15 = appt7.getValid();
        appt7.setStartDay((int) (short) 10);
        appt7.setStartDay((-1));
        appt7.setStartYear((int) '4');
        appt7.setStartHour(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
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
        appt12.setStartYear((int) (short) -1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
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
        appt7.setTitle("hi!");
        appt7.setStartYear(100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i20 == 97);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        boolean b8 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(linkedlist_appt9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        cs362.Appt appt7 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        int i8 = appt7.getStartMinute();
        appt7.setStartMinute((int) (byte) 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        cs362.Appt appt7 = new cs362.Appt((-1), (int) (short) 0, 97, (int) (byte) 100, (int) (short) 1, "", "hi!");
        appt7.setTitle("");
        appt7.setStartMinute(0);
        boolean b12 = appt7.getValid();
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
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
        cs362.Appt appt31 = new cs362.Appt(97, 52, (int) 'a', 52, 0, "", "");
        java.lang.String str32 = appt31.getTitle();
        boolean b33 = appt31.getValid();
        java.lang.String str34 = appt31.getDescription();
        calDay0.addAppt(appt31);
        appt31.setTitle("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(iterator_wildcard23);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartMonth((int) ' ');
        appt7.setStartMonth(0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartMinute(0);
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartDay();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
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
        int i25 = appt14.getStartYear();
        appt14.setStartMonth(10);
        int i28 = appt14.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(i25 == 97);
        org.junit.Assert.assertTrue(i28 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
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
        java.lang.String str64 = calDay0.toString();
        int i65 = calDay0.getYear();
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
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
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
        java.lang.String str23 = calDay0.toString();
        boolean b24 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        java.lang.String str26 = calDay0.toString();
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        appt34.setStartMinute((int) (byte) 10);
        appt34.setStartYear(0);
        appt34.setStartHour((int) '#');
        appt34.setStartHour((int) (short) 10);
        appt34.setStartHour((int) (short) 1);
        java.lang.String str47 = appt34.getTitle();
        java.lang.String str48 = appt34.getDescription();
        appt34.setTitle("hi!");
        appt34.setStartDay((int) 'a');
        java.lang.String str53 = appt34.getTitle();
        calDay0.addAppt(appt34);
        boolean b55 = appt34.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(linkedlist_appt25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
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
        int i18 = appt11.getStartMinute();
        int i19 = appt11.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMinute((int) (byte) 10);
        appt10.setStartYear(0);
        appt10.setTitle("");
        calDay0.addAppt(appt10);
        int i20 = appt10.getStartMinute();
        appt10.setStartMonth((int) (short) -1);
        appt10.setDescription("");
        boolean b25 = appt10.getValid();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i20 == 10);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        int i8 = calDay0.getDay();
        int i9 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard10 = calDay0.iterator();
        int i11 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(iterator_wildcard10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        java.lang.String str14 = appt7.getDescription();
        appt7.setStartYear(0);
        int i17 = appt7.getStartDay();
        appt7.setDescription("");
        appt7.setStartHour((int) '4');
        java.lang.String str22 = appt7.toString();
        int i23 = appt7.getStartMinute();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(i23 == 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartHour();
        appt7.setStartHour((int) 'a');
        int i13 = appt7.getStartMinute();
        java.lang.String str14 = appt7.getDescription();
        boolean b15 = appt7.getValid();
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        appt7.setDescription("hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
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
        appt7.setStartHour((int) (byte) 1);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartDay((int) (byte) 1);
        int i15 = appt7.getStartHour();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
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
        int i20 = appt11.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt19 = calDay0.getAppts();
        int i20 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(linkedlist_appt19);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
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
        java.lang.String str49 = appt45.getTitle();
        int i50 = appt45.getStartHour();
        appt45.setTitle("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        org.junit.Assert.assertTrue(i50 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
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
        appt65.setDescription("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartHour();
        appt7.setStartHour((int) 'a');
        int i13 = appt7.getStartMinute();
        java.lang.String str14 = appt7.getDescription();
        java.lang.String str15 = appt7.getTitle();
        appt7.setStartHour((int) '4');
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
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
        java.util.Iterator<?> iterator_wildcard39 = calDay0.iterator();
        java.lang.String str40 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertNull(iterator_wildcard39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
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
        boolean b19 = appt10.getValid();
        appt10.setTitle("");
        appt10.setStartHour((int) '4');
        boolean b24 = appt10.getValid();
        java.lang.String str25 = appt10.getDescription();
        java.lang.String str26 = appt10.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartDay((int) (byte) 1);
        int i15 = appt7.getStartMinute();
        int i16 = appt7.getStartHour();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getDescription();
        appt7.setStartDay((int) (byte) 10);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        cs362.Appt appt7 = new cs362.Appt(100, 52, (int) ' ', (int) (short) 10, (-1), "hi!", "hi!");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
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
        appt10.setStartYear((int) 'a');
        int i22 = appt10.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 97);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartYear();
        int i15 = appt7.getStartHour();
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test103");
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
        int i24 = appt12.getStartDay();
        appt12.setDescription("");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 52);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test104");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, (int) (short) 1, 0, 32, (int) '4', "hi!", "hi!");
        java.lang.String str8 = appt7.getTitle();
        int i9 = appt7.getStartDay();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test105");
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
        int i22 = appt7.getStartHour();
        appt7.setStartHour((int) (short) -1);
        appt7.setStartYear((int) 'a');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test106");
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
        int i23 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test107");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartHour((int) '4');
        boolean b16 = appt7.getValid();
        appt7.setStartMonth((int) ' ');
        appt7.setStartMonth((int) (byte) 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test108");
        cs362.Appt appt7 = new cs362.Appt((int) (short) -1, (int) 'a', (int) (short) 0, 35, (int) (byte) 10, "hi!", "hi!");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test109");
        cs362.Appt appt7 = new cs362.Appt((-1), 32, (int) '4', 0, 0, "", "");
        java.lang.String str8 = appt7.toString();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test110");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 10, 0, (int) (short) 100, (int) (byte) 10, "", "");
        appt7.setStartMinute((int) '#');
        java.lang.String str10 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test111");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        int i18 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 52);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test112");
        cs362.Appt appt7 = new cs362.Appt((int) '4', (int) (short) 10, (int) (byte) -1, 97, (int) '4', "\t1/10/-1 at 1:1am ,, \n", "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test113");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        int i6 = calDay0.getMonth();
        boolean b7 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertNull(linkedlist_appt5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test114");
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
        java.lang.String str22 = appt7.getTitle();
        appt7.setStartHour((int) (byte) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test115");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        appt7.setStartMinute((int) (byte) 0);
        appt7.setStartYear((int) (short) 1);
        appt7.setStartMinute((int) '4');
        int i23 = appt7.getStartYear();
        int i24 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(i24 == 52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test116");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test117");
        cs362.Appt appt7 = new cs362.Appt(10, (int) (short) 0, (int) (byte) 0, 0, (int) (byte) 1, "", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test118");
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
        boolean b24 = calDay0.isValid();
        java.lang.String str25 = calDay0.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test119");
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
        cs362.Appt appt33 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt33.setStartHour(1);
        int i36 = appt33.getStartYear();
        boolean b37 = appt33.getValid();
        int i38 = appt33.getStartMonth();
        appt33.setStartYear((int) (byte) -1);
        appt33.setStartHour((-1));
        calDay0.addAppt(appt33);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue(i36 == 97);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test120");
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
        appt7.setDescription("hi!");
        boolean b30 = appt7.getValid();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test121");
        cs362.Appt appt7 = new cs362.Appt(52, (-1), 10, (int) 'a', (int) (short) 10, "hi!", "");
        appt7.setStartHour(1);
        appt7.setStartDay((int) (byte) -1);
        appt7.setStartYear((int) (short) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test122");
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
        int i68 = calDay0.getDay();
        cs362.CalDay calDay69 = new cs362.CalDay();
        cs362.CalDay calDay70 = new cs362.CalDay();
        int i71 = calDay70.getYear();
        int i72 = calDay70.getYear();
        cs362.Appt appt80 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt80.setStartHour(1);
        appt80.setStartMonth((int) (short) -1);
        int i85 = appt80.getStartMonth();
        calDay70.addAppt(appt80);
        appt80.setStartHour(0);
        int i89 = appt80.getStartYear();
        calDay69.addAppt(appt80);
        calDay0.addAppt(appt80);
        java.lang.String str92 = appt80.getDescription();
        java.lang.String str93 = appt80.getDescription();
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
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(i85 == (-1));
        org.junit.Assert.assertTrue(i89 == 97);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "" + "'", str93.equals(""));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test123");
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
        appt45.setStartMonth((int) (short) 10);
        appt45.setTitle("");
        java.lang.String str53 = appt45.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test124");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setStartMinute((int) (byte) -1);
        boolean b17 = appt7.getValid();
        appt7.setStartMonth((int) '#');
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test125");
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
        java.lang.String str23 = appt10.getDescription();
        appt10.setStartMonth(0);
        boolean b26 = appt10.getValid();
        appt10.setStartDay((int) (short) 10);
        java.lang.String str29 = appt10.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test126");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 10, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) '#', "\t1/10/-1 at 1:1am ,, \n", "hi!");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\t1/10/-1 at 1:1am ,, \n" + "'", str8.equals("\t1/10/-1 at 1:1am ,, \n"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test127");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        int i15 = appt7.getStartDay();
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.getDescription();
        int i18 = appt7.getStartMonth();
        appt7.setStartMonth((int) (byte) 0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test128");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        java.lang.String str8 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test129");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        appt7.setStartMonth((int) (byte) 100);
        int i18 = appt7.getStartDay();
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test130");
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
        appt11.setStartYear((int) '4');
        appt11.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 52);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test131");
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
        int i24 = calDay0.getDay();
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
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test132");
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
        appt12.setStartMonth(97);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test133");
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
        appt31.setStartHour((int) (byte) -1);
        int i48 = appt31.getStartDay();
        java.lang.String str49 = appt31.getDescription();
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
        org.junit.Assert.assertTrue(i48 == 52);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test134");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt26 = calDay0.getAppts();
        int i27 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertNull(linkedlist_appt26);
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test135");
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
        int i24 = calDay0.getYear();
        cs362.Appt appt32 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b33 = appt32.getValid();
        int i34 = appt32.getStartDay();
        appt32.setStartMinute((int) '#');
        int i37 = appt32.getStartMinute();
        java.lang.String str38 = appt32.getTitle();
        boolean b39 = appt32.getValid();
        calDay0.addAppt(appt32);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 52);
        org.junit.Assert.assertTrue(i37 == 35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test136");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        boolean b17 = appt7.getValid();
        appt7.setStartMinute((int) (byte) 1);
        boolean b20 = appt7.getValid();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test137");
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
        int i22 = appt11.getStartHour();
        appt11.setStartHour((int) (byte) 0);
        appt11.setStartMonth((int) (short) -1);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test138");
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
        java.lang.String str23 = appt10.getDescription();
        java.lang.String str24 = appt10.getDescription();
        boolean b25 = appt10.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test139");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        appt7.setStartDay((int) (short) 100);
        java.lang.String str16 = appt7.toString();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test140");
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
        java.util.Iterator<?> iterator_wildcard30 = calDay0.iterator();
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
        org.junit.Assert.assertNull(iterator_wildcard30);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test141");
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
        java.lang.String str40 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard41 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard41);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test142");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 10, (int) (short) 1, (-1), (int) (short) -1, "hi!", "");
        appt7.setStartMonth((int) (byte) -1);
        appt7.setStartYear((int) (short) 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test143");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 52);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test144");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        appt7.setStartMonth(97);
        appt7.setStartMonth(1);
        appt7.setStartMonth((int) (byte) 0);
        int i22 = appt7.getStartYear();
        boolean b23 = appt7.getValid();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test145");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartHour();
        int i18 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i18 == 10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test146");
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
        cs362.Appt appt27 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        appt27.setStartMonth(97);
        calDay0.addAppt(appt27);
        appt27.setDescription("");
        int i33 = appt27.getStartHour();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i33 == 52);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test147");
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
        appt11.setStartYear(0);
        int i31 = appt11.getStartMinute();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i31 == 10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test148");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        java.lang.String str13 = appt7.getTitle();
        java.lang.String str14 = appt7.getDescription();
        java.lang.String str15 = appt7.getDescription();
        int i16 = appt7.getStartMinute();
        appt7.setStartYear((-1));
        int i19 = appt7.getStartMonth();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i19 == (-1));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test149");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        appt7.setStartMonth((-1));
        int i16 = appt7.getStartMinute();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test150");
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
        java.util.Iterator<?> iterator_wildcard31 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard32 = calDay0.iterator();
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
        org.junit.Assert.assertNull(iterator_wildcard31);
        org.junit.Assert.assertNull(iterator_wildcard32);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test151");
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
        appt86.setStartYear(0);
        appt86.setTitle("");
        appt86.setStartHour((int) (short) 1);
        int i97 = appt86.getStartMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt98 = timeTable0.deleteAppt(linkedlist_appt68, appt86);
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
        org.junit.Assert.assertTrue(i97 == 1);
        org.junit.Assert.assertNull(linkedlist_appt98);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test152");
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
        int i25 = appt11.getStartYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test153");
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
        java.util.Iterator<?> iterator_wildcard25 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(iterator_wildcard25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test154");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartYear();
        appt7.setStartMinute((int) '4');
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        java.lang.String str18 = appt7.getTitle();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test155");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour(100);
        appt7.setStartMonth((int) ' ');
        java.lang.String str19 = appt7.toString();
        boolean b20 = appt7.getValid();
        int i21 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        int i24 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i24 == 100);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test156");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        int i17 = appt7.getStartHour();
        appt7.setStartMinute(97);
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test157");
        cs362.Appt appt7 = new cs362.Appt(97, (int) (short) 1, (int) (byte) 100, (int) (byte) 0, (int) (byte) 100, "\t1/10/97 at 1:1am ,, \n", "\t10/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test158");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartMinute();
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test159");
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
        java.lang.String str11 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt12 = calDay0.getAppts();
        boolean b13 = calDay0.isValid();
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
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test160");
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
        int i58 = appt47.getStartYear();
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
        org.junit.Assert.assertTrue(i58 == 97);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test161");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) (short) 10, "", "");
        appt7.setTitle("");
        int i10 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test162");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartDay();
        int i12 = appt7.getStartMinute();
        appt7.setStartMonth(52);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 52);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test163");
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
        java.lang.String str28 = appt12.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test164");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour((int) (byte) 10);
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartDay((int) 'a');
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test165");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard7 = calDay0.iterator();
        boolean b8 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(iterator_wildcard7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(iterator_wildcard9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test166");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.getDescription();
        java.lang.String str14 = appt7.getTitle();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test167");
        cs362.Appt appt7 = new cs362.Appt((int) '4', 97, (int) (byte) 0, (int) (byte) -1, 52, "hi!", "hi!");
        appt7.setStartMonth(97);
        int i10 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test168");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.toString();
        appt7.setStartYear((int) (byte) 0);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test169");
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
        boolean b23 = calDay0.isValid();
        boolean b24 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test170");
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
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMonth();
        int i42 = appt36.getStartYear();
        boolean b43 = appt36.getValid();
        appt36.setStartMinute((int) (byte) -1);
        int i46 = appt36.getStartMinute();
        appt36.setStartYear((int) (short) 10);
        appt36.setDescription("hi!");
        int i51 = appt36.getStartHour();
        calDay0.addAppt(appt36);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(i42 == 97);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == (-1));
        org.junit.Assert.assertTrue(i51 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test171");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        java.lang.String str15 = appt7.toString();
        appt7.setStartHour((int) (byte) 0);
        appt7.setTitle("hi!");
        int i20 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test172");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test173");
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
        cs362.Appt appt66 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt66.setStartHour(1);
        appt66.setStartMinute((int) (byte) 10);
        appt66.setStartYear(0);
        appt66.setTitle("");
        appt66.setStartMonth(97);
        appt66.setStartMonth((int) (byte) 100);
        int i79 = appt66.getStartYear();
        int i80 = appt66.getStartHour();
        calDay0.addAppt(appt66);
        boolean b82 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertTrue(i80 == 1);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test174");
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
        appt14.setStartMonth(0);
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test175");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.getTitle();
        appt7.setStartYear((int) (short) -1);
        appt7.setDescription("hi!");
        int i21 = appt7.getStartDay();
        boolean b22 = appt7.getValid();
        appt7.setStartMonth((int) '#');
        appt7.setDescription("");
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test176");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        appt7.setStartDay((-1));
        java.lang.String str22 = appt7.getDescription();
        appt7.setStartMonth((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test177");
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
        boolean b26 = calDay0.isValid();
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        int i37 = appt34.getStartYear();
        boolean b38 = appt34.getValid();
        appt34.setStartMonth((int) (short) -1);
        calDay0.addAppt(appt34);
        appt34.setStartDay((int) (short) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i37 == 97);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test178");
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
        appt14.setTitle("hi!");
        boolean b27 = appt14.getValid();
        appt14.setStartHour(32);
        int i30 = appt14.getStartMonth();
        int i31 = appt14.getStartMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test179");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartDay();
        appt7.setDescription("hi!");
        appt7.setStartDay(1);
        appt7.setStartMonth((int) '4');
        appt7.setStartYear((int) (short) -1);
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test180");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getMonth();
        int i9 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test181");
        cs362.Appt appt7 = new cs362.Appt(32, (int) (byte) 1, 0, 0, (int) (byte) 10, "", "\t10/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test182");
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
        int i24 = calDay0.getMonth();
        cs362.CalDay calDay25 = new cs362.CalDay();
        int i26 = calDay25.getYear();
        int i27 = calDay25.getYear();
        cs362.Appt appt35 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt35.setStartHour(1);
        appt35.setStartMonth((int) (short) -1);
        int i40 = appt35.getStartMonth();
        calDay25.addAppt(appt35);
        boolean b42 = appt35.getValid();
        java.lang.String str43 = appt35.getTitle();
        appt35.setStartMinute((int) '4');
        int i46 = appt35.getStartYear();
        calDay0.addAppt(appt35);
        int i48 = calDay0.getDay();
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
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i40 == (-1));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        org.junit.Assert.assertTrue(i46 == 97);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test183");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 10, (int) (byte) 0, (-1), 32, 1, "hi!", "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test184");
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
        boolean b25 = calDay0.isValid();
        java.lang.String str26 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test185");
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
        int i10 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test186");
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
        java.lang.String str46 = appt31.getDescription();
        int i47 = appt31.getStartMinute();
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
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        org.junit.Assert.assertTrue(i47 == 52);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test187");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        int i17 = appt7.getStartMonth();
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test188");
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
        int i65 = appt50.getStartYear();
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
        org.junit.Assert.assertTrue(i65 == 97);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test189");
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
        int i24 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard25 = calDay0.iterator();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(iterator_wildcard25);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test190");
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
        appt31.setStartHour((int) (byte) -1);
        boolean b48 = appt31.getValid();
        appt31.setStartMonth((int) '4');
        appt31.setTitle("");
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
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test191");
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
        int i23 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i23 == 52);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test192");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getMonth();
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test193");
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
        int i26 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test194");
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
        appt12.setTitle("");
        int i29 = appt12.getStartMonth();
        appt12.setStartDay(97);
        int i32 = appt12.getStartYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == (-1));
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test195");
        cs362.Appt appt7 = new cs362.Appt((int) 'a', (int) 'a', (int) (short) 0, 0, (int) (byte) 10, "", "hi!");
        boolean b8 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test196");
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
        cs362.Appt appt17 = new cs362.Appt((-1), (int) (short) 1, 52, (int) (short) -1, (int) (short) 100, "", "hi!");
        int i18 = appt17.getStartYear();
        int i19 = appt17.getStartHour();
        calDay0.addAppt(appt17);
        java.lang.String str21 = appt17.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i18 == 100);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test197");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMinute((int) (byte) 10);
        appt10.setStartYear(0);
        appt10.setTitle("");
        calDay0.addAppt(appt10);
        java.lang.String str20 = appt10.toString();
        appt10.setStartMonth((int) (short) 1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test198");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear((int) (byte) -1);
        appt7.setStartMonth((int) (byte) 10);
        appt7.setStartMonth((-1));
        java.lang.String str18 = appt7.toString();
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test199");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test200");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (byte) -1, 100, 0, 52, "", "");
        java.lang.String str8 = appt7.toString();
        java.lang.String str9 = appt7.getDescription();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test201");
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
        int i38 = calDay0.getYear();
        int i39 = calDay0.getMonth();
        java.lang.String str40 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(linkedlist_appt37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test202");
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
        int i22 = calDay0.getYear();
        boolean b23 = calDay0.isValid();
        boolean b24 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test203");
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
        int i25 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt26 = calDay0.getAppts();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(linkedlist_appt26);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test204");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 100, (-1), (int) ' ', (int) (byte) 10, "hi!", "");
        java.lang.String str8 = appt7.toString();
        int i9 = appt7.getStartDay();
        int i10 = appt7.getStartYear();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == 10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test205");
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
        java.lang.String str26 = calDay0.toString();
        int i27 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertNull(iterator_wildcard25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue(i27 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test206");
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
        appt30.setStartDay((int) (short) 0);
        appt30.setStartMinute(100);
        int i36 = appt30.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test207");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        int i19 = appt7.getStartHour();
        appt7.setStartMinute((-1));
        appt7.setStartDay(100);
        appt7.setStartDay((int) ' ');
        java.lang.String str26 = appt7.toString();
        appt7.setDescription("\t10/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test208");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getDay();
        java.lang.String str6 = calDay0.toString();
        int i7 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test209");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        java.lang.String str4 = calDay0.toString();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test210");
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
        java.lang.String str51 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard52 = calDay0.iterator();
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
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard52);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test211");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        cs362.Appt appt9 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt9.setStartHour(1);
        appt9.setStartMonth((int) (short) -1);
        int i14 = appt9.getStartMinute();
        appt9.setStartHour((int) '4');
        int i17 = appt9.getStartDay();
        int i18 = appt9.getStartMinute();
        calDay0.addAppt(appt9);
        appt9.setDescription("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test212");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        boolean b7 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test213");
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
        java.lang.String str20 = calDay0.toString();
        java.lang.String str21 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test214");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertNull(iterator_wildcard5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test215");
        cs362.Appt appt7 = new cs362.Appt(52, 52, (int) (short) 1, (int) (short) 1, 52, "\t1/10/97 at 1:1am ,, \n", "\t1/10/-1 at 1:1am ,, \n");
        appt7.setStartHour((int) (short) 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test216");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        appt7.setStartHour((int) (byte) 10);
        int i12 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == 10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test217");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        appt7.setStartHour((-1));
        java.lang.String str17 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test218");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) (short) 10, "", "");
        int i8 = appt7.getStartYear();
        java.lang.String str9 = appt7.getTitle();
        int i10 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 100);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test219");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.toString();
        int i14 = appt7.getStartHour();
        appt7.setStartMonth((int) (short) 100);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test220");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartMinute();
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test221");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartDay((int) (short) 1);
        int i19 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test222");
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
        int i22 = appt11.getStartMinute();
        int i23 = appt11.getStartMonth();
        appt11.setStartDay((int) ' ');
        appt11.setStartHour(100);
        java.lang.String str28 = appt11.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test223");
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
        boolean b24 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test224");
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
        cs362.Appt appt30 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt30.setStartHour(1);
        appt30.setStartMonth((int) (short) -1);
        int i35 = appt30.getStartMonth();
        int i36 = appt30.getStartYear();
        int i37 = appt30.getStartYear();
        java.lang.String str38 = appt30.getTitle();
        java.lang.String str39 = appt30.toString();
        boolean b40 = appt30.getValid();
        calDay0.addAppt(appt30);
        java.lang.String str42 = calDay0.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertTrue(i36 == 97);
        org.junit.Assert.assertTrue(i37 == 97);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test225");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        int i4 = calDay0.getMonth();
        boolean b5 = calDay0.isValid();
        boolean b6 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test226");
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
        int i20 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test227");
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
        java.lang.String str23 = appt10.getDescription();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i19 == 97);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test228");
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
        int i26 = calDay0.getYear();
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
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test229");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        boolean b14 = appt7.getValid();
        appt7.setDescription("hi!");
        java.lang.String str17 = appt7.getDescription();
        boolean b18 = appt7.getValid();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test230");
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
        int i64 = calDay0.getMonth();
        cs362.Appt appt72 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt72.setStartHour(1);
        appt72.setStartMinute((int) (byte) 10);
        appt72.setStartYear(0);
        appt72.setStartHour((int) '#');
        appt72.setStartHour((int) (short) 10);
        appt72.setStartHour((int) (short) 1);
        appt72.setStartYear((int) (short) 1);
        int i87 = appt72.getStartMonth();
        calDay0.addAppt(appt72);
        int i89 = appt72.getStartMonth();
        int i90 = appt72.getStartMinute();
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
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(i87 == 1);
        org.junit.Assert.assertTrue(i89 == 1);
        org.junit.Assert.assertTrue(i90 == 10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test231");
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
        int i24 = calDay0.getDay();
        boolean b25 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test232");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        boolean b15 = appt11.getValid();
        appt11.setTitle("hi!");
        java.lang.String str18 = appt11.toString();
        java.lang.String str19 = appt11.getTitle();
        calDay0.addAppt(appt11);
        int i21 = calDay0.getMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test233");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        java.lang.String str12 = appt7.toString();
        appt7.setStartDay((int) (byte) 1);
        int i15 = appt7.getStartMinute();
        int i16 = appt7.getStartMinute();
        java.lang.String str17 = appt7.getTitle();
        boolean b18 = appt7.getValid();
        appt7.setStartMonth(1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test234");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        int i25 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt26 = calDay0.getAppts();
        java.lang.String str27 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(linkedlist_appt26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test235");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt44 = calDay0.getAppts();
        boolean b45 = calDay0.isValid();
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
        org.junit.Assert.assertNull(linkedlist_appt44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test236");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartYear();
        int i22 = appt7.getStartMinute();
        int i23 = appt7.getStartYear();
        java.lang.String str24 = appt7.getDescription();
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 10);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test237");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test238");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(linkedlist_appt8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test239");
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
        java.lang.String str23 = appt7.toString();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test240");
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
        java.lang.String str37 = calDay0.toString();
        int i38 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt39 = calDay0.getAppts();
        java.lang.String str40 = calDay0.toString();
        int i41 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(linkedlist_appt39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test241");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getMonth();
        java.lang.String str6 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test242");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setStartMonth(0);
        int i16 = appt7.getStartMinute();
        appt7.setStartMinute((int) (byte) 1);
        int i19 = appt7.getStartHour();
        int i20 = appt7.getStartMonth();
        java.lang.String str21 = appt7.toString();
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test243");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear((int) (byte) -1);
        appt7.setStartMonth((int) (byte) 10);
        appt7.setStartMonth((-1));
        appt7.setDescription("\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test244");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        int i14 = appt7.getStartHour();
        int i15 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test245");
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
        int i27 = appt12.getStartMinute();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i26 == (-1));
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test246");
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
        appt12.setTitle("");
        appt12.setTitle("");
        java.lang.String str31 = appt12.getTitle();
        appt12.setStartDay(32);
        appt12.setStartDay((int) (short) 100);
        int i36 = appt12.getStartMinute();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue(i36 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test247");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        boolean b16 = appt7.getValid();
        int i17 = appt7.getStartMinute();
        appt7.setTitle("hi!");
        java.lang.String str20 = appt7.toString();
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test248");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour((int) 'a');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test249");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        java.lang.String str10 = appt7.toString();
        java.lang.String str11 = appt7.getTitle();
        appt7.setTitle("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test250");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        int i8 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test251");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartMonth();
        int i15 = appt7.getStartDay();
        appt7.setStartDay(0);
        java.lang.String str18 = appt7.toString();
        appt7.setStartMonth(52);
        appt7.setTitle("\t10/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test252");
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
        appt46.setStartHour((int) (short) -1);
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
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test253");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        appt7.setStartMinute((int) (byte) 100);
        appt7.setStartDay(52);
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test254");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        cs362.Appt appt14 = new cs362.Appt(52, (-1), 10, (int) 'a', (int) (short) 10, "hi!", "");
        appt14.setStartHour(1);
        appt14.setStartDay(0);
        appt14.setStartMonth((int) (byte) 100);
        calDay0.addAppt(appt14);
        appt14.setTitle("\t1/10/-1 at 1:1am ,, \n");
        appt14.setStartMinute((int) (short) 100);
        boolean b26 = appt14.getValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test255");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test256");
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
        boolean b43 = calDay0.isValid();
        cs362.Appt appt51 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt51.setStartHour(1);
        appt51.setStartMonth((int) (short) -1);
        int i56 = appt51.getStartMinute();
        appt51.setStartHour((int) '4');
        appt51.setDescription("hi!");
        calDay0.addAppt(appt51);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i56 == (-1));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test257");
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
        java.lang.String str38 = appt30.toString();
        appt30.setTitle("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test258");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("");
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartHour();
        java.lang.String str18 = appt7.toString();
        java.lang.String str19 = appt7.getDescription();
        appt7.setTitle("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test259");
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
        int i25 = calDay0.getMonth();
        int i26 = calDay0.getDay();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard5);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test260");
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
        int i68 = calDay0.getMonth();
        int i69 = calDay0.getDay();
        int i70 = calDay0.getYear();
        int i71 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(i71 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test261");
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
        java.util.Iterator<?> iterator_wildcard45 = calDay0.iterator();
        java.lang.String str46 = calDay0.toString();
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
        org.junit.Assert.assertNull(iterator_wildcard45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test262");
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
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        int i25 = calDay0.getDay();
        int i26 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test263");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 100, (int) (short) 1, 97, (int) (byte) 0, 0, "hi!", "hi!");
        appt7.setStartMonth((int) (byte) 100);
        java.lang.String str10 = appt7.getTitle();
        appt7.setStartMonth((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test264");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        java.lang.String str14 = appt7.getDescription();
        appt7.setStartYear(0);
        int i17 = appt7.getStartDay();
        boolean b18 = appt7.getValid();
        int i19 = appt7.getStartDay();
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 52);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test265");
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
        java.lang.String str34 = appt12.getDescription();
        appt12.setStartHour((int) '4');
        int i37 = appt12.getStartMonth();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue(i31 == 32);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(i37 == 32);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test266");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        int i18 = appt7.getStartMonth();
        appt7.setStartMinute((int) (byte) 10);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test267");
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
        cs362.CalDay calDay25 = new cs362.CalDay();
        int i26 = calDay25.getYear();
        int i27 = calDay25.getMonth();
        int i28 = calDay25.getDay();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMonth((int) (short) -1);
        int i41 = appt36.getStartMinute();
        appt36.setStartYear((int) (short) 100);
        boolean b44 = appt36.getValid();
        appt36.setStartMinute((int) 'a');
        calDay25.addAppt(appt36);
        calDay0.addAppt(appt36);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(linkedlist_appt24);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i41 == (-1));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test268");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', 52, (int) (byte) 10, 10, 0, "", "");
        int i8 = appt7.getStartHour();
        int i9 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i8 == 32);
        org.junit.Assert.assertTrue(i9 == 10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test269");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        int i8 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i8 == 97);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test270");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        cs362.Appt appt12 = new cs362.Appt(52, (int) (byte) 0, 97, (int) (byte) 1, (int) (byte) 10, "hi!", "");
        int i13 = appt12.getStartMinute();
        int i14 = appt12.getStartMinute();
        calDay0.addAppt(appt12);
        java.util.LinkedList<cs362.Appt> linkedlist_appt16 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(linkedlist_appt16);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test271");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setDescription("hi!");
        int i16 = appt7.getStartMonth();
        java.lang.String str17 = appt7.getDescription();
        appt7.setDescription("");
        int i20 = appt7.getStartMinute();
        appt7.setStartMinute(52);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test272");
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
        java.lang.String str22 = appt7.getTitle();
        int i23 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test273");
        cs362.Appt appt7 = new cs362.Appt(0, 1, 10, (int) (short) 0, 100, "\t10/10/97 at 1:1am ,, \n", "\t10/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test274");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        int i17 = appt7.getStartHour();
        int i18 = appt7.getStartMonth();
        boolean b19 = appt7.getValid();
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartMinute();
        int i22 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test275");
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
        int i31 = appt12.getStartMinute();
        appt12.setStartYear((int) (byte) 100);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(i30 == 1);
        org.junit.Assert.assertTrue(i31 == (-1));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test276");
        cs362.Appt appt7 = new cs362.Appt(32, 32, 1, 52, (int) 'a', "\t1/10/-1 at 1:1am ,, \n", "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test277");
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
        java.util.Iterator<?> iterator_wildcard19 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(iterator_wildcard19);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test278");
        cs362.Appt appt7 = new cs362.Appt(100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) (short) 10, "", "");
        appt7.setTitle("");
        java.lang.String str10 = appt7.getDescription();
        appt7.setStartMonth((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test279");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt23 = calDay0.getAppts();
        java.lang.String str24 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNull(iterator_wildcard22);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test280");
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
        appt46.setStartDay(0);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertNull(iterator_wildcard38);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test281");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 100, (-1), 100, 32, "", "hi!");
        appt7.setStartYear((int) 'a');
        appt7.setStartHour((int) (byte) 100);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test282");
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
        int i25 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i25 == 10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test283");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (byte) 10);
        appt7.setStartMinute(0);
        int i17 = appt7.getStartHour();
        appt7.setStartHour((int) (short) 1);
        appt7.setStartMinute((int) (byte) 10);
        int i22 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(i22 == 10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test284");
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
        java.util.Iterator<?> iterator_wildcard89 = calDay0.iterator();
        int i90 = calDay0.getYear();
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
        org.junit.Assert.assertNull(iterator_wildcard89);
        org.junit.Assert.assertTrue(i90 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test285");
        cs362.Appt appt7 = new cs362.Appt(35, (int) ' ', 35, (int) (short) 0, 32, "\t1/10/-1 at 1:1am ,, \n", "\t1/10/-1 at 1:1am ,, \n");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test286");
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
        boolean b30 = calDay0.isValid();
        cs362.CalDay calDay31 = new cs362.CalDay();
        int i32 = calDay31.getYear();
        int i33 = calDay31.getYear();
        java.lang.String str34 = calDay31.toString();
        cs362.Appt appt42 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt42.setStartHour(1);
        appt42.setStartMonth((int) (short) -1);
        int i47 = appt42.getStartMinute();
        appt42.setStartHour((int) '4');
        calDay31.addAppt(appt42);
        cs362.Appt appt58 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt58.setStartHour(1);
        appt58.setStartMinute((int) (byte) 10);
        appt58.setStartYear(0);
        int i65 = appt58.getStartMonth();
        calDay31.addAppt(appt58);
        boolean b67 = calDay31.isValid();
        java.util.Iterator<?> iterator_wildcard68 = calDay31.iterator();
        java.util.Iterator<?> iterator_wildcard69 = calDay31.iterator();
        int i70 = calDay31.getYear();
        cs362.Appt appt78 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt78.setStartHour(1);
        int i81 = appt78.getStartYear();
        java.lang.String str82 = appt78.toString();
        calDay31.addAppt(appt78);
        calDay0.addAppt(appt78);
        int i85 = calDay0.getMonth();
        cs362.Appt appt93 = new cs362.Appt((int) (byte) 0, (int) 'a', 0, (int) '#', (int) (short) 10, "hi!", "hi!");
        calDay0.addAppt(appt93);
        java.lang.String str95 = calDay0.toString();
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
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertTrue(i47 == (-1));
        org.junit.Assert.assertTrue(i65 == 1);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(iterator_wildcard68);
        org.junit.Assert.assertNull(iterator_wildcard69);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue(i81 == 97);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue(i85 == 0);
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test287");
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
        boolean b25 = calDay0.isValid();
        int i26 = calDay0.getMonth();
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        int i37 = appt34.getStartYear();
        appt34.setDescription("");
        calDay0.addAppt(appt34);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i37 == 97);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test288");
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
        appt14.setStartHour((int) (short) 1);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test289");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setStartMinute(1);
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartMinute();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test290");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        java.lang.String str16 = appt7.getDescription();
        int i17 = appt7.getStartDay();
        int i18 = appt7.getStartMinute();
        appt7.setStartHour((int) '#');
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 52);
        org.junit.Assert.assertTrue(i18 == 10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test291");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        int i12 = appt7.getStartHour();
        java.lang.String str13 = appt7.toString();
        int i14 = appt7.getStartHour();
        int i15 = appt7.getStartYear();
        appt7.setTitle("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test292");
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
        boolean b19 = appt10.getValid();
        appt10.setStartMonth(97);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test293");
        cs362.Appt appt7 = new cs362.Appt((int) 'a', 1, (int) ' ', 35, 35, "\t10/10/97 at 1:1am ,, \n", "\t10/10/97 at 1:1am ,, \n");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test294");
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
        boolean b22 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(iterator_wildcard23);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test295");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        appt7.setStartMinute(1);
        appt7.setDescription("hi!");
        appt7.setStartYear((int) ' ');
        org.junit.Assert.assertTrue(i16 == 97);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test296");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, (int) (short) 10, (int) (short) 100, 35, 100, "hi!", "hi!");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 35);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test297");
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
        int i27 = appt11.getStartMonth();
        appt11.setStartMinute((int) '#');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i27 == 52);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test298");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 0, 35, (int) (short) 1, 100, (int) '#', "", "\t1/10/97 at 1:1am ,, \n");
        appt7.setStartMonth((int) (byte) 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test299");
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
        appt56.setStartMonth(100);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(iterator_wildcard37);
        org.junit.Assert.assertTrue(i61 == (-1));
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test300");
        cs362.Appt appt7 = new cs362.Appt(1, 32, (int) (short) 10, 35, (int) (short) 1, "", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 35);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test301");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        int i13 = appt7.getStartMinute();
        int i14 = appt7.getStartYear();
        appt7.setStartDay(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 97);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test302");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt21 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt22 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt23 = calDay0.getAppts();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(linkedlist_appt21);
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertNull(linkedlist_appt23);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test303");
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
        appt7.setStartHour(100);
        java.lang.String str25 = appt7.getTitle();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i21 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test304");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        int i10 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(iterator_wildcard8);
        org.junit.Assert.assertNull(iterator_wildcard9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test305");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        java.util.Iterator<?> iterator_wildcard16 = calDay0.iterator();
        cs362.Appt appt24 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt24.setStartHour(1);
        appt24.setStartMinute((int) (byte) 10);
        appt24.setStartYear(0);
        appt24.setTitle("");
        appt24.setStartMonth(97);
        appt24.setStartMonth(1);
        appt24.setStartMonth((int) (byte) 0);
        calDay0.addAppt(appt24);
        java.lang.String str40 = appt24.toString();
        java.lang.String str41 = appt24.getDescription();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(iterator_wildcard16);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test306");
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
        int i40 = calDay0.getDay();
        int i41 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test307");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartDay((-1));
        appt7.setDescription("");
        int i16 = appt7.getStartYear();
        appt7.setStartMinute(1);
        appt7.setStartDay(10);
        int i21 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(i21 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test308");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        boolean b12 = appt7.getValid();
        java.lang.String str13 = appt7.getDescription();
        appt7.setStartMonth((-1));
        java.lang.String str16 = appt7.toString();
        java.lang.String str17 = appt7.toString();
        appt7.setStartMinute((int) (byte) 1);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test309");
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
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMinute((int) (byte) 10);
        appt36.setStartYear(0);
        int i43 = appt36.getStartMinute();
        int i44 = appt36.getStartDay();
        appt36.setStartMinute((int) (byte) 100);
        calDay0.addAppt(appt36);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i19 == (-1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i43 == 10);
        org.junit.Assert.assertTrue(i44 == 52);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test310");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        boolean b7 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        java.lang.String str10 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(linkedlist_appt8);
        org.junit.Assert.assertNull(iterator_wildcard9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test311");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        int i14 = appt7.getStartYear();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.toString();
        int i17 = appt7.getStartMonth();
        appt7.setTitle("hi!");
        java.lang.String str20 = appt7.getDescription();
        java.lang.String str21 = appt7.getTitle();
        int i22 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue(i22 == 1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test312");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        int i13 = appt10.getStartYear();
        java.lang.String str14 = appt10.toString();
        java.lang.String str15 = appt10.toString();
        appt10.setStartHour((int) ' ');
        appt10.setDescription("");
        int i20 = appt10.getStartDay();
        int i21 = appt10.getStartDay();
        appt10.setDescription("hi!");
        calDay0.addAppt(appt10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i20 == 52);
        org.junit.Assert.assertTrue(i21 == 52);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test313");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartDay();
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 52);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test314");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 0, 0, (int) '#', (int) (byte) 0, 0, "", "");
        int i8 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test315");
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
        boolean b19 = appt10.getValid();
        appt10.setTitle("");
        int i22 = appt10.getStartDay();
        appt10.setStartMinute((int) 'a');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 52);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test316");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 1, 32, 0, (int) (short) 0, "", "");
        int i8 = appt7.getStartHour();
        org.junit.Assert.assertTrue(i8 == 32);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test317");
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
        java.util.Iterator<?> iterator_wildcard89 = calDay0.iterator();
        java.lang.String str90 = calDay0.toString();
        int i91 = calDay0.getYear();
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
        org.junit.Assert.assertNull(iterator_wildcard89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
        org.junit.Assert.assertTrue(i91 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test318");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        cs362.CalDay calDay8 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard9 = calDay8.iterator();
        cs362.CalDay calDay10 = new cs362.CalDay();
        int i11 = calDay10.getYear();
        int i12 = calDay10.getYear();
        cs362.Appt appt20 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt20.setStartHour(1);
        appt20.setStartMonth((int) (short) -1);
        int i25 = appt20.getStartMonth();
        calDay10.addAppt(appt20);
        appt20.setStartHour(0);
        calDay8.addAppt(appt20);
        int i30 = calDay8.getDay();
        cs362.Appt appt38 = new cs362.Appt((int) (byte) 10, (int) ' ', (int) 'a', 0, (int) (short) 100, "", "hi!");
        calDay8.addAppt(appt38);
        appt38.setStartDay((int) (short) 0);
        int i42 = appt38.getStartDay();
        int i43 = appt38.getStartYear();
        calDay0.addAppt(appt38);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(linkedlist_appt7);
        org.junit.Assert.assertNull(iterator_wildcard9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 100);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test319");
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
        java.lang.String str40 = appt27.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test320");
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
        appt14.setTitle("\t1/10/97 at 1:1am ,, \n");
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test321");
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
        appt27.setStartMinute((int) (short) 10);
        int i44 = appt27.getStartHour();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i40 == 10);
        org.junit.Assert.assertTrue(i41 == 1);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test322");
        cs362.Appt appt7 = new cs362.Appt((int) (byte) 1, 97, (int) (byte) 10, (int) (short) 1, 35, "", "hi!");
        java.lang.String str8 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test323");
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
        appt10.setStartMonth((int) (byte) 10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test324");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartYear((int) (byte) -1);
        appt7.setDescription("hi!");
        java.lang.String str20 = appt7.getTitle();
        boolean b21 = appt7.getValid();
        boolean b22 = appt7.getValid();
        int i23 = appt7.getStartMonth();
        appt7.setDescription("\t1/10/97 at 1:1am ,, \n");
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test325");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        java.lang.String str20 = appt7.getTitle();
        java.lang.String str21 = appt7.getDescription();
        appt7.setTitle("hi!");
        java.lang.String str24 = appt7.getTitle();
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test326");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setStartHour((int) '#');
        appt7.setStartHour((int) (short) 10);
        appt7.setStartHour((int) (short) 1);
        int i20 = appt7.getStartYear();
        appt7.setStartHour((int) 'a');
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test327");
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
        appt32.setStartHour((int) '4');
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test328");
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
        int i27 = appt14.getStartDay();
        appt14.setStartHour((int) (short) -1);
        appt14.setStartDay(10);
        java.lang.String str32 = appt14.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(i27 == 52);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test329");
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
        int i25 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(iterator_wildcard24);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test330");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        int i16 = appt7.getStartHour();
        appt7.setStartMinute((int) '4');
        boolean b19 = appt7.getValid();
        appt7.setStartMinute(35);
        appt7.setStartYear((int) (short) -1);
        appt7.setStartMonth((int) ' ');
        java.lang.String str26 = appt7.getDescription();
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test331");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartHour((int) '4');
        appt7.setStartHour((int) (short) 0);
        int i17 = appt7.getStartHour();
        boolean b18 = appt7.getValid();
        int i19 = appt7.getStartHour();
        appt7.setStartYear(0);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test332");
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
        cs362.Appt appt54 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt54.setStartHour(1);
        appt54.setStartMinute((int) (byte) 10);
        appt54.setStartYear(0);
        appt54.setDescription("hi!");
        int i63 = appt54.getStartHour();
        java.lang.String str64 = appt54.getDescription();
        appt54.setStartYear(100);
        calDay0.addAppt(appt54);
        appt54.setDescription("\t1/10/-1 at 1:1am ,, \n");
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
        org.junit.Assert.assertTrue(i63 == 1);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test333");
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
        int i62 = appt47.getStartMinute();
        int i63 = appt47.getStartMonth();
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
        org.junit.Assert.assertTrue(i62 == 1);
        org.junit.Assert.assertTrue(i63 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test334");
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
        int i64 = calDay0.getMonth();
        cs362.Appt appt72 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt72.setStartHour(1);
        appt72.setStartMinute((int) (byte) 10);
        appt72.setStartYear(0);
        appt72.setStartHour((int) '#');
        appt72.setStartHour((int) (short) 10);
        appt72.setStartHour((int) (short) 1);
        appt72.setStartYear((int) (short) 1);
        int i87 = appt72.getStartMonth();
        calDay0.addAppt(appt72);
        int i89 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt90 = calDay0.getAppts();
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
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(i87 == 1);
        org.junit.Assert.assertTrue(i89 == 0);
        org.junit.Assert.assertNull(linkedlist_appt90);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test335");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.getTitle();
        appt7.setTitle("");
        java.lang.String str19 = appt7.getTitle();
        int i20 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == (-1));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test336");
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
        int i10 = calDay0.getYear();
        int i11 = calDay0.getMonth();
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
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test337");
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
        boolean b38 = appt30.getValid();
        appt30.setStartYear(10);
        java.lang.String str41 = appt30.getTitle();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i33 == 97);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue(i35 == 1);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test338");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        boolean b13 = appt7.getValid();
        int i14 = appt7.getStartMonth();
        appt7.setStartHour((int) (byte) 10);
        appt7.setStartHour(0);
        int i19 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i19 == 97);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test339");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        boolean b3 = calDay0.isValid();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        appt11.setStartMonth((int) (short) -1);
        int i16 = appt11.getStartMonth();
        int i17 = appt11.getStartMonth();
        int i18 = appt11.getStartYear();
        java.lang.String str19 = appt11.getDescription();
        int i20 = appt11.getStartMonth();
        appt11.setStartDay((int) (short) 0);
        calDay0.addAppt(appt11);
        boolean b24 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == (-1));
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test340");
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
        appt12.setTitle("\t1/10/-1 at 1:1am ,, \n");
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test341");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        appt10.setStartMonth((int) (short) 10);
        java.lang.String str19 = appt10.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test342");
        cs362.Appt appt7 = new cs362.Appt(1, (int) (byte) 1, 100, (int) (byte) -1, (int) '4', "", "hi!");
        java.lang.String str8 = appt7.toString();
        appt7.setStartMinute((int) (short) 10);
        appt7.setStartMonth((int) (short) 100);
        appt7.setStartDay(97);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test343");
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
        int i69 = calDay0.getYear();
        boolean b70 = calDay0.isValid();
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
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test344");
        cs362.TimeTable timeTable0 = new cs362.TimeTable();
        java.util.LinkedList<cs362.Appt> linkedlist_appt1 = null;
        cs362.CalDay calDay2 = new cs362.CalDay();
        int i3 = calDay2.getYear();
        int i4 = calDay2.getYear();
        cs362.Appt appt12 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt12.setStartHour(1);
        appt12.setStartMonth((int) (short) -1);
        int i17 = appt12.getStartMonth();
        calDay2.addAppt(appt12);
        boolean b19 = appt12.getValid();
        java.lang.String str20 = appt12.getDescription();
        boolean b21 = appt12.getValid();
        appt12.setTitle("");
        appt12.setStartHour((int) '4');
        boolean b26 = appt12.getValid();
        java.lang.String str27 = appt12.getDescription();
        java.util.LinkedList<cs362.Appt> linkedlist_appt28 = timeTable0.deleteAppt(linkedlist_appt1, appt12);
        java.util.LinkedList<cs362.Appt> linkedlist_appt29 = null;
        cs362.CalDay calDay30 = new cs362.CalDay();
        int i31 = calDay30.getYear();
        java.lang.String str32 = calDay30.toString();
        java.lang.String str33 = calDay30.toString();
        java.lang.String str34 = calDay30.toString();
        java.util.Iterator<?> iterator_wildcard35 = calDay30.iterator();
        cs362.Appt appt43 = new cs362.Appt(52, 0, 0, (int) '#', (int) (short) 10, "", "hi!");
        calDay30.addAppt(appt43);
        java.lang.String str45 = appt43.getTitle();
        java.util.LinkedList<cs362.Appt> linkedlist_appt46 = timeTable0.deleteAppt(linkedlist_appt29, appt43);
        java.util.LinkedList<cs362.Appt> linkedlist_appt47 = null;
        java.util.GregorianCalendar gregorianCalendar48 = null;
        java.util.GregorianCalendar gregorianCalendar49 = null;
        try {
            java.util.LinkedList<cs362.CalDay> linkedlist_calDay50 = timeTable0.getApptRange(linkedlist_appt47, gregorianCalendar48, gregorianCalendar49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard35);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt46);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test345");
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
        java.lang.String str23 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard24 = calDay0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard24);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test346");
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
        cs362.CalDay calDay51 = new cs362.CalDay();
        int i52 = calDay51.getYear();
        int i53 = calDay51.getYear();
        cs362.Appt appt61 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt61.setStartHour(1);
        appt61.setStartMonth((int) (short) -1);
        int i66 = appt61.getStartMonth();
        calDay51.addAppt(appt61);
        appt61.setStartHour(0);
        int i70 = appt61.getStartYear();
        int i71 = appt61.getStartYear();
        java.lang.String str72 = appt61.toString();
        appt61.setStartMonth((int) 'a');
        int i75 = appt61.getStartDay();
        calDay0.addAppt(appt61);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i66 == (-1));
        org.junit.Assert.assertTrue(i70 == 97);
        org.junit.Assert.assertTrue(i71 == 97);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue(i75 == 52);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test347");
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
        cs362.Appt appt54 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt54.setStartHour(1);
        appt54.setStartMinute((int) (byte) 10);
        appt54.setStartYear((int) (byte) -1);
        appt54.setStartMonth((int) (byte) 10);
        calDay0.addAppt(appt54);
        int i64 = appt54.getStartDay();
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
        org.junit.Assert.assertTrue(i64 == 52);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test348");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        appt7.setStartHour((int) (byte) 0);
        java.lang.String str14 = appt7.getDescription();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test349");
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
        int i30 = appt12.getStartMonth();
        java.lang.String str31 = appt12.getDescription();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue(i30 == 32);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test350");
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
        cs362.Appt appt31 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        boolean b32 = appt31.getValid();
        calDay0.addAppt(appt31);
        int i34 = calDay0.getYear();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i34 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test351");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.getMonth();
        boolean b6 = calDay0.isValid();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(linkedlist_appt4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test352");
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
        java.lang.String str24 = appt7.getTitle();
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i19 == 10);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test353");
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
        cs362.Appt appt58 = new cs362.Appt((int) (byte) 100, (int) (short) 1, 97, 97, (int) (short) 0, "", "");
        boolean b59 = appt58.getValid();
        int i60 = appt58.getStartMinute();
        appt58.setStartHour(32);
        calDay0.addAppt(appt58);
        boolean b64 = calDay0.isValid();
        cs362.Appt appt72 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt72.setStartHour(1);
        appt72.setStartMonth((int) (short) -1);
        java.lang.String str77 = appt72.toString();
        int i78 = appt72.getStartYear();
        appt72.setStartMinute((int) '4');
        boolean b81 = appt72.getValid();
        calDay0.addAppt(appt72);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 1);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue(i78 == 97);
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test354");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        java.lang.String str12 = appt7.toString();
        int i13 = appt7.getStartHour();
        int i14 = appt7.getStartMonth();
        appt7.setStartMinute((int) (short) 1);
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test355");
        cs362.Appt appt7 = new cs362.Appt((int) (short) 1, (int) (byte) 100, 0, (int) (short) 0, 10, "", "");
        boolean b8 = appt7.getValid();
        boolean b9 = appt7.getValid();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test356");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        appt7.setTitle("hi!");
        java.lang.String str17 = appt7.getTitle();
        appt7.setTitle("");
        int i20 = appt7.getStartYear();
        int i21 = appt7.getStartYear();
        java.lang.String str22 = appt7.getDescription();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 97);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test357");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt27 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt28 = calDay0.getAppts();
        int i29 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNull(iterator_wildcard4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i23 == 10);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(linkedlist_appt27);
        org.junit.Assert.assertNull(linkedlist_appt28);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test358");
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
        int i25 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard26 = calDay0.iterator();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(iterator_wildcard26);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test359");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        int i14 = appt7.getStartMinute();
        int i15 = appt7.getStartDay();
        int i16 = appt7.getStartMinute();
        appt7.setDescription("hi!");
        appt7.setStartHour((int) ' ');
        appt7.setStartDay((int) (short) 10);
        java.lang.String str23 = appt7.toString();
        org.junit.Assert.assertTrue(i14 == 10);
        org.junit.Assert.assertTrue(i15 == 52);
        org.junit.Assert.assertTrue(i16 == 10);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test360");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        appt7.setStartMinute((int) (short) 10);
        appt7.setStartDay((int) (byte) 10);
        org.junit.Assert.assertTrue(i10 == 97);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test361");
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
        cs362.Appt appt34 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt34.setStartHour(1);
        appt34.setStartMonth((int) (short) -1);
        int i39 = appt34.getStartMinute();
        appt34.setStartHour((int) '4');
        int i42 = appt34.getStartDay();
        java.lang.String str43 = appt34.toString();
        appt34.setTitle("");
        appt34.setStartYear(1);
        int i48 = appt34.getStartHour();
        appt34.setStartDay((int) (byte) 1);
        appt34.setStartDay((int) (byte) 100);
        appt34.setStartMinute((int) (short) 10);
        calDay0.addAppt(appt34);
        java.lang.String str56 = appt34.getTitle();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i39 == (-1));
        org.junit.Assert.assertTrue(i42 == 52);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue(i48 == 52);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test362");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        int i12 = appt7.getStartHour();
        appt7.setDescription("hi!");
        int i15 = appt7.getStartYear();
        appt7.setStartYear((int) '4');
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i15 == 97);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test363");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartYear();
        boolean b14 = appt7.getValid();
        java.lang.String str15 = appt7.getTitle();
        java.lang.String str16 = appt7.getTitle();
        int i17 = appt7.getStartYear();
        int i18 = appt7.getStartMinute();
        appt7.setTitle("");
        appt7.setStartMonth(35);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == (-1));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test364");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt10 = calDay0.getAppts();
        cs362.Appt appt18 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt18.setStartHour(1);
        appt18.setStartMonth((int) (short) -1);
        int i23 = appt18.getStartMonth();
        int i24 = appt18.getStartYear();
        boolean b25 = appt18.getValid();
        appt18.setTitle("hi!");
        java.lang.String str28 = appt18.getTitle();
        appt18.setTitle("");
        int i31 = appt18.getStartYear();
        int i32 = appt18.getStartDay();
        calDay0.addAppt(appt18);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(linkedlist_appt6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(linkedlist_appt10);
        org.junit.Assert.assertTrue(i23 == (-1));
        org.junit.Assert.assertTrue(i24 == 97);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue(i31 == 97);
        org.junit.Assert.assertTrue(i32 == 52);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test365");
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
        java.lang.String str37 = calDay0.toString();
        int i38 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt39 = calDay0.getAppts();
        int i40 = calDay0.getMonth();
        java.lang.String str41 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(iterator_wildcard3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(iterator_wildcard6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i22 == (-1));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(linkedlist_appt39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test366");
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
        boolean b24 = calDay0.isValid();
        int i25 = calDay0.getMonth();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertTrue(i21 == 52);
        org.junit.Assert.assertNull(linkedlist_appt23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test367");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMinute((int) (byte) 10);
        appt7.setStartYear(0);
        appt7.setTitle("hi!");
        appt7.setStartYear((int) (byte) -1);
        appt7.setDescription("hi!");
        java.lang.String str20 = appt7.getTitle();
        boolean b21 = appt7.getValid();
        boolean b22 = appt7.getValid();
        int i23 = appt7.getStartMonth();
        appt7.setStartMonth((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test368");
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
        appt27.setTitle("");
        int i40 = appt27.getStartDay();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue(i40 == 52);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test369");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        java.lang.String str11 = appt7.toString();
        java.lang.String str12 = appt7.toString();
        appt7.setStartHour((int) ' ');
        appt7.setStartMonth((int) (short) 0);
        int i17 = appt7.getStartMonth();
        boolean b18 = appt7.getValid();
        appt7.setTitle("hi!");
        appt7.setStartHour(52);
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test370");
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
        int i24 = calDay0.getDay();
        java.lang.String str25 = calDay0.toString();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertNull(linkedlist_appt22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test371");
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
        appt11.setStartYear(32);
        appt11.setStartDay(1);
        appt11.setStartHour(32);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(linkedlist_appt3);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test372");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        boolean b8 = appt7.getValid();
        int i9 = appt7.getStartDay();
        java.lang.String str10 = appt7.getDescription();
        int i11 = appt7.getStartMonth();
        appt7.setTitle("hi!");
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 52);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test373");
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
        boolean b19 = calDay0.isValid();
        int i20 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test374");
        cs362.Appt appt7 = new cs362.Appt((int) ' ', (int) (short) 100, (int) (byte) 100, (int) '4', (int) ' ', "", "hi!");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test375");
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
        int i25 = appt11.getStartMonth();
        boolean b26 = appt11.getValid();
        java.lang.String str27 = appt11.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i16 == (-1));
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i21 == 97);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i25 == (-1));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test376");
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
        appt12.setStartHour(35);
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test377");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMonth();
        int i13 = appt7.getStartMonth();
        int i14 = appt7.getStartHour();
        appt7.setStartHour(100);
        appt7.setStartMonth((int) ' ');
        appt7.setStartYear((int) ' ');
        appt7.setStartMonth(35);
        int i23 = appt7.getStartDay();
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == (-1));
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertTrue(i23 == 52);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test378");
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
        appt33.setStartHour((int) '#');
        int i45 = appt33.getStartYear();
        appt33.setTitle("\t10/10/97 at 1:1am ,, \n");
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
        org.junit.Assert.assertTrue(i45 == 97);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test379");
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
        int i24 = appt12.getStartMinute();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i22 == 52);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test380");
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
        appt7.setTitle("");
        java.lang.String str22 = appt7.toString();
        java.lang.String str23 = appt7.toString();
        appt7.setStartDay((int) ' ');
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(i13 == 97);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i17 == 97);
        org.junit.Assert.assertTrue(i18 == 97);
        org.junit.Assert.assertTrue(i19 == 52);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test381");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth((int) (short) -1);
        int i14 = appt7.getStartDay();
        int i15 = appt7.getStartHour();
        java.lang.String str16 = appt7.getDescription();
        int i17 = appt7.getStartYear();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 52);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue(i17 == 97);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test382");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        java.lang.String str6 = calDay0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test383");
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
        boolean b19 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt20 = calDay0.getAppts();
        int i21 = calDay0.getDay();
        int i22 = calDay0.getYear();
        org.junit.Assert.assertNull(iterator_wildcard1);
        org.junit.Assert.assertNull(linkedlist_appt2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(linkedlist_appt20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test384");
        cs362.Appt appt7 = new cs362.Appt(35, 0, 1, (int) (short) 100, (int) '#', "hi!", "");
        java.lang.String str8 = appt7.getDescription();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test385");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        int i10 = appt7.getStartYear();
        boolean b11 = appt7.getValid();
        appt7.setStartMonth(0);
        int i14 = appt7.getStartMonth();
        org.junit.Assert.assertTrue(i10 == 97);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test386");
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
        appt22.setStartDay((-1));
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
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test387");
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
        java.lang.String str21 = appt9.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i18 == 1);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test388");
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
        int i22 = calDay0.getYear();
        cs362.Appt appt30 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt30.setStartHour(1);
        appt30.setStartMinute((int) (byte) 10);
        appt30.setStartYear(0);
        appt30.setTitle("hi!");
        int i39 = appt30.getStartHour();
        appt30.setStartMinute((int) '4');
        int i42 = appt30.getStartHour();
        appt30.setStartMinute((-1));
        appt30.setStartDay(100);
        calDay0.addAppt(appt30);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == 97);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(iterator_wildcard21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i39 == 1);
        org.junit.Assert.assertTrue(i42 == 1);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test389");
        cs362.Appt appt7 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt7.setStartHour(1);
        appt7.setStartMonth((int) (short) -1);
        int i12 = appt7.getStartMinute();
        appt7.setStartYear((int) (short) 100);
        boolean b15 = appt7.getValid();
        int i16 = appt7.getStartMonth();
        appt7.setStartDay(100);
        org.junit.Assert.assertTrue(i12 == (-1));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == (-1));
    }
}

