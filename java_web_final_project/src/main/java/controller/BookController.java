package controller;

import model.Book;
import org.springframework.web.bind.annotation.*;
import service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<service.Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody BookDTO bookDTO) {
        bookService.addBook(bookDTO);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@RequestBody BookDTO bookDTO, @PathVariable Long id) {
        bookService.updateBook(bookDTO, id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
