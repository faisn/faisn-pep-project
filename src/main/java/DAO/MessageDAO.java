package DAO;

import java.sql.PreparedStatement;

import Model.Message;
import Util.ConnectionUtil;

public class MessageDAO {

    public void addMessage(Message message) {
        
        try {
            PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement("insert into message (message_id, message_text ) values (? ,? )");
            ps.setInt(1, message.message_id);
            ps.setString(2, message.getMessage_text());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}
