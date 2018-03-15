package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;


public class ParenCheckerTest {
    @Test
    public void testCheckPair(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "You (Cant) Guard (me) bum";

        // When
        boolean checkPair = parenChecker.checkPair(value);
        Assert.assertTrue(checkPair);
    }
    @Test
    public void testCheckPair2(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "You (Cant) Guard me bum";
        //When
        boolean checkPair = parenChecker.checkPair(value);
        Assert.assertTrue(checkPair);
        //Then

    }
    @Test public void TestCheckForClosing(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "I love <Basketball> so (much)";
        //When
        boolean checkForClosing = parenChecker.checkForClosing(value);
        Assert.assertTrue(checkForClosing);
    }

    @Test public void TestCheckForClosing2(){
        //Given
        ParenChecker parenChecker = new ParenChecker();
        String value = "I love <Bask>etball {so m}uch";
        //When
        boolean checkForClosing = parenChecker.checkForClosing(value);
        Assert.assertTrue(checkForClosing);
    }




}