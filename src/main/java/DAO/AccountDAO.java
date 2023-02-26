package DAO;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Account;
import Util.ConnectionUtil;

public class AccountDAO {

    public void registerAccount(Account account){
        
        try{
            PreparedStatement ps = conn.prepareStatement("insert into account (username, password) values (?, ?)");
//            ps.setString, ps.setInt 'fills in' the question marks in a preparedStatement
//            this not only makes them easier to write but it also avoids a security issue called SQL injection
            ps.setString(2, account.username);
            ps.setString(3, account.password);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

}
