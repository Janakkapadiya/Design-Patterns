package DesignPatterns.PrototypeDesign;

//instade of callomg same object multiple time we clone the smae object to resuce the time
//for example if we are faching the data from database and we create object multiple time
// and call the same method multiple time it may consume more time
// so to reduce this problem we use prototype design patterns
public class Book {
    public String bookName;
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
