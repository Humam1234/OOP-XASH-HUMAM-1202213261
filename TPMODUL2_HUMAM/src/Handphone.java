public class Handphone extends Perangkat {
    boolean fingerprint;

    Handphone(String Nama,String drive,int RAM,float prosesor,boolean fingerprint){
        super(Nama,drive,RAM,prosesor);
        this.fingerprint=fingerprint;
    }
    void display(){
        super.display();
        System.out.println("FINGERPRINT :"+this.fingerprint);
    }
    void telepon(int no_hp1){
        System.out.println("oppo berhasil Menyambungkan telfon ke no  "+ no_hp1);
    }
    void sms(int no_hp1){
        System.out.println("Oppo berhasil mengirim Pesan Ke :"+no_hp1);
    }
    void sms(int no_hp1,int no_hp2){
        System.out.println("Handphone berhasil mengirim pesan ke No "+no_hp1 + " dan ke No "+no_hp2);
    }
}
