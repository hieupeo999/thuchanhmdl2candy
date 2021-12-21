import java.util.ArrayList;
import java.util.Scanner;

public class ManageCandy {
    ArrayList<Candy> candies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAllCandy() {
        System.out.println(candies);
    }

    public void addCandy(){

        System.out.println("nhập màu");
        String color = scanner.nextLine();
        System.out.println("Nhập thuộc tính");
        String property = scanner.nextLine();
        System.out.println("Nhập số lượng");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("NHập giá");
        int price = Integer.parseInt(scanner.nextLine());
    }
    public void deleteCanndyById(){


    }
    public void editCanndy(){

    }
    public void searchById(){

    }
    public void deleteByColor(){

    }
    public void searchByColor(){

    }
    public void maxPrice(){

    }
    public void totalPrice(){

    }
}
