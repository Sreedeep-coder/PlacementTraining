package day09;
public class library {
    String bookName;
    String author;
    int price;
    static int totalBooks = 0;
    public library(String bName, String auth, int cost) {
        bookName = bName;
        author = auth;
        price = cost;
        totalBooks++;
    }
    public void displayDetails() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Author    : " + author);
        System.out.println("Price     : $" + price);
    }
    public static void showTotalBooks() {
        System.out.println("Total books in the library: " + totalBooks);
    }
    public static void main(String[] args) {
        library book1 = new library("Rich DAD POOR DAD", "Robert koavsaki ", 299);
        library book2 = new library("The Alchemist", "Paulo Coelho", 350);
        library book3 = new library("1984", "George Orwell", 399);
        library book4 = new library("wings of fire", "Abdul kalam", 500);
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        library.showTotalBooks();
    }
}
