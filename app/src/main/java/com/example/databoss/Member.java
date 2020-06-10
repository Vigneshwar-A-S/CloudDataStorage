package com.example.databoss;

public class Member {
    private String Name;
    private String Father_Name;
    private String Mother_Name;
    private String ID;
    private String Password;
    private String Address;
    private String DateJoined;
    private String DateRequest;
    private String PhoneNumber;

    public Member() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFather_Name() {
        return Father_Name;
    }

    public void setFather_Name(String father_Name) {
        Father_Name = father_Name;
    }

    public String getMother_Name() {
        return Mother_Name;
    }

    public void setMother_Name(String mother_Name) {
        Mother_Name = mother_Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDateJoined() {
        return DateJoined;
    }

    public void setDateJoined(String dateJoined) {
        DateJoined = dateJoined;
    }

    public String getDateRequest() {
        return DateRequest;
    }

    public void setDateRequest(String dateRequest) {
        DateRequest = dateRequest;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
