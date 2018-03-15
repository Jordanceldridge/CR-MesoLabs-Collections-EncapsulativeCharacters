package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class WCTest {
    @Test
    public void countAllTheWordsInFile(){
        //Given
        WC wc = new WC("/Users/jordanelderidge/dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        Integer expected = 9;
        Integer actual = wc.countAllTheWordsInFile().size();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void printOutWordsInDescendingOrder() {
        WC wc = new WC("/Users/jordanelderidge/dev/CR-MesoLabs-Collections-EncapsulativeCharacters/src/main/resources/someTextFile.txt");
        // We need this line to run this method
        wc.countAllTheWordsInFile();
        String expected = "";
        // we need to call wc because we need to call the method on the object.
        String actual = wc.printOutWordsInDescendingOrder();
        Assert.assertEquals(expected,actual);
    }

}