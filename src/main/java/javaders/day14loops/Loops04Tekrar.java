package javaders.day14loops;

import java.util.Scanner;

public class Loops04Tekrar {
    public static void main(String[] args) {
        //Kullanici username ve password'u girsin.(-)
        // 3 kereden fazla yanlis girerse"Your account was blocked" mesaji alsin
        // 3 kereye kadar yanlis girerse"Invalid username or password "mesaji alsin
        //Dogru girerse"Welcome to your account"mesaji alsin
        //        String validUserName = "techpro123";
        //        String validPassWord = "Education12?";

        Scanner input=new Scanner(System.in);
        int i=1;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";
        do{
            if (i==4){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Lutfen username giriniz");
            String u=input.next();
            System.out.println("Lutfen password giriniz");
            String p=input.next();
            i++;
            if (u.equals(validUserName) && p.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid username or password ");
                System.out.println((4-i) + " hakkiniz kaldi");
            }


        }while(true);


        /*
                Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String passWord = input.next();

            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + " right left");
            }
        }while(true);
         */
    }
}
