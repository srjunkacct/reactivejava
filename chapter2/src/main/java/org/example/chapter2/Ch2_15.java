package org.example.chapter2;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_15 {
    public static void main(String[] args) {
        Observable.range(5,10).subscribe(s->System.out.println("Received: " + s));
    }
}
