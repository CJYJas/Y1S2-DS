
import java.util.Queue;
public class TestComparableBook {
    public static void main(String[] args) {
        Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();
        
        BookQueue.add(new ComparableBook(1065, "EffectiveJava"));
        BookQueue.add(new ComparableBook(3012, "Java : A Beginner Guide"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java"));
        BookQueue.add(new ComparableBook(6481, "Java : Programming Basics"));
        
        for(ComparableBook book : BookQueue){
            System.out.println(book.getBookId() + " " + book.getBookName());
        }
        System.out.println("");
        while(BookQueue.peek() != null){
            ComparableBook book = BookQueue.peek();
            System.out.println("Head Element :" + book.getBookId() + " " + book.getBookName());
            BookQueue.remove();
            for(ComparableBook b : BookQueue){
                System.out.println(b.getBookId() + " " + b.getBookName());
            }
            System.out.println("");
        }
    }
}
