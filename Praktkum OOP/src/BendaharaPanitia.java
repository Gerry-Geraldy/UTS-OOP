public class BendaharaPanitia extends Panitia {
    
    //Method
    void menyetujuiAnggaran(){
        System.out.println(super.namaAnggota + "Menyetujui Anggaran"+ this.namaKegiatan);
    }
    void menyetujuiPekerjaan(){
        System.out.println(super.namaAnggota + "menyetujui pekerjaan "+ this.namaKegiatan);
    }
    void menyetujuiJadwal(){
        System.out.println(super.namaAnggota + "menyetujui jadwal"+ this.namaKegiatan);
    }
    void menyetujuiKegiatan(){
        System.out.println(super.namaAnggota + "menyutujui kegiatan"+ this.namaKegiatan);
    }
}
