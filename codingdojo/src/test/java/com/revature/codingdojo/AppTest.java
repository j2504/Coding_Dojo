package com.revature.codingdojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
    String sentence = "lady lady lady lady was lady lady";
    String word1 = "" + "" + "" + "" + "" + "" + "" + "" + "" + "" + "lady";
    String word2 = "was";
    Solution1 solution1;

    @Before
    public void setup() {

        // create an instance of solution to arrange objects needed for test cases
        solution1 = new Solution1();

    }

    @Test
    public void sanityCheck() {
        assertNotNull(solution1);

    }

    @Test
    public void wordNotFound() {
        word1 = "or";
        assertThrows(Exception.class, () -> {
            solution1.answer(word1, word2, sentence);
        });

    }

    @Test
    public void emptyString() {

    }

    @Test
    public void sameWord() {

    }

    @Test
    public void word2BeforeWord1() {

    }

    @Test
    public void word2AfterWord1() {

    }

    @Test
    public void wordsAdject() {

    }

    @Test
    public void empytSentance() {

    }

    @Test
    public void wordSubstring() {

    }

    @Test
    public void whiteSpace() {

    }

}
