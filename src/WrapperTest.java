import static org.junit.Assert.*;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void enteringHeyThereFriendAnd7ReturnsProperOutput() {
		assertEquals("Hey\nthere\nfriend\n",Wrapper.wrap("Hey there friend",7));
	}
	
	@Test
	public void enteringSuchAGoodCoolStringThisIsAnd6ReturnsProperOutput() {
		assertEquals("Such a\ngood\ncool\nstring\nthis\nis!\n",Wrapper.wrap("Such a good cool string this is!",6));
	}
	
	@Test
	public void enteringWhatAGoodCoolStringThisIsWithExtraWhiteSpaceAnd6ReturnsProperOutput() {
		assertEquals("What a\ngood\ncool\nstringer\nthis\nis!\n",Wrapper.wrap("What  a good  cool stringer this is!",6));
	}
	
	@Test
	public void enteringWhatAGoodCoolStringerThisIsAnd6ReturnsProperOutput() {
		assertEquals("What a\ngood\ncool\nstringer\nthis\nis!\n",Wrapper.wrap("What a good cool stringer this is!",6));
	}

}
