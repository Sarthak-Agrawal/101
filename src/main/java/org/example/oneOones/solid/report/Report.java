package org.example.oneOones.solid.report;


import org.example.oneOones.solid.DataAccess;
import org.example.oneOones.solid.ReportPrinter;
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
