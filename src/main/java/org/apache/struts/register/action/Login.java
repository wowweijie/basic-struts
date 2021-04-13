package org.apache.struts.register.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.register.model.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Acts as a controller to handle actions
 * related to logging in a user account
 * @author wongweijie
 *
 */
public class Login extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Account accountBean;

    public String execute() {
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://localhost:3306/usersdb";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "root");
            String sql = "SELECT Username FROM Login WHERE";
            sql+="Username  = ? AND Password= ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, accountBean.getUsername());
            ps.setString(2, accountBean.getPassword());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ret = SUCCESS;
            }
        } catch (Exception e) {
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
        return ret;

    }

    public Account getAccountBean() {
        return accountBean;
    }

    public void setPersonBean(Account accountBean) {
        accountBean = accountBean;
    }

}