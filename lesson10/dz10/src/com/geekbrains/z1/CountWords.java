package com.geekbrains.z1;

import java.util.HashMap;
import java.util.List;

import static java.util.Collections.frequency;

public class CountWords {
    public void countWords(List<String> list) {
        HashMap<String, String> countWords = new HashMap<>();
        String str = "";
        int numberOfRepetitions = 0;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            numberOfRepetitions = frequency(list, str);

            countWords.put(str, Integer.toString(numberOfRepetitions));

        }

        System.out.println("Сколько раз встречается каждое слово " + countWords);


    }
}
