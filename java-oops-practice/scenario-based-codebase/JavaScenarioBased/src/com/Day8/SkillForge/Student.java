package com.Day8.SkillForge;

class Student extends User {
    private double progress; 

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void updateProgress(double completedModules, double totalModules) {
        progress = (completedModules / totalModules) * 100; 
    }

    public double getProgress() {
        return progress;
    }
}
