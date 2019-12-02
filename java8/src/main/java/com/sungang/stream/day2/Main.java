package com.sungang.stream.day2;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IntStream intStream = IntStream.rangeClosed(1,100).filter(n->n%2==0);
        //System.out.println(intStream.count());
        intStream.forEach(System.out::println);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
        //pool.execute(()->Integer.parseInt(null));
        System.out.println(pool.getPoolSize());
        Thread.sleep(3000);
        pool.execute(()-> System.out.println("test"));

    }
}
