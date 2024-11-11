package giangviendaihoc;

public class Test {

	public static void main(String[] args) {
		GVThinhGiang tg = new GVThinhGiang();
		GVCoHuu ch = new GVCoHuu();
		// giang vien thinh giang
		tg.nhapThongTin();
		tg.inThongTin();
		
		//giang vien co huu
		ch.nhapThongTin();
		ch.inThongTin();
	}
}
