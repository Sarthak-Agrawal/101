package org.example.oneOones.solid.report;

import org.example.oneOones.solid.DataAccess;
import org.example.oneOones.solid.printer.ReportPrinter;
import org.example.oneOones.solid.printer.TabloidReportPrinter;
import org.example.oneOones.solid.reportFormatter.ReportFormatter;
import org.example.oneOones.solid.reportFormatter.TabloidLetterReportFormatter;

public class TabloidLetterReport extends Report {
    public void print() {
        DataAccess dataAccess = new DataAccess();
        dataAccess.getData();

        ReportFormatter reportFormatter = new TabloidLetterReportFormatter();
        reportFormatter.formatReport();

        ReportPrinter reportPrinter = new TabloidReportPrinter();
        reportPrinter.print();
    }
}
