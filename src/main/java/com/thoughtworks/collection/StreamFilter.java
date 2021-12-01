package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream().filter(number-> number % 2 == 0).collect(Collectors.toList());
    }

    public List<String> filterEndWithS(List<String> words) {
        return null;
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return null;
    }


}
