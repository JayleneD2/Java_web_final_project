package controller;

import java.util.Objects;

public class BookDTO extends service.BookDTO {
    private String title;
    private String author;
    private String category;
    private Integer publicationYear;
    private Double price;

    public BookDTO() {
    }

    public BookDTO(String title, String author, String category, Integer publicationYear, Double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BookDTO bookDTO = (BookDTO) obj;
        return Objects.equals(title, bookDTO.title) &&
                Objects.equals(author, bookDTO.author) &&
                Objects.equals(category, bookDTO.category) &&
                Objects.equals(publicationYear, bookDTO.publicationYear) &&
                Objects.equals(price, bookDTO.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, category, publicationYear, price);
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                '}';
    }
}
