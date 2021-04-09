package com.streamliners.task3_2;

import java.util.ArrayList;

class GroceryItem {
    String name;
    int pricePerKg;
    GroceryItem(String name , int pricePerKg){
        this.name = name;
        this.pricePerKg = pricePerKg;
    }
}
class  GroceryCartItem extends GroceryItem{
    float price;
    float quantity;
    GroceryCartItem ( String name , int pricePerKg ){
        super(name,pricePerKg);
    }
    @Override
    public String toString() {
        return String.format("%s(Rs. %d * %f)=Rs.%f",name,pricePerKg,quantity,price);
    }
    static float extractQuantity(String quantityStr){
        String arr[]= quantityStr.split(" ");
        arr[0]=arr[0].replace("kg","");
        arr[1]=arr[1].replace("g","");
        float a=Float.parseFloat(arr[0]);
        float b=Float.parseFloat(arr[1])/1000;
        float f = a+b;
        return f;
    }
    static GroceryCartItem createNew(GroceryItem item ,String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.name,item.pricePerKg);
        cartItem.quantity = extractQuantity(quantityStr);
        cartItem.price= cartItem.quantity * cartItem.pricePerKg;
        return cartItem;
    }
}
class Cart{
    ArrayList<GroceryCartItem> cartItems;
    float  totalAmount;
    Cart(){
        cartItems = new ArrayList<GroceryCartItem> ();
        totalAmount = 0;
    }
    Cart add(GroceryCartItem item){
        cartItems.add(item);
        totalAmount+= item.price;
        return this;
    }
    @Override
    public String toString() {
        return String.format("Cart{ \n\t groceryCartItems = [ \n\t\t %s (Rs.%d * %fkg) = Rs.%f,\n\t\t %s (Rs.%d * %fkg) = Rs.%f,\n\t\t%s (Rs.%d * %fkg) = Rs.%f,\n\t\t%s (Rs.%d * %fkg) = Rs.%f \n], totalAmount = Rs.%f \n}", cartItems.get(0).name,cartItems.get(0).pricePerKg,cartItems.get(0).quantity,cartItems.get(0).price,cartItems.get(1).name,cartItems.get(1).pricePerKg,cartItems.get(1).quantity,cartItems.get(1).price,cartItems.get(2).name,cartItems.get(2).pricePerKg,cartItems.get(2).quantity,cartItems.get(2).price,cartItems.get(3).name,cartItems.get(3).pricePerKg,cartItems.get(3).quantity,cartItems.get(3).price,totalAmount);
    }
}

public class task3_2 {
    public static void main(String[] args) {
        GroceryItem gi1 = new GroceryItem("Sugar",35);
        GroceryItem gi2 = new GroceryItem("Jaggery",40);
        GroceryItem gi3 = new GroceryItem("Apple",100);
        GroceryItem gi4 = new GroceryItem("Mango",60);
        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(gi1,"3kg 0g")).add(GroceryCartItem.createNew(gi2,"0kg 750g")).add(GroceryCartItem.createNew(gi3,"1kg 500g")).add(GroceryCartItem.createNew(gi4,"3kg 500g"));
        System.out.println(cart);
    }

}
