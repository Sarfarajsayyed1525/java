import java.time.LocalDate;
import java.time.Period;

public class AgeCalc
{

	public static void main(String[] args)
  {
		LocalDate dob = LocalDate.of(1999, 01, 22) ;
		
		LocalDate curDate = LocalDate.now();  
		
		Period period = Period.between(dob, curDate);  
		  
		System.out.printf(" age :"+ period.getYears());

	}
}