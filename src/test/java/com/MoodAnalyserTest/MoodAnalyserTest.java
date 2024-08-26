package com.MoodAnalyserTest;

import com.MoodAnalyser.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_shouldReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMessage_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Any Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
