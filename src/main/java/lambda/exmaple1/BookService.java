package lambda.exmaple1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class MyComparator implements Comparator<Book>
//{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//
//
//    }
//}
public class BookService {


    public List<Book> getBookInSort(){
        List<Book> books=new BookDAO().getBooks();
       // Collections.sort(books,);
        Collections.sort(books, (o1,o2)->o1.getName().compareTo(o2.getName()));

        return books;

    }
}
