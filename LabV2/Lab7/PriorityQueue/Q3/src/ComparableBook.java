/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ComparableBook implements Comparable<ComparableBook>{
    private final int bookId;
    private final String bookName;
    
    public ComparableBook(int bookId, String bookName){
        this.bookId = bookId;
        this.bookName = bookName;
    }
    
    public int getBookId(){
        return bookId;
    }
    
    public String getBookName(){
        return bookName;
    }
    
    @Override
    public int compareTo(ComparableBook other){
        return Integer.compare(this.bookId, other.bookId);
    }
}
