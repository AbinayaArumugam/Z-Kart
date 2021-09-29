package com.zcart;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicalLayer {
    static String workingDirectory = System.getProperty("user.dir");

    public static List<String> readCustomerDetailsFromFile() {
        List<String> list = new ArrayList<>();
        System.out.println("Working Dir: " + workingDirectory);
        File file = new File(workingDirectory + File.separator + "src" + File.separator + "com" + File.separator + "zcart" + File.separator + "CustomerDetail");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static List<String> readInventoryDetail() {
        List<String> list = new ArrayList<>();
        File file = new File(File.separator + "home" + File.separator + "inc1" + File.separator + "IdeaProjects" + File.separator + "Z-Cart" + File.separator + "src" + File.separator + "com" + File.separator + "zcart" + File.separator + "Inventory");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

   /* public static void writeCustomerDetail() {
        try (FileWriter fileWriter = new FileWriter(File.separator + "CustomerDetail")) {
            fileWriter.write("Welcome");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}




/*
 List<String> result = new ArrayList<>();
        BufferedReader br = null;
        String fileName="/home/inc1/IdeaProjects/Z-Cart/src/com/zcart/CustomerDetail";

        try {

            br = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
 */
