package DAO;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.validator.PublicClassValidator;

import Model.Account;
import Util.ConnectionUtil;

public class AccountDAO {



    public void createAccount(Account account){
        
        try{
            Connection connection = ConnectionUtil.getConnection();
            PreparedStatement ps = connection.prepareStatement("insert into account (username, password) values (?, ?)");
//            ps.setString, ps.setInt 'fills in' the question marks in a preparedStatement
//            this not only makes them easier to write but it also avoids a security issue called SQL injection
            ps.setString(2, account.username);
            ps.setString(3, account.password);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }

    }


    public List<Account> getAccount() {
        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement ps = connection.prepareStatement("select * form account");
        ResultSet rs = ps.executeQuery();
        List<Account> account = new ArrayList<>();
        while(rs.next()) {
            Account newAccount = new Account(rs.getInt("account_id"), rs.getString("username"), rs.getString("password"));
        }

        return list;
    }

}
