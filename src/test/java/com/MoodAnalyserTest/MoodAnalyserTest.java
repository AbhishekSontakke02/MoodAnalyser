package com.MoodAnalyserTest;

import com.MoodAnalyser.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_shouldReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMessage_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_shouldReturnHAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }

}
