import java.util.Scanner;
public class SistemEkspedisi{ 
public static void main(String[] args){
        String[] isi_barang = new String[100];
        
        Scanner ekspedisi = new Scanner(System.in);

        //Deklarasi
        String namaPenerima, pengirim, layanan, cari;
        int jumlah, jml=0;
        char jawab;
        double biaya=0;
        long no_hp;
        int maxPaket =15;
        int no_resi, almtTuju, index;
        //int [] nomorPaket = new int [maxPaket];
        //String [] tujuan = new String [maxPaket];
        //double [] beratPaket = new double [maxPaket];
        double [] berat = new double [20];
        //int jumlahPaket = 0;
        
        
        //output
 
        System.out.println("----------------");
            
        while (true){
            System.out.println("----------------------------------------");
            System.out.println("|           Menu :                     |");
            System.out.println("|   1. Buat Paket/Tambah Paket         |");
            System.out.println("|   2. Cari Paket                      |");
            System.out.println("|   3. Sorting Paket berdasarkan Nomor |");
            System.out.println("|   4. Keluar                          |");
            System.out.println("----------------------------------------");
            System.out.print("Pilih menu : ");
            int pilihan = ekspedisi.nextInt();

            switch (pilihan){
                case 1:
                        System.out.println("--Data Ekspedisi--");
                        System.out.print("Masukkan No. Resi: ");
                        no_resi = ekspedisi.nextInt();
                        System.out.print("Nama Pengirim: ");
                        pengirim = ekspedisi.next();
                       // int noCari []= new int [no_resi];
                    // System.out.print("Isi barang: ");
                        //isi_barang = ekspedisi.next();
                        do {
                            System.out.print("Isi barang :");
                            isi_barang[jml] = ekspedisi.next();
                            jml++;
                            System.out.print("Apakah anda ingin menambahkan barang (Y/T)?");
                            jawab = ekspedisi.next().charAt(0);
                        }while (jawab == 'Y' || jawab == 'y');
                        System.out.println("-----------------------------");
                        System.out.println("Berikut adalah isi barang yang akan dipaketkan : ");
                        for (int i=0; i<jml;i++){
                            System.out.println(isi_barang[i]);
                        }
                        System.out.println("Jumlah barang yang akan dikirimkan : " + jml);
                    // System.out.print("Jumlah barang: ");
                    // jumlah = ekspedisi.nextInt();
                        System.out.println("-----------------------------");
                        System.out.print("Masukkan No. HP customer: ");
                        no_hp = ekspedisi.nextLong();
                        System.out.print("Berat (kg): ");
                        berat [maxPaket]= ekspedisi.nextDouble();
                        System.out.println("Jenis Layanan (Reguler/Kargo/Hemat/SameDay)");
                        layanan = ekspedisi.next();
                        if(layanan.equalsIgnoreCase("Reguler")){
                                if(berat[maxPaket]<=1.0){
                                    biaya = 5000;
                                }else if(berat [maxPaket] <= 5.0){
                                    biaya = 10000;
                                }else if (berat[maxPaket] <= 10.0){
                                    biaya = 15000;
                                }else{
                                    biaya = 20000;
                                }
                            }else if (layanan.equalsIgnoreCase ("Kargo")){
                                if(berat[maxPaket]<=1.0){
                                    biaya = 13000;
                                }else if(berat[maxPaket]<=5.0){
                                    biaya = 18000;
                                }else if(berat[maxPaket]<=10){
                                    biaya = 25000;
                                }else{
                                    biaya = 50000;
                                }
                            }else if (layanan.equalsIgnoreCase ("Hemat")){
                                if(berat[maxPaket]<=1.0){
                                    biaya = 3000;
                                }else if(berat[maxPaket] <=5.0){
                                    biaya = 6000;
                                }else if(berat [maxPaket] <= 10.0){
                                    biaya = 10000;
                                }else{
                                    System.out.println("Anda tidak dapat menambahkan barang di atas 10kg");
                                }
                            }else if (layanan.equalsIgnoreCase ("SameDay")){
                                if(berat[maxPaket]<=1.0){
                                    biaya = 10000;
                                }else if(berat[maxPaket] <= 5.0){
                                    biaya = 20000;
                                }else if(berat[maxPaket] <= 10.0){
                                    biaya = 50000;
                                }else{
                                    biaya = 70000;
                                }
                            }
                            if (biaya !=0){
                                System.out.println("Biaya pengiriman: "+ biaya + " IDR");
                        System.out.println("Total Biaya: " +biaya);
                        System.out.print("Nama Penerima: ");
                        namaPenerima = ekspedisi.next();
                        System.out.print("Masukkan nomor HP penerima: ");
                        no_hp = ekspedisi.nextLong();
                        System.out.println("Alamat tujuan yang tersedia :");
                        System.out.println("1. Surabaya");
                        System.out.println("2. Malang");
                        System.out.println("3. Blitar");
                        System.out.println("4. Jakarta");
                        System.out.println("5. Bali");
                        System.out.println("6. Bandung");
                        System.out.println("7. Solo");
                        System.out.print("Pilih alamat tujuan Anda: ");
                        almtTuju = ekspedisi.nextInt();
                            switch (almtTuju) {
                                case 1:
                                System.out.println("Alamat tujuan: Surabaya");  
                                    break;
                                case 2:
                                System.out.println("Alamat tujuan: Malang");
                                    break;
                                case 3:
                                System.out.println("Alamat tujuan: Blitar");
                                    break;
                                case 4:
                                System.out.println("Alamat tujuan: Jakarta");
                                    break;
                                case 5:
                                System.out.println("Alamat tujuan: Bali");
                                    break;
                                case 6:
                                System.out.println("Alamat tujuan: Bandung");
                                    break;
                                case 7:
                                System.out.println("Alamat tujuan: Solo");
                                    break;
                                default:
                                System.out.println("Pilihan tidak valid");
                                    break;
                            }
                            System.out.println("Data Anda Telah Diproses");
                            System.out.println("--------------------");
                        }
                        // Buat variabel untuk menyimpan nomor resi
                  // String nomor_resi = "";

                   // Buat fungsi untuk generate nomor resi
                 //  Random random = new Random();
                 //  for (int i = 0; i < 10; i++) {
                 //  nomor_resi += random.nextInt(10);
                 //  }

                   // Tampilkan nomor resi
                 //  System.out.println("Nomor resi Anda adalah: " + nomor_resi);
                 //  System.out.println("--------------------");
                        // System.out.println("Nomor Paket : ");
                                //noCari[no_resi] = ekspedisi.nextInt();
                            // ekspedisi.nextLine(); // Membersihkan newline
                            // System.out.print("Tujuan: ");
                            // tujuan[jumlahPaket] = ekspedisi.nextLine();
                            // System.out.print("Berat (kg): ");
                            // beratPaket[jumlahPaket] = ekspedisi.nextDouble();
                                //jumlahPaket++;
                        break;

            case 2:
                String[] dataAlmt = {"Surabaya", "Malang", "Blitar", "Jakarta","Bali", "Bandung", "Solo",};  
                System.out.print("Masukkan alamat tujuan paket yang dicari: ");
                cari = ekspedisi.next();
                
                // Mencari data
                index = -1;
                for (int i = 0; i < dataAlmt.length; i++) {
                    if (dataAlmt[i].equalsIgnoreCase(cari)) {
                        index = i;
                        break;
                    }
                }

                // Menampilkan hasil pencarian
                if (index != -1) {
                    System.out.println("Alamat tujuan " + cari + " ditemukan pada indeks ke-" + index);
                } else {
                    System.out.println("Alamat tujuan " + cari + " tidak ditemukan");
                }

            
               // System.out.print("Masukkan nomor paket yang dicari: ");
                //int noCari [no_resi] = ekspedisi.nextInt();
                //int i = {noCari, almtTuju};
               // if (i != -1) {
              //      System.out.println("Paket ditemukan - Nomor Paket: " + noCari[i] + ", Tujuan: " + tujuan[indeks] );
              //  } else {
             //       System.out.println("Paket tidak ditemukan.");
            //    }
                break;

            case 3:
                // Sorting paket berdasarkan nomor secara sederhana
              //  for (int i = 0; i < jumlahPaket - 1; i++) {
              //      for (int j = 0; j < jumlahPaket - i - 1; j++) {
              //          if (no_resi[j] > no_resi[j + 1]) {
              //              // Tukar posisi
              //              int tempNomor = no_resi[j];
              //              no_resi[j] = no_resi[j + 1];
              //              no_resi[j + 1] = tempNomor;

              //              String tempTujuan = tujuan[j];
              //              tujuan[j] = tujuan[j + 1];
              //              tujuan[j + 1] = tempTujuan;

               //             double tempBerat = beratPaket[j];
               //             beratPaket[j] = beratPaket[j + 1];
               //             beratPaket[j + 1] = tempBerat;
              //          }
              //      }
              //  }

              //  System.out.println("Daftar Paket setelah pengurutan berdasarkan nomor:");
              //  for (int i = 0; i < jumlahPaket; i++) {
              //      System.out.println("Nomor Paket: " + no_resi[i] + ", Tujuan: " + tujuan[i] + ", Berat: " + beratPaket[i] + " kg");
              //  }
                break;

            case 4:
                System.out.println("Terima kasih!");
                System.exit(0);

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}

//public static int cariPaketByNomor(int[] nomorPaket, int jumlahPaket, int nomorCari) {
//    for (int i = 0; i < jumlahPaket; i++) {
//        if (nomorPaket[i] == nomorCari) {
//            return i;
//        }
//    }
//    return -1; // Paket tidak ditemukan
//}
            }
        




