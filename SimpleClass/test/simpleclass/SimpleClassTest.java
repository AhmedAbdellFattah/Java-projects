/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package simpleclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Legion
 */
public class SimpleClassTest {
    
    public SimpleClassTest() {
    }

    @Test
    public void testAddEm() {
        SimpleClass test = new SimpleClass();
        int expected = 3;
        int actual;
        
        actual = test.addEm(1, 2);
        
        assertEquals(expected, actual, "AddEm does not work correctly");
    }
    
}
