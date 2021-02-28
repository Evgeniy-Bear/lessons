package com.geekbrains.z2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    Map<String, List<String>> surnameAndPhoneNumber  = new HashMap<>();
    List<String> listPhoneNumber;

    public  List<String>  get(String name){
        return surnameAndPhoneNumber.get(name);
    }
    public void add(String surname, String phoneNumber){
        if (surnameAndPhoneNumber.containsKey(surname)) {
            listPhoneNumber = surnameAndPhoneNumber.get(surname);
            listPhoneNumber.add(phoneNumber);
            surnameAndPhoneNumber.put(surname, listPhoneNumber);
        } else {
            listPhoneNumber = new ArrayList<>();
            listPhoneNumber.add(phoneNumber);
            surnameAndPhoneNumber.put(surname, listPhoneNumber);
        }
    }

}
