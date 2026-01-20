package com.Day12.AddressBookSystem;

import java.util.*;

class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact c) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equalsIgnoreCase(c.getFullName())) {
                System.out.println("❌ Contact already exists!");
                return;
            }
        }
        contacts.add(c);
        System.out.println("✅ Contact added successfully!");
    }

    public void editContact(String name, String newPhone, String newEmail, Address newAddress) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                c.setAddress(newAddress);
                System.out.println("✏️ Contact updated successfully!");
                return;
            }
        }
        System.out.println("❌ Contact not found!");
    }

    public void deleteContact(String name) {
        contacts.removeIf(c -> c.getFullName().equalsIgnoreCase(name));
        System.out.println("🗑️ Contact deleted (if existed).");
    }

    public void searchByLocation(String location) {
        boolean found = false;

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(location) ||
                c.getAddress().getState().equalsIgnoreCase(location)) {

                System.out.println(c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts found in " + location);
        }
    }

    public void displayAllContacts() {
        contacts.sort(Comparator.comparing(Contact::getFullName));

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
