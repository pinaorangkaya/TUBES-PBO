import seats.*;

public class Film {
    String judul;
    String genre;
    String no;
    Seats seats;

    Film(String judul, String genre, String no){
        this.judul = judul;
        this.genre = genre;
        this.no = no;
        this.seats = new Seats();
    }
}
