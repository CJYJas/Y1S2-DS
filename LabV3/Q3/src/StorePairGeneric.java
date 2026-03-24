/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <T>
 */
public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;
    
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
    return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (!(o instanceof StorePairGeneric)) return false;
        
        StorePairGeneric<?> other = (StorePairGeneric<?>) o;
        return first.equals(other.first) && second.equals(other.second);
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return this.first.compareTo(o.first);
    }
}

