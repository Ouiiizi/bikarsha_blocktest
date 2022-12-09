package models;

public class Orderlist {

    int Orderno;
    int OrderID;
    String OrderUser;

    public int getOrderno() {
        return Orderno;
    }

    public void setOrderno(int orderno) {
        Orderno = orderno;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getOrderUser() {
        return OrderUser;
    }

    public void setOrderUser(String orderUser) {
        OrderUser = orderUser;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    int ItemID;
    int Cost;

public Orderlist(int Orderno, int OrderID, int ItemID, String Orderuser, int Cost){
    this.Cost = Cost;
    this.ItemID = ItemID;
    this.OrderID = OrderID;
    this.Orderno = Orderno;
    this.OrderUser = Orderuser;
}

 public void bill(){
     System.out.println("Orderlist of User " + this.OrderUser +
             " is: " + this.OrderID +
             " of Item ID " + this.ItemID +
             " at " + this.Cost + ".");
 }


}
