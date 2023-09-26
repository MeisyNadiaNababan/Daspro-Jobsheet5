import java.util.Scanner;
public class TugasJarak19{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan pilihan jarak: ");
    int jarak = input.nextInt();
    
    if (jarak<=5) {
        System.out.print("Anda menggunakan melee weapon");
    }
    else{
        System.out.print("Anda menggunakan ranged weapon");
        
    }
    }
} 