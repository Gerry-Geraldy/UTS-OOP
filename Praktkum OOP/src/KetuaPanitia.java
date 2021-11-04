public class KetuaPanitia extends Panitia{
    //Method

    public String periode;

    void menyetujuiAnggaran() {
        System.out.println(super.namaAnggota +" Menyetujui Anggaran: " + super.noAnggota + " selama " + this.periode);
    }

    void menyetujuiPekerjaan() {
        System.out.println(super.namaAnggota +"Menyetujui Pekerjaan"+this.namaKegiatan);
    }

    void menyetujuiJadwal() {
        System.out.println(super.namaAnggota +"Menyetujui Jadwal"+this.namaKegiatan);
    }
}
