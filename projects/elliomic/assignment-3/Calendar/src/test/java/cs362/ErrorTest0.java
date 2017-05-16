import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        int i3 = calDay0.getSizeAppts();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getSizeAppts();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getSizeAppts();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        int i22 = calDay0.getSizeAppts();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        int i22 = calDay0.getSizeAppts();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        int i37 = calDay0.getSizeAppts();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        boolean b8 = calDay0.isValid();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        int i16 = calDay0.getSizeAppts();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getSizeAppts();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        int i4 = calDay0.getSizeAppts();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        int i20 = calDay0.getSizeAppts();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getSizeAppts();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        int i49 = calDay0.getSizeAppts();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getYear();
        int i4 = calDay0.getSizeAppts();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        cs362.Appt appt11 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt11.setStartHour(1);
        int i14 = appt11.getStartYear();
        calDay0.addAppt(appt11);
        java.util.Iterator<?> iterator_wildcard16 = calDay0.iterator();
        int i17 = calDay0.getSizeAppts();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        int i38 = calDay0.getDay();
        int i39 = calDay0.getSizeAppts();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        int i17 = calDay0.getYear();
        int i18 = calDay0.getSizeAppts();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        int i22 = calDay0.getSizeAppts();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        int i31 = calDay0.getSizeAppts();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        boolean b2 = calDay0.isValid();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        int i32 = calDay0.getSizeAppts();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        int i39 = calDay0.getSizeAppts();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        int i67 = calDay0.getSizeAppts();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.LinkedList<cs362.Appt> linkedlist_appt4 = calDay0.getAppts();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        java.util.Iterator<?> iterator_wildcard10 = calDay0.iterator();
        int i11 = calDay0.getSizeAppts();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        cs362.Appt appt35 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt35.setStartHour(1);
        appt35.setStartMinute((int) (byte) 10);
        appt35.setStartDay((-1));
        appt35.setDescription("");
        int i44 = appt35.getStartYear();
        int i45 = appt35.getStartMonth();
        appt35.setStartMinute((int) (short) 10);
        appt35.setTitle("hi!");
        int i50 = appt35.getStartMinute();
        calDay0.addAppt(appt35);
        int i52 = calDay0.getDay();
        int i53 = calDay0.getSizeAppts();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        int i10 = calDay0.getDay();
        int i11 = calDay0.getSizeAppts();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        int i12 = calDay0.getSizeAppts();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        int i29 = calDay0.getSizeAppts();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.lang.String str6 = calDay0.toString();
        int i7 = calDay0.getDay();
        int i8 = calDay0.getSizeAppts();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        int i65 = calDay0.getSizeAppts();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        int i39 = calDay0.getSizeAppts();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        int i65 = calDay0.getSizeAppts();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getYear();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        int i24 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        int i38 = calDay0.getSizeAppts();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        int i32 = calDay0.getSizeAppts();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        int i23 = calDay0.getMonth();
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        boolean b3 = calDay0.isValid();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        int i85 = calDay0.getSizeAppts();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        boolean b21 = calDay0.isValid();
        int i22 = calDay0.getYear();
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        int i13 = calDay0.getSizeAppts();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getMonth();
        java.lang.String str4 = calDay0.toString();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        int i47 = calDay0.getSizeAppts();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        int i89 = calDay0.getSizeAppts();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        int i69 = calDay0.getSizeAppts();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        int i14 = calDay0.getSizeAppts();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        int i44 = calDay0.getSizeAppts();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getYear();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getYear();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        int i38 = calDay0.getSizeAppts();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt2 = calDay0.getAppts();
        int i3 = calDay0.getYear();
        boolean b4 = calDay0.isValid();
        boolean b5 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        int i36 = calDay0.getSizeAppts();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        int i38 = calDay0.getSizeAppts();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        int i24 = calDay0.getMonth();
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        java.util.Iterator<?> iterator_wildcard23 = calDay0.iterator();
        int i24 = calDay0.getYear();
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        int i89 = calDay0.getDay();
        int i90 = calDay0.getSizeAppts();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        java.lang.String str53 = calDay0.toString();
        int i54 = calDay0.getDay();
        int i55 = calDay0.getSizeAppts();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        boolean b8 = calDay0.isValid();
        boolean b9 = calDay0.isValid();
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        int i30 = calDay0.getSizeAppts();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        java.util.LinkedList<cs362.Appt> linkedlist_appt17 = calDay0.getAppts();
        int i18 = calDay0.getSizeAppts();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        int i22 = calDay0.getYear();
        int i23 = calDay0.getYear();
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        int i24 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt25 = calDay0.getAppts();
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getDay();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getMonth();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt20 = calDay0.getAppts();
        int i21 = calDay0.getSizeAppts();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        int i43 = calDay0.getSizeAppts();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        int i11 = calDay0.getSizeAppts();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getYear();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        java.lang.String str4 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard5 = calDay0.iterator();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        int i39 = calDay0.getDay();
        int i40 = calDay0.getSizeAppts();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        int i25 = calDay0.getMonth();
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.lang.String str3 = calDay0.toString();
        int i4 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt5 = calDay0.getAppts();
        java.lang.String str6 = calDay0.toString();
        java.lang.String str7 = calDay0.toString();
        int i8 = calDay0.getMonth();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMonth((int) (short) -1);
        int i15 = appt10.getStartMonth();
        calDay0.addAppt(appt10);
        int i17 = calDay0.getSizeAppts();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        java.lang.String str68 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard69 = calDay0.iterator();
        int i70 = calDay0.getSizeAppts();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        int i23 = calDay0.getDay();
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getYear();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        cs362.Appt appt10 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt10.setStartHour(1);
        appt10.setStartMinute((int) (byte) 10);
        appt10.setStartYear(0);
        appt10.setTitle("");
        calDay0.addAppt(appt10);
        int i20 = calDay0.getSizeAppts();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        java.lang.String str65 = calDay0.toString();
        int i66 = calDay0.getSizeAppts();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        int i27 = calDay0.getYear();
        boolean b28 = calDay0.isValid();
        cs362.Appt appt36 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt36.setStartHour(1);
        appt36.setStartMinute((int) (byte) 10);
        appt36.setStartDay((-1));
        appt36.setDescription("");
        int i45 = appt36.getStartYear();
        java.lang.String str46 = appt36.getDescription();
        int i47 = appt36.getStartDay();
        appt36.setStartHour((int) (short) 100);
        appt36.setStartMonth((int) 'a');
        appt36.setStartMonth((int) (byte) 0);
        int i54 = appt36.getStartMinute();
        appt36.setDescription("hi!");
        calDay0.addAppt(appt36);
        int i58 = calDay0.getSizeAppts();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        int i55 = calDay0.getSizeAppts();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        java.lang.String str23 = calDay0.toString();
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        boolean b6 = calDay0.isValid();
        boolean b7 = calDay0.isValid();
        int i8 = calDay0.getSizeAppts();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        int i11 = calDay0.getSizeAppts();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        boolean b23 = calDay0.isValid();
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        cs362.CalDay calDay0 = new cs362.CalDay();
        java.util.Iterator<?> iterator_wildcard1 = calDay0.iterator();
        java.lang.String str2 = calDay0.toString();
        int i3 = calDay0.getDay();
        boolean b4 = calDay0.isValid();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        int i40 = calDay0.getSizeAppts();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        int i27 = calDay0.getYear();
        cs362.CalDay calDay28 = new cs362.CalDay();
        int i29 = calDay28.getYear();
        int i30 = calDay28.getMonth();
        int i31 = calDay28.getDay();
        int i32 = calDay28.getDay();
        int i33 = calDay28.getDay();
        cs362.Appt appt41 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt41.setStartHour(1);
        appt41.setStartMonth((int) (short) -1);
        int i46 = appt41.getStartMonth();
        int i47 = appt41.getStartYear();
        boolean b48 = appt41.getValid();
        java.lang.String str49 = appt41.getTitle();
        calDay28.addAppt(appt41);
        appt41.setStartDay(52);
        calDay0.addAppt(appt41);
        int i54 = calDay0.getSizeAppts();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt8 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard9 = calDay0.iterator();
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        int i5 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt28 = calDay0.getAppts();
        int i29 = calDay0.getSizeAppts();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        int i13 = calDay0.getSizeAppts();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        cs362.Appt appt30 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt30.setStartHour(1);
        appt30.setStartMonth((int) (short) -1);
        int i35 = appt30.getStartMonth();
        int i36 = appt30.getStartYear();
        boolean b37 = appt30.getValid();
        appt30.setStartMinute((int) (byte) -1);
        int i40 = appt30.getStartYear();
        boolean b41 = appt30.getValid();
        int i42 = appt30.getStartMonth();
        calDay0.addAppt(appt30);
        java.lang.String str44 = calDay0.toString();
        int i45 = calDay0.getSizeAppts();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        int i12 = calDay0.getSizeAppts();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        int i69 = calDay0.getSizeAppts();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        int i30 = calDay0.getSizeAppts();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        int i82 = calDay0.getDay();
        int i83 = calDay0.getSizeAppts();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        boolean b6 = calDay0.isValid();
        java.util.LinkedList<cs362.Appt> linkedlist_appt7 = calDay0.getAppts();
        int i8 = calDay0.getSizeAppts();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        boolean b8 = calDay0.isValid();
        int i9 = calDay0.getYear();
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        int i26 = calDay0.getSizeAppts();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        int i4 = calDay0.getYear();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        java.lang.String str7 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt42 = calDay0.getAppts();
        int i43 = calDay0.getSizeAppts();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        java.util.LinkedList<cs362.Appt> linkedlist_appt26 = calDay0.getAppts();
        int i27 = calDay0.getSizeAppts();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        java.lang.String str5 = calDay0.toString();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getMonth();
        int i8 = calDay0.getSizeAppts();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        int i22 = calDay0.getSizeAppts();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.util.Iterator<?> iterator_wildcard22 = calDay0.iterator();
        java.util.LinkedList<cs362.Appt> linkedlist_appt23 = calDay0.getAppts();
        java.lang.String str24 = calDay0.toString();
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.Iterator<?> iterator_wildcard3 = calDay0.iterator();
        boolean b4 = calDay0.isValid();
        java.lang.String str5 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getDay();
        java.util.Iterator<?> iterator_wildcard8 = calDay0.iterator();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        int i82 = calDay0.getSizeAppts();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        boolean b6 = calDay0.isValid();
        int i7 = calDay0.getYear();
        java.lang.String str8 = calDay0.toString();
        java.util.LinkedList<cs362.Appt> linkedlist_appt9 = calDay0.getAppts();
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        cs362.Appt appt31 = new cs362.Appt(0, (int) (short) -1, (int) '4', (int) (short) 1, (int) 'a', "", "");
        appt31.setStartHour((int) (byte) 10);
        java.lang.String str34 = appt31.getDescription();
        calDay0.addAppt(appt31);
        int i36 = calDay0.getSizeAppts();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getDay();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        int i5 = calDay0.getSizeAppts();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        int i12 = calDay0.getSizeAppts();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        int i58 = calDay0.getSizeAppts();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        java.lang.String str39 = calDay0.toString();
        int i40 = calDay0.getSizeAppts();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        int i24 = calDay0.getMonth();
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        int i5 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt6 = calDay0.getAppts();
        int i7 = calDay0.getMonth();
        int i8 = calDay0.getMonth();
        int i9 = calDay0.getSizeAppts();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        java.util.Iterator<?> iterator_wildcard22 = calDay0.iterator();
        int i23 = calDay0.getDay();
        int i24 = calDay0.getSizeAppts();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        int i38 = calDay0.getSizeAppts();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        int i33 = calDay0.getSizeAppts();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        int i40 = calDay0.getSizeAppts();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        int i25 = calDay0.getSizeAppts();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.lang.String str3 = calDay0.toString();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getYear();
        int i8 = calDay0.getSizeAppts();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getYear();
        java.lang.String str6 = calDay0.toString();
        boolean b7 = calDay0.isValid();
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
        appt15.setStartHour((-1));
        calDay0.addAppt(appt15);
        int i36 = calDay0.getSizeAppts();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        boolean b5 = calDay0.isValid();
        java.util.Iterator<?> iterator_wildcard6 = calDay0.iterator();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getMonth();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getMonth();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getYear();
        java.util.LinkedList<cs362.Appt> linkedlist_appt3 = calDay0.getAppts();
        java.util.Iterator<?> iterator_wildcard4 = calDay0.iterator();
        int i5 = calDay0.getMonth();
        int i6 = calDay0.getSizeAppts();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        java.lang.String str42 = calDay0.toString();
        int i43 = calDay0.getSizeAppts();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        int i20 = calDay0.getSizeAppts();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        int i10 = calDay0.getSizeAppts();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        appt37.setStartMonth((int) ' ');
        java.lang.String str54 = appt37.toString();
        calDay0.addAppt(appt37);
        int i56 = calDay0.getSizeAppts();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        boolean b21 = calDay0.isValid();
        int i22 = calDay0.getDay();
        int i23 = calDay0.getSizeAppts();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        cs362.CalDay calDay0 = new cs362.CalDay();
        int i1 = calDay0.getYear();
        int i2 = calDay0.getMonth();
        int i3 = calDay0.getDay();
        int i4 = calDay0.getDay();
        boolean b5 = calDay0.isValid();
        int i6 = calDay0.getYear();
        int i7 = calDay0.getSizeAppts();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        int i40 = calDay0.getDay();
        int i41 = calDay0.getSizeAppts();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        int i26 = calDay0.getMonth();
        int i27 = calDay0.getSizeAppts();
    }
}

