import models.Items;
import models.Orderlist;
import models.Users;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        Items i1 = new Items(12375,"Hoodie","adidas",3,2500);
        Items i2 = new Items(12765,"Joggers","Nike",17,4500);
        Items i3 = new Items(12789,"Sneakers","Yeezy",8,7000);
        Items i4 = new Items(12276,"Beanie","Local(Handmade Woolen)",2,2500);
        Items i5 = new Items(12777,"Jacket(Fluffy Insides)","Gucci",7,7500);


        Users u1 = new Users("Wizi",21666,"New Road,Kathmandu");
        Users u2 = new Users("विजी",25647,"Baneshwor,Kathmandu");


        Orderlist o1 = new Orderlist(1,11112,12375,"wizi",2700);
        Orderlist o2 = new Orderlist(2,11123,12389,"wwizi",4750);


        ArrayList<String> Userlist = new ArrayList<>();

        Userlist.add(u1.getUsername());
        Userlist.add(u2.getUsername());

        System.out.println("Users present in the systems are:" + Userlist);

        ArrayList<Orderlist> Orderlist = new ArrayList<>();

        Orderlist.add(o1);
        Orderlist.add(o2);

        o1.bill();
        o2.bill();

        System.out.println("-------------------------------------------------------------------------------------");


        i1.ItemOutput();
        i2.ItemOutput();
        i3.ItemOutput();





    }
}