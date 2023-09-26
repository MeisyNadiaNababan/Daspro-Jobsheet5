import java.util.Scanner;
public class PemilihanPercobaan119 {
    
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka = input19.nextInt();

        int nomor = 10;

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka ini adalah " + hasil);
        


    }
}