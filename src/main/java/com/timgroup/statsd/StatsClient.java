package com.timgroup.statsd;

/**
 * 2012-08-15
 *
 * @author Michael Rose <michael@fullcontact.com>
 */
public interface StatsClient {
    void incrementCounter(String aspect);

    void incrementCounter(String aspect, int n);

    void recordGaugeValue(String aspect, int value);

    void recordExecutionTime(String aspect, long timeInMs);
}
