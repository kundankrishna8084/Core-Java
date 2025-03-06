
package com.jspider.program.src.java8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        System.out.println(date);

        //Converting date into String

        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(date);
        System.out.println(format);

        SimpleDateFormat sdf1= new SimpleDateFormat("dd/MMM/yyyy");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        SimpleDateFormat sdf2= new SimpleDateFormat("dd/MMMM/yy");
        String format2 = sdf2.format(date);
        System.out.println(format2);

        SimpleDateFormat sdf3= new SimpleDateFormat("MM/dd/yyyy");
        String format3 = sdf3.format(date);
        System.out.println(format3);


        // dd/mm/yyyy

        //Convert String to date
        SimpleDateFormat sdf4= new SimpleDateFormat("yyyy-MM-dd");
        Date parseDate= sdf4.parse("2025-03-05");
        System.out.println(parseDate);

    }
}
