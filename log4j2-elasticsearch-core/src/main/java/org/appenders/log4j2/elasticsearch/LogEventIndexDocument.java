package org.appenders.log4j2.elasticsearch;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.message.Message;

/**
 * @author guo.li
 */
public class LogEventIndexDocument {
    private Level level;
    private long threadId;
    private String threadName;
    private String loggerName;
    private String loggerFqcn;
    private long nanoTime;
    private String thrown;
    private Message message;
    private String hostName;
    private String ip;
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getLoggerFqcn() {
        return loggerFqcn;
    }

    public void setLoggerFqcn(String loggerFqcn) {
        this.loggerFqcn = loggerFqcn;
    }

    public long getNanoTime() {
        return nanoTime;
    }

    public void setNanoTime(long nanoTime) {
        this.nanoTime = nanoTime;
    }

    public String getThrown() {
        return thrown;
    }

    public void setThrown(String thrown) {
        this.thrown = thrown;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
