package edu.ib;

public class ThreadTester {

    public static void main(String[] args) {

        //Utwórz wątek korzystając z obiektu klasy implemetującej interface Runnable
        Thread thread1 = new Thread(new ThreadDemo1());
        thread1.start();

        //Utwórz wątek korzystając z anonimowej klasy wewnętrznej
        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 in thread 2 completed");
            }
        });
        thread2.start();


        //Utwórz wątek korzystając z wyrażenia lambda
        Thread thread3= new Thread(()-> System.out.println("Task 3 in thread 3 completed"));
        thread3.start();

        System.out.println("Main thread ....");


    }


}
