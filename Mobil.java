public class Mobil extends Kendaraan {
  public Mobil(){
    super(0, 0, "XXX", KategoriKendaraan.MOBIL);
  }
  
  public Mobil(int nomor, int tahunKeluaran, String kategori){
    super(nomor, tahunKeluaran, kategori, KategoriKendaraan.MOBIL);
  }

  public Mobil(Mobil m){
    super(m);
  }

  @Override
  int biayaSewa(int lamaSewa) {
      return 500_000 * lamaSewa;
  }
}