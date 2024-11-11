package sinhviencaodang;

public class Test {

	public static void main(String[] args) {
		SVCDN svn = new SVCDN();
		SVCDCQ svcq = new SVCDCQ();
		
		//sinh vien cd nghe
		svn.nhapThongTin();
		svn.inThongTin();
		
		//sinh bien cd chinh quy
		svcq.nhapThongTin();
		svcq.inThongTin();
	}
}
