package com.Day2.TextEditor;

public class TextEditorApp{
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello ");
        editor.insert("World");
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();

        editor.delete(5);
        editor.display();

        editor.undo();
        editor.display();
    }
}
