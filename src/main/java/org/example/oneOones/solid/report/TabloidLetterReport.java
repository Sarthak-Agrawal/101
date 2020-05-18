package org.example.oneOones.solid.report;

import org.example.oneOones.solid.DataAccess;
import org.example.oneOones.solid.printer.ReportPrinter;
import org.example.oneOones.solid.printer.TabloidReportPrinter;
import org.example.oneOones.solid.reportFormatter.LetterReportFormatter;
import org.example.oneOones.solid.reportFormatter.TabloidLetterReportFormatter;

public class TabloidLetterReport extends LetterReport {
    public void print() {
        DataAccess dataAccess = new DataAccess();
        dataAccess.getData();

        LetterReportFormatter letterReportFormatter = new TabloidLetterReportFormatter();
        letterReportFormatter.formatReport();

        ReportPrinter reportPrinter = new TabloidReportPrinter();
        reportPrinter.print();
    }
}
