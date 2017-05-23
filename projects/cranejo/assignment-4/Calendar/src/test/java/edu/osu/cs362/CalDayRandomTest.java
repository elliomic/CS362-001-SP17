package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
    private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */

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
     * Generate Random Tests that tests CalDay Class.
     */
    @Test
    public void radnomtest()  throws Throwable  {

        long startTime = Calendar.getInstance().getTimeInMillis();
        long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

        System.out.println("Start testing...");

        for (int iteration = 0; elapsed < TestTimeout; iteration++) {
            Random random = new Random(iteration);

            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            CalDay calDay = new CalDay(gregorianCalendar);

            int numAppts=random.nextInt(5);
            for (int i = 0; i < numAppts; i++) {
                int startHour=CalDayRandomTest.selectHour(random);
                int startMinute=CalDayRandomTest.selectMinute(random);
                int startDay=CalDayRandomTest.selectDay(random);
                int startMonth=CalDayRandomTest.selectMonth(random);
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
                calDay.addAppt(appt);
            }

            elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
            if((iteration%10000)==0 && iteration!=0 )
                System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
        }
        System.out.println("Done testing...");
    }

}
