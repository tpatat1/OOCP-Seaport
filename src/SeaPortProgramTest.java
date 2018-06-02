import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SeaPortProgramTest {
	SeaPortProgram spp = new SeaPortProgram();
	@Test
	public void test() {
		String line = "dock Pier_4 20004 10000 30004";
		Dock ref = new Dock("Pier_4", 20004, 10000, 30004);
		Dock expect = (Dock)SeaPortProgram.parseFileLine(line);
		assert(ref.compareTo(expect)==1);
	}

}
