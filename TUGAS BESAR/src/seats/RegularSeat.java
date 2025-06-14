package seats;
class RegularSeat extends Seat{
    double harga;

    RegularSeat(String kode){
        super(kode);
        status = true;
        harga = 35000;
    }
}