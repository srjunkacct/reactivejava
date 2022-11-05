import io.reactivex.rxjava3.core.Observable;

public class chapter1_1 {
    public static void main(String[] args)
    {
        Observable<String> myStrings =
                Observable.just("Alpha","Beta","Gamma");
        myStrings.subscribe(s -> System.out.println(s));
    }
}
