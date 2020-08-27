package com.geekbrains.javaCoreAdvancedLevel.lesson_03_Collection.homework.task2;

import java.util.*;

public class Phonebook {

    List<Contact> contactList = new LinkedList<>();

    public void add(String lastName, int phoneNumber){
        boolean isUpdateContact = false;
        if (contactList.size() == 0){
            addNewContact(lastName, phoneNumber);
        } else {
            for (Contact contact : contactList) {
                if (lastName.equals(contact.getLastName())){
                    updateContact(phoneNumber, contact);
                    isUpdateContact = true;
                }
            }
            if (!isUpdateContact){
                addNewContact(lastName, phoneNumber);
            }
        }
    }

    private void updateContact(int phoneNumber, Contact contact) {
        contact.getListPhoneNumber().add(phoneNumber);
        System.out.println("В контакт \"" + contact.getLastName() + "\" добавлен новый номер!");
    }

    private void addNewContact(String lastName, int phoneNumber) {
        contactList.add(new Contact(lastName, new ArrayList<>(Arrays.asList(phoneNumber))));
        System.out.println("В телефонную книгу добавлен новый контакт \"" + lastName + "\"");
    }

    public void getAll(){
        for (Contact contact : contactList) {
            contact.printInfo();
        }
    }

    public void get(String lastName){
        for (Contact contact : contactList) {
            if (lastName.equals(contact.getLastName())) {
                contact.printInfo();
            }
        }
    }
}
