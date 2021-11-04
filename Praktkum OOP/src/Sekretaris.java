public class Sekretaris extends Perangkat {
    
    //Method
    void membuatPekerjaan() {
        System.out.println(super.namaAnggota + "Membuat Pekerjaan" + this.tanggalMenjabat);
    }

    void menghapusPekerjaan() {
        System.out.println(super.namaAnggota + "Menghapus Pekerjaan" + this.tanggalSelesai);
    }

    void membuatJadwal() {
        System.out.println(super.namaAnggota + "Membuat Jadwal");
    }

    void menghapusJadwal() {
        System.out.println(super.namaAnggota + "Menghapus Jadwal");
    }

    void menambahAnggota() {
        System.out.println(super.namaAnggota + "Menambah Anggota" + super.noAnggota);
    }

    void menghapusAnggota() {
        System.out.println(super.namaAnggota + "Menghapus Anggota"+ this.noAnggota);
    }

    void menambahKegiatan() {
        System.out.println(super.namaAnggota + "Menambah Kegiatan");
    }

    void menghapusKegiatan() {
        System.out.println(super.namaAnggota + "Menghapus Kegiatan");
    }
}
