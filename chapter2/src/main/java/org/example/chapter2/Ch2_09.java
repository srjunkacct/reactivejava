package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_09 {

    public static void main(String[] arge) {
        Observable<String> source = Observable.just("Alpha","Beta","Gamma");
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe( i -> System.out.println("Received: " + i));


    }
}
