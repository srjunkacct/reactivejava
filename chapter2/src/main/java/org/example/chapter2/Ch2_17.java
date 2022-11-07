package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;


public class Ch2_17 {
    public static void main(String[] args) {
        ConnectableObservable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS).publish();
        seconds.subscribe(s -> System.out.println(LocalDateTime.now().getSecond() + " " + s + " Mississippi listener 1"));
        seconds.connect();
        sleep(5000);
        seconds.subscribe(s -> System.out.println(LocalDateTime.now().getSecond() + " " + s + " Mississippi listener 2"));
        sleep(5000);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
