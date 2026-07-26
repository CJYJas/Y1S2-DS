/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 * @param <E>
 */
class StoreRecordGeneric <E extends Comparable<E>>{
    private E standardId;
    private E alternateId;
    
    public StoreRecordGeneric(E standardId, E alternateId){
        this.standardId = standardId;
        this.alternateId = alternateId;
    }
    
    public E getStandardId(){
        return this.standardId;
    }
    
    public E getAlternateId(){
        return this.alternateId;
    }
    
    public void setStandardId(E standardId){
        this.standardId = standardId;
    }
    
    public void setAlternateId(E alternateId){
        this.alternateId = alternateId;
    }
    
    public boolean equal(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        
        StoreRecordGeneric<E> other = null;
        if(obj instanceof StoreRecordGeneric){
            other = (StoreRecordGeneric<E>) obj;
            
            if(other.standardId == null){
                return false;
            }
        }
        
        return this.standardId.equals(other.standardId);
    }
     
    public int compareTo(StoreRecordGeneric<E> other){
        return this.standardId.compareTo(other.standardId);
    }
}
