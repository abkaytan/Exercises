package date.study;

import java.sql.Date;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * public class Test {
 *     public static void main(String a[]) {
 *         java.sql.Date todaysDate = new java.sql.Date(new java.util.Date().getTime());
 *
 *         int futureDay =1;
 *         int pastDay=2;
 *
 *         java.sql.Date futureDate = this.addDays(todaysDate, futureDay);
 *         java.sql.Date pastDate = this.subtractDays(todaysDate, pastDay);
 *
 *         System.out.println("futureDate =>>> " + futureDate);
 *         System.out.println("pastDate =>>> " + pastDate);
 *     }
 *     public static Date addDays(Date date, int days) {
 *         Calendar c = Calendar.getInstance();
 *         c.setTime(date);
 *         c.add(Calendar.DATE, days);
 *         return new Date(c.getTimeInMillis());
 *     }
 *     public static Date subtractDays(Date date, int days) {
 *         Calendar c = Calendar.getInstance();
 *         c.setTime(date);
 *         c.add(Calendar.DATE, -days);
 *         return new Date(c.getTimeInMillis());
 *     }
 * }
 * */
public class DateStudy {
    public static void main(String[] args) {

        Date date = Date.valueOf("2022-5-5");
        int incrementDays = 3;
        int incrementMonths = 2;
        int incrementYears = 1;

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, incrementDays);
        c.add(Calendar.MONTH, incrementMonths);
        c.add(Calendar.YEAR, incrementYears);
        Date dateResult = new Date(c.getTimeInMillis());

        System.out.println(date);
        System.out.println(dateResult);

        Set<Date> dateSet = new TreeSet<>();
        dateSet.add(Date.valueOf("2022-5-5"));
        dateSet.add(Date.valueOf("2022-5-6"));
        dateSet.add(Date.valueOf("2022-5-7"));

        System.out.println(dateSet);

        Set<Date> dateSet2 = new TreeSet<>();
        dateSet2.add(Date.valueOf("2022-5-1"));
        dateSet2.add(Date.valueOf("2022-5-2"));

        boolean result = false;
        for(Date d : dateSet2){
            if(dateSet.contains(d)){
                result = true;
                break;
            }
        }

        if(result){
            System.out.println(" this room is reserve in these dates");
        } else {
            System.out.println("this room is available among these days");
        }

    }
}
