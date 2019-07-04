package com.rest.fileupload.services;


import com.rest.fileupload.dao.PhoneBookDao;
import com.rest.fileupload.entities.PhoneBook;
import com.rest.fileupload.util.PhoneBookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

    @Autowired
    private PhoneBookDao phoneBookDao;

    @Override
    public void save(List<String> phoneBookList, MultipartFile file) {
        PhoneBookUtil.getPhoneNumberList(phoneBookList,file);
        phoneBookDao.save(phoneBookList);
    }

    @Override
    public List<PhoneBook> getPhoneBook() {
        return phoneBookDao.getPhoneBook();

    }
}
