public class Main {
  public static void main(String[] args) {
    try{
        KoleksiKendaraan kk1 = new KoleksiKendaraan();
        KoleksiKendaraan kk2 = new KoleksiKendaraan(10);

        kk1.insertKendaraan(new Mobil(2,2002,"Mobil Bebek"));
        kk1.insertKendaraan(new Mobil(100,2022,"Mobil Hana"));
        kk1.insertKendaraan(new Mobil(32,2030,"Mobil Bayu"));

        kk2.insertKendaraan(new Bus(1, 100, "Damri"));
        kk2.insertKendaraan(new Minibus(3, 2099, "Mobil Alien"));
        kk2.insertKendaraan(new Mobil(4, 2045, "Mobil Abad Kejayaan"));
        
        kk1.printAll();
        kk2.printAll();
        
        KoleksiKendaraan cp = new KoleksiKendaraan(kk2);
        cp.insertKendaraan(kk1);
        cp.printAll();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}