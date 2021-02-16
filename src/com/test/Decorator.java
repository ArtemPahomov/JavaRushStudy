package com.test;

public class Decorator {
    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorRunnableImpl body ");
            component.run();
        }
    }
    public static class DecoratorMyRunnableImpl implements Runnable{
        private Runnable component;
        public DecoratorMyRunnableImpl(RunnableImpl runnable) {
            this.component = runnable;
        }

        @Override
        public void run() {
            System.out.println("decoratorMyRunnableImpl body");
            component.run();
        }
    }
}
