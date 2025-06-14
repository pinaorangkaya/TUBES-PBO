import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("===MENU UTAMA===");
            System.out.println("1. Buat Akun Baru\n2. Login\n3. Exit");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Bioskop.login();
                    break;
                case 2:
                    Bioskop.signUp();
                    break;

            
                default:
                    break;
            }
        }
        
    }
}
