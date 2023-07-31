import java.util.Scanner;



public class BesEkle {

    public static void islemYap(int sayi) {
        System.out.print(sayi+" ");

        if (sayi <= 0) {
            return;
        }

        islemYap(sayi - 5);
        System.out.print(sayi +" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        islemYap(sayi);
    }
}
