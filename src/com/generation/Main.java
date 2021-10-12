package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ciclos-Java
        //        CicloFor
       /* for (contador=0; contador<numero;contador++){
            //Código que se repite
        }*/

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Ingresa un número");
//        int numero=sc.nextInt();
//
//        for(int i=1;i<=10;i++){
//            System.out.println(numero+" x "+i+" = "+(numero*i));
//        }
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Ingresa un número y devolveré ese termino en la serie de Fibonacci");
//        int numero=sc.nextInt();
//
//        int n1=0;
//        int n2=1;
//        int n3=0;
//        System.out.println(n1);
//        System.out.println(n2);
//        for(int i=1;i<=numero;i++){
//            n3=n1+n2;
//            System.out.println(n3);
//            n1=n2;
//            n2=n3;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Adivina el número secreto. Ingresa un número");
//        int numero= sc.nextInt();
//        int numeroSecreto=20;
//
//        while(numero!=numeroSecreto){
//            System.out.println("Ese no es el número secreto. Ingresa otro número");
//            numero= sc.nextInt();
//        }
//        sc.close();
//        System.out.println("¡Felicidades adivinaste el número secreto!");

        //Ciclo do while
        /*do{
        }while(condicion)*/

//        Scanner sc = new Scanner(System.in);
//
//        int numero = 0;
//        int numeroSecreto = 33;
//
//        do {
//            System.out.println("Adivina el número secreto. Ingresa un número");
//            numero = sc.nextInt();
//        } while (numero != numeroSecreto);
//
//        sc.close();
//        System.out.println("¡" +
//                "Felicidades adivinaste el número secreto!");

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número y te daré su factorial");
        int numero=sc.nextInt();

        int i=1;
        int factorial=1;

        while(i<=numero){

            factorial=factorial*i;
            i =i+1;
        }
        sc.close();
       System.out.println("El factorial de "+numero+" es "+factorial);


    }
}