package pl.waw.sgh;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {


        int a[]=new int[16];  //declaration and instantiation
        a[0]=0;     //initialization
        a[1]=1;
        a[2]=a[0]+a[1];
        a[3]=a[1]+a[2];
        a[4]=a[2]+a[3];
        a[5]=a[3]+a[4];
        a[6]=a[4]+a[5];
        a[7]=a[5]+a[6];
        a[8]=a[6]+a[7];
        a[9]=a[7]+a[8];
        a[10]=a[8]+a[9];
        a[11]=a[9]+a[10];
        a[12]=a[10]+a[11];
        a[13]=a[11]+a[12];
        a[14]=a[12]+a[13];
        a[15]=a[13]+a[14];


        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);











            //number of elements to generate in a series
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci series upto: ");
        int m =scanner.nextInt();


            //int m = 100;

            //creating array


            long[] array = new long[m];

            //create first 2 series elements
            array[0] = 1;
            array[1] = 1;

            //create the Fibonacci series and store it in an array
            for(int i=2; i < m; i++){
                array[i] = array[i-1] + array[i-2];
            }

            //print the Fibonacci series numbers
            System.out.println("Fibonacci Series upto " + m);
            for (int i = 0; i < m; i++) {
                System.out.print(array[i] + " ");





            }
        }

    }
