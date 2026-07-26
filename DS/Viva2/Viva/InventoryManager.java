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
class InventoryManager{
    private final ArrayList<Product> list;
    
    public InventoryManager(){
        list = new ArrayList<>();
    }
    
    public void loadFromFile(String filename){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                
                String[] element = line.split(" ");
                
                int id = Integer.parseInt(element[0]);
                String name = element[1];
                double price = Double.parseDouble(element[2]);
                int stock = Integer.parseInt(element[3]);
                
                Product newProduct = new Product(id, name, price, stock);
                list.add(newProduct);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public void saveToFile(String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product p : list) {
                String record = p.getId() + " " + p.getName() + " " + p.getPrice() + " " + p.getStock();
                writer.write(record);
                writer.newLine();
            }
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public void addProduct(Product p){
        if (getProductById(p.getId()) != null) {
            System.out.println("Error: Product with ID " + p.getId() + " already exists.");
            return;
        }
        list.add(p);
    }
    
    public void removeProduct(int id){
        for(Product p : list){
            if(p.getId() == id){
                list.remove(p);
                return;
            }
        }
        
        System.out.println("Id not found");
    }
    
    public Product searchById(int id){
        for(Product p : list){
            if(p.getId() == id){
                System.out.print(p.toString());
                return p;
            }
        }
        System.out.println("Id not found");
        return null;
    }
    
    public ArrayList<Product> searchByName(String name){
        ArrayList<Product> foundProduct = new ArrayList<>();
        String insensitiveName = name.toLowerCase();
        for(Product p : list){
            if(p.getName().toLowerCase().contains(insensitiveName)){
                foundProduct.add(p);
            }
        }
        return foundProduct;
    }
    
    public void updateStock(int id, int newStock) {
        Product p = getProductById(id);
        if (p != null) {
            p.setStock(newStock);
        } else {
            System.out.println("Id not found");
        }
    }
    
    public void displayAll(){
        System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Name", "Price", "Stock");
        System.out.println("------------------------------------------------------------");
        for(Product p : list){
            System.out.println(p);
        }
    }
    
    public Product getProductById(int id){
        for(Product p : list){
            if(p.getId() == id){
                return p;
            }
        }
        
        System.out.println("Id not found");
        return null;
    }
    
    public boolean isAvailable(int id, int requestedQty){
        Product p = getProductById(id);
        return p != null && p.getStock() >= requestedQty;
    }
}
