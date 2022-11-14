import org.junit.Assert;
import org.junit.Test;

import com.program.InvoiceGenerator;
import com.program.Ride;
public class InvoiceGenerator_J_UnitTest {
	@Test
	public void CalculateFar()  {
		InvoiceGenerator obj=new InvoiceGenerator();
		double test=obj.calculateFare(10, 15);
		double test1=obj.calculateFare(10, 15)+obj.calculateFare(10, 15);;
		Assert.assertEquals(230.0, test1, 0.0);
	}
	@Test
	public void MonthFare()  {
		InvoiceGenerator obj=new InvoiceGenerator();
		Ride[] rides= { new Ride(1,23), new Ride(1,2)};
		double monthfare=obj.calculateFare(rides);
		Assert.assertEquals(45.0,monthfare , 0.0);
		
		}
	}