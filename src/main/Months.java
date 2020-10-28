package main;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(30),
    SEPTEMBER(31),
    OCTOBER(30),
    NOVEMBER(31),
    DECEMEBR(30);

    int daysInMonths;
    Months (int daysInMonths){
        this.daysInMonths = daysInMonths;
    }


    
}
