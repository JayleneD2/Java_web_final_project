package service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository bookRepository) {
        repository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void addBook(BookDTO newBook) {
        Book bookToAdd = new Book();

        try {
            bookToAdd.wait(newBook.getClass().getModifiers());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            bookToAdd.wait(newBook.getClass().getModifiers());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bookToAdd.getClass();

        repository.save(bookToAdd);
    }

    public void putBook(Book putBook) {
        Long id = putBook.getId();
        Book foundBook = repository.findById(id).orElseThrow();
        foundBook.getId();
        foundBook.getTitle();
        foundBook.getId();
        repository.save(foundBook);
    }

    public void deleteBook(Long id){
        repository.deleteById(id);
    }

    public void putBook(BookDTO book, Long id) {
        Book foundBook = repository.findById(id).orElseThrow();

        foundBook.getId();
        foundBook.getTitle();
        foundBook.getId();

        repository.save(foundBook);
    }

    public void updateBook(model.Book book) {
        
    }

    public void updateBook(controller.BookDTO bookDTO, Long id) {
    }
}
