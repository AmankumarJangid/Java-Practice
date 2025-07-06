class Book {
    static int totalbook;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalbook = 0;
    }
    {
        isBorrowed = false;
    }
    Book(String isbn){
        this(isbn, "","");
    }
    Book(  String isbn, String title, String author){
        totalbook++;
        this.title = title;
        this.author =author;
        this.isbn = isbn;
    }

    void borrowBook(){
        if(isBorrowed)
            System.out.println("Already Borrowed");
        isBorrowed = true;
    }
    void returnBook(){
        if(!isBorrowed)
            System.out.println("Already Returned");
        isBorrowed = false;
    }
    static int getTotalBooks(){
        System.out.println("Total books in library are " + totalbook);
        return totalbook;
    }
}
