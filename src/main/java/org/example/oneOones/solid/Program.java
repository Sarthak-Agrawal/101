package org.example.oneOones.solid;

import org.example.oneOones.solid.report.LetterReport;
import org.example.oneOones.solid.report.Report;
import org.example.oneOones.solid.report.TabloidLetterReport;

public class Program {

    public static void main(String[] args) {

        Report report = new TabloidLetterReport();
        report.print();
    }
}
