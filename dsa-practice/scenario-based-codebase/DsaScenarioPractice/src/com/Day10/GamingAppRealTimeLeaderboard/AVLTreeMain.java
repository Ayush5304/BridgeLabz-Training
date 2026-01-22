package com.Day10.GamingAppRealTimeLeaderboard;

public class AVLTreeMain {

    public static void main(String[] args) {

        AVLTree leaderboard = new AVLTree();

        leaderboard.addPlayer("Alex", 950);
        leaderboard.addPlayer("Ryan", 880);
        leaderboard.addPlayer("John", 990);
        leaderboard.addPlayer("Sam", 910);
        leaderboard.addPlayer("Emma", 970);
        leaderboard.addPlayer("Liam", 930);
        leaderboard.addPlayer("Noah", 940);
        leaderboard.addPlayer("Mia", 900);
        leaderboard.addPlayer("Olivia", 920);
        leaderboard.addPlayer("Sophia", 960);
        leaderboard.addPlayer("Ava", 985);

        leaderboard.showTop10();

        System.out.println("\n Removing player with score 970");
        leaderboard.removePlayer(970);

        leaderboard.showTop10();
    }
}
