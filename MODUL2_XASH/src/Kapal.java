public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi, biaya);
        this.mesin = mesin;

    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah " +jumlahkursi + "Ditetapkan dengan biaya sebesar"+biaya);
    }
    @Override
    public void berlayar(){
        System.out.println();
    }
    @Override
    public void berlayar(int kecepatan){
        System.out.println();
    }
    @Override
    public void berlabuh(){
        System.out.println();
}
