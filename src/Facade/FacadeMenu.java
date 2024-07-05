package src.Facade;

import java.util.Scanner;

public class FacadeMenu {

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("1: Them moi");
        System.out.println("2: Xoa");
        System.out.println("3: Tim kiem");
        System.out.println("4: Thoat");

        switch (number) {
            case 1:
                // Them moi
                break;
            case 2:
                // Xoa
                break;
            case 3:
                // Tim kiem
                break;
            case 4:
                System.out.println("Thoat chuong trinh");
                break;
            default:
                System.out.println("Lua chon khong hop le");
        }
    }

}
