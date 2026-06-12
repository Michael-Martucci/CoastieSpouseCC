package com.app.coastiespousecc.model;

public class Member {

    //Use Long wrapper instead of int so can be null
    private Long id;
    private String name;
    private String spouse;
    private String phoneNumber;
    private String address;
    private boolean isAdmin;

    public Member (Long id, String name, String spouse, String phoneNumber, String address, boolean isAdmin){
        this.id = id;
        this.name = name;
        this.spouse = spouse;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.isAdmin = isAdmin;
    }

    //no args
    public Member(){}

    //getters && setters
    public Long getId() {return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpouse(){
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress (){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
