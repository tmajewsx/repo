package pl.infoshare;

import javax.sound.midi.Soundbank;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String name = "Tomasz";
        String lastName = "Majewski";
        byte myage = 34;
        String hometown = "Malbork";
        int result = 10 + 5;
        System.out.println(result);


        double a = 90.99;
        System.out.println(a);

        int b = (int) a;
        System.out.println(b);

        char c = 'a';
        System.out.println(c);

        int d = (int) c;
        System.out.println(d);

        System.out.println(b / a + d + "Wynik to:" + ("ZZZZ" + b + a + d));
    }

    {

        byte age = 18;

        if (age >= 20 && age <= 28) {
            System.out.println("Wiek jest wieskszy od 18 lat");
        }

    }
}
// koment: wiekszy rowny >=  mniejszy rowny <=   rowny ==
// || to jest "lub"
//&& to jest "i"

 int agePrim = 20;

switch (agePrim)
    case 20: {

        }