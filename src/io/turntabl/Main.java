package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
        new Book("Programming Fundamentals", 123, "Mark Joan", BookCategory.Fiction, BookState.Available),
        new Book("Programming Fundamentals", 1234, "Philip Parker", BookCategory.Education, BookState.Lost),
        new Book("Introduction to C++", 4837, "Sandra Brooke", BookCategory.Education, BookState.Borrowed),
        new Book("Five Rules", 5678, "Emily Paul", BookCategory.Romance, BookState.Available),
        new Book("Happy Feet", 9142, "Mike Foll", BookCategory.Comic, BookState.Available)
        );

        List<Borrower> borrowers =Arrays.asList(
                new Borrower("Jimmy",12, "12/06/2019", 1534748, BorrowerType.Premium),
                new Borrower("Kim",4, "08/01/2016",673989, BorrowerType.Children),
                new Borrower("Holly", 6,"04/05/2010",38340393, BorrowerType.Gold),
                new Borrower("Marcus", 10,"09/12/2017",38340393, BorrowerType.Premium)
        );



        List<Borrower> premium = new ArrayList<>();
            for (Borrower borrower: borrowers){
                if (borrower.getType()==BorrowerType.Premium){
                    premium.add(borrower);
                }
            }
            printBorrowers(premium);

    }

    private static void printBorrowers(List<Borrower> borrowers) {
        System.out.println(borrowers);
    }


}
