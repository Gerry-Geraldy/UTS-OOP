public class Ketua extends Perangkat {
    
    //method
    void menyetujuiAnggaran() {
        System.out.println(super.namaAnggota + " no " + super.noAnggota +" Dengan Periode " + this.periode);
    }

    void menyetujuiPekerjaan() {
        System.out.println(super.namaAnggota +"Menyetujui Pekerjaan Periode " + this.periode);
    }

    void menyetujuiJadwal() {
        System.out.println( super.namaAnggota +"Menyetujui Jadwal ");
    }

    void menyetujuiKegiatan() {
        System.out.println(super.namaAnggota +"Menyetujui Kegiatan ");
    }
}
