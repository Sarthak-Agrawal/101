package org.example.oneOones.solid.report;


import org.example.oneOones.solid.DataAccess;
import org.example.oneOones.solid.printer.ReportPrinter;
import org.example.oneOones.solid.reportFormatter.LetterReportFormatter;

public class LetterReport {

    public void print() {
        DataAccess dataAccess = new DataAccess();
        dataAccess.getData();

        LetterReportFormatter letterReportFormatter = new LetterReportFormatter();
        letterReportFormatter.formatReport();

        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.print();
    }

}
