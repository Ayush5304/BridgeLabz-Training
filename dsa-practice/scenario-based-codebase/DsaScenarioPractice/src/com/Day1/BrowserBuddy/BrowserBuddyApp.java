package com.Day1.BrowserBuddy;

public class BrowserBuddyApp {
    public static void main(String[] args) {

        ClosedTabsManager tabManager = new ClosedTabsManager();
        BrowserTab tab = new BrowserTab("google.com");

        tab.visitPage("github.com");
        tab.visitPage("stackoverflow.com");

        tab.goBack();
        tab.goForward();

        tabManager.closeTab(tab.getCurrentPage());

        String restoredTab = tabManager.reopenTab();
        if (restoredTab != null) {
            tab = new BrowserTab(restoredTab);
        }
    }
}
