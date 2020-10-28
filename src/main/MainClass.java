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
        System.out.println("ENTER THE NAME OF THE MONTH.");
        String monthsName = scannerObject.nextLine();
        Months monthsObject = Months.valueOf(monthsName);
        switch (monthsObject){
            case January:
                System.out.println("CURRENT MONTH IS JANUARY.");
                break;
            case February:
                System.out.println("CURRENT MONTH IS FEBRUARY.");
                break;
            case March:
                System.out.println("CURRENT MONTH IS MARCH.");
            default:

        }



    }

}

