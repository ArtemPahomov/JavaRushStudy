package com.test;

public class Potoki22Interrupted {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(),"Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp;
        @Override
        public void run() {

            try {
                while (true) {
                    ++countIndexUp;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countIndexUp == number) return;
                }
            } catch (InterruptedException e) {
            }
        }
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Potoki22Interrupted.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
