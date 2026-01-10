package com.Day1.BrowserBuddy;

import java.util.Stack;

public class ClosedTabsManager {

    private Stack<String> closedTabs = new Stack<>();

    public void closeTab(String url) {
        closedTabs.push(url);
        System.out.println("Closed tab: " + url);
    }

    public String reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore!");
            return null;
        }
        String url = closedTabs.pop();
        System.out.println("Reopened tab: " + url);
        return url;
    }
}
