import org.junit.Assert;
import org.junit.Test;

import com.program.InvoiceGenerator;
import com.program.InvoiceSummary;
import com.program.Ride;
public class InvoiceGenerator_J_UnitTest {
	@Test
	public void givenUserId_shouldReturnInvoiceSummary() {
		try {
			String userId = "deepakpatil48@gmail.com";
			Ride[] rides ={new Ride(2.0,5),
					new Ride(0.1,1)};
			InvoiceGenerator.addRides(userId,rides);
			InvoiceSummary summary;

			summary = InvoiceGenerator.calculateFare(rides, "normal");

			InvoiceSummary	invoiceSummary = InvoiceGenerator.getInvoiceSummary(userId);
			Assert.assertEquals(invoiceSummary, summary);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}