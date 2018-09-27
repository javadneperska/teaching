import java.util.Objects;

public class Date {
    private int month;
    private int year;
    private int day;


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return month == date.month &&
                year == date.year &&
                day == date.day;
    }

    @Override
    public int hashCode() {

        return Objects.hash(month, year, day);
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", year=" + year +
                ", day=" + day +
                '}';
    }
}
