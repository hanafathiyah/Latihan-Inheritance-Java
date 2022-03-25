class KoleksiKendaraan {
    private Kendaraan[] data;    
    private int size;
    private int Neff;

    public KoleksiKendaraan() {
        this.size = 100;
        this.Neff = 0;
        this.data = new Kendaraan[size] ;
    } 
    
    public KoleksiKendaraan(int size) {
        this.size = size;
        this.Neff = 0;
        this.data = new Kendaraan[size] ;
    }

    public KoleksiKendaraan(KoleksiKendaraan kk) throws Exception {
        this.size = kk.size;
        this.Neff = 0;
        this.data = new Kendaraan[kk.size];

        for(int i = 0; i < kk.Neff; i++) {
          this.insertKendaraan(kk.data[i]);
        }
    }
    
    public int getSize() {
        return this.size;
    }

    public int getNeff() {
        return this.Neff;
    }
    
    public void printAll() {
        for (int i = 0; i < this.Neff; i++) {
            this.data[i].printInfo();
            System.out.println("");
        }
    }

    public void insertKendaraan(Kendaraan k) throws Exception {
        if(this.size == this.Neff){
          throw new Exception("Mohon maaf, kendaraan sudah penuh");
        } else {
            this.data[this.Neff] = k;
            this.Neff ++;
        }
    }
    
    public void insertKendaraan(KoleksiKendaraan k) throws Exception {
      if(this.Neff + k.Neff > this.size) {
        throw new Exception("Mohon maaf, kendaraan sudah penuh");
      }else{
        for(int i = 0; i < k.Neff; i++) {
          this.insertKendaraan(k.data[i]);
        }
      }
    }
}