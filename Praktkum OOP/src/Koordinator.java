public class Koordinator extends Panitia {
    //Method
    void membuatLaporan() {
        System.out.println(super.namaAnggota +"Membuat Laporan"+ this.namaKegiatan);
    }

    void menghapusLaporan() {
        System.out.println(super.namaAnggota +"Menghapus Laporan" +this.namaKegiatan);
    }

    void membuatPekerjaan() {
        System.out.println(super.namaAnggota +"Membuat Pekerjaan" +this.namaKegiatan);
    }

    void menghapusPekerjaan() {
        System.out.println("Menghapus Pekerjaan"+ this.namaKegiatan);
    }

    void membuatJadwal() {
        System.out.println("Membuat Jadwal"+ this.namaKegiatan);
    }

    void menghapusJadwal() {
        System.out.println("Menghapus Jadwal"+ this.namaKegiatan);
    }
}
