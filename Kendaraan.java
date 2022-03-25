public abstract class Kendaraan {
    private int nomor;
    private int tahunkeluaran;
    private String merk;
    private KategoriKendaraan kategori;
    
    public Kendaraan() {
        this.nomor = 0;
        this.tahunkeluaran = 0;
        this.merk = "XXX";
        this.kategori = KategoriKendaraan.MOBIL;
    }
    
    public Kendaraan(int nomor, int tahunKeluaran, String merk, KategoriKendaraan kategori){
      this.nomor = nomor;
      this.tahunkeluaran = tahunKeluaran;
      this.merk = merk;
      this.kategori = kategori;
    }

    public Kendaraan(Kendaraan k){
      this.nomor = k.nomor;
      this.tahunkeluaran = k.tahunkeluaran;
      this.merk = k.merk;
      this.kategori = k.kategori;
    }

    public void printInfo() {
        System.out.println("NOMOR: "+ this.nomor);
        System.out.println("TAHUN KELUARAN: "+ this.tahunkeluaran);
        System.out.println("MERK: "+ this.merk);
        switch(this.kategori){
          case BUS:
            System.out.println("KATEGORI: BUS");
            break;   
          case MINIBUS:
            System.out.println("KATEGORI: MINIBUS");
            break;   
          case MOBIL:
            System.out.println("KATEGORI: MOBIL");
            break;   
        }
    }

    abstract int biayaSewa(int lamaSewa);
}