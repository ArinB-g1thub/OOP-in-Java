/*
Task:
Design and implement a Library Management System in Java using the SOLID Principles.
The system should provide the following Personalities:

- create a book class to store book information.
- add books to the library
- search a book by its title
- issue a book
- return a book
- send a notification after issuing or returning a book.
- support multiple notification methods. (Email, SMS).
Ensure the system follows all five SOLID principles.
*/

/*//
Book Entity.
//*/
public class SmartLibrary {

    static class Book {
        private String title;
        private boolean issued;

        public Book(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }
    
        public boolean isIssued(){
            return issued;
        }

        public void setIssued(boolean issued){
            this.issued = issued;
        }
    }   

    /*//
    Repository (SRP)
    //*/

    static class BookRepository{
        private Book[] books = new Book [10];
        private int count = 0;

        public void addBook(Book book){
            books[count++] = book;
        }
    
        public Book findBook(String title){
            for (int i = 0; i<count; i++){
                if (books[i].getTitle().equalsIgnoreCase(title)){
                    return books[i];
                }
            }
            return null;
        }
    }

    /*//
    OCP + LSP
    //*/
    interface Notification{
        void send(String message);
    }

    static class EmailNotification implements Notification{
        @Override
        public void send(String message){
            System.out.println("Email: " + message);
        }
    }

    static class SMSNotification implements Notification{
        @Override
        public void send(String message){
            System.out.println("SMS: " + message);
        }
    }

    /*//
    ISP
    //*/
    interface Searchable{
        Book search(String title);
    }

    interface Borrowable{
        void issue(Book book);
        void returnBook(Book book);
    }

    /*//
    DIP
    //*/
    static class LibraryService implements Searchable, Borrowable{
        
        private BookRepository repository;
        private Notification notification;

        public LibraryService(BookRepository repository, Notification notification){
            this.repository = repository;
            this.notification = notification;
        }

        @Override
        public Book search(String title){
            return repository.findBook(title);
        }

        @Override
        public void issue(Book book){
            if (book != null && !book.isIssued()){
                book.setIssued(true);
                notification.send(book.getTitle() + " issued successfully.");
            } else{
                System.out.println("Book not available.");
            }
        }

        @Override
        public void returnBook(Book book){
            if (book != null && book.isIssued()){
                book.setIssued(false);
                notification.send(book.getTitle() + " returned successfully.");
            }
        }       
    }

    /*// 
    Main Method
    //*/

    public static void main(String[] args){
        BookRepository repository = new BookRepository();
        repository.addBook(new Book("Java Programming"));
        repository.addBook(new Book("Design Patterns"));

        Notification notification = new EmailNotification();

        LibraryService service =
            new LibraryService(repository, notification);

        Book book = service.search("Java Programming");

        service.issue(book);
        service.returnBook(book);
    }
}