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
        
        
        String[] sb = new String[5];
        sb [0] = "Pembersihan CVT";
        sb [1] = "Penggantian Oli Gardan";
        sb [2] = "Penggantian Oli Mesin";
        sb [3] = "Filter Udara K16";
              
        String[] part = new String [3];
        part [0] = "Penggantian kampas rem";
        part [1] = "Penggantian aki";
        part [2] = "Penggantian V belt";
        
        String[] tu = new String[4];
        tu [0] = "Pengecekan Karburator atau Injektor";
        tu [1] = "Pengecekan Busi dan Filter Udara";
        tu [2] = "Pengecekan Sistem Pengapian dan Pendinginan";
        
        String[] go = new String[2];
        go [0] = "Repsol Moto 4T 10w30";
        go [1] = "Motul Scooter LE 10w30";
        
        String srvs = null, lyn;
        int hrg = 0, berkala = 0,lanjutan = 0,lanjutan1 = 0,lanjutan2 = 0,n1,jmlh = 1, hrg1=350000;
        int srvs1 = 0, srvs2 = 0, srvs3 = 0;
        double total;
        
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
                //INPUTAN SERVIS BERKALA
                System.out.println("Harga Jasa dikenakan biaya = Rp.350.000");
                System.out.println("Anda ingin melanjutakan \n[1] Ya \n[2] Tidak");
                System.out.print("Masukkan pilihan : ");
                berkala = inp.nextInt();
                System.out.println("\n-----Penggantian rem-----\n[1] Ya \n[2] Tidak");
                lanjutan = inp.nextInt();
                System.out.println("\n-----Penggantian Ban-----\n[1] Ya \n[2] Tidak");
                lanjutan1 = inp.nextInt();
                System.out.println("\n-----Penggantian Oli-----\n[1] Ya \n[2] Tidak");
                lanjutan2 = inp.nextInt();
                
                switch (berkala) { //PROGRAM SERVIS BERKALA
                    case 1:
                        srvs = "Pemeriksaan kondisi mesin, rem, oli mesin, dan ban";
                        hrg = hrg + 350000;
                        break;
                    default:
                        srvs = "Pilihan tidak Valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                switch (lanjutan){ 
                    case 1:
                        srvs = "Penggantian rem";
                        hrg = hrg + 40000;
                        break;
                    case 2 :
                        hrg = hrg + 0;
                        break;
                    default:
                        srvs = "Pilihan tidak Valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                switch (lanjutan1){
                    case 1:
                        srvs = "Penggantian Ban";
                        hrg = hrg + 400000;
                        break;
                    case 2 :
                        hrg = hrg + 0;
                        break;
                    default:
                        srvs = "Pilihan tidak Valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                 switch (lanjutan2){
                    case 1:
                        srvs = "Penggantian Oli";
                        hrg = hrg + 70000;
                        break;
                    case 2 :
                        hrg = hrg + 0;
                        break;
                    default:
                        srvs = "Pilihan tidak Valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                
                break;
                
            case 2:
                System.out.println("\n-----Pilih menu pelayanan-----");
                lyn = "Penggantian Filter";
                for (int i = 0; i < 4; i++) {
                    System.out.println((i + 1) + ". " + sb[i]);
                }
                System.out.println("Anda ingin melanjutakan \n[1] Ya \n[2] Tidak");
                System.out.print("Masukkan pilihan : ");
                int besar = inp.nextInt();
                System.out.println("\n-----Apakah ingin Mengganti Filter Udara-----\n[1] Ya \n[2] Tidak");
                n1 = inp.nextInt();
                
                switch (besar) {
                    case 1:
                        srvs = "Pembersihan CVT, Penggantian Oli Gardan, Penggantian Oli Mesin,";
                        hrg = hrg + 150000;
                        break;
                    default:
                        srvs = "Pilihan tidak Valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                switch (n1) {
                    case 1:
                        srvs = "Penggantian filter udara";
                        hrg = hrg + 100000;
                        break;
                    case 2 :
                        hrg = hrg + 0;
                    default:
                        srvs = "Pilihan tidak valid";
                        hrg = 0;
                        System.out.println("Pilihan tidak valid");
                }
                break;
                
            case 3:
                System.out.println("Pilih Produk : ");
                lyn = "Ganti Oli";
                for (int i = 0; i < 2; i++) {
                    System.out.println((i + 1) + ". " + go[i]);
                }
                System.out.print("Masukkan pilihan (1-2): ");
                int oli = inp.nextInt();
                System.out.print("Jumlah : "); jmlh = inp.nextInt();
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
                
            case 4: //
                System.out.println("Pilih pelayanan : ");
                lyn = "Spare Part";
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ". " + part[i]);
                }
                System.out.print("Masukkan pilihan (1-3): ");
                int prt = inp.nextInt();
                switch (prt) {
                    case 1:
                        System.out.print("Jumlah : "); jmlh = inp.nextInt();
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
                
                
            case 5:
                System.out.println("Pilih pelayanan : ");
                lyn = "Servis besar";
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + ". " + tu[i]);
                }
                System.out.println("Anda ingin melanjutakan \n[1] Ya \n[2] Tidak");
                System.out.print("Masukkan pilihan : ");
                int tun = inp.nextInt();
                
                switch (tun) {
                    case 1:
                        srvs = "Pengecekan Karburator atau Injektor, Pengecekan Busi dan Filter Udara\n        : Pengecekan Sistem Pengapian dan Pendinginan ";
                        hrg = 1000000;
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
        
          total = hrg * jmlh + 20000;
        
          System.out.println("\n===Data Pelayanan===");
          System.out.println(lyn + " : " + hrg1);
          System.out.println("Service : " + srvs);
          
          if (lanjutan < lanjutan1){
                            
                    if (lanjutan < lanjutan2){
                  System.out.println("servis : " + srvs1);    
                    }
                    else if (lanjutan == lanjutan2){
                        System.out.println("servis : " + srvs1 + ", " + srvs3);
                    }
                    else{
                        System.out.println("sevis : " + srvs3);
                    }
                    
                }
                
                else if (lanjutan == lanjutan1){
                    if (lanjutan1 == lanjutan2){
                        System.out.println("sistem : " + srvs1 + ", " + srvs2 + ", " + srvs3);
                    }
                    else {
                        System.out.println("servis : " + srvs1 + ", " + srvs2);
                    }
                }
                
                
                else{
                  if (lanjutan1 < lanjutan2){
                      System.out.println("servis : " + srvs2);
                  }
                  else if (lanjutan1 == lanjutan2){
                      System.out.println("servis : " + srvs2 + ", " + srvs3);
                  }
                  else {
                      System.out.println("servis : " + srvs3);
                  }
                }
          
          System.out.println("Merek Motor : ");
          System.out.println("Harga : " + hrg);
          System.out.println("Jumlah beli : ");
          System.out.println("Jenis Pembayaran : ");
          System.out.println("Diskon : ");
          System.out.println("Harga Total : " + total);
          System.out.println("Bonus : ");
    }
}
