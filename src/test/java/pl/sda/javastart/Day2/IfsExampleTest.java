package pl.sda.javastart.Day2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfsExampleTest {
    @Test
    public void ShouldNotAnswerBecauseWeAreAsleep() {
        boolean mum = true;
        boolean isMorning = true;
        boolean isAsleep = true;


           boolean result = IfsExample.answerCell(mum, isMorning, isAsleep);

           assertFalse(result);
    }

    @Test
    public void ShouldNotAnswerBecauseWeAreNotAsleepAndIsMorningAndIsNotMum() {
        boolean mum = false;
        boolean isMorning = true;
        boolean isAsleep = false;


           boolean result = IfsExample.answerCell(mum, isMorning, isAsleep);

           assertFalse(result);
    }
}