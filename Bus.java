public class Bus extends Kendaraan {

	@Override
	int biayaSewa(int lamaSewa) {
		return 1_000_000 * lamaSewa;
	}

    public Bus() {
        super(0,0,"XXX",KategoriKendaraan.BUS);
    }

    public Bus(int nomor, int tahunKeluaran, String kategori){
        super(nomor, tahunKeluaran, kategori, KategoriKendaraan.BUS);
      }
    
      public Bus(Bus b){
        super(b);
      }
}
