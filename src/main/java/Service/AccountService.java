package Service;

import java.util.ArrayList;
import java.util.List;

import DAO.AccountDAO;
import DAO.MessageDAO;
import Model.Account;
import Model.Message;

public class SocialMediaService {
    // create a service class from scratch in java code

public class SocialMediaController {
    private String serviceName;
    private double price;
    private int duration;

    public SocialMediaController(String serviceName, double price, int duration) {
        this.serviceName = serviceName;
        this.price = price;
        this.duration = duration;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}






}
