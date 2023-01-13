/*
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int bigger=Integer.MIN_VALUE;
        int introduced=0;
        int amount=6;
        boolean exit=false;
            for(int i=0;i<amount;i++){
                do{
                    try{
                        System.out.print("Ingrese un número: ");
                        introduced=Integer.parseInt(sc.nextLine());
                        exit=true;
                    }catch(NumberFormatException inp){
                        System.out.print("Dato mal ingresado, vuelva a ingresarlo: ");
                    }
                }while(!exit);
                if(introduced>bigger){
                    bigger=introduced;
                }
            }
            System.out.println("El número mas grande es: "+bigger);
            sc.close();
        }
       
      }