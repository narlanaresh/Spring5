package com.rest.fileupload.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHONEBOOK")
public class PhoneBook {
    @Id
    @Column(name ="PHONE_NUMBER" )
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
