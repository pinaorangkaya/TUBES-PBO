package seats;
import java.util.ArrayList;

abstract class Seat{
    String kode;
    boolean status;

    Seat(String kode){
        this.kode = kode;
        status = true;
    }
}




