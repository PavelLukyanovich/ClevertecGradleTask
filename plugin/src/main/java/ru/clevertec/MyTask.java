package ru.clevertec;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MyTask extends DefaultTask {
    @TaskAction
    public void myTask() {
        System.out.println("Hello from my plugin");
    }
}
