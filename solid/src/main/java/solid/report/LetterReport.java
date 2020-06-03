package solid.report;


import solid.DataAccess;
import solid.printer.LetterReportPrinter;
import solid.printer.ReportPrinter;
import solid.reportFormatter.LetterReportFormatter;
import solid.reportFormatter.ReportFormatter;

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
