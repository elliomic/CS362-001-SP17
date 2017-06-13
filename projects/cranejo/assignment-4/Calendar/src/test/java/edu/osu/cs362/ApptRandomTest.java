package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
    private static final int NUM_TESTS=100;

    private static int selectHour(Random random) {
        if (random.nextBoolean()) {
            return random.nextInt(24);
        } else {
            if (random.nextBoolean()) {
                return (random.nextInt(24)+24);
            } else {
                return (random.nextInt(24)-24);
            }
        }
    }

    private static int selectMinute(Random random) {
        if (random.nextBoolean()) {
            return random.nextInt(60);
        } else {
            if (random.nextBoolean()) {
                return (random.nextInt(60)+60);
            } else {
                return (random.nextInt(60)-60);
            }
        }
    }

    private static int selectDay(Random random) {
        if (random.nextBoolean()) {
            return random.nextInt(32);
        } else {
            if (random.nextBoolean()) {
                return (random.nextInt(32)+32);
            } else {
                return (random.nextInt(32)-32);
            }
        }
    }

    private static int selectMonth(Random random) {
        if (random.nextBoolean()) {
            return (random.nextInt(12)+1);
        } else {
            if (random.nextBoolean()) {
                return (random.nextInt(12)+13);
            } else {
                return (random.nextInt(13)-12);
            }
        }
    }

    /**
     * Return a randomly selected method to be tests !.
     */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"isValid","setDescription"};// The list of the of methods to be tested in the Appt class

        int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

        return methodArray[n] ; // return the method name
    }

    /**
     * Generate Random Tests that tests Appt Class.
     */
    @Test
    public void radnomtest()  throws Throwable  {

        long startTime = Calendar.getInstance().getTimeInMillis();
        long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

        System.out.println("Start testing...");

        for (int iteration = 0; elapsed < TestTimeout; iteration++) {
            Random random = new Random(iteration);

            int startHour=ApptRandomTest.selectHour(random);
            int startMinute=ApptRandomTest.selectMinute(random);
            int startDay=ApptRandomTest.selectDay(random);
            int startMonth=ApptRandomTest.selectMonth(random);
            int startYear=(random.nextInt(4040)-2020);
            String title=(String) ValuesGenerator.getString(random);
            String description=(String) ValuesGenerator.getString(random);
            //Construct a new Appointment object with the initial data
            Appt appt = new Appt(startHour,
                    startMinute ,
                    startDay ,
                    startMonth ,
                    startYear ,
                    title,
                    description);
            for (int i = 0; i < NUM_TESTS; i++) {
                String methodName = ApptRandomTest.RandomSelectMethod(random);
                if (methodName.equals("setDescription")){
                    String newDescription=(String) ValuesGenerator.getString(random);
                    appt.setDescription(newDescription);
                }
            }

            elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
            if((iteration%10000)==0 && iteration!=0 )
                System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
        }
        System.out.println("Done testing...");
    }

}
