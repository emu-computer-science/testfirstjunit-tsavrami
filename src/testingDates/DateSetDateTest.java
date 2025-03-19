package testingDates;
import static org.junit.Assert.*;
import org.junit.*;

public class DateSetDateTest {
	
	private static Date janThird = new Date("January",3,2019);
	
	@Test
	public void testLegalDate() {
		Date valentines = new Date("February", 14, 2025);
		Date testDate = new Date(janThird).setDate("February", 14, 2025);
		assertEquals(valentines.getMonth(), testDate.getMonth());
		assertEquals(valentines.getDay(), testDate.getDay());
		assertEquals(valentines.getYear(), testDate.getYear());	
	}
	
	@Test
	public void testIllegalDate() {
		Date nullDate = null;
		Date testDate = new Date(janThird).setDate("January", 40, 2019); // maybe do one for month and year also
		assertSame(nullDate, testDate);
	}
	
}
