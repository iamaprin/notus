package io.vilya.notus.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:19:14
 */
@WebListener
public class NotusHttpSessionAttributeListener implements HttpSessionAttributeListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusHttpSessionAttributeListener.class);
    
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        LOGGER.info("attributeAdded: " + event.toString());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        LOGGER.info("attributeRemoved: " + event.toString());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        LOGGER.info("attributeReplaced: " + event.toString());
    }

}
