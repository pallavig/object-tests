package datetime;

import static java.lang.Math.abs;

public class Time {
    private long totalSeconds;

    public Time(int h,int m,int s) {
        totalSeconds = h * 3600 + m * 60 + s;
    }
    String getDifference(Time time) {
        long difference = this.totalSeconds - time.totalSeconds;
        long dh = difference/3600;
        long dm = (difference%3600)/60;
        long ds = (difference%3600)%60;
        return abs(dh) + ":" + abs(dm) + ":" + abs(ds);
    }
    String getCurrentTime() {
        long h = totalSeconds/3600;
        long m = (totalSeconds%3600)/60;
        long s = (totalSeconds%3600)%60;
        return h + ":" + m + ":" + s;
    }
}
