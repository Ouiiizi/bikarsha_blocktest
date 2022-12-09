package models;
import java.util.ArrayList;

public class Users {

ArrayList<String> Userlist = new ArrayList<>();

    String Username;
    int UserID;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getDeliveryadress() {
        return Deliveryadress;
    }

    public void setDeliveryadress(String deliveryadress) {
        Deliveryadress = deliveryadress;
    }

    String Deliveryadress;

    public Users(String Username, int UserID, String Deliveryadress){
        this.Deliveryadress = Deliveryadress;
        this.UserID = UserID;
        this.Username = Username;
    }


}
