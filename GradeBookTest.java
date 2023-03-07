import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {

	Object gradebook1;
	Object gradebook2;
	Object gradebook;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		gradebook1 = new GradeBook(5);
        gradebook2 = new GradeBook(5);
        
        ((GradeBook) gradebook1).addScore(85);
        ((GradeBook) gradebook1).addScore(92);
        ((GradeBook) gradebook1).addScore(78);
        
        ((GradeBook) gradebook2).addScore(90);
        ((GradeBook) gradebook2).addScore(88);
        ((GradeBook) gradebook2).addScore(95);
	}

	@AfterEach
	public void tearDown() throws Exception {
		gradebook1 = null;
        gradebook2 = null;
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddScore() {
		assertTrue(gradebook.toString().equals("85.0 92.0 78.0 "));
		assertEquals(3, ((GradeBook) gradebook).getScoreSize());
	}

	@Test
	void testSum() {
		fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(78.0, ((GradeBook) gradebook).minimum(), 0.0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(177.0, ((GradeBook) gradebook).finalScore(), 0.0001);
        ((GradeBook) gradebook).addScore(95);
        assertEquals(270.0, ((GradeBook) gradebook).finalScore(), 0.0001);
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
