package exchange_money;

import java.util.ArrayList;

public class Exchange {

	protected ArrayList<Rate> dsTyLeDoiTien = new ArrayList<>();
	
	public double convert(String code1, String code2, double amount) {
		/*
		 * duyet tung phan tu trong list<Rate>
		 * neu gap dung chuyen doi theo ti le cho truoc thi tien hanh chuyen doi 
		 */
		for (Rate x : dsTyLeDoiTien) {
			if(x.code1.equals(code1) && x.code2.equals(code2)) {
				double result = amount * x.rate;
				return result;
			}
		}
		throw new IllegalArgumentException("Khong co ti le chuyen doi tu ma tien "+code1+ " ==> ma tien "+code2);
		
		
	}
}
