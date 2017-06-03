package org.lst.trading.lib.model;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by garfield on 17-6-3.
 */
public class Kdata {
    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;

}
