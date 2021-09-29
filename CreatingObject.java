package com.zcart;

import java.util.ArrayList;
import java.util.List;

public class CreatingObject {
    public static void createCusObject(){
        for(String str:Main.customerList){
            int i=0;
            String[] array=str.split("   ");
            CustomerInfo customer=new CustomerInfo();
            customer.setEmail(array[i++]);
            customer.setPassword(array[i++]);
            customer.setName(array[i++]);
            customer.setMobileNo(array[i++]);
            Main.map.put(customer.getEmail(),customer);

        }
       // System.out.println(Main.map);
    }
    public static void createProductObj(){

        for (String str:Main.productList){
            List<InventoryInfo> list=new ArrayList<>();
            int j=0;
            String[] array=str.split("    ");
            InventoryInfo inventory =new InventoryInfo();
            String category=array[j++];
            inventory.setBrand(array[j++]);
            inventory.setModel(array[j++]);
            inventory.setPrice(Integer.parseInt(array[j++]));
            inventory.setStock(Integer.parseInt(array[j++]));
            list.add(inventory);
           // Main.hash.put(inventory.getCategory(), list);
            if(Main.hash.get(category)==null){
                Main.hash.put(category,list);
            } else {
                List<InventoryInfo> newList=new ArrayList<>();
                List<InventoryInfo> oldList=Main.hash.get(category);
                InventoryInfo obj=oldList.get(0);
                newList.add(obj);
                newList.add(inventory);
                Main.hash.put(category,newList);
            }
        }
        System.out.println(Main.hash);

    }
}
