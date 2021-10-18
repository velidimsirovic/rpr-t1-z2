package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj){
        int suma = 0;
        while(broj != 0){
            suma = suma + broj % 10;
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Brojevi između 1 i n koji su djeljivi sa sumom svojih cifara su:");
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.print(i + " ");
        }
    }
}
