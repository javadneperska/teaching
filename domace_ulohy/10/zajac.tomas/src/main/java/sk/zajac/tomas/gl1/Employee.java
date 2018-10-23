package sk.zajac.tomas.gl1;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Employee extends Person {

    private static final int REQ_WORK_HOURS = 160 * 60 * 60; // 576 000 sec
    private long secondsAtWork;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Employee(int id, String firstName, String lastName, String workPosition, Date dateOfEntry) {
        super(id, firstName, lastName, workPosition, dateOfEntry);
        this.secondsAtWork = 0;
    }

    public Employee() {
        super();
        this.secondsAtWork = 0;
    }


    public static int getRequredWorkHours() {
        return REQ_WORK_HOURS;
    }

    public long getSecondsAtWork() {
        return this.secondsAtWork;
    }

    public String getHoursAtWork() {

        long hours = this.secondsAtWork / 3600;
        long minutes = (this.secondsAtWork % 3600) / 60;
        long seconds = this.secondsAtWork % 60;

        String hoursAtWork = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return hoursAtWork;
    }

    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public LocalDateTime getFutureTime() {
        this.endTime = LocalDateTime.now();
        return this.endTime;
    }

    public void timeDifference(LocalDateTime now, LocalDateTime future) {
        long seconds = ChronoUnit.SECONDS.between(now, future);
        incrementHoursAtWork(seconds);
    }

    public void setStartTime() {
        this.startTime = LocalDateTime.now();
    }

    private void incrementHoursAtWork(long hoursAtWork) {
        this.secondsAtWork += hoursAtWork;
    }
}
