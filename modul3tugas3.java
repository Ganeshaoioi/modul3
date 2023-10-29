import java.util.Calendar;
import java.util.Scanner;

public class modul3tugas3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Mendapatkan tahun kelahiran dari pengguna
        System.out.print("Masukkan tahun kelahiran anda: ");
        int tahunKelahiran = input.nextInt();

        // Mendapatkan tahun sekarang
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);

        // Menghitung umur
        int umur = tahunSekarang - tahunKelahiran;

        // Menampilkan hasil
        System.out.println("Umur Anda adalah: " + umur + " tahun");

        // Menutup objek Scanner
        input.close();
    }
}