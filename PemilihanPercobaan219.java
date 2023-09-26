import java.util.Scanner;
public class PemilihanPercobaan219{

    public static void main (String[] args){
        Scanner input19 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input19.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input19.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input19.nextFloat();
        System.out.print("Nilai tugas   :");
        float tugas = input19.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F );
        String message = total < 65 ? "Remidi" : "Tidak remidi ";
        System.out.println("Nilai akhir = " +total+" sehingga "+ message);

        if (total >= 100) {
        System.out.println("Kualifikasi nilai sangat baik dengan predikit 'A' ");
        } else if (total <=73) {
        System.out.println("Kualifikasi nilai lebih dari baik dengan predikat 'B+' ");
        } else if (total >=65) {
        System.out.println("Kualifikasi nilai baik dengan predikat 'B' ");  
        } else if (total >=60) {
        System.out.println("Kualifikasi nilai lebih dari cukup dengan predikat 'C+' ");
        } else if (total >=50) {
        System.out.println("Kualifikasi nilai cukup dengan predikat 'C' ");
        } else if (total >=39) {
        System.out.println("Kualifikasi nilai kurang dengan predikat 'D' ");
        } else if (total <=39) {
        System.out.println("Kualifikasi nilai lebih dari kurang dengan predikat 'E' ");
        }

        }
        }
