package com.zcart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
   static List<String> customerList=LogicalLayer.readCustomerDetailsFromFile();
    static List<String> productList=LogicalLayer.readInventoryDetail();
    static HashMap<String,CustomerInfo> map=new HashMap<>();
    static Map<String,List<InventoryInfo>> hash=new HashMap<String,List<InventoryInfo>>();
    public static void main(String[] args)  {
        Scanner in= new Scanner(System.in);
       CreatingObject.createCusObject();
       CreatingObject.createProductObj();
       // System.out.println(CheckingLayer.encryptPassword("Abinaya17"));
       while (true){
            System.out.println("--------------Z-Cart online shopping----------------");
            System.out.println("1.Sign up");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    in.nextLine();
                    String name = in.nextLine();
                    System.out.println("Enter the E-mail ID");
                    String email = in.nextLine();
                    System.out.println("Enter Password");
                    String password = in.nextLine();
                    System.out.println("Confirm Password");
                    String confirmPassword = in.nextLine();
                    if (!password.equals(confirmPassword)) {
                        System.out.println("Password doesn't match");
                        return;
                    }
                    System.out.println("Enter Mobile No");
                    String mobileNo = in.nextLine();

                    if (!map.containsKey(email)) {
                        CustomerInfo customerInfo = new CustomerInfo();
                        customerInfo.setEmail(email);
                        customerInfo.setPassword(CheckingLayer.encryptPassword(password));
                        customerInfo.setName(name);
                        customerInfo.setMobileNo(mobileNo);
                        map.put(customerInfo.getEmail(), customerInfo);
                    }
                    System.out.println(map);
                    break;
                case 2:
                    System.out.println("Enter the UserName/e-Mail ID");
                    in.nextLine();
                    String userName=in.nextLine();
                    if(map.get(userName)!=null) {
                        CustomerInfo info = map.get(userName);
                        System.out.println("Enter the Password");
                        String passWord = in.nextLine();
                        if (info.getPassword() == CheckingLayer.encryptPassword(passWord)) ;
                        {
                            System.out.println("You have Successfully Logged in");
                        }
                         String category=Shopping.shoppingCategory();
                        Shopping.shoppingList(category);
                    } else {
                        System.out.println("No such userId found.If you don't have an account. Please Sign in");
                    }
                    break;
                case 3:
                    return;
            }
            }
    }
}

