package step9_01.OOP_Theory;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("0을 입력하면 종료됩니다.");
		System.out.print("Enter Number ? ");
		int getNumber = sc.nextInt();

		
//		int number = getNumber + 1;		// 입력한값보다 1큰값 / 시작값

		if (getNumber != 0) { // 종료가 아니면

			

			int cnt = 0;
			
			for (int i = getNumber; i <= getNumber * 2; i++) { // 500~1000
				
//				System.out.println("for1 : " + i);
				for (int j = 1; j <= i; j++) { // 1~ 500
//					System.out.println("for2 : " + i + " % " + j + " = " + (i%j));
					if ((i % j) == 0) {
						cnt++;
					}
				} 
				if (cnt == 2) {
					System.out.println(getNumber + " 보다 큰 첫번째 소수는 " + i + "이다.");
					break;
				} 
				
//				System.out.println("cnt : " + cnt);
				cnt = 0;
			}
			

			


		} else {
			System.out.println("종료합니다.");

		}
		sc.close();

	}

}
