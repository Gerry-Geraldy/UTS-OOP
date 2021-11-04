public class Panitia extends Anggota {
    String namaKegiatan;
    String periode;

    //Method
    @Override
    void melihatLaporan() {
        System.out.println("Melihat Laporan");
    }
    @Override
    void melihatJadwal() {
        System.out.println("Melihat Jadwal");
    }

    void melihatAnggaran() {
        System.out.println("Melihat Anggaran");
    }


}
