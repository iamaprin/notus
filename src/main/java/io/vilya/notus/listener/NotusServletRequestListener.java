package io.vilya.notus.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:20:10
 */
@WebListener
public class NotusServletRequestListener implements ServletRequestListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusServletRequestListener.class);
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        LOGGER.info("requestDestroyed: " + sre.toString());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        LOGGER.info("requestInitialized: " + sre.toString());
    }

}
