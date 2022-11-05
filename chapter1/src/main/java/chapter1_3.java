import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class chapter1_3 {
    public static void main(String[] args)
    {
        Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(s -> System.out.println(s));
        sleep(5000);
    }

    public static void sleep(long millis)
    {
        try {
            Thread.sleep(millis);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
