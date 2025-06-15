import seats.*;

public class Theater {
    String no;
    Seats seats;
    Film film;

    Theater(String no, Film film){
        this.no = no;
        this.seats = new Seats();
        this.film = film;
    }
}
