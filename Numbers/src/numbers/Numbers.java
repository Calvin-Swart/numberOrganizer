/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

/**
 *
 * @author swart
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberRangeSummarizer nrs = new NumberWorker();
        System.out.println(nrs.summarizeCollection(nrs.collect("1,2,1,2,1,2")));
        Tester test = new Tester();
        test.testCollector();
        test.testSumarizer();
        }
    } 

//1,2,3,3,2,1,5,6,7,8,9,1,1,1,1,2,3,2,2,1,2,1,2,1
//1,3,6,7,8,12,13,14,15,21,22,23,24,31