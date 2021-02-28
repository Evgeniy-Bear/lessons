package com.geekbrains.z1;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.frequency;

public class UniqueWords {


    public void uniqueWords(List<String> list) {

        List<String> listUniqueWords = new ArrayList<>();

        String str = "";
        int numberOfRepetitions = 0;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            numberOfRepetitions = frequency(list, str);
            if (numberOfRepetitions == 1) {
                listUniqueWords.add(str);
            }
        }
        System.out.println("Список уникальных слов: " + listUniqueWords);

    }
}
