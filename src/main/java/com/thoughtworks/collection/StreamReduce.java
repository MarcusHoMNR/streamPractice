package com.thoughtworks.collection;

import java.util.List;

import static java.lang.Integer.parseInt;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0, (returnNumber, number) -> number % 2 != 0 ? number : returnNumber);
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce(String.valueOf(0), (returnWord, word) -> word.length() > returnWord.length() ? word : returnWord);
    }

    public int getTotalLength(List<String> words) {
        return parseInt(words.stream().reduce(String.valueOf(0), (sumLength, word) -> String.valueOf(parseInt(sumLength) + word.length())));
    }
}
