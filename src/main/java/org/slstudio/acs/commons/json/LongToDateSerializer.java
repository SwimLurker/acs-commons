package org.slstudio.acs.commons.json;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: chandler
 * Date: 13-6-2
 * Time: ÉÏÎç9:12
 */
public class LongToDateSerializer extends JsonSerializer<Long> {
    @Override
    public void serialize(Long value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = new Date(value);
        String dateString = dateFormat.format(date);
        jgen.writeString(dateString);
    }
}
