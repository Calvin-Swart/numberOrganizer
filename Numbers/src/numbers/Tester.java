/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.testng.Assert;

/**
 *
 * @author swart
 */
public class Tester {
    
    @Test
    public void testCollector() {
        System.out.println("\nTesting Collector\n");
        try {
            NumberRangeSummarizer nrs = new NumberWorker();
            String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
            Collection<Integer> result = new ArrayList<>(nrs.collect(input));
            Collection<Integer> expected = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
            System.out.println("Input: \t\t\t" + input);
            System.out.println("Expected: \t\t" + expected);
            System.out.println("Result: \t\t" + result);
            Assert.assertEquals(expected, result);
            System.out.println("Passed.\n");
        } catch (AssertionError e) {
            System.out.println("Failed.\n");
        }
        
        try {
            NumberRangeSummarizer nrs = new NumberWorker();
            String input = "1,2,3,3,2,1,5,6,7,8,9,1,1,1,1,2,3,2,2,1,2,1,2,1";
            Collection<Integer> result = new ArrayList<>(nrs.collect(input));
            Collection<Integer> expected = Arrays.asList(1, 2, 3, 3, 2, 1, 5, 6, 7, 8, 9, 1, 1, 1, 1, 2, 3, 2, 2, 1, 2, 1, 2, 1);
            System.out.println("Input: \t\t\t" + input);
            System.out.println("Expected: \t\t" + expected);
            System.out.println("Result: \t\t" + result);
            Assert.assertEquals(expected, result);
            System.out.println("Passed.\n");
        } catch (AssertionError e) {
            System.out.println("Failed.\n");
        }
    }

    @Test
    public void testSumarizer() {
        System.out.println("\nTesting Summarizer\n");
        try {
            NumberRangeSummarizer nrs = new NumberWorker();
            String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
            String result = (nrs.summarizeCollection(nrs.collect(input)));
            String expected = "1, 3, 6-8, 12-15, 21-24, 31";
            System.out.println("Input: \t\t\t" + input);
            System.out.println("Expected: \t\t" + expected);
            System.out.println("Result: \t\t" + result);
            Assert.assertEquals(expected, result);
            System.out.println("Passed.\n");
        } catch (AssertionError e) {
            System.out.println("Failed.\n");
        }

        try {
            NumberRangeSummarizer nrs = new NumberWorker();
            String input = "1,2,3,2,1,2,3,4,5,1,5";
            String result = (nrs.summarizeCollection(nrs.collect(input)));
            String expected = "1-3, 2-1, 2-5, 1, 5";
            System.out.println("Input: \t\t\t" + input);
            System.out.println("Expected: \t\t" + expected);
            System.out.println("Result: \t\t" + result);
            Assert.assertEquals(expected, result);
            System.out.println("Passed.\n");
        } catch (AssertionError e) {
            System.out.println("Failed.\n");
        }

        try {
            NumberRangeSummarizer nrs = new NumberWorker();
            String input = "1,2,3,3,2,1,5,6,7,8,9,1,1,1,1,2,3,2,2,1,2,1,2,1";
            String result = (nrs.summarizeCollection(nrs.collect(input)));
            String expected = "1-3, 3-1, 5-9, 1, 1, 1, 1-3, 2, 2-1, 2-1, 2-1";
            System.out.println("Input: \t\t\t" + input);
            System.out.println("Expected: \t\t" + expected);
            System.out.println("Result: \t\t" + result);
            Assert.assertEquals(expected, result);
            System.out.println("Passed.\n");
        } catch (AssertionError e) {
            System.out.println("Failed.\n");
        }

        try {
            NumberRangeSummarizer nrs = new NumberWorker();
            String input = "1,3,2,4,5,6,7,8,5,4,6,5,4,3,4,3,4,5";
            String result = (nrs.summarizeCollection(nrs.collect(input)));
            String expected = "1, 3-2, 4-8, 5-4, 6-3, 4-3, 4-5";
            System.out.println("Input: \t\t\t" + input);
            System.out.println("Expected: \t\t" + expected);
            System.out.println("Result: \t\t" + result);
            Assert.assertEquals(expected, result);
            System.out.println("Passed.\n");
        } catch (AssertionError e) {
            System.out.println("Failed.\n");
        }

    }

}
