import java.util.Scanner;
public class Tugas316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
 
        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;      
            int barangTerbanyak = -1; 
            int tokoTerbanyak = 0;
            String ringkasan = "";   
 
            int toko = 1;
            while (toko <= jumlahToko) {        
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);
 
                int totalBarangToko = 0;          
 
                for (int p = 1; p <= jumlahPelanggan; p++) { 
                    int barang;
                    do {
                        System.out.print("  Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Jumlah barang tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
 
                ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko + "\n";
 
                totalSemua += totalBarangToko;
                if (totalBarangToko > barangTerbanyak) {   
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
                toko++;
            }
 
            System.out.println();
            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
 