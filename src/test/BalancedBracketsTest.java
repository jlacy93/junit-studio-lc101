package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void strWithinTwoBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Lacy]"));
    }

    @Test
    public void strWithoutBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Lacy"));
    }

    @Test
    public void strWithOneOpenBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Lacy"));
    }

    @Test
    public void strWithOneClosedBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Lacy]"));
    }

    @Test
    public void strWithinTwoBracketsNotNull(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("Lacy"));
    }

}
