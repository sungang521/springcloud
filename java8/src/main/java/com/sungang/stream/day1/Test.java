package com.sungang.stream.day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //1.
        Integer[] array = {1,2,3,4};
        Arrays.asList(array).stream().map(n->n*n).collect(Collectors.toList()).forEach(System.out::println);
        //2
        Integer[] a1 = {1,2,3};
        Integer[] a2 = {3,4};
        List<Integer> numbers1 = Arrays.asList(a1);
        List<Integer> numbers2 = Arrays.asList(a2);
        List<int[]> list = numbers1.stream().flatMap(i->numbers2.stream().filter(j->(i+j)%6==0).
                map(j->new int[]{i,j}))
                .collect(Collectors.toList());
        System.out.println(list.size());
        //3
        int sum = numbers1.stream().reduce(0,Integer::sum);
        int aaaa = numbers1.stream().reduce(1,(a,b)->a*b);
        System.out.println(aaaa);
    }
}
