package com.MoodAnalyser;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message == null || message.isEmpty()) {
                return "HAPPY";
            }
            if (message.contains("Sad")) {
                return "SAD";
            }
            return "HAPPY";
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
