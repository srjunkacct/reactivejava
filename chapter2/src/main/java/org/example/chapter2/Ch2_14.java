package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class Ch2_14 {
    public static void main(String[] args) {
        ConnectableObservable<String> source =
                Observable.just("Alpha","Beta","Gamma").publish();
source.subscribe(s -> System.out.println("Observer 1: " + s));
source.map(String::length).subscribe(s -> System.out.println("Observer 2: " + s));
source.connect();
    }
}
