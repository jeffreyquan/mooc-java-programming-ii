
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age of recommendation: ");
            
            int age = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name, age);
            
            books.add(book);
        }
        
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedAge).thenComparing(Book::getName);
        
        System.out.println(books.size() + " books in total.");
        
        Collections.sort(books, comparator);
        
        System.out.println("Books:");
        books.forEach(book ->  System.out.println(book.getName() + " (recommended for " + book.getRecommendedAge() + " year-olds or older)"));

    }

}

// Solution:
//public class MainProgram {
// 
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
// 
//        List<Book> books = new ArrayList<>();
//        while (true) {
//            System.out.print("Input the name of the book, empty stops: ");
//            String name = scanner.nextLine();
// 
//            if (name.isEmpty()) {
//                break;
//            }
// 
//            System.out.print("Input the age recommendation: ");
//            int age = Integer.valueOf(scanner.nextLine());
//            books.add(new Book(name, age));
//        }
// 
//        System.out.println("");
//        System.out.println("" + books.size() + " books in total.");
//        System.out.println("");
//        System.out.println("Books:");
//        books.stream().sorted().forEach(book -> {
//            System.out.println(book);
//        });
// 
//    }
// 
//}
// 
