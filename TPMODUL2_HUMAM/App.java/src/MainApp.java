public class MainApp {
    public static void main(String[] args) throws Exception {
        Laptop toshiba = new Laptop("Toshiba", "Windows 11", 8, 2, true);
        Handphone oppo = new Handphone("OPPO","Android",3,2,true);
       
        toshiba.display();
        toshiba.game("PUBG");
        toshiba.email("muhammadhumam@gmail.com");
        toshiba.email("muhammadhumam@gmail.com", "akuhumam@gmail.com");
        
        oppo.display();
        oppo.telepon(822572237);
        oppo.sms(8224521);
        oppo.sms(8522541, 8527736);

        
    }
}
