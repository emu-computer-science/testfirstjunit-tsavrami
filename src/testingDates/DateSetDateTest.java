package testingDates;
import static org.junit.Assert.*;
import org.junit.*;

public class DateSetDateTest {
	
	private static Date janThird = new Date("January",3,2019);
	
	@Test
	public void testLegalDate() {
		Date valentines = new Date("February", 14, 2025);
		Date testDate = new Date(janThird);
		testDate.setDate("February", 14, 2025);
		assertSame(valentines, testDate);	
	}
	
	@Test
	public void testIllegalDate() {
		Date janThird_copy = new Date(janThird);
		Date testDate = new Date(janThird);
		testDate.setDate("January", 40, 2019); // maybe do one for month and year also
		assertSame(janThird_copy, testDate);
	}
	
}
