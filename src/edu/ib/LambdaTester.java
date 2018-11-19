package edu.ib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTester {


    public static void main(String[] args) {

        // Implementacja interfejsu za pomocą wyrażenia lambda
        InterfaceFunc fObj= (x)-> System.out.println(2*x);

        fObj.abstractFunction(5);

        fObj.normalFunction(); // wywołanie metody domyślnej


        List<Integer> numbers= new ArrayList<>(Arrays.asList(new Integer [] {1,2,7,8,2} ));

        //  pokaż zawartość listy tablicowej
        numbers.forEach(n-> System.out.println(n));

        System.out.println("*******");

        // pokaż parzyste elementy listy
        numbers.forEach(n -> {if(n%2 == 0) System.out.println(n);});

        System.out.println("*******");

        // usuń z listy wszystkie 2
        numbers.removeIf(n -> n==2);
        numbers.forEach(n-> System.out.println(n));



    }

}
