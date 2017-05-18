package io.vilya.notus.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:17:46
 */
@WebListener
public class NotusServletContextListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusServletContextListener.class);
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("contextInitialized: " + sce.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("contextInitialized: " + sce.toString());
    }

}
