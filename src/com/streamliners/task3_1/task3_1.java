package com.streamliners.task3_1;

class Product {
    String name ;
    int price ;
    Product(){
    name = "Cellphone";
    price = 10000;
    }
    Product (String name,int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d",name,price);
    }
    public boolean equals (Product p1){
        return name.equals(p1.name);
    }
}
class SpecialProduct extends Product {
    static int regularPrice ;
    static int percentageOff ;
    SpecialProduct(String name , int price){
        super(name,price);
    }
    @Override
    public String toString() {
        return String.format("RegularPrice : %d & PercentageOff : %d",regularPrice,percentageOff);
    }
    static SpecialProduct applyOffOnProduct(Product product,int percentageOff){
        int discountedPrice = product.price - (percentageOff*product.price/100);
        SpecialProduct sp1 = new SpecialProduct(product.name , discountedPrice);
        SpecialProduct.regularPrice = product.price;
        SpecialProduct.percentageOff = percentageOff;
        return sp1;
    }
}
public class task3_1 {
    public static void main(String[] args) {
        Product p = new Product("Apple",100);
        Product q = new Product("Apple",80);
        Product r = new Product("Orange",50);
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(r.toString());
        System.out.println(p.equals(q));
        System.out.println(p.equals(r));
        SpecialProduct sp = new SpecialProduct("A",30);
        sp = SpecialProduct.applyOffOnProduct(p,20);
        System.out.println(sp.toString());
    }
}
