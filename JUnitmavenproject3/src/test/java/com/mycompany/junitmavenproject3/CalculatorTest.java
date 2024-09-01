/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junitmavenproject3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Legion
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    @org.junit.jupiter.api.Test
    public void testAdd() {
        Calculator obj = new Calculator();
        assertEquals(5,obj.add(2,3));
    }
    
}
