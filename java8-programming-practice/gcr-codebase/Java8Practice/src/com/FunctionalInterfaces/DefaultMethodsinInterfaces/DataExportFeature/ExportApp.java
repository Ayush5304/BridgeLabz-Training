package com.FunctionalInterfaces.DefaultMethodsinInterfaces.DataExportFeature;

public class ExportApp {
    public static void main(String[] args) {

        DataExporter report = new SalesReport();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();  
    }
}
