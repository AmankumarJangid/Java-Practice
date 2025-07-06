package Challenges;

public class LibraryItem {
    private int itemID;
    private String title;
    private String author;
    private boolean isCheckedOut ;

//    public LibraryItem(int itemID, String title, String author) {
//        this.itemID = itemID;
//        this.title = title;
//        this.author = author;
//        this.isCheckedOut = false;
//    }
    public LibraryItem(){
        isCheckedOut = false;
    }
    public void checkout(){
        if( isCheckedOut ){
            System.out.println("The book is already taken by someone else");
            return;
        }
        else{
            System.out.println("Checkout Successfull");
            isCheckedOut = true;
        }
    }

    public void returnItem(){
        if( !isCheckedOut){
            System.out.println("Item is already here");
            System.out.println("Can't return anything");
        }
        else{
            System.out.println("Item is successfully returned");
            isCheckedOut = false;
        }
    }


}
