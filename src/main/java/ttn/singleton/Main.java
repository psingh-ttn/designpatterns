package ttn.singleton;

/**
 * Created by parampreet on 11/7/17.
 */
public class Main {
    public static void main(String... args) throws Exception {


        Holder2.INSTANCE.increment();
        Holder2.INSTANCE.get();




    }
}
