package io.vilya.notus.rest;

/**
 * @author zhukuanxin
 * @time 2017年5月21日 下午10:31:31
 */
public class AccountNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = -1130259579138039268L;

    public AccountNotFoundException(int id) {
        super(id + " account not found");
    }
}
