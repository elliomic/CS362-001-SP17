import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test001");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test002");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test003");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test004");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test005");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test006");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str19 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test007");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test008");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test009");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test010");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test011");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test012");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test013");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str19 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertNull(node_comparable_str19);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test014");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test015");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str19 = queue_comparable_str0.getFront();
        boolean b20 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertNull(node_comparable_str19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test016");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test017");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test018");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test019");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        boolean b17 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test020");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test021");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test022");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test023");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test024");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test025");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test026");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test027");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        boolean b2 = queue_comparable_str0.isEmpty();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test028");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test029");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test030");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test031");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        boolean b16 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test032");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test033");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test034");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test035");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test036");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test037");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test038");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test039");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test040");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test041");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test042");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test043");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test044");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test045");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test046");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test047");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test048");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test049");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test050");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test051");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test052");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test053");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test054");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test055");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test056");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test057");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test058");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test059");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test060");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        boolean b17 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test061");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test062");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test063");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        boolean b16 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test064");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test065");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test066");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test067");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test068");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test069");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test070");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test071");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test072");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        boolean b13 = queue_comparable_str0.isEmpty();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test073");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test074");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test075");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test076");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test077");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test078");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test079");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test080");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test081");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        boolean b16 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test082");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test083");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        boolean b17 = queue_comparable_str0.isEmpty();
        boolean b18 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test084");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test085");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test086");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test087");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test088");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test089");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test090");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test091");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test092");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test093");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        boolean b19 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str20 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(node_comparable_str20);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test094");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test095");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test096");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test097");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str19 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertNull(node_comparable_str19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test098");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test099");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test100");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test101");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        boolean b19 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str20 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(node_comparable_str20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test102");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test103");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test104");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test105");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test106");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test107");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test108");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test109");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test110");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test111");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test112");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test113");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test114");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test115");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        boolean b19 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str20 = queue_comparable_str0.getFront();
        boolean b21 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str22 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(node_comparable_str20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test116");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test117");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test118");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        boolean b17 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test119");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test120");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test121");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test122");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test123");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test124");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test125");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test126");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test127");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test128");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test129");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test130");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test131");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test132");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test133");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test134");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test135");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test136");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test137");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test138");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        boolean b17 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test139");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test140");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test141");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        boolean b17 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test142");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test143");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test144");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test145");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test146");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test147");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test148");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test149");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test150");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str19 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str20 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str21 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str22 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertNull(node_comparable_str18);
        org.junit.Assert.assertNull(node_comparable_str19);
        org.junit.Assert.assertNull(node_comparable_str20);
        org.junit.Assert.assertNull(node_comparable_str21);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test151");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test152");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test153");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test154");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        boolean b17 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test155");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test156");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test157");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test158");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test159");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test160");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test161");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test162");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test163");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test164");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test165");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test166");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test167");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test168");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test169");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test170");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test171");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test172");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test173");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        boolean b17 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test174");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test175");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        boolean b18 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test176");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test177");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test178");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test179");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test180");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test181");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        boolean b16 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test182");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test183");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test184");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test185");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test186");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test187");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test188");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test189");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test190");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test191");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test192");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test193");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test194");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test195");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test196");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test197");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test198");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        boolean b12 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test199");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test200");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.getFront();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test201");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        boolean b17 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str18 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(node_comparable_str18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test202");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test203");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test204");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test205");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.getFront();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.getFront();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test206");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test207");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        boolean b16 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test208");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.dequeue();
        boolean b13 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test209");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        boolean b6 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        boolean b8 = queue_comparable_str0.isEmpty();
        boolean b9 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.getFront();
        boolean b14 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str17 = queue_comparable_str0.getFront();
        boolean b18 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str19 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str20 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
        org.junit.Assert.assertNull(node_comparable_str17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(node_comparable_str19);
        org.junit.Assert.assertNull(node_comparable_str20);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test210");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test211");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test212");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        boolean b8 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str10 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertNull(node_comparable_str10);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test213");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        boolean b2 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        boolean b4 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        boolean b11 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str12 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str13 = queue_comparable_str0.dequeue();
        boolean b14 = queue_comparable_str0.isEmpty();
        boolean b15 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(node_comparable_str12);
        org.junit.Assert.assertNull(node_comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test214");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.getFront();
        boolean b3 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str5 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.dequeue();
        boolean b9 = queue_comparable_str0.isEmpty();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = null;
        try {
            queue_comparable_str0.enqueue(node_comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertNull(node_comparable_str5);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test215");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str3 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str4 = queue_comparable_str0.dequeue();
        boolean b5 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str6 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str7 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        boolean b10 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str11 = queue_comparable_str0.getFront();
        boolean b12 = queue_comparable_str0.isEmpty();
        boolean b13 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str14 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str15 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str16 = queue_comparable_str0.getFront();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertNull(node_comparable_str3);
        org.junit.Assert.assertNull(node_comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(node_comparable_str6);
        org.junit.Assert.assertNull(node_comparable_str7);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(node_comparable_str11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(node_comparable_str14);
        org.junit.Assert.assertNull(node_comparable_str15);
        org.junit.Assert.assertNull(node_comparable_str16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test216");
        Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new Queue<java.lang.Comparable<java.lang.String>>();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str1 = queue_comparable_str0.dequeue();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str2 = queue_comparable_str0.dequeue();
        boolean b3 = queue_comparable_str0.isEmpty();
        boolean b4 = queue_comparable_str0.isEmpty();
        boolean b5 = queue_comparable_str0.isEmpty();
        boolean b6 = queue_comparable_str0.isEmpty();
        boolean b7 = queue_comparable_str0.isEmpty();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str8 = queue_comparable_str0.getFront();
        Node<java.lang.Comparable<java.lang.String>> node_comparable_str9 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertNull(node_comparable_str1);
        org.junit.Assert.assertNull(node_comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(node_comparable_str8);
        org.junit.Assert.assertNull(node_comparable_str9);
    }
}

