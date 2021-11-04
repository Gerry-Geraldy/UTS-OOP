public class Anggota {
    Integer noAnggota;
    String namaAnggota;
    Integer telepon;
    String alamat;

    // fuction atau Method
    void melihatJadwal() {
        System.out.println(namaAnggota + " , jadwal anda:  ");
    }
    void melihatPekerjaan() {
        System.out.println(namaAnggota + "Pekerjaan anda:");
    }
    void melihatLaporan() {
        System.out.println(namaAnggota + "Silahkan melihat Laporan: "+noAnggota);
    }
    void melihatAnggota() {
        System.out.println("Nama-nama anggota yang sudah terdaftar:");
    }
    void melihatKegiatan(){
        System.out.println(namaAnggota + "Kegiatan anda hari ini: ");
    }
    
}