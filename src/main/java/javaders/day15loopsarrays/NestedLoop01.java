package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*
            1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        //Nested for-loop
        for(int i=1; i<3; i++){
            System.out.println("Week: "+i);

            for(int k=1;k<4;k++){
                System.out.println("Day: "+k);
            }
        }
        //nested while-loop
        int i=1;
        while(i<3){
            System.out.println("Week: "+i);
           int k=1;
           while(k<4){
               System.out.println("Day: "+k);
               k++;
           }
            i++;
        }
        // nested loop u genellikle for ile kullanirlar daha sade

        /*
          2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user

         */
        //turkcesi: For Loop Kullanarak Dikdörtgen Yıldız Desenini Yazdıran Bir Java Programı Yazma
        //Kullanıcıdan satır ve sütun sayısını al


        // 1 satirda 4 yildiz var aynindan 3 satir var buyuzden nested loop kullanmaliyiz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows=input.nextInt();
        System.out.println("Please enter number of columns");
        int columns=input.nextInt();

        for (int r=1;r<=rows;r++){
            for (int c=1; c<=columns;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
                */
        System.out.println("Please enter row number");
        int row=input.nextInt();

        for (int m=1; m<=row ; m++){
            for (int n=1; n<=m ;n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }










    }
}
