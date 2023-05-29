package programs.Java8Features_Programs.JavaTechie.example1;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java",400));
        books.add(new Book(363,"Hibernate",180));
        books.add(new Book(275,"Spring",200));
        books.add(new Book(893,"Webservice",300));

        return books;
    }
}
