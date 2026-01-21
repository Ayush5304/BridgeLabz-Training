package com.Day9.MusicApp;

class MusicLibraryBST {

    SongNode root;

    void insert(int trackId, String title, String artist) {
        root = insertSong(root, trackId, title, artist);
    }

    SongNode insertSong(SongNode root, int trackId, String title, String artist) {

        if (root == null) {
            return new SongNode(trackId, title, artist);
        }

        if (title.compareToIgnoreCase(root.title) < 0) {
            root.left = insertSong(root.left, trackId, title, artist);
        } else {
            root.right = insertSong(root.right, trackId, title, artist);
        }

        return root;
    }

    void searchByTrackId(int trackId) {
        SongNode result = searchTrack(root, trackId);

        if (result != null) {
            System.out.println("Track Found → ID: " + result.trackId +
                    ", Title: " + result.title +
                    ", Artist: " + result.artist);
        } else {
            System.out.println("Track not found.");
        }
    }

    SongNode searchTrack(SongNode root, int trackId) {

        if (root == null)
            return null;

        if (root.trackId == trackId)
            return root;

        SongNode leftResult = searchTrack(root.left, trackId);
        if (leftResult != null)
            return leftResult;

        return searchTrack(root.right, trackId);
    }

    void showPlaylist() {
        if (root == null) {
            System.out.println("Playlist is empty.");
        } else {
            inorder(root);
        }
    }

    void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Title: " + root.title +
                    " | Artist: " + root.artist +
                    " | Track ID: " + root.trackId);
            inorder(root.right);
        }
    }
}
