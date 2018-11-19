package edu.ib;

public interface InterfaceFunc {

    void abstractFunction(int x );

    default void normalFunction(){

        System.out.println("Hello!");
    }

}
