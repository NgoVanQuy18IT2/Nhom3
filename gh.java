package ngan;

import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class gh {
	
	Vector list = new Vector();
	public gh() {
		while(true) {
			System.out.println("Quan ly Hocsinh");
			System.out.println("1. Nhap Thong Tin");
			System.out.println("2. Tra Cuu ThongTin");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong hoc sinh=");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ma hoc sinh=");
			String maHs=key.nextLine();
			System.out.println("Nhap ten ");
			String tenHs=key.nextLine();
			System.out.println("Nam sinh");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namsinh=key.nextLine();	
			main b = new main(maHs,tenHs,namsinh);
			list.add(b);
		}	
		
	}
	public void InTT() {
		Enumeration eStudent = list.elements();
		int i=1;
		while(eStudent.hasMoreElements()) {
			main student = (main)eStudent.nextElement();
			System.out.println("Ma hoc sinh ="+student.getMaSV()+" va ten hoc sinh la "+student.getTen());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new gh();
	}

}


