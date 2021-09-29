package com.zcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
    static Scanner in=new Scanner(System.in);
    public static String shoppingCategory() {
        System.out.println("----Category----");
        System.out.println("1.Mobile");
        System.out.println("2.Laptop");
        System.out.println("3.Tablet");
        System.out.println("Enter your Choice");
        int choice = in.nextInt();
        String category = "";
        if (choice == 1) {
            category = "Mobile";
        } else if (choice == 2) {
            category = "Laptop";
        } else if (choice == 3) {
            category = "Tablet";
        } else {
            System.out.println("No such category");
        }
        return category;
    }
    public static void shoppingList(String category){
        System.out.println(Main.hash.get(category));
        List<InventoryInfo> info=new ArrayList<>();
        System.out.println("Enter the brand Name");
        in.nextLine();
        String brand=in.nextLine();
        System.out.println("Enter the Model Name");
        String model=in.nextLine();
        if(info.contains(brand)&&info.contains(model)){

            System.out.println("Do you want to continue shopping.Y=1/N=0");
            int option=in.nextInt();
            if(option==1){
                String cat=shoppingCategory();
                
            }
        }
    }
}
