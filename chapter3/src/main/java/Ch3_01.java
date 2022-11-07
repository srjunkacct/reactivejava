import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

import java.util.concurrent.TimeUnit;

import static org.example.utils.Utilities.sleep;

public class Ch3_01 {
    public static void main(String[] args) {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable = seconds
                .takeWhile(i -> i < 20)
                .skipWhile(i -> i < 5)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
        sleep(1000 * 10);
        disposable.dispose();
        sleep(1000 * 10);

    }
}
