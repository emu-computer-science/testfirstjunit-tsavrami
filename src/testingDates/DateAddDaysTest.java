package testingDates;
import static org.junit.Assert.*;
import org.junit.*;

public class DateAddDaysTest {
	
private static Date janThird = new Date("January",3,2019);
private static Date janThirtyFirst = new Date("January",31,2019);
private static Date febTwentyEigth = new Date("February",28,2019);
private static Date julyThirtieth = new Date("July",30,2019);
private static Date decThirtyFirst = new Date("December",31,2019);

	@Test
	public void testAddOneDay() {
		Date janFourth = new Date("January",4,2019);
		Date testDate = new Date(janThird);
		assertSame(janFourth, testDate.addOneDay());
	}


	@Test
	public void testAddDayNoCarry() {
		Date janTenth = new Date("January",10,2019);
		Date testDate = new Date(janThird);
		for(int i = 0; i < 7; i++)
			testDate.addOneDay();
		assertSame(janTenth, testDate);
	}
	
	@Test
	public void testAddDayMonthCarry() {
		Date testDate1 = new Date(janThirtyFirst);
		Date febFirst = new Date("February",1,2019);
		assertSame(febFirst, testDate1.addOneDay());
		
		Date testDate2 = new Date(febTwentyEigth);
		Date marFirst = new Date("March",1,2019);
		assertSame(marFirst, testDate2.addOneDay());
		
		Date testDate3 = new Date(julyThirtieth);
		Date septFirst = new Date("August",1,2019);
		assertSame(septFirst, testDate3.addOneDay());
		
	}
	
	@Test
	public void testAddDayYearCarry() {
		Date janFirst = new Date("January",1,2020);
		Date testDate = new Date(decThirtyFirst);
		assertSame(janFirst, testDate.addOneDay());
	}

}
