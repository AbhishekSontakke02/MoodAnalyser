package com.MoodAnalyser;

public class MoodAnalysisException extends Exception {
    public enum ExceptionType {
        EMPTY_OR_NULL;
    }

    public ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
