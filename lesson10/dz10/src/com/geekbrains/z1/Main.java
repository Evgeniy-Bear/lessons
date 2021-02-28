package com.geekbrains.z1;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        AddList addList = new AddList();
        List<String> setOfWords = addList.addList();

        UniqueWords uniqueWords = new UniqueWords();
        uniqueWords.uniqueWords(setOfWords);

        CountWords countWords = new CountWords();
        countWords.countWords(setOfWords);

    }


}
