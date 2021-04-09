package com.streamliners.task3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TouristPlace{
    String name;
    String workingHour;
    int entryTicketPrice ;
    int noOfRatings;
    float starRating ;
    List<String> famousFor;
    TouristPlace(String name ,String workingHour ,int entryTicketPrice ){
        this.name=name;
        this.workingHour=workingHour;
        this.entryTicketPrice=entryTicketPrice;
        famousFor = new ArrayList<>() ;
        noOfRatings = 0;
        starRating = 0;
    }
    void rate(int stars){
            starRating = ((starRating * noOfRatings)+stars)/++noOfRatings;
    }
    TouristPlace addFamousfor(String s){
        famousFor.add(s);
        return this;
    }
    boolean isPlaceOpen() {
        return true;
    }
}

class City {
    String name;
    String state;
    List<TouristPlace> touristPlaces;
    City(String name , String state){
        this.name=name;
        this.state=state;
        touristPlaces = new ArrayList<>();
    }
}

public class task3_3 {
    public static void main(String[] args) {
        TouristPlace tp1 =new TouristPlace("TajMahal","10:00AM to 5:00PM",50);
        tp1.addFamousfor("1 of 7 Wonders of World");
        tp1.rate(4);
        tp1.rate(5);
        tp1.rate(3);
        tp1.rate(5);
        tp1.rate(4);
        System.out.println(tp1.starRating);
    }
}
