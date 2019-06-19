/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author swart
 */
public class NumberWorker implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) {
        try {
            Collection<Integer> intList = Stream.of(input.split(","))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            return intList;
        } catch (Exception e) {
            System.out.println("Incompatible Format no spaces and only numbers or , allowed");
            return null;
        }
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {

        Integer[] array = input.toArray(new Integer[0]);

        StringBuilder answer = new StringBuilder();
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int flag = 0;
        for (Integer x : array) {
            List<Integer> workList = list.get(list.size() - 1);
            if (workList.isEmpty()) {
                workList.add(x);
            } else {
                int lastElement = workList.get(workList.size() - 1);
                if (lastElement == x - 1 || lastElement == x + 1) {
                    if (lastElement == x - 1) {
                        if (flag == 2) {
                            List<Integer> newList = new ArrayList<>();
                            newList.add(x);
                            list.add(newList);
                            flag = 0;
                        } else {
                            flag = 1;
                            workList.add(x);
                        }   
                    }
                    if (lastElement == x + 1) {
                        if (flag == 1) {
                            List<Integer> newList = new ArrayList<>();
                            newList.add(x);
                            list.add(newList);
                            flag = 0;
                        } else {
                            flag = 2;
                            workList.add(x);
                        }
                    }
                } else {
                    flag = 0;
                    List<Integer> one = new ArrayList<>();
                    one.add(x);
                    list.add(one);
                }
            }
        }
        list.forEach((List<Integer> workList) -> {
            if (workList.size() > 1) {
                answer.append(workList.get(0)).append("-").append(workList.get(workList.size() - 1));
            } else {
                answer.append(workList.get(0));
            }
            if (workList != list.get(list.size() - 1)) {
                    answer.append(", ");
                }
        });
        return answer.toString();
    }
}
