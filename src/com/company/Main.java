package com.company;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {

        Store Store = new Store("App", "Charlotte", 2021);

        Store.getProduct();
        Store.getLocation();
        Store.getOpeningYear();

        Store.setProduct("Communication Line");
        Store.setOpeningYear(2021);
        Store.setLocation("Charlotte, NC");

        Store.isNewStore();

        Pet Pet = new Pet("Rick", "Charlotte", "Dog", 3);
        Pet.getAge();
        Pet.getName();
        Pet.getType();

        Pet.setAge(3);
        Pet.setName("Rick");
        Pet.setLocation("Charlotte, NC");

    }


}

