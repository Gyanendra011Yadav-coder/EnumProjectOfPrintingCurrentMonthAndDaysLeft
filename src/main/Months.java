package main;

public enum Months {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMEBER(31);

    int daysInMonths;

    Months(int daysInMonths) {
        this.daysInMonths = daysInMonths;
    }

    public int getDaysInMonths() {
        return daysInMonths;
    }


}
