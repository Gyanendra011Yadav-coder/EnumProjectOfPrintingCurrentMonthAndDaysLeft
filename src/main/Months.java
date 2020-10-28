package main;

public enum Months {
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(30),
    September(31),
    October(30),
    November(31),
    December(30);

    int daysInMonths;
    Months (int daysInMonths){
        this.daysInMonths = daysInMonths;
    }


    
}
