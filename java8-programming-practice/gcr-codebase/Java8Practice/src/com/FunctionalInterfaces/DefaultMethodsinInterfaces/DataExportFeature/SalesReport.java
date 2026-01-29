package com.FunctionalInterfaces.DefaultMethodsinInterfaces.DataExportFeature;

class SalesReport implements DataExporter {

    public void exportToCSV() {
        System.out.println("Sales report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}

class InventoryReport implements DataExporter {

    public void exportToCSV() {
        System.out.println("Inventory report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Inventory report exported to PDF");
    }
}
