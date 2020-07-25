package TyssClassProg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="getLogin")
	public void Invalidlogin(String un,String pw) {
		System.out.println("username = "+un);
		System.out.println("password = "+pw);
	}

	@DataProvider
	public Object[][] getLogin() {
		Object[][] objArr=new Object[2][2];
		objArr[0][0]="Admin1";
		objArr[0][1]="manager1";
		objArr[1][0]="Admin2";
		objArr[1][1]="manager2";

		return objArr;
	}

}



