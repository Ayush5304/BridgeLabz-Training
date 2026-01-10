package com.Day1.BrowserBuddy;

public class BrowserTab {

    private BrowserHistory history;

    public BrowserTab(String homepage) {
        history = new BrowserHistory(homepage);
    }

    public void visitPage(String url) {
        history.visit(url);
    }

    public void goBack() {
        history.back();
    }

    public void goForward() {
        history.forward();
    }

    public String getCurrentPage() {
        return history.getCurrentPage();
    }
}
