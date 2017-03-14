import static org.junit.Assert.*;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void enteringHeyThereFriendAnd7ReturnsProperOutput() {
		assertEquals("Hey\nthere\nfriend",Wrapper.wrap("Hey there friend",7));
	}
	
	@Test
	public void enteringSuchAGoodCoolStringThisIsAnd6ReturnsProperOutput() {
		assertEquals("Such a\ngood\ncool\nstring\nthis\nis!",Wrapper.wrap("Such a good cool string this is!",6));
	}
	
	@Test
	public void enteringWhatAGoodCoolStringThisIsWithExtraWhiteSpaceAnd6ReturnsProperOutput() {
		assertEquals("What a\ngood\ncool\nstringer\nthis\nis!",Wrapper.wrap("What  a good  cool stringer this is!",6));
	}
	
	@Test
	public void enteringAWordThatIsLargerThanColumnNumberReturnsTheWord() {
		assertEquals("Awesomeness",Wrapper.wrap("Awesomeness",10));
	}
	
	@Test
	public void enteringAStringContainingAllWordsLargerThanColumnNumbeReturnsProperOutput() {
		assertEquals("Awesomeness\nawesomeness\nawesomeness",Wrapper.wrap("Awesomeness awesomeness awesomeness",10));
	}
	
	@Test
	public void enteringAStringContainingAWordLargerThanColumnNumbeReturnsProperOutput() {
		assertEquals("What a\ngood\ncool\nstringer\nthis\nis!",Wrapper.wrap("What a good cool stringer this is!",6));
	}

	@Test
	public void enteringAnEmptyStringAnd1ReturnsTheOriginalString() {
		assertEquals("",Wrapper.wrap("",1));
	}
	
	@Test
	public void enteringAStringWithJustWhiteSpaceAnd1ReturnsTheOriginalString() {
		assertEquals(" ",Wrapper.wrap(" ",1));
	}
	
	@Test
	public void enteringAStringWithLessCharactersThanColumnNumberReturnsTheOriginalString() {
		assertEquals("Hey now you're an allstar",Wrapper.wrap("Hey now you're an allstar",30));
	}
	
}
