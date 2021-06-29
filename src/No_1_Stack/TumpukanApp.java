package No_1_Stack;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan = new Tumpukan (5);
        tumpukan.push(1);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long nilai1 = tumpukan.peek();
        System.out.println("nilai teratas = " +nilai1+" nilai");
        System.out.println("Nama saya adalah Lusi yustika Rachman");
        long nilai2 = tumpukan.pop();
        System.out.println("yang dihapus = " + nilai2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
    }
    
}
