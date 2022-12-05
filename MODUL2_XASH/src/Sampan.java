public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi, biaya);
        this.layar = layar;

    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah " +jumlahkursi + "Ditetapkan dengan biaya sebesar"+biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan");
    }
    @Override
    public void berlabuh(){
        System.out.println();
    }
    @Override
    public void berlabuh (int jangkar){
        System.out.println();
    }
}
