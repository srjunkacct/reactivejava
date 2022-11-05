package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class Ch2_06 {
    public static void main(String[] args) {
        List<String> sourceList = List.of("Alpha", "Beta", "Gamma");
        Observable<String> source = Observable.fromIterable(sourceList);
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}
