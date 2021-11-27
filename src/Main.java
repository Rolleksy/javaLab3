import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student student = new Student();
        var[] tablica = new var[2];
        tablica[0] = student.napis1;
        tablica[1] = student.liczba;
        tablica[2] = student.lup;
        for (int i = 0; i<2; i++){
            System.out.println(tablica[i]);
        }
    }
}
