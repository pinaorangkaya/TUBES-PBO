package seats;
import java.util.ArrayList;

public class Seats {
    ArrayList<Seat> seats = new ArrayList<>();

    public Seats() {
        for (char baris = 'A'; baris <= 'J'; baris++) {         
            for (int kolom = 1; kolom <= 10; kolom++) {   
                if (kolom == 3){
                    String kode = baris + Integer.toString(kolom);  
                    seats.add(new VipSeat(kode));
                } else {
                    String kode = baris + Integer.toString(kolom);  
                    seats.add(new RegularSeat(kode));
                }     
                
            }
        }
    }

    void showSeat() {
        for (int i = 0; i < seats.size(); i++) {
            if(i % 10 == 5){
                System.out.print("   ");
            }
           Seat s = seats.get(i);
            if (s.status) {
                System.out.print(s.kode + " ");
            } else {
                System.out.print("-- ");
            }

            if ((i + 1) % 10 == 0) System.out.println();
        }
        System.out.println("_________________________________");
        System.out.println("              layar              ");
    } 

    void pesanSeat(String seat){
        for(Seat s : seats){
            if(s.kode.equalsIgnoreCase(seat)){
                if(!s.status){
                    System.out.println("kursi sudah dipesan!");
                }

                s.status = false;
                System.out.println("kursi berhasil dipesan!");
                return;
            }
        }
        System.out.println("kursi tidak ditemukan");
    }
}
