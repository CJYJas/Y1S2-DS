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

interface SimpleLog{
    public void insertToLog(String text);
    public boolean checkLogFull();
    public int getLogSize();
    public boolean checkLogItem(String text);
    public void deleteLog();
    public void displayLog();
}

class TextFileLog implements SimpleLog{
    private int size;
    protected static int count = 0;
    ArrayList<String> list = new ArrayList<>();
    
    public TextFileLog(int size){
        this.size = size;
    }
    
    @Override
    public void insertToLog(String text){
        try(FileWriter writer = new FileWriter("L2Q2.txt", true)){
            writer.write(text + "\n");
            list.add(text);
            count ++;
            writer.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    @Override
    public boolean checkLogFull(){
        return count < size;
    }
    
    @Override
    public int getLogSize(){
        return size;
    }
    
    @Override
    public boolean checkLogItem(String text){
        for(String l :list){
            if(l.equals(text)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void deleteLog(){
        File file = new File("L2Q2.txt");
        file.delete();
        size = 0;
    }
    
    @Override
    public void displayLog(){
        try(BufferedReader reader = new BufferedReader(new FileReader("L2Q2.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        System.out.println("Create a text file log with maximum record equal to 5");
        
        TextFileLog tf  = new TextFileLog(5);
        
        int filesize = tf.getLogSize();
        System.out.println("Text File Log Size " + filesize);
        String[] list = {"James", "Ahmad", "Siti", "Ramesh", "John", "Ali"};
        
        for(String l : list){
            if(tf.checkLogFull()){
                tf.insertToLog(l);
            }
        }
        tf.displayLog();
        System.out.println("Adding another record");
        System.out.println("The log is full");
            
        System.out.println("Searching for Siti in the file");
        if(tf.checkLogItem("Siti")){
            System.out.println("Text File Log contains Siti");
        }else{
            System.out.println("Text File Log do not contains Siti");
        }
        
        System.out.println("Clear the text file log");
        tf.deleteLog();
        
        System.out.println("Text File Log Size " + tf.getLogSize());       
    }
    
}
