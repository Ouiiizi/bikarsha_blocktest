package models;
import java.util.ArrayList;

public class Items {

    int itemno;
    String itemname;

    public int getItemno() {
        return itemno;
    }

    public void setItemno(int itemno) {
        this.itemno = itemno;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    int Stock;

    String Brand;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    int itemcost;

    public int getItemcost() {
        return itemcost;
    }

    public void setItemcost(int itemcost) {
        this.itemcost = itemcost;
    }

    public Items(int itemno, String itemname, String Brand, int Stock,int itemcost){
this.itemname = itemname;
this.itemno = itemno;
this.Stock = Stock;
this.Brand = Brand;
this.itemcost = itemcost;


}

    public void ItemOutput(){
        System.out.println("Item name: " +this.itemname + "\n" +
                "Code: " + this.itemno + "\n" +
                "Brand: " + this.Brand + "\n" +
                "Price: " + this.itemcost + " \n");

        System.out.println("-------------------------------------------------------------------------------------");
    }

}
