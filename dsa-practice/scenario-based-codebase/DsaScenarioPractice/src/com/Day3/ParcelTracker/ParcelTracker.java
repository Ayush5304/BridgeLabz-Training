package com.Day3.ParcelTracker;

class ParcelTracker {

    private StageNode head;
 
    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    public void trackParcel() {
        StageNode current = head;

        if (current == null) {
            System.out.println("Parcel lost. No tracking data available.");
            return;
        }

        System.out.print("Tracking Status: ");
        while (current != null) {
            System.out.print(current.stage);
            if (current.next != null) System.out.print(" → ");
            current = current.next;
        }
        System.out.println();
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode temp = new StageNode(newStage);
        temp.next = current.next;
        current.next = temp;

        System.out.println("Checkpoint '" + newStage + "' added after '" + afterStage + "'");
    }

    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST.");
    }
}
