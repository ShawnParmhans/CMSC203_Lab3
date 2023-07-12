/*
 Class: CMSC203 CRN 40398
 Program: Lab 3
 Instructor: Farnaz Eivazi
 Summary of Description: 
 Due Date: 07/11/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Shawn Parmhans
*/


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
    private GradeBook gradeBook1;
    private GradeBook gradeBook2;
    
	@BeforeEach
	void setUp() throws Exception {
		// Create two GradeBook objects 
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        // gradeBook1 scores
        gradeBook1.addScore(87.0);
        gradeBook1.addScore(70.5);

        //gradeBook2 scores
        gradeBook2.addScore(68.0);
        gradeBook2.addScore(91.0);
        gradeBook2.addScore(88.5);
	}

	@AfterEach
	void tearDown() throws Exception {
        // Set the GradeBooks to null
        gradeBook1 = null;
        gradeBook2 = null;
	}

	@Test
	void testAddScore() {
        //add scores to gradeBook1
        assertTrue(gradeBook1.addScore(95.0));
        assertTrue(gradeBook1.addScore(88.5));
        assertEquals("87.0 70.5 95.0 88.5", gradeBook1.toString());
        assertEquals(4, gradeBook1.getScoresSize());

        //add scores to gradeBook2
        assertTrue(gradeBook2.addScore(85.0));
        assertEquals("68.0 91.0 88.5 85.0", gradeBook2.toString());
        assertEquals(4, gradeBook2.getScoresSize());
	}

	@Test
	void testSum() {
        //sum of gradeBook1
        assertEquals(157.5, gradeBook1.sum());

        //sum of gradeBook2
        assertEquals(247.5, gradeBook2.sum());
	}

	@Test
	void testMinimum() {
        //minimum score in gradeBook1
        assertEquals(70.5, gradeBook1.minimum());

        //minimum score in gradeBook2
        assertEquals(68.0, gradeBook2.minimum());
	}

	@Test
	void testFinalScore() {
        //final score in gradeBook1
        assertEquals(87.0, gradeBook1.finalScore());

        //final score in gradeBook2
        assertEquals(179.5, gradeBook2.finalScore());
	}

}
