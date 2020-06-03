package solid;

import solid.report.Report;
import solid.report.TabloidLetterReport;

public class Program {

    public static void main(String[] args) {

        Report report = new TabloidLetterReport();
        report.print();
    }
}
