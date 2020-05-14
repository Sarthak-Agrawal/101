package org.example.oneOones.solid.report;

import org.example.oneOones.solid.DataAccess;
import org.example.oneOones.solid.printer.ReportPrinter;
import org.example.oneOones.solid.printer.TabloidReportPrinter;
import org.example.oneOones.solid.reportFormatter.ReportFormatter;
import org.example.oneOones.solid.reportFormatter.TabloidReportFormatter;

public class TabloidReport extends Report {
    public void print() {
        DataAccess dataAccess = new DataAccess();
        dataAccess.getData();

        ReportFormatter reportFormatter = new TabloidReportFormatter();
        reportFormatter.formatReport();

        ReportPrinter reportPrinter = new TabloidReportPrinter();
        reportPrinter.print();
    }
}
