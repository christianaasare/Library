package io.turntabl;

import java.util.List;

public class Borrower {
    private String name;
    private int time;
    private String date;
    private int account_number;
    private BorrowerType type;

    @Override
    public String toString() {
        return "Borrower name: "  + name + " " +
                "Borrower time: " + time + " "+
                "Date: "  + date +
                "Borrower Type: " + type;
    }

    public Borrower(String name, int time, String date, int account_number, BorrowerType type) {
        this.name = name;
        this.time = time;
        this.date = date;
        this.account_number = account_number;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public BorrowerType getType() {
        return type;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

}