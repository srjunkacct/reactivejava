package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.concurrent.TimeUnit;

import static org.example.utils.Utilities.sleep;

public class Ch2_33 {
    public static void main(String[] args) {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable = seconds.subscribe(l -> System.out.println("Received: " + l));
        sleep(5000);
        disposable.dispose();
        sleep(5000);
    }
}
