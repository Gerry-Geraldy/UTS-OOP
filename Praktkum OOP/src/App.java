public class App {
    public static void main(String[] args)
    {
        
    Anggota anggota1 = new Anggota();
    Ketua Ketua2 = new Ketua();
    KetuaPanitia Ketua3 = new KetuaPanitia();
    anggota1.namaAnggota = "Amel";
    anggota1.noAnggota =  42030071 ;
    Ketua2.namaAnggota = "Ayut";
    Ketua2.noAnggota = 42000000 ;
    Ketua2.periode = " 4 thn";
    Ketua3.namaAnggota = "Gerry";
    Ketua3.noAnggota = 42000000;
    Ketua3.periode = "4 bln";
        
        Ketua2.menyetujuiAnggaran();
        System.out.println("-----------------------");
        Ketua2.menyetujuiKegiatan();
        System.out.println("-----------------------");

        Ketua3.menyetujuiAnggaran();
        Ketua2.menyetujuiKegiatan();
    }
}