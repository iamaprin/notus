package io.vilya.notus.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 上午12:08:22
 */
@WebFilter("/*")
public class LoggingFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingFilter.class);
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("inited.");
    }
    
    private int count;
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        if (response instanceof HttpServletResponse) {
            ((HttpServletResponse) response).addIntHeader("count", count++);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        LOGGER.info("destroyed.");
    }

}
