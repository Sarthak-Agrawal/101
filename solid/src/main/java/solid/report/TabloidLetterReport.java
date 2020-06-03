package solid.report;

import solid.DataAccess;
import solid.printer.ReportPrinter;
import solid.printer.TabloidReportPrinter;
import solid.reportFormatter.ReportFormatter;
import solid.reportFormatter.TabloidLetterReportFormatter;

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
