package com.timgroup.statsd;

/**
 * 2012-08-15
 *
 * @author Michael Rose <michael@fullcontact.com>
 */
public interface StatsClient {
    public void incrementCounter(String aspect);

    public void incrementCounter(String aspect, int n);

    public void incrementCounterSampled(String aspect, int n, double rate) {

    public void recordGaugeValue(String aspect, int value);

    public void recordExecutionTime(String aspect, long timeInMs);
}
