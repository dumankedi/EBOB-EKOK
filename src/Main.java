import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi1,sayi2,ebob=0,ekok=0;
        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2=input.nextInt();
        if (sayi1 < sayi2) {
            for (int i = 1; i <=sayi1 ; i++) {
                if (sayi1%i == 0 &&sayi2%i==0) {
                    ebob=i;
                }
            }
            ekok=(sayi1*sayi2)/ebob;
            System.out.println("EKOK: "+ekok);
            System.out.println("EBOB: "+ebob);
        }
        else {
            for (int i = 1; i <=sayi2 ; i++) {
                if (sayi1%i == 0 && sayi2%i==0) {
                    ebob=i;
                }
            }
            ekok=(sayi1*sayi2)/ebob;
            System.out.println("EKOK: "+ekok);
            System.out.println("EBOB: "+ebob);
            }
        }
    }
