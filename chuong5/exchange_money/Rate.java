package exchange_money;

public class Rate {

	protected String code1;
	protected String code2;
	protected double rate;
	
	//constructor
	public Rate(String code1, String code2, double rate) {
		this.code1 = code1;
		this.code2 = code2;
		this.rate = rate;
	}
	
	
}
