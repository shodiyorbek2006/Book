package Book;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    int id;
    String name;
    String category;

    public Book(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public int compareTo(Book book){
        if (id==book.id){
            return 1;
        }else if (id>book.id){
            return 0;
        }else {
            return -1;
        }

    }
}
