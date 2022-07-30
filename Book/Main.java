package Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Book> bookArrayList = new ArrayList();
        bookArrayList.add(new Book(3,"Java","Dasturlash"));
        bookArrayList.add(new Book(2,"C","Bas"));
        bookArrayList.add(new Book(4,"Kotlin","Has"));
        bookArrayList.add(new Book(1,"C++","Gas"));
        Collections.sort(bookArrayList);
        System.out.println("--------------------------------");
        System.out.println("+++ Id bilan sortlash +++");
        for (Book book:bookArrayList) {
            System.out.println(book.id+" "+book.name+" "+book.category);
        }
        System.out.println("--------------------------------");
        System.out.println("+++ Name bilan sortlash +++");
        Comparator<Book> ComparatorName = Comparator.comparing(Book::getName);
        for (Book book:bookArrayList) {
            System.out.println(book.id + " " + book.name + " " + book.category);
        }
        System.out.println("--------------------------------");
        System.out.println("+++ Category bilan sortlash +++");
        Comparator<Book> ComparatorCategory = Comparator.comparing(Book::getCategory);
        for (Book book:bookArrayList) {
            System.out.println(book.id + " " + book.name + " " + book.category);
        }
    }
}
