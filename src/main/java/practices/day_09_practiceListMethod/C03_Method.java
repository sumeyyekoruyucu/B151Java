package practices.day_09_practiceListMethod;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {

    public static void main(String[] args) {

   /*
   kullanıcıdan bir cumle sisteme girmesini isteyiniz.
   method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
  */

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir cumle giriniz");
        String cumle= scan.nextLine();;

        String arr[]=cumle.split("");

        System.out.println(Arrays.toString(arr));

        sesliharfleryazdir(arr);

    }

       public static void sesliharfleryazdir(String[] arr) {

           for (int i = 0; i < arr.length; i++) {

               if (arr[i].equalsIgnoreCase("a")
               || arr[i].equalsIgnoreCase("e")
               || arr[i].equalsIgnoreCase("i")
               || arr[i].equalsIgnoreCase("o")
               || arr[i].equalsIgnoreCase("u")){

                   System.out.println(arr[i]);
               }

           }
           //method olusturmadan da aynisi olur for dongusunu main icine at aynisi



    }
}
