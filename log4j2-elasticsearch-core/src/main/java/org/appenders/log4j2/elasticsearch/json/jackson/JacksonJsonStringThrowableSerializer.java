package org.appenders.log4j2.elasticsearch.json.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import io.netty.util.internal.ThrowableUtil;
import org.apache.logging.log4j.core.impl.ThrowableProxy;

import java.io.IOException;

public class JacksonJsonStringThrowableSerializer extends StdScalarSerializer<ThrowableProxy> {
    protected JacksonJsonStringThrowableSerializer() {
        super(ThrowableProxy.class);
    }

    @Override
    public void serialize(ThrowableProxy value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(ThrowableUtil.stackTraceToString(value.getThrowable()));
    }
}
