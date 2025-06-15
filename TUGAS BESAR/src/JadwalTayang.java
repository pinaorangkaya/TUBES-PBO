public class JadwalTayang {
    Film film;
    Theater theater;
    String jamTayang;
    seats.Seats seats;

    public JadwalTayang(Film film, Theater theater, String jamTayang) {
        this.film = film;
        this.theater = theater;
        this.jamTayang = jamTayang;
        this.seats = new seats.Seats();
    }

    public Film getFilm() {
        return film;
    }

    public Theater getTheater() {
        return theater;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public seats.Seats getSeats() {
        return seats;
    }
}
