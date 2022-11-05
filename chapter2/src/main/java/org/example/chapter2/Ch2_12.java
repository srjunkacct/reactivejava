package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_12 {



        public static void main(String[] args) {
            System.out.println(Ch2_12.class.getName());
            Observable<String> source = Observable.just("Alpha","Beta","Gamma");
            source.subscribe(s -> System.out.println("Observer 1: " + s));
            source.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("Observer 2: " + s));
        }

}
