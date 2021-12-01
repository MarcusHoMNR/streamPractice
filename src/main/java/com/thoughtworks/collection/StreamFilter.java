package com.thoughtworks.collection;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers.stream().filter(number-> number % 2 == 0).collect(Collectors.toList());
    }

    public List<String> filterEndWithS(List<String> words) {
        return words.stream().filter(word-> StringUtils.equals(word.substring(word.length() - 1).toLowerCase(Locale.ENGLISH), "s")).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return numbers.stream()
                .distinct()
                .filter(anotherNumbers::contains)
                .collect(Collectors.toList());
    }


}
