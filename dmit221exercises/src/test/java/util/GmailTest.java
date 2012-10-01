package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class GmailTest {

	@Test
	public void testSendmail() {
		Gmail mailer = new Gmail("shoujianchu@gmail.com","*******");
		try {
			mailer.sendmail(
					"shoujianchu@gmail.com", 
					"schu4@nait.ca", 
					"DMIT221 exercise 6", 
					"Give me 100% for exercise 6");
		} catch (Exception e) {
			fail("Error sending email");
		}
		
	}

}
