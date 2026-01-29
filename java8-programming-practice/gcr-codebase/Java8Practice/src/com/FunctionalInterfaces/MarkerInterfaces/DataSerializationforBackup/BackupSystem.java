package com.FunctionalInterfaces.MarkerInterfaces.DataSerializationforBackup;

import java.io.*;

public class BackupSystem {
    public static void main(String[] args) throws Exception {

        PatientRecord p = new PatientRecord(101, "Ayush", "Fever");

        if (p instanceof Serializable) {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("backup.ser"));

            oos.writeObject(p);
            oos.close();

            System.out.println(" Backup stored successfully");
        }
    }
}
