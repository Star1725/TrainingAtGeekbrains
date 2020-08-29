package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private final String lastName;
    private final List<Integer> listPhoneNumber;

    public String getLastName() {
        return lastName;
    }

    public void addPhoneNum(int phoneNumber){
        this.listPhoneNumber.add(phoneNumber);
    }

    public Contact(String lastName, ArrayList<Integer> listPhoneNumber) {
        this.lastName = lastName;
        this.listPhoneNumber = listPhoneNumber;
    }

    public void printInfo(int numCont) {
        System.out.println("Contact" + numCont + ": " + "ФИО = " + lastName);
        for (Integer phoneNum : listPhoneNumber) {
        System.out.println("         тел. номер " + (listPhoneNumber.indexOf(phoneNum) + 1) + " = " + phoneNum);
        }
    }
}
