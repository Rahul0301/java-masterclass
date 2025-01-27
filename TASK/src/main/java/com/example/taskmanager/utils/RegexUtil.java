package com.example.taskmanager.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    public static void extractTaskDetails(String logMessage) {
        Pattern pattern = Pattern.compile("Task \\[ID: (\\d+)\\] - Status: (\\w+)");
        Matcher matcher = pattern.matcher(logMessage);

        if (matcher.find()) {
            System.out.println("Extracted Task ID: " + matcher.group(1));
            System.out.println("Extracted Status: " + matcher.group(2));
        } else {
            System.out.println("No match found.");
        }
    }
}
