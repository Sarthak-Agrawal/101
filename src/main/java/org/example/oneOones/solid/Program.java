package org.example.oneOones.solid;

import org.example.oneOones.solid.report.LetterReport;
import org.example.oneOones.solid.report.TabloidLetterReport;

public class Program {

    public static void main(String[] args) {

        LetterReport report = new TabloidLetterReport();
        report.print();
    }
}
