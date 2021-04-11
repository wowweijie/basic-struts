package org.apache.struts.register.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.register.model.Account;

/**
 * Acts as a controller to handle actions
 * related to logging in a user account
 * @author wongweijie
 *
 */
public class Login extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Account accountBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database

        return SUCCESS;
    }

    public Account getAccountBean() {
        return accountBean;
    }

    public void setPersonBean(Account accountBean) {
        accountBean = accountBean;
    }

}