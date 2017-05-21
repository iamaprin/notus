package io.vilya.notus.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月19日 上午1:15:45
 */
@ApplicationPath("/rest")
public class NotusRestConfig extends ResourceConfig {
    
    public static final Logger LOGGER = LoggerFactory.getLogger(NotusRestConfig.class);
    
    public NotusRestConfig() {
        LOGGER.info("NotusRestConfig");
        packages("io.vilya.notus.rest");
        register(JacksonFeature.class);
        // property(JsonGenerator.PRETTY_PRINTING, true);
    }
    
}
