public class FitnessChallengeTracker {

    public static void main(String[] args) {

        // Push-ups done each day (0 means rest day)
        int[] weeklyPushUps = {30, 0, 25, 40, 0, 35, 20};

        int totalPushUps = 0;
        int activeDays = 0;

        for (int pushUps : weeklyPushUps) {

            if (pushUps == 0) {
                continue;  
            }

            totalPushUps += pushUps;
            activeDays++;
        }

        double averagePushUps = (double) totalPushUps / activeDays;

        System.out.println("Sandeep's Weekly Fitness Report");
        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Average Push-ups per active day: " + averagePushUps);
    }
}
