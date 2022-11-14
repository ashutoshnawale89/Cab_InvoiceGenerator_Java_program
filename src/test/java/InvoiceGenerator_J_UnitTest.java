import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.program.InvoiceGenerator;
import com.program.InvoiceSummary;
import com.program.Ride;
public class InvoiceGenerator_J_UnitTest {
	@Test
    public void test() {
		InvoiceGenerator obj = new InvoiceGenerator();
        Assert.assertEquals(120.0,obj.getInvoice(10, 20,"R"), 0);
    }

    @Test
    public void test1() {
    	InvoiceGenerator obj = new InvoiceGenerator();    
    	Assert.assertEquals(240.0, obj.generateInvoiceAsPerUserID(5),0);
    }
    @Test
    public void test2() {
    	InvoiceGenerator obj = new InvoiceGenerator();
    	Assert.assertEquals(220.0,obj.getInvoice(10, 20,"P"), 0);
    }

}