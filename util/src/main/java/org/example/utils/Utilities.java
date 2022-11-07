package org.example.utils;

public class Utilities {

    private Utilities()
    {
    }

    public static void sleep(long millis)
    {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
