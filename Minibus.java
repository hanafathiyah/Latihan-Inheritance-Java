public class Minibus extends Kendaraan{

    @Override
    int biayaSewa(int lamaSewa) {
        // TODO Auto-generated method stub
        return lamaSewa * 500_000;
    }

    public Minibus() {
        super(0,0,"XXX",KategoriKendaraan.MINIBUS);
    }

    public Minibus(int nomor, int tahunKeluaran, String kategori){
        super(nomor, tahunKeluaran, kategori, KategoriKendaraan.MINIBUS);
      }
    
    public Minibus(Bus mb){
        super(mb);
    }

}
