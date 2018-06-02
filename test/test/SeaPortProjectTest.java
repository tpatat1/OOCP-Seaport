import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

@Test
public class SeaPortProjectTest {

	

	@Test
	public void test() {
		String line = "dock Pier_4 20004 10000 30004";
		Dock ref = ("Pier_4", 20004, 10000, 30004);
		Dock expect = spp.parseFileLine(line);
		assertEquals(ref, expect);
	}

}
