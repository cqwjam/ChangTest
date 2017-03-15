package Test;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain2 {
	
	private static final Logger log = LoggerFactory.getLogger(TestMain2.class); 
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure(TestMain2.class.getClassLoader().getResource("log4j.properties")); 
		
		String id = "123";
		
		String symbol = "abc";
		
		log.debug("Processing trade with id: {} and symbol : {} ", id, symbol);
	}

}
