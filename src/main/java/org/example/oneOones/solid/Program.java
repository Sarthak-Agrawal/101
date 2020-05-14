package org.example.oneOones.solid;

import org.example.oneOones.solid.report.Report;
import org.example.oneOones.solid.report.TabloidReport;

public class Program {

    public static void main(String[] args) {

        Report report = new TabloidReport();
        report.print();
    }
}
