package lambda.exmaple1;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(10,"Math",400));
        books.add(new Book(11,"Physics",1023));
        books.add(new Book(14,"Chemistry",4000));
    }
}
