package enuzunpalindrome;

import java.util.Scanner;

public class Kronometre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac kez islem yapilacagini giriniz.");
        int numTasks = input.nextInt();


        long startTime = System.currentTimeMillis();// mili saniye olarak ani verir. baslangic zamanini alacagiz.
        System.out.println("*******************");
        for (int i = 0; i < numTasks; i++) {// kullanicinin verdigi yere kadar donsun
            int numbers[] = {1,2,3,4,5};
            int sum = 0;
            for (int number: numbers ) {//numbers'dan aldigi datayi number konteynirine ekler.
                sum+= number;// number'daki datayi sum'a ekler.

            }
            System.out.println("sum = " + sum);
            System.out.println("Islem "+( i+1)+ " tamamlandi");
            System.out.println("******************");

        }//fori
        long endTime = System.currentTimeMillis();

        long islemSuresi = endTime-startTime;
        System.out.println("*************************");
        System.out.println("islemSuresi = " + islemSuresi);
        System.out.println("OrtalamSure : "+ ((double)islemSuresi/numTasks) +" milisaniye");


    }
}
