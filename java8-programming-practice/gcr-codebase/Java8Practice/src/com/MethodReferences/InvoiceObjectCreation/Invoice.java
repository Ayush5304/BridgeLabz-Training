package com.MethodReferences.InvoiceObjectCreation;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{TransactionID=" + transactionId + "}";
    }
}
