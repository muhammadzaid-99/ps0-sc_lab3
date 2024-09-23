/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        assertFalse("Expected false: required self code, cited publicy available code, not of a coursework",
        		RulesOf6005.mayUseCodeInAssignment(false, true, false, true, true));
        assertTrue("Expected true: not required self code, cited publicy available code, not of a coursework",
        		RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
        assertFalse("Expected true: not required self code, cited publicy un-available code, not of a coursework",
        		RulesOf6005.mayUseCodeInAssignment(false, false, false, true, false));
        assertFalse("Expected true: not required self code, cited publicy available code, part of a coursework",
        		RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }
    
}
