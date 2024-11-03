import java.util.Scanner;

public class dizi_tek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Kaç elemanlı bir dizi gireceksiniz? ");
        int n = scanner.nextInt();

       
        int[] dizi = new int[n];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            dizi[i] = scanner.nextInt();
        }

     
        boolean tekSayiVar = false;
        System.out.println("Tek sayılar:");
        for (int sayi : dizi) {
            if (sayi % 2 != 0) {
                System.out.println(sayi);
                tekSayiVar = true;
            }
        }

       
        if (!tekSayiVar) {
            System.out.println("Tek sayı yoktur.");
        }

        scanner.close();
    }
}

