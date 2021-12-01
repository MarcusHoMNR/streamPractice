package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToDouble(number -> number)
                .average().orElse(0);
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().reduce(0, (maxNumber, number) -> number > maxNumber ? number : maxNumber);
    }

}
