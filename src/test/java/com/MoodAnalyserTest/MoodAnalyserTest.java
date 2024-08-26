package com.MoodAnalyserTest;

import com.MoodAnalyser.MoodAnalysisException;
import com.MoodAnalyser.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadMessage_shouldReturnSAD() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMessage_shouldReturnHAPPY() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("HAPPY", mood);
    }

//    @Test
//    public void givenNullMood_shouldReturnHAPPY() throws MoodAnalysisException {
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
//        String mood = moodAnalyzer.analyzeMood();
//        Assertions.assertEquals("HAPPY", mood);
//    }

    @Test
    public void givenNullMood_shouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EMPTY_OR_NULL, e.type);
        }
    }

    @Test
    public void givenEmptyMood_shouldThrowMoodAnalysisException() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
            moodAnalyzer.analyzeMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EMPTY_OR_NULL, e.type);
        }
    }

}
