package io.vilya.notus.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:18:18
 */
@WebListener
public class NotusHttpSessionIdListener implements HttpSessionIdListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusHttpSessionIdListener.class);
    
    @Override
    public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
        LOGGER.info("sessionIdChanged: " + event.toString() + " oldSessionId: " + oldSessionId);
    }

}
