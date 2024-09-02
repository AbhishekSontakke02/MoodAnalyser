package com.MoodAnalyser;

import java.util.function.Predicate;

public class MoodAnalyzer {
    private String message;

    private static final Predicate<String> sadMood = messege -> messege.contains("Sad");

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException {
        try {
            if (message == null || message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_OR_NULL, "Mood cannot be null or empty");
            }
            if (sadMood.test(message)) {
                return "SAD";
            }
            return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_OR_NULL, "Mood cannot be null or empty");
        }
    }
}

