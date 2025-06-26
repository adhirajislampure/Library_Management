public class Library {

    private List<Book> books;

    public Library(){
        this.books=new ArrayList<>();
    }

    public void addBook(String title,String author,String isbn){
        books.add(new Book(title,author,isbn));
    }
    public void displayBooks(){
        if(books.isEmpty()) {
            System.out.println("No books in the library");
            return;
        }
        System.out.println("Books in the library");
        for(Book book:books){
            System.out.println(book);
        }
    }

    public void issueBook(String isbn){
        for(Book book:books){
            if(book.getIsbn().equals(isbn) && book.isAvailable()==true){
                book.setAvailable(false);
                System.out.println("Book issued Successfully");
                        return;
            }
            System.out.println("Book not available for issuing");
        }
    }

    public void returnBook(String isbn){
        for(Book book:books){
            if(book.getIsbn().equals(isbn) && !book.isAvailable){
                book.setAvailable(true);
                System.out.println("Book returned succcessfull");
                return;
            }
        }
        System.out.println("Invallid ISBN or book already returned");
    }

    public void searchBook(String isbn){


    }


}
