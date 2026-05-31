/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;
import java.io.*;
public class Tester {
    public static void main(String[] args) {
        String fileName = "L9Q2.txt";
        ArrayList<Product> list = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            System.out.println("Reading data from product text file");
            while((line = reader.readLine()) != null){
                String[] dataArray = line.split(":");
                
                System.out.print(dataArray[0] + " : ");
                System.out.print(dataArray[1] + " : ");
                System.out.print(dataArray[2] + "  : ");
                System.out.print(dataArray[3] + "\n");
                
                Product newProduct = new Product(dataArray[0], dataArray[1], Double.parseDouble(dataArray[2]), Integer.parseInt(dataArray[3]));
                list.add(newProduct);
            }
            
            QuickSort(list, 0, list.size() - 1);
            readList(fileName, list);
            reader.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    private static void QuickSort(ArrayList<Product> list, int low, int high){
            if(low < high){
                int partitionIndex = partition(list, low, high);
                
                QuickSort(list, low, partitionIndex - 1);
                QuickSort(list, partitionIndex + 1, high);
            }
    }
    
    private static int partition(ArrayList<Product> list, int low, int high){
        Product pivot = list.get(high);
        double pivotPrice = pivot.getPrice();
        String pivotName = pivot.getPID();
        
        int i = low - 1;
        
        for(int j= low; j < high; j++){
            double currPrice = list.get(j).getPrice();
            String currName = list.get(j).getPID();
            
            if(currPrice < pivotPrice ||
               currPrice == pivotPrice && currName.compareTo(pivotName) < 0){
                i ++;
                
                Product temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        
        i ++;
        Product temp = list.get(i);
        list.set(i, list.get(high));
        list.set(high, temp);
        return i;
    }
    
    private static void readList(String fileName, ArrayList<Product> list){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            System.out.println("After Quick Sort (Price, PID) : ");
            for(Product p : list){
                System.out.print(p.getPID() + " : ");
                System.out.print(p.getSID() + " : ");
                System.out.print(p.getPrice() + " : ");
                System.out.print(p.getQuantity() + "\n");
                
                writer.write(p.getPID() + " : ");
                writer.write(p.getSID() + " : ");
                writer.write(p.getPrice() + " : ");
                writer.write(p.getQuantity() + "\n");
            }
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}

//list = {4, 7, 3, 6}
//quickSort(list, 0, 3) -> partitionIndex = partition(list, 0, 3)
//partition(list, 0, 3) -> pivot = 6, i = -1
//j = 0 -> 4 < 6 -> true -> i = 0 temp = 4, arr[0] = 0, arr[0] = 0
//j = 1 -> 7 <= 6 -> false -> continue
//j = 2 -> 3 <= 6 -> true -> i = 1 temp = 7, arr[1] = 3, arr[2] = 7
//list = {4, 3, 7, 6}
//
//temp = 7
//arr[2] = 6
//arr[3] = 7
//list = 4 3 6 7
//return 2
//
//quickSort(list, 0, 1)


