package DesignPatterns.PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
   private String shopName;
   private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void allBooks()
    {
        for(int i=1;i<=10;i++)
        {
            Book book = new Book();
            book.setBookName("Book" + i);
            this.getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public BookShop clone() {
        try {
            return (BookShop) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
