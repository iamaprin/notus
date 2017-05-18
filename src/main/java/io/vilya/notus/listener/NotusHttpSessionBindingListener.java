package io.vilya.notus.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:19:36
 */
@WebListener
public class NotusHttpSessionBindingListener implements HttpSessionBindingListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusHttpSessionBindingListener.class);
    
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        LOGGER.info("valueBound: " + event.toString());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        LOGGER.info("valueUnbound: " + event.toString());
    }

}
