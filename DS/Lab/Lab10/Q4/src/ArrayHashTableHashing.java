/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ArrayHashTableHashing{
    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] table;
    private int size;

    public ArrayHashTableHashing(int capacity) {
        this.table = new Entry[capacity];
        this.size = capacity;
    }
    
    public int getSize(){
        int count = 0;
        for(Entry e : table){
            if(e != null){
                count ++;
            }
        }
        
        return count;
    }
    
    private boolean containsKey(String search){
        return get(search) != null;
    }
    
    private int getIndex(String search){
        int count = -1;
        
        for (Entry table1 : table) {
            if (table1 == null) {
                continue;
            }
            
            count ++;
            if (table1.key.equals(search)) {
                break;
            }   
        }
        return count;
    }
    
    public void search(String search){
        if(containsKey(search)){
            System.out.println("Product ID : " + search + " " + get(search));
            System.out.println("Location : " + getIndex(search));
            
        }else{
            System.out.println("Product ID " + search + " cannot be found");
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % this.size;
    }

    public void put(String key, String value) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                table[index].value = value;
                return;
            }
            
            index = (index + 1) % this.size;

            if (index == startIndex) {
                System.out.println("Hash Table is completely full! Cannot insert: " + key);
                return;
            }
        }

        table[index] = new Entry(key, value);
    }

    public String get(String key) {
        int index = hash(key);
        int startIndex = index;

        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                return table[index].value;
            }

            index = (index + 1) % this.size;

            if (index == startIndex) {
                break;
            }
        }

        return null;
    }

    public void printTable() {
        System.out.println("The data set from the File");
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.println(table[i].key + " : " + table[i].value);
            }
        }
    }
}