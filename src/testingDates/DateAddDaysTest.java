package testingDates;
import static org.junit.Assert.*;
import org.junit.*;

public class DateAddDaysTest {
	
private static Date janThird = new Date("January",3,2019);
private static Date janThirtyFirst = new Date("January",31,2019);
private static Date febTwentyEigth = new Date("February",28,2019);
private static Date aprilThirtieth = new Date("April",30,2019);
private static Date decThirtyFirst = new Date("December",31,2019);

	@Test
	public void testAddOneDay() {
		Date janFourth = new Date("January",4,2019);
		Date testDate = new Date(janThird).addOneDay();
		assertEquals(janFourth.getMonth(), testDate.getMonth());
		assertEquals(janFourth.getDay(), testDate.getDay());
		assertEquals(janFourth.getYear(), testDate.getYear());
	}


	@Test
	public void testAddDayNoCarry() {
		Date janTenth = new Date("January",10,2019);
		Date testDate = new Date(janThird);
		for(int i = 0; i < 7; i++)
			testDate.addOneDay();
		assertEquals(janTenth.getMonth(), testDate.getMonth());
		assertEquals(janTenth.getDay(), testDate.getDay());
		assertEquals(janTenth.getYear(), testDate.getYear());
	}
	
	@Test
	public void testAddDayMonthCarry() {
		Date febFirst = new Date("February",1,2019);
		Date testDate1 = new Date(janThirtyFirst).addOneDay();
		assertEquals(febFirst.getMonth(), testDate1.getMonth());
		assertEquals(febFirst.getDay(), testDate1.getDay());
		assertEquals(febFirst.getYear(), testDate1.getYear());
		
		Date marFirst = new Date("March",1,2019);
		Date testDate2 = new Date(febTwentyEigth).addOneDay();
		assertEquals(marFirst.getMonth(), testDate2.getMonth());
		assertEquals(marFirst.getDay(), testDate2.getDay());
		assertEquals(marFirst.getYear(), testDate2.getYear());
		
		Date mayFirst = new Date("May",1,2019);
		Date testDate3 = new Date(aprilThirtieth).addOneDay();
		assertEquals(mayFirst.getMonth(), testDate3.getMonth());
		assertEquals(mayFirst.getDay(), testDate3.getDay());
		assertEquals(mayFirst.getYear(), testDate3.getYear());
		
	}
	
	@Test
	public void testAddDayYearCarry() {
		Date janFirst = new Date("January",1,2020);
		Date testDate = new Date(decThirtyFirst).addOneDay();
		assertEquals(janFirst.getMonth(), testDate.getMonth());
		assertEquals(janFirst.getDay(), testDate.getDay());
		assertEquals(janFirst.getYear(), testDate.getYear());
	}

}
