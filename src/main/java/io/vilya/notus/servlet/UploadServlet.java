package io.vilya.notus.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月18日 下午9:47:30
 */
@SuppressWarnings("serial")
@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadServlet.class);
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File uploadPath = new File(getServletContext().getRealPath("tmp"));
        LOGGER.info(uploadPath.getAbsolutePath());
        if (!uploadPath.exists()) {
            uploadPath.mkdirs();
        }
        
        Collection<Part> parts = req.getParts();
        for (Part part : parts) { 
            part.write(uploadPath + "/notus_" + System.currentTimeMillis());
        }
    }

}
