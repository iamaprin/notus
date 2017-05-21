package io.vilya.notus.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:20:28
 */
@WebListener
public class NotusServletRequestAttributeListener implements ServletRequestAttributeListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotusServletRequestAttributeListener.class);
    
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        LOGGER.info("attributeAdded: " + srae.getValue());        
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        LOGGER.info("attributeRemoved: " + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        LOGGER.info("attributeReplaced: " + srae.getValue());
    }

}
