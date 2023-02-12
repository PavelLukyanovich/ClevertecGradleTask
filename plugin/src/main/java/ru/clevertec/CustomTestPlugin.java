package ru.clevertec;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class CustomTestPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        project.task("hello")
                .doLast(task -> {
                    System.out.println("Hello ");
                });
    }
}
