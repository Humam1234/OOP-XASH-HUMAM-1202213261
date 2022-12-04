public class Perangkat {
    String drive;
    int RAM;
    float prosesor;
    String Nama;

    
    Perangkat(String Nama,String drive,int RAM,float prosesor){

        this.drive=drive;
        this.RAM=RAM;
        this.prosesor=prosesor;
        this.Nama = Nama;
    }
    void display(){
        System.out.println("Informasi Gadget kamu :");
        System.out.println(this.Nama);
        System.out.println(this.RAM+"GB");
        System.out.println(this.prosesor+"Ghz");
        System.out.println(this.drive);
    }
    void informasi(){
        System.out.println();
    }
}
