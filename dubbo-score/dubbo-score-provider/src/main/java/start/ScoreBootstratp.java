package start;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScoreBootstratp {

	public static void main(String[] args) {
		/* Main.main(args); */

		Logger logger = LoggerFactory.getLogger(ScoreBootstratp.class);
		@SuppressWarnings("all")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		logger.debug("score app 启动完成...");
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
