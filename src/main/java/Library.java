import java.util.HashMap;

public class Library {

    public HashMap<String, Object> mainLibrary;

    public void addBookToLibrary(Book newBook) {
        // Using List
        // List mainLibrary = new ArrayList();
        // mainLibrary.add(newBook);

        // Using hashmap
        mainLibrary = new HashMap<>();
        mainLibrary.put(newBook.title, newBook);

        System.out.println("I added " + newBook.title + " to this library!");
        System.out.println("from library - the library contains  " + mainLibrary.get(newBook.title));
    }

    public void grabBookFromLibrary(String bookLookupTitle) {
        if (mainLibrary == null) {
            System.out.println("I'm sorry I don't have any books in the library.");
        } else {
            if (mainLibrary.containsKey(bookLookupTitle)) {
                Book foundBook = (Book) mainLibrary.get(bookLookupTitle);
                System.out.println("I found it!");
                System.out.println("Here is the title: " + foundBook.title);
                System.out.println("Here is the genre: " + foundBook.genre);
                System.out.println("Here is the number of pages: " + foundBook.numOfpages);
            } else {
                System.out.println("I'm sorry I don't have this book in the library.");
            }
        }

    }

}
