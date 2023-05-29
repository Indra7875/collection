package programs.Java8Features_Programs.JavaTechie.example1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
//        public List<Book> getBooksSortedByName(){
//           List<Book> books = new BookDAO().getBooks();
//            Collections.sort(books, (b1,b2) -> b1.getName().compareTo(b2.getName()));
//            return books;
//        }

    public List<Book> getBooksSortedByName(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, Comparator.comparing(Book::getName));
        return books;
    }

    public static void main(String[] args) {
        List<Book> books = new BookService().getBooksSortedByName();
        System.out.println(books);
    }
}
