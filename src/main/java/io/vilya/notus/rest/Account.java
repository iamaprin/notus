package io.vilya.notus.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author zhukuanxin
 * @time 2017年5月21日 下午8:35:27
 */
@XmlRootElement
@SuppressWarnings("serial")
public class Account implements Serializable {
    
    private String username;
    
    private String password;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
