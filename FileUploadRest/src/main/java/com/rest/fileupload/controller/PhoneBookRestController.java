package com.rest.fileupload.controller;


import com.rest.fileupload.constants.Message;
import com.rest.fileupload.entities.PhoneBook;
import com.rest.fileupload.services.PhoneBookService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 36000)
@RequestMapping("/rest")
public class PhoneBookRestController {
    static Logger log = Logger.getLogger(PhoneBookRestController.class.getName());

    private String uploadPath;

    public PhoneBookRestController(@Value("upload.path") String uploadPath) {
        this.uploadPath = uploadPath;
    }

    @Autowired
    private PhoneBookService phoneBookService;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public  @ResponseBody ResponseEntity<List<PhoneBook>> uploadFile(@RequestParam("file") MultipartFile file){
        List<String> phoneNumberList = new ArrayList<>();
        List<PhoneBook> phoneBookList=null;
        try {
            phoneBookService.save(phoneNumberList, file);
            log.info(Message.FILE_UPLOAD_SUCCESS_MESSAGE);
            phoneBookList = phoneBookService.getPhoneBook();
            log.info("phone Numbers are :"+phoneBookList);
        }
        catch (Exception e){
            log.error(""+e.getMessage());
            return new ResponseEntity<List<PhoneBook>>(phoneBookList, HttpStatus.INTERNAL_SERVER_ERROR);
        }
         return new ResponseEntity<List<PhoneBook>>(phoneBookList, HttpStatus.OK);
    }

    @RequestMapping(value="getPhoneNumbers",method = RequestMethod.GET)
     public @ResponseBody  ResponseEntity<List<PhoneBook>> getPhoneNumbers(){
        List<PhoneBook> phoneBookList=null;
        try {
           phoneBookList = phoneBookService.getPhoneBook();
           log.info("phone Numbers are :"+phoneBookList);
        }
        catch (Exception e){
            log.error(""+e.getMessage());
            return new ResponseEntity<List<PhoneBook>>(phoneBookList, HttpStatus.INTERNAL_SERVER_ERROR);
        }
       return new ResponseEntity<List<PhoneBook>>(phoneBookList, HttpStatus.OK);
   }
}
