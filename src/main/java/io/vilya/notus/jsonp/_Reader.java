package io.vilya.notus.jsonp;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月23日 下午11:06:41
 */
public class _Reader {

    private static final Logger LOG = LoggerFactory.getLogger(_Reader.class);
    
    public static void main(String[] args) {
        JsonReader reader = Json.createReader(new StringReader("{\"key\": \"value\"}"));
        LOG.info(reader.readObject().getString("key"));
        
        reader.close();
    }
    
}
