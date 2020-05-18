package org.example.oneOones.solid.report;


import org.example.oneOones.solid.DataAccess;
import org.example.oneOones.solid.printer.LetterReportPrinter;
import org.example.oneOones.solid.printer.ReportPrinter;
import org.example.oneOones.solid.reportFormatter.LetterReportFormatter;
import org.example.oneOones.solid.reportFormatter.ReportFormatter;

public class LetterReport extends Report {

    public void print() {
        DataAccess dataAccess = new DataAccess();
        dataAccess.getData();

        ReportFormatter letterReportFormatter = new LetterReportFormatter();
        letterReportFormatter.formatReport();

        ReportPrinter reportPrinter = new LetterReportPrinter();
        reportPrinter.print();
    }

}
