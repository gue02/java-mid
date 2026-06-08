package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate setYear(int year){
        ImmutableMyDate changeYear = new ImmutableMyDate(year,month,day);
        return changeYear;
    }
    public ImmutableMyDate setmonth(int month){
        ImmutableMyDate changemonth = new ImmutableMyDate(year,month,day);
        return changemonth;
    }
    public ImmutableMyDate setDay(int day){
        ImmutableMyDate changeDay = new ImmutableMyDate(year,month,day);
        return changeDay;
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
