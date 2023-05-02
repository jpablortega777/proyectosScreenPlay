package utils;

import java.util.concurrent.Callable;

public class UtiliTime
{

    public static Callable<Boolean> codicionExitosa()
    {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return true;
            }
        };
    }
}
