package com.Day2.TextEditor;

import java.util.Stack;

public class TextEditor {

    private StringBuilder content = new StringBuilder();
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();
    }

    public void delete(int length) {
        if (length > content.length()) return;

        String removed = content.substring(content.length() - length);
        content.delete(content.length() - length, content.length());

        undoStack.push(new Action("delete", removed));
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content.delete(content.length() - action.text.length(), content.length());
        } else if (action.type.equals("delete")) {
            content.append(action.text);
        }

        redoStack.push(action);
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content.append(action.text);
        } else if (action.type.equals("delete")) {
            content.delete(content.length() - action.text.length(), content.length());
        }

        undoStack.push(action);
    }

    public void display() {
        System.out.println("Text: " + content.toString());
    }
}
