public class Laptop extends Perangkat {
    boolean webcam;

    Laptop(String Nama,String drive,int RAM,float prosesor,boolean webcam){
        super(Nama,drive,RAM,prosesor);
        this.webcam=webcam;
    }
    void display(){
        super.display();
        System.out.println("Webcam :"+this.webcam);
    }
    void game(String nama_game){
        System.out.println(this.Nama +" Berhasil Membuka Game "+ nama_game);

    }
    void email(String email1){
        System.out.println("Toshiba Berhasil Mengirim Email Ke :"+email1);
    }
    public void email(String email1, String email2){
        System.out.println("Toshiba berhasil Mengirim Email ke "+email1+" dan ke "+email2);
    }
}
