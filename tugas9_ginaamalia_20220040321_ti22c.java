import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        LinkedList<String> todoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih menu" + "(1/2/3) :");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Lihat Todo");
            System.out.println("3. Keluar");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("masukan Todo baru: ");
                    scanner.nextLine(); // clear buffer
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                    System.out.println("Todo berhasil ditambahkan");
                    break;

                case 2:
                    System.out.println("Todo List:");
                    for (String item : todoList) {
                        System.out.println("- " + item);
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi Todo List.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
                    break;
            }
        }
    }
}