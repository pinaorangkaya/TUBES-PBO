import java.util.*;

public class Bioskop {
    static ArrayList<Film> daftarFilm = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    static void signUp(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan username akun baru: ");
        String user = input.nextLine();
        System.out.print("masukkan password akun baru: ");
        String pass = input.nextLine();

        users.add(new User(user, pass));
    }

    static boolean login(){
        String userAdmin = "ADMIN";
        String passAdmin = "admin keren";
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan username: ");
        String user = input.nextLine();
        System.out.print("masukkan password: ");
        String pass = input.nextLine();
        
        if(user.equals(userAdmin)  && pass.equals(pass)){
            adminMenu();
        } else {
            for(User u : users){
                if (user.equals(u.username) && pass.equals(pass)){
                    return true;
                } else {
                    System.out.println("username atau password tidak ditemukan");
                }
            }
        }
        return false;
    }

    static void showFilm(ArrayList<Film> daftarFilm){
        System.out.println("==DAFTAR FILM==");
        for(Film f : daftarFilm){
            System.out.println(f.judul + " - " + f.genre);
        }
        System.out.println();
    }

    static void adminMenu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("== Menu Admin ==");
            System.out.println("1. Tambah Film");
            System.out.println("2. Lihat Daftar Film");
            System.out.println("0. Kembali ke Menu Utama");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt(); input.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan judul film baru: ");
                String judul = input.nextLine();
                System.out.print("Masukkan genre film baru: ");
                String genre = input.nextLine();
                System.out.print("Masukkan nomor teaternya: ");
                String nomor = input.nextLine();
                daftarFilm.add(new Film(judul, genre, nomor));
                System.out.println("Film berhasil ditambahkan.");
            } else if (pilih == 2){
                showFilm(daftarFilm);
            }
             else if (pilih == 0) {
                login();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
}
}
