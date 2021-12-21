import java.util.Scanner;

public class Maincandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageCandy canndyManager = new ManageCandy();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả kẹo");
            System.out.println("2. thêm kẹo");
            System.out.println("3. xóa kẹo theo id");
            System.out.println("4. sửa kẹo theo id");
            System.out.println("5. tìm kẹo theo id");
            System.out.println("6. xóa kẹo theo màu");
            System.out.println("7. tìm kẹo theo màu");
            System.out.println("8. giá kẹo lớn nhất");
            System.out.println("9. tổng tiền kẹo");
            System.out.println("0. thoát");
            System.out.println("---------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Hiển thị tất cả kẹo");
                    canndyManager.displayAllCandy();
                    break;
                case 2:
                    System.out.println("2. thêm kẹo");
                    canndyManager.addCandy();
                    break;
                case 3:
                    System.out.println("3. xóa kẹo theo id");
                    canndyManager.deleteCanndyById();
                    break;
                case 4:
                    System.out.println("4.sửa kẹo theo id ");
                    canndyManager.editCanndy();
                    break;
                case 5:
                    System.out.println("5. tìm kẹo theo id");
                    canndyManager.searchById();
                    break;
                case 6:
                    System.out.println("6.xóa kẹo theo màu ");
                    canndyManager.deleteByColor();
                    break;
                case 7:
                    System.out.println("7.tìm kẹo theo màu");
                    canndyManager.searchByColor();
                    break;
                case 8:
                    System.out.println("8. Max canndys price");
                    canndyManager.maxPrice();
                    break;
                case 9:
                    System.out.println("9.tổng tiền kẹo ");
                    canndyManager.totalPrice();
                    break;
                default:
                    break;
            }
        } while (choice != 0);

    }
}
