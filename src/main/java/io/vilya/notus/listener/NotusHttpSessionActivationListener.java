package io.vilya.notus.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:18:45
 */
@WebListener
public class NotusHttpSessionActivationListener implements HttpSessionActivationListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusHttpSessionActivationListener.class);
    
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        LOGGER.info("sessionWillPassivate: " + se.toString());
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        LOGGER.info("sessionDidActivate: " + se.toString());
    }

}
