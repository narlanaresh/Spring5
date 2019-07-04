package com.rest.fileupload.services;

import com.rest.fileupload.entities.PhoneBook;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PhoneBookService {

    public void save(List<String> phoneBookList, MultipartFile file);
    public List<PhoneBook>  getPhoneBook();
}