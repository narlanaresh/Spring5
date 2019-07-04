package com.rest.fileupload.dao;

import com.rest.fileupload.entities.PhoneBook;

import java.util.List;

public interface PhoneBookDao {
    public void  save(List<String> list);
    public List<PhoneBook>  getPhoneBook();
}
