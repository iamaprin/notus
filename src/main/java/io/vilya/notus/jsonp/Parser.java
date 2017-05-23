package io.vilya.notus.jsonp;

import java.io.Reader;
import java.io.StringReader;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import javax.json.stream.JsonParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月23日 下午10:27:57
 */
public class Parser {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Parser.class);
    
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("{\"key\": \"value\"}");
        JsonParser jsonParser = createParser(stringReader);
        Event event;
        while(jsonParser.hasNext()) {
            event = jsonParser.next();
            if (canRead(event)) {
                LOGGER.info(jsonParser.getString());
            }
        }
        
    }
    
    private static boolean canRead(Event event) {
        boolean canRead = false;
        
        switch (event) {
        case KEY_NAME:
        case VALUE_STRING:
        case VALUE_NUMBER:
        case VALUE_TRUE:
        case VALUE_FALSE:
        case VALUE_NULL:
            canRead = true;
            break;
        default:
            break;
        }

        return canRead;
    }
    
    public static JsonParser createParser(Reader reader) {
        JsonParser jsonParser = Json.createParser(reader);
        return jsonParser;
    }
    
    public static JsonParser createParserFromFactory() {
        JsonParserFactory jsonFactory = Json.createParserFactory(null);
        JsonParser jsonParser = jsonFactory.createParser(new StringReader(null));
        return jsonParser;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
