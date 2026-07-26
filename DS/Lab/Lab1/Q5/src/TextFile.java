/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.*;

interface FileIO{
    public void writeFile();
    public void readFile();
}

class TextFile implements FileIO{
    private String path;
    
    public TextFile(String path){
        this.path = path;
    }
    
    @Override
    public void writeFile(){
        try(FileWriter writer = new FileWriter(path)){
            writer.write("Write to text file\n");
            writer.write("Welcome to FSKTM!\n");
            writer.write("Please register your matric number.\n");
            writer.write("Please register your UMMail account\n");
            writer.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    @Override
    public void readFile(){
        System.out.println("Read from text file");
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String header = reader.readLine();
            
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

class BinaryFile implements FileIO{
    private String path;
    
    public BinaryFile(String path){
        this.path = path;
    }
    
    @Override
    public void writeFile(){
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(path))){
            writer.writeUTF("Write to binary file");
            writer.writeUTF("Welcome to FSKTM!");
            writer.writeUTF("Please register your matric number.");
            writer.writeUTF("Please register your UMMail account");
            writer.close();
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    @Override
    public void readFile(){
        System.out.println("Read from binary file");
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(path))){
            reader.readUTF();
            while(true){
                try{
                    String line = reader.readUTF();
                    System.out.println(line);
                }catch(EOFException e){
                    break;
                }
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}

class Tester{
    public static void main(String[] args) {
        TextFile tf = new TextFile("L1Q5.txt");
        tf.writeFile();
        tf.readFile();
        
        BinaryFile bf = new BinaryFile("L1Q5.dat");
        bf.writeFile();
        bf.readFile();
    }
}