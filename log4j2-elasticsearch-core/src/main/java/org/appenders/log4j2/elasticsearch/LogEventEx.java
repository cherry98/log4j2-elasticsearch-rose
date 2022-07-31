package org.appenders.log4j2.elasticsearch;

import org.apache.logging.log4j.core.LogEvent;
import org.appenders.log4j2.elasticsearch.util.IpUtil;

public interface LogEventEx extends LogEvent {
    default String getHostName() {
        return IpUtil.getHostSubName();
    }

    default String getIp() {
        return IpUtil.getLocalIp();
    }
}
