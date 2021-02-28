package com.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    Map<String, List<String>> surnameAndPhoneNumber  = new HashMap<>();
    List<String> phone_number_list;

    public  List<String>  get(String name){
        return surnameAndPhoneNumber.get(name);
    }
    public void add(String surname, String phoneNumber){
        if (surnameAndPhoneNumber.containsKey(surname)) {
            phone_number_list = surnameAndPhoneNumber.get(surname);
            phone_number_list.add(phoneNumber);
            surnameAndPhoneNumber.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phoneNumber);
            surnameAndPhoneNumber.put(surname, phone_number_list);
        }
    }

}
