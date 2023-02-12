package ru.clevertec;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomTestPluginTest {
    @Test
    void testPlugin() {
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("ru.clevertec.customtestplugin");
        Assertions.assertNotNull(project.task("helloPlugin"));


    }
}