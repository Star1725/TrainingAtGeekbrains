package com.geekbrains.javaCoreAdvancedLevel.lesson_03_Collection.homework.task2;

import java.util.ArrayList;

public class Contact {
    private String lastName;
    private ArrayList<Integer> listPhoneNumber;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Integer> getListPhoneNumber() {
        return listPhoneNumber;
    }

    public void setListPhoneNumber(ArrayList<Integer> listPhoneNumber) {
        this.listPhoneNumber = listPhoneNumber;
    }

    public Contact(String lastName, ArrayList<Integer> listPhoneNumber) {
        this.lastName = lastName;
        this.listPhoneNumber = listPhoneNumber;
    }

    public void printInfo() {
        System.out.println("Contact: " + "ФИО = " + this.lastName);
        for (Integer phoneNum : this.listPhoneNumber) {
        System.out.println("         тел. номер " + (this.listPhoneNumber.indexOf(phoneNum) + 1) + " = " + phoneNum);
        }
    }
}
