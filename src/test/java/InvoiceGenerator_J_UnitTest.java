import org.junit.Assert;
import org.junit.Test;

import com.program.InvoiceGenerator;
public class InvoiceGenerator_J_UnitTest {
	@Test
	public void calculateFareOfTheOneRides()  {
		InvoiceGenerator obj=new InvoiceGenerator();
		double test=obj.calculateFare(10, 15);
		Assert.assertEquals(115.0, test, 0.0);
	}


}