package Thread;

public class tester {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("main: " + i);
        }
/*
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(int i =0; i <5; i++){
                    System.out.println("THREAD: " + i);

                }
            }
        };
        thread.start();
*/
        MyThread my = new MyThread();
        my.start();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("abc");
            }
        }
    };
    Thread y = new Thread(runnable);
    y.start();



    }
}

    class MyThread extends Thread{

        @Override
        public void run() {
            for(int i =0; i <10; i++){

                System.out.println("mythread: "+i);
            }
        }
    }

