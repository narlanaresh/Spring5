package com.rest.fileupload.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class PhoneBookUtil {

    public static void getPhoneNumberList(List<String> phoneNumberList, MultipartFile file){
        BufferedReader br;
        try {
            String line;
            InputStream is = file.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                List<String> temp= Arrays.asList(line.split(","));
                phoneNumberList.addAll(temp);
            }
            phoneNumberList.forEach(str->{
                System.out.println(str);
            });

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
