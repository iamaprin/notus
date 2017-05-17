package io.vilya.notus.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月17日 下午11:17:29
 */
@SuppressWarnings("serial")
@WebServlet("/account")
@WebInitParam(name = "config", value = "NotusConfig")
public class AccountServlet extends HttpServlet {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServlet.class);
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
        try {
            resp.getWriter().write("hello"); 
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    
    
}
