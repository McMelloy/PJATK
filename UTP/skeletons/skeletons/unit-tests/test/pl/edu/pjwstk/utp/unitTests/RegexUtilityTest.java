package pl.edu.pjwstk.utp.unitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegexUtilityTest {
	
	private RegexUtility _sut;
	
    @Test
	public void matches() {
		Assert.assertTrue(_sut.matches("ala"));
		Assert.assertFalse(_sut.matches("ala ma kota"));
	}
    
    @Before
    public void before() {
    	_sut = new RegexUtility("^ala$");
    }
}