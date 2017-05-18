package io.vilya.notus.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:17:24
 */
@WebListener
public class NotusServletContextAttributeListener implements ServletContextAttributeListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusServletContextAttributeListener.class);
    
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        LOGGER.info("attributeAdded: " + event.toString());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        LOGGER.info("attributeRemoved: " + event.toString());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        LOGGER.info("attributeReplaced: " + event.toString());
    }

}
