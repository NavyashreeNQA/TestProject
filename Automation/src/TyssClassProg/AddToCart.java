package TyssClassProg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddToCart {
	@Test(dataProvider="getDataForAddCart")
	public void addCart(String category,String ProductName,int qty) {
		System.out.println("Execute => "+category+" = > "+ProductName+" = >"+qty);
	}
	@DataProvider
	public Object[][] getDataForAddCart(){
		Object[][] objArr=new Object[3][3];
		objArr[0][0]="Mobile";
		objArr[0][1]="Mi A2";
		objArr[0][2]=10;
		objArr[1][0]="Mobile";
		objArr[1][1]="vivo s1";
		objArr[1][2]=7;
		objArr[2][0]="Tv";
		objArr[2][1]="LG";
		objArr[2][2]=1;
		return objArr;
	}

}
