package edu.osu.cs362;

import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
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
     * Generate Random Tests that tests TimeTable Class.
     */
    @Test
    public void radnomtest()  throws Throwable  {

        long startTime = Calendar.getInstance().getTimeInMillis();
        long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

        System.out.println("Start testing...");

        for (int iteration = 0; elapsed < TestTimeout; iteration++) {
            Random random = new Random(iteration);
            LinkedList<Appt> linkedList = new LinkedList<Appt>();
            List<Appt> apptArray = new ArrayList<Appt>();
            TimeTable timeTable = new TimeTable();

            int numAppts=random.nextInt(5);
            if (numAppts > 0) {
                for (int i = 0; i < numAppts; i++) {
                    int startHour=TimeTableRandomTest.selectHour(random);
                    int startMinute=TimeTableRandomTest.selectMinute(random);
                    int startDay=TimeTableRandomTest.selectDay(random);
                    int startMonth=TimeTableRandomTest.selectMonth(random);
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
                    linkedList.add(appt);
                    apptArray.add(appt);
                }
            }
            for (Appt appt : apptArray) {
                if (random.nextBoolean()) {
                    if (random.nextBoolean()) {
                        timeTable.deleteAppt(null, appt);
                    } else {
                        timeTable.deleteAppt(linkedList, appt);
                    }
                } else {
                    int startHour=TimeTableRandomTest.selectHour(random);
                    int startMinute=TimeTableRandomTest.selectMinute(random);
                    int startDay=TimeTableRandomTest.selectDay(random);
                    int startMonth=TimeTableRandomTest.selectMonth(random);
                    int startYear=(random.nextInt(4040)-2020);
                    String title=(String) ValuesGenerator.getString(random);
                    String description=(String) ValuesGenerator.getString(random);
                    //Construct a new Appointment object with the initial data
                    Appt newAppt = new Appt(startHour,
                            startMinute ,
                            startDay ,
                            startMonth ,
                            startYear ,
                            title,
                            description);
                    if (random.nextBoolean()) {
                        timeTable.deleteAppt(null, newAppt);
                    } else {
                        timeTable.deleteAppt(linkedList, newAppt);
                    }
                }
            }
            if (random.nextBoolean()) {
                if (random.nextBoolean()) {
                    timeTable.deleteAppt(linkedList, null);
                } else {
                    timeTable.deleteAppt(null, null);
                }
            }

            elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
            if((iteration%10000)==0 && iteration!=0 )
                System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
        }
        System.out.println("Done testing...");
    }

}
