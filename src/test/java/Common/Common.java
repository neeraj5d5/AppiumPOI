package Common;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

public class Common {
	@BeforeTest
	public static void KillServer(){
		try {
			Runtime.getRuntime().exec(System.getProperty("taskkill /F /IM node.exe"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
