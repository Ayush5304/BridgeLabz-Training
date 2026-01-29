package com.FunctionalInterfaces.MarkerInterfaces.DataSerializationforBackup;

import java.io.Serializable;

class PatientRecord implements Serializable {
    private int id;
    private String name;
    private String diagnosis;

    public PatientRecord(int id, String name, String diagnosis) {
        this.id = id;
        this.name = name;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + diagnosis;
    }
}
