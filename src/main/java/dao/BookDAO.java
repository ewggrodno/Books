package dao;

import entity.Book;

import java.util.List;

public interface BookDAO {

    void add(Book book);

    void add(List<Book> books);

    Book getBookById(long id);

    List<Book> getAllBooks();

    void update(Book book);

    void update(List<Book> books);

    void remove(Book book);

    void remove(List<Book> books);

}
