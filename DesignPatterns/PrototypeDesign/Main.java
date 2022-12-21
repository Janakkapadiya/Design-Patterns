package DesignPatterns.PrototypeDesign;

import java.util.logging.Logger;

public class Main {
    public static final Logger log = Logger.getLogger(String.valueOf(DesignPatterns.SingleTone.Main.class));

    public static void main(String[] args) {
          BookShop bookShop = new BookShop();
          bookShop.setShopName("yourBooksNoobs");
          bookShop.allBooks();
          log.info(String.valueOf(bookShop));

          BookShop bookShop1 = bookShop.clone();
          bookShop1.setShopName("myBooksNoobs");
          log.info(String.valueOf(bookShop1));

    }
}
