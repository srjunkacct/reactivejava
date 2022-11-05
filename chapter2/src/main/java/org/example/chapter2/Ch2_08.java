package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;


public class Ch2_08 {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        Consumer<Integer> onNext = i -> System.out.println("Received: " + i);
        Consumer<Throwable> onError = Throwable::printStackTrace;
        Action onComplete = () -> System.out.println("Done");
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(onNext, onError, onComplete);
    }
}
