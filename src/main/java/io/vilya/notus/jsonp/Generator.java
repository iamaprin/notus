package io.vilya.notus.jsonp;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月23日 下午10:51:55
 */
public class Generator {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Generator.class);
    
    public static void main(String[] args) {
        JsonGenerator generator = Json.createGenerator(System.out);
        generator
            .writeStartArray()
                .writeStartObject()
                    .write("name", "a")
                .writeEnd()
                .writeStartObject()
                    .write("name", "b")
                .writeEnd()
            .writeEnd();
        
        generator.close();
    }
    
}
