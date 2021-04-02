package step9_01.OOP_Theory;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		
		System.out.println("문제 18) 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다");
		System.out.println("         s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다.");
		System.out.println("         조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장");
		
		System.out.print(" { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		int check = -1;
		for (int i = 0; i < 5; i++) {
			
			System.out.print("입력 : ");
			int getArr = sc.nextInt();
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println(getArr);
				if (getArr == arr[j]) {
					
					check = j;
					System.out.println(arr[j] + " " + check);
					break;
				} else if (getArr != arr[j]) {
					
					check = -1;
					System.out.println(arr[j] + " " + check);
				} 
			}
			
			if (check > -1) {
				s[i] = check;
			} else {
				s[i] = check;
			}
			
		}
		
		System.out.print(" { ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
			if (i < s.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		sc.close();
	}

}
