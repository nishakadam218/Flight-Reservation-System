package com.company;

public class Contact {
    private String name;
    private String phoneNumber;
    private String emailId;

//---------------------------CONSTRUCTORS-------------------------------------//

    public Contact(String name,String phoneNumber,String emailId){
        this.phoneNumber=phoneNumber;
        this.emailId=emailId;
        this.name=name;
    }

    public Contact() {
    }
    //-----------------------METHODS----------------------------------//
    public String getContactDetails(){
        return getName() + ", " + getPhoneNumber() + ", " + getEmailId();
    }
    //public String updateContactDetails(){
    //    return
    //}

  //-----------------------------GETTERS AND SETTERS-----------------------------//
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
}
