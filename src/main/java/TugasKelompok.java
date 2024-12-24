/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Advin Rabel
 */
import java.util.Scanner;
public class TugasKelompok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] sbkl = new String [4];
        sbkl [0] = "Pemeriksaan kondisi mesin";
        sbkl [1] = "Pemeriksaan kondisi rem";
        sbkl [2] = "Pemeriksaan kondisi oli mesin";
        sbkl [3] = "Pemeriksaan kondisi ban";
        
        String[] hrgsbkl = {"Rp.40000", "Rp.25000", "Rp.35000", "Rp.15000"};
        
        String[] sb = new String[5];
        sb [0] = "Pemeriksaan sistem bahan bakar";
        sb [1] = "Pemeriksaan sistem pendingin";
        sb [2] = "Pemeriksaan aki";
        sb [3] = "Penggantian oli mesin dan filter oli";
        sb [4] = "Penggantian filter udara";
              
        String[] part = new String [3];
        part [0] = "Penggantian kampas rem";
        part [1] = "Penggantian aki";
        part [2] = "Penggantian V belt";
        
        String[] tu = new String[4];
        tu [0] = "Pengecekan tekanan ban";
        tu [1] = "Pengecekan kondisi rantai";
        tu [2] = "Pengecekan radiator";
        tu [3] = "Pengecekan lampu";
        
        String[] go = new String[2];
        go [0] = "Repsol Moto 4T 10w30";
        go [1] = "Motul Scooter LE 10w30";
        
        String srvs, lyn;
        int hrg;
        
        System.out.println("Pilih kategori Layanan:");
        System.out.println("1. Servis berkala");
        System.out.println("2. Servis besar");
        System.out.println("3. Ganti oli");
        System.out.println("4. Pengantian sparepart");
        System.out.println("5. Tune-up");
        System.out.print("Masukkan pilihan (1 sampai 5): ");
        int kategori = inp.nextInt(); // Input kategori
        
        switch (kategori) {
            case 1: 
                System.out.println("\n===Pilih menu pelayanan===");
                lyn = "Servis berkala";
                for (int i = 0; i < 4; i++) {
                    System.out.println((i + 1) + ". " + sbkl[i]);
                }
                System.out.println("Harga Jasa dikenakan biaya = Rp.350.000");
                System.out.println("Anda ingin melanjutakan \n[1] Ya \n[2] Tidak");
                System.out.print("Masukkan pilihan : ");
                int berkala = inp.nextInt(); 
                
                switch (berkala) {
                    case 1:
                        srvs = "Pemeriksaan kondisi mesin, rem, oli mesin, dan ban";
                        hrg = 350000;
                        break;
                    default:
                        srvs = "Pilihan tidak Valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                break;
                
            case 2: // Kategori Minuman
                System.out.println("\n-----Pilih menu pelayanan-----");
                lyn = "Servis besar";
                for (int i = 0; i < 5; i++) {
                    System.out.println((i + 1) + ". " + sb[i]);
                }
                System.out.print("Masukkan pilihan 1 ~ 5 : ");
                int besar = inp.nextInt(); // Input pilihan minuman
                
                switch (besar) {
                    case 1:
                        srvs = "Pemeriksaan sistem bahan bakar";
                        hrg = 150000;
                        break;
                    case 2:
                        srvs = "Pemeriksaan sistem pendingin";
                        hrg = 100000;
                        break;
                   case 3:
                        srvs = "Pemeriksaan aki";
                        hrg = 65000;
                        break;
                   case 4:
                        srvs = "Penggantian oli mesin dan filter oli";
                        hrg = 125000;
                        break;
                   case 5:
                        srvs = "Penggantian filter udara";
                        hrg = 100000;
                        break;
                    default:
                        srvs = "Pilihan tidak valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                break;
                
            case 3: // Kategori Minuman
                System.out.println("Pilih pelayanan : ");
                lyn = "Ganti Oli";
                for (int i = 0; i < 2; i++) {
                    System.out.println((i + 1) + ". " + go[i]);
                }
                System.out.print("Masukkan pilihan (1-2): ");
                int oli = inp.nextInt(); // Input pilihan minuman
                
                switch (oli) {
                    case 1:
                        srvs = "Repsol Moto 4T 10w30";
                        hrg = 40000;
                        break;
                    case 2:
                        srvs = "Motul Scooter LE 10w30";
                        hrg = 70000;
                        break;
                    default:
                        srvs = "Pilihan tidak valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                break;    
                
            case 4: // Kategori Minuman
                System.out.println("Pilih pelayanan : ");
                lyn = "Spare Part";
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ". " + part[i]);
                }
                System.out.print("Masukkan pilihan (1-3): ");
                int prt = inp.nextInt(); // Input pilihan minuman
                
                switch (prt) {
                    case 1:
                        srvs = "Penggantian kampas rem";
                        hrg = 40000;
                        break;
                    case 2:
                        srvs = "Penggantian aki";;
                        hrg = 40000;
                        break;
                    case 3:
                        srvs = "Penggantian V belt";
                        hrg = 40000;
                        break;
                    default:
                        srvs = "Pilihan tidak valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                break;
                
                
            case 5: // Kategori Minuman
                System.out.println("Pilih pelayanan : ");
                lyn = "Servis besar";
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ". " + tu[i]);
                }
                System.out.print("Masukkan pilihan (1-3): ");
                int tun = inp.nextInt(); // Input pilihan minuman
                
                switch (tun) {
                    case 1:
                        srvs = "Pengecekan tekanan ban";
                        hrg = 40000;
                        break;
                    case 2:
                        srvs = "Pengecekan kondisi rantai";
                        hrg = 40000;
                        break;
                    case 3:
                        srvs = "Pengecekan radiator";
                        hrg = 40000;
                        break;
                    case 4:
                        srvs = "Pengecekan lampu";
                        hrg = 40000;
                        break;
                    default:
                        srvs = "Pilihan tidak valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                break;
                
            default:
                lyn = "Tidak tersedia";
                srvs = "-";
                hrg = 0;
                System.out.println("Kategori tidak valid");
        }
          System.out.println("\n===Data Pelayanan===");
          System.out.println("Jasa Layanan : " + lyn);
          System.out.println("Service : " + srvs);
          System.out.println("Merek Motor : ");
          System.out.println("Harga : " + hrg);
          System.out.println("Jumlah beli : ");
          System.out.println("Jenis Pembayaran : ");
          System.out.println("Diskon : ");
          System.out.println("Harga Total : ");
          System.out.println("Bonus : ");
    }
}
