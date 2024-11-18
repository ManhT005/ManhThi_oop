package dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

	HashMap<String,String> translate = new HashMap<>();
	//cung cap danh sach tu vung
	public void nhapTuVung() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu tieng Anh ");
		String engWord = sc.nextLine().toLowerCase();
		System.out.println("Nhap nghia tu vung ");
		String vieMean = sc.nextLine();
		this.translate.put(engWord, vieMean);
	}
	
	public String lookUp(String word) {
		word = word.toLowerCase();
		if(translate.containsKey(word)) {
			return translate.get(word);
		}
		else 
			throw new IllegalArgumentException("Khong tim thay nghia tu can tra!"+"\nKiem tra lai ban co nhap dung tu can tra khong!!!");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary enToVie = new Dictionary();
		System.out.println("Nhap so luong tu bo sung cho tu dien :");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			enToVie.nhapTuVung();
		}
		
		System.out.println("\n\n--------------------------\nTra tu dien : ");
		sc.nextLine();
		while(true) {
			System.out.println("Nhap tu can tra ");
			String word = sc.nextLine();
			try {
				System.out.println("Nghia cua tu la : "+enToVie.lookUp(word));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
