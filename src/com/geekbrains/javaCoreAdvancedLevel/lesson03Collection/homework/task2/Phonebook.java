package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.homework.task2;

import java.util.*;

public class Phonebook {

    Map<String, Contact> contactMap = new HashMap<>();

    public void add(String lastName, int phoneNumber){
        if(contactMap.containsKey(lastName)){
            updateContact(lastName, phoneNumber);
        }else {
            addNewContact(lastName, phoneNumber);
        }
    }

    private void updateContact(String lastName, int phoneNumber) {
        Contact contact = contactMap.get(lastName);
        contact.addPhoneNum(phoneNumber);
        contactMap.put(lastName, contact);
        System.out.println("В контакт \"" + lastName + "\" добавлен новый номер!");
    }

    private void addNewContact(String lastName, int phoneNumber) {
        contactMap.put(lastName, new Contact(lastName, new ArrayList<>(Collections.singletonList(phoneNumber))));
        System.out.println("В телефонную книгу добавлен новый контакт \"" + lastName + "\"");
    }

    public void getAll(){
        int num = contactMap.size() - 1;
        for (Contact contact : contactMap.values()) {
            contact.printInfo(contactMap.size() - num);
            num--;
        }
    }

    public void get(String lastName){
        int num = contactMap.size() - 1;
        if (contactMap.containsKey(lastName)) {
            for (Contact contact :contactMap.values()) {
                if (lastName.equals(contact.getLastName())) {
                    contact.printInfo(contactMap.size() - num);
                    num--;
                }
            }
        } else {
            System.out.println("Контакт \"" + lastName + "\" отсутствует");
        }
    }
}
