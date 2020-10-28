/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 10/28/2020
 *   Time: 12:34 PM
 *   File: MainClass.java
 */

package main;

import java.util.Scanner;



public class MainClass {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("ENTER THE NAME OF THE CURRENT MONTH:-");
        String monthsName = scannerObject.nextLine().trim().toUpperCase();
        System.out.println("ENTER THE CURRENT DATE:-");
        int date = scannerObject.nextInt();
        Months monthsObject = Months.valueOf(monthsName);
        switch (monthsObject){
            case JANUARY:
                System.out.println("CURRENT MONTH IS JANUARY.");
                System.out.println("THE TOTAL NUMBER OF DAYS IN"+monthsName+",is "
                        +monthsObject.daysInMonths);
                System.out.println("THE TOTAL NUMBER OF DAYS,LEFT IN COMPLETING THIS MONTH IS;"
                        +(monthsObject.daysInMonths - date));
                break;
            case FEBRUARY:
                System.out.println("CURRENT MONTH IS FEBRUARY.");
                System.out.println("THE TOTAL NUMBER OF DAYS, LEFT IS"
                        +(monthsObject.daysInMonths - date));
                break;
            case MARCH:
                System.out.println("CURRENT MONTH IS MARCH.");
                System.out.println("THE TOTAL NUMBER OF DAYS, LEFT IS"
                        +(monthsObject.daysInMonths - date));
            case APRIL:
                System.out.println("CURRENT MONTH IS APRIL!");
                System.out.println("THE TOTAL NUMBER OF DAYS LEFT,IN COMPLETING THIS MONTH IS"
                +(monthsObject.daysInMonths - date));
            default:



        }


        scannerObject.close();
    }

}

