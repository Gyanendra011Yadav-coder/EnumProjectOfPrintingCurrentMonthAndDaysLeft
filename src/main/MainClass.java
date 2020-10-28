/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 10/28/2020
 *   Time: 12:34 PM
 *   File: MainClass.java
 */

package main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
//        System.out.println("ENTER THE NAME OF THE CURRENT MONTH:-");
        String monthsName= new GregorianCalendar().getDisplayName(
                Calendar.MONTH,
                Calendar.LONG,
                Locale.US).toUpperCase();
//        scannerObject.nextLine().trim().toUpperCase();

        System.out.println("ENTER THE CURRENT DATE:-");
        int date = scannerObject.nextInt();
        Months monthsObject = Months.valueOf(monthsName);
        switch (monthsObject) {
            case JANUARY:
                System.out.println("CURRENT MONTH IS JANUARY.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "
                        +(monthsObject.daysInMonths - date));
                break;
            case FEBRUARY:
                System.out.println("CURRENT MONTH IS FEBRUARY.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IS:"+" "
                        + (monthsObject.daysInMonths - date));
                break;
            case MARCH:
                System.out.println("CURRENT MONTH IS MARCH.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IS"+" "
                        + (monthsObject.daysInMonths - date));
            case APRIL:
                System.out.println("CURRENT MONTH IS APRIL!");
                System.out.println("THE TOTAL NUMBER OF DAYS LEFT,IN COMPLETING THIS MONTH IS"+" "
                        + (monthsObject.daysInMonths - date));
            case MAY:
                System.out.println("THE CURRENT MONTH IS MAY!");

                System.out.println("THE DAYS LEFT IN COMPLETING THE MONTH IS:"+" "+
                        +(monthsObject.daysInMonths - date));
            case JUNE:
                System.out.println("THE CURRENT MONTH IS JUNE!");
                System.out.println("THE DAYS LEFT IN COMPLETING THIS MONTH IS"+" "
                        + (monthsObject.daysInMonths - date));
            case JULY:
                System.out.println("CURRENT MONTH IS JULY.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "+
                        + (monthsObject.daysInMonths - date));
                break;
            case AUGUST:
                System.out.println("CURRENT MONTH IS AUGUST.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "+
                        + (monthsObject.daysInMonths - date));
                break;
            case SEPTEMBER:
                System.out.println("CURRENT MONTH IS SEPTEMBER.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "+
                        + (monthsObject.daysInMonths - date));
                break;
            case OCTOBER:
                System.out.println("CURRENT MONTH IS OCTOBER.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "+
                        + (monthsObject.daysInMonths - date));
                break;
            case NOVEMBER:
                System.out.println("CURRENT MONTH IS NOVEMBER.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "+
                        + (monthsObject.daysInMonths - date));
                break;
            case DECEMEBER:
                System.out.println("CURRENT MONTH IS DECEMBER.");
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS:"+" "+
                        + (monthsObject.daysInMonths - date));
                break;
            default:
        }
        scannerObject.close();
    }

}

