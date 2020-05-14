package org.example.oneOones.solid;


import org.example.oneOones.solid.reportFormatter.ReportFormatter;

public class Report {

    public void print() {
        DataAccess dataAccess = new DataAccess();
        dataAccess.getData();

        ReportFormatter reportFormatter = new ReportFormatter();
        reportFormatter.formatReport();

        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.print();
    }

}
