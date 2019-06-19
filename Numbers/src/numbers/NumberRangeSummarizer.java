/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Collection;

/**
 *
 * @author swart
 */
public interface NumberRangeSummarizer {
    Collection<Integer> collect(String input);
    String summarizeCollection(Collection<Integer> input);
}
