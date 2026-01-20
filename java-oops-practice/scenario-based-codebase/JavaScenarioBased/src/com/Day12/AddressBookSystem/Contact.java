package com.Day12.AddressBookSystem;

class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;   

    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() +
               "\nPhone: " + phone +
               "\nEmail: " + email +
               "\nAddress: " + address +
               "\n";
    }
}
