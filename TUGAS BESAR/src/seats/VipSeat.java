package seats;
class VipSeat extends Seat{
    double harga;

    VipSeat(String kode){
        super(kode);
        status = true;
        harga = 65000;
    }
}