/*
In a publication system, Author a1 contributes to a set of books. Author a2 also contributes
to all the books contributed by a1 except for the second book, which a2 replaces with another
book. Write a program that defines two classes Author and PublicationSystem. Define a
copy constructor to create a2 from a1 such that changing the values of instance variables of
either a2 or a1 does not affect the other one. The program accepts name of author a2 and
the new book contributed by a2 as input.

• Define a constructor to initialize the instance variables in class Author.
• Define a copy constructor to create a deep copy of another Author object in class Author.
*/


package sep2024OPPE1revision;
import java.util.*;

class Author{
    private String name;
    private String[] books;
    //define constructor here
    public Author(String name, String[] Books){
        this.name = name;
        this.books = Books;
    }
    public Author(Author a){
        this.name = a.name;
        this.books = new String[a.books.length];
        for(int i = 0; i < books.length; i++){
            this.books[i] = a.books[i];
        }
    }
    public void setName(String n){
        name = n;
    }
    public void setBook(int index, String b){
        books[index] = b;
    }
    public String getName(){
        return name;
    }
    public String getBook(int index){
        return books[index];
    }
}

public class typeone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Maths", "DL", "DSA", "DC"};
        Author a1 = new Author("Nandu", books);
        Author a2 = new Author(a1);
        a2.setName(sc.next());
        a2.setBook(1,sc.next());
        System.out.println(a1.getName() + ": "+a1.getBook(1));
        System.out.println(a2.getName() + ": "+a2.getBook(1));
    }
}
