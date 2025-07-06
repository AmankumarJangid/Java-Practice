public class challengeClass {
    public static void main(String[] args) {
        Book book1 = new Book("A1241B", "Hills of Maghalaya", "Mittal Brothers");
        Book book2 = new Book( "A3414B");
        Book book3 = new Book( "A1252B");

        book1.borrowBook();
        Book.getTotalBooks();
        book3.borrowBook();

        System.out.println("Book1 is borrowed : " + book1.isBorrowed);
        System.out.println("Book2 is borrowed : " + book2.isBorrowed);
        System.out.println("Book3 is borrowed : " + book3.isBorrowed);
        book1.returnBook();
        book2.returnBook();
        System.out.println("Book1 is returned : " + !book1.isBorrowed);
        System.out.println("Book2 is returned : " + !book2.isBorrowed);
        System.out.println("Book3 is returned : " + !book3.isBorrowed);
    }
}
