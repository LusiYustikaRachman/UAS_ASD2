package No_2_Queue;
public class AntrianApp {
    public static void main(String[] args){
        Antrian antrian = new Antrian(5);
        antrian.masuk(1);
        antrian.lihat();
        System.out.println("");
        antrian.masuk(60);
        antrian.lihat();
        System.out.println("");
        System.out.println("nilai yang paling depan = "+antrian.peekDepan());
        System.out.println("Nama saya adalah Lusi yustika Rachman");
        System.out.println("");
        antrian.masuk(70);
        antrian.lihat();
        System.out.println("");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
        System.out.println("");
        System.out.println("nilai yang paling depan = "+antrian.peekDepan());
        antrian.lihat();
    }

}
