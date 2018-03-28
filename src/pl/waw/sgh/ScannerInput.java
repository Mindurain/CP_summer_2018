package pl.waw.sgh;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ScannerInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        //System.out.println("Please give your age: ");
        //int age =scanner.nextInt();
        int age = 0;
        System.out.println("Age: " + age);
        boolean succes = false;
        while (succes != true) ;  //while (!succes) {
        try {
            System.out.println("Please give your age: ");
            scanner = new Scanner(System.in);
            age = scanner.nextInt();
            succes = true;
        } catch (InputMismatchException ie) {
            System.out.println("Please try it again"); }
            System.out.println("Age: " + age);
        }



    }

