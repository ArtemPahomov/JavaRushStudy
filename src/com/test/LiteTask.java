package com.test;

public class LiteTask {
    class Clock implements Runnable
    {
        public void run()
        {
            Thread current = Thread.currentThread();

            while (!current.isInterrupted())
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }
}
