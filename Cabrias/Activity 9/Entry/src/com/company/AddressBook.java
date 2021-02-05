package com.company;

public class AddressBook {

    private String name;
    private String address;
    private String num;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        AddressBook a = new AddressBook();
        a.setName("Name of the person in the address book");
        System.out.println("Name: " + a.getName());

        AddressBook b = new AddressBook();
        b.setAddress("Address of the person");
        System.out.println("Address: " + b.getAddress());

        AddressBook c = new AddressBook();
        c.setNum("Telephone number of the person");
        System.out.println("Telephone Number: " + c.getNum());

        AddressBook d = new AddressBook();
        d.setEmail("Person's Email address");
        System.out.println("Email Address: " + d.getEmail());
    }
}


