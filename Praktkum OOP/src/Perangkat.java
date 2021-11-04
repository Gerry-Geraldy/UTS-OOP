public class Perangkat extends Anggota{
    String periode;
    Integer tanggalMenjabat;
    Integer tanggalSelesai;
    void membuatLaporan() {
        System.out.println(super.namaAnggota + "Membuat Laporan");
    }

    void menghapusLaporan() {
        System.out.println(super.namaAnggota + "Menghapus Laporan");
    }
}