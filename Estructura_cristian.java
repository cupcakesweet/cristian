package com.mycompany.estructura_cristian;
import java.util.Scanner;
import java.io.*;

public class Estructura_cristian {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Inserte un numero: ");
        x = input.nextInt();
        if (x < 0)
            x=x*-1;
        System.out.println("El numero es: "+x);
    }
}
   
