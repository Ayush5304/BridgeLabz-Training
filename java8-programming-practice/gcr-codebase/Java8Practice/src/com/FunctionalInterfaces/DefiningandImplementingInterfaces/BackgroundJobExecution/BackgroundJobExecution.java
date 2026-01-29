package com.FunctionalInterfaces.DefiningandImplementingInterfaces.BackgroundJobExecution;

public class BackgroundJobExecution {
    public static void main(String[] args) {

        Runnable dataBackupTask = () -> {
            System.out.println(" Backup started...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" Backup completed successfully!");
        };

        Thread backgroundThread = new Thread(dataBackupTask);
        backgroundThread.start();

        System.out.println("Main program continues running...");
    }
}
