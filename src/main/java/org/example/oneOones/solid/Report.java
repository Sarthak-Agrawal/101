package org.example.oneOones.solid;

public class Report {

    public void print() {
        getData();
        formatReport();
        System.out.println("Printing the report...");
    }

    private void getData() {
        System.out.println("Getting data from database...");
    }

    private void formatReport() {
        System.out.println("Formatting report...");
    }
}
