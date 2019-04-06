package br.com.unicesumar.aula20190312;

import java.util.Objects;

public class Book {

    private String name;
    private int totalPages;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return totalPages == book.totalPages &&
//                Objects.equals(name, book.name);
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book book = (Book) obj;
        return Objects.equals(book.name,name) && book.totalPages == totalPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalPages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
