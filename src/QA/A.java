package QA;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class A {
    public static void main(String[] args) {   // №1
 Scanner a = new Scanner(System.in);
 System.out.println("Введите имя");
 String v = a.nextLine();
 System.out.println("Здравствуйте, " + v);
 }}

/**public static void main(String[] args) {    //№2
 for (int i = args.length - 1; i >= 0; i--) {
 System.out.println(args[i]);
 }
 }**/

    /**
     * public static void main(String[] args) {   //№3
     * int x;
     * for (int i = 0; i < 15; i++) {
     * x = ThreadLocalRandom.current().nextInt(-20, 35);
     * System.out.print( x+ "\n" + " " );
     * }
     * }
     **/
    /**public static void main(String[] args) {     //№4
        String a = "Тест1";
        System.out.println("Введите пароль");
        Scanner b = new Scanner(System.in);
        String v = b.nextLine();

        do {
            System.out.println("Пароль '" + v + "' неправельный");
            Scanner k= new Scanner(System.in);
            v =null;
            v = b.nextLine();
        }
        while (!v.equals(a));
        System.out.println("Добро пожаловать!");
    }}**/

    /**public static void main(String[] args) {   //№5
        int sum=0;
        int sum1=0;
        for (int i = 0; i < args.length; i++) {
            sum+= Integer.parseInt(args[i]);
            sum*= Integer.parseInt(args[i]);
        System.out.println("args = " + sum);}

        System.out.println(sum);
        System.out.println(sum1);
    }}**/

    /**public static void main(String[] args) {     //6.1
        int[]b= new int[] {1,30,3,4,5,6,7,-5,9,10,11,230,13,14,15,16,17,18,19,20,81};
        /**for (int z: b) {
            if (z%2==0) {
                System.out.println("z= "+ z);
            }
        else{
                System.out.println("-z= "+ z);}
        }}}**/

        /**int max=0;                               //6.2
        for (int z: b) {
            if (z >= max);
            max=z;
        }
            System.out.println(max);
        } }**/

        /**for (int z: b) {                           //6.3
            if (z%3.0==0) {
                System.out.println("z= "+ z);
            }
            for (int z1: b) {
                if  (z1%9.0==0){
                System.out.println("z1= "+ z);}
        }}}}**/

        /**for (int z: b) {                               //6.4
            if (z%5.0==0) {
                System.out.println("z= "+ z);
            }
            else if (z%7.0==0) {
                    System.out.println("z1= "+ z);}
            }}}**/








