package step9_01.OOP_Theory;

import java.util.Scanner;

/*
 * 
 * 1. key값(기준값)을 입력받아서 저장한다.
 * 2. 반복문을 사용하여 -1을 입력받을때까지 일련의 수를 계속 받는다. -1을 입력받을 경우 종료한다.
 * 3. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
 * 4. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
 * 5. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
 * 
 * 예) 
 * key 값 입력 : 7
 * 
 * 입력 : 10
 * 입력 : 7
 * 입력 : 20
 * 입력 : 7
 * 입력 : 30
 * 입력 : 7
 * 입력 : 10
 * 입력 : -1
 * 
 * 결과 : key값 7가 첫번재 나타난 것은 2번째 이다.
 * 
 */

public class ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int temp = 0;
		int cnt = 0;
		boolean isRunning = true;
		
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│           LoopEx27_테스트문제              │");
		System.out.println("├────────────────────────────────────────────┤");
		System.out.println("│  1. key값(기준값)을 입력받아서 저장한다.   │");
		System.out.println("│                                            │");
		System.out.println("│  2. 반복문을 사용하여 -1을 입력받을때까지  │");
		System.out.println("│     일련의 수를 계속 받는다.               │");
		System.out.println("│     -1을 입력받을 경우 종료한다.           │");
		System.out.println("│                                            │");
		System.out.println("│  3. 위 수 중 key 값이 몇 번째에 포함되어   │");
		System.out.println("│     있는가를 출력하는 프로그램             │");
		System.out.println("│                                            │");
		System.out.println("│  4. 단, key가 여러개 포함되어 있을 경우    │");
		System.out.println("│     앞에 나타난 것의 위치를 출력하시오.    │");
		System.out.println("│                                            │");
		System.out.println("│  5. key가 일련의 수 안에 없는 경우         │");
		System.out.println("│     'not found'를 출력하시오.              │");
		System.out.println("└────────────────────────────────────────────┘");
		
		System.out.print("key값 입력 : ");
		int key = scan.nextInt();
		
		System.out.println("───────────────────────────────────────────────");
		
		while (isRunning) {

			System.out.print("입력 : ");
			int getNumber = scan.nextInt();

			cnt++;

			// <-- key count -->
			
			if (getNumber == key && temp == 0) {
				temp = cnt;
			} 
			
			//<-- 결과 값 출력 -->
			
			else if (getNumber == -1) {
				
				if (temp > 0) {
					System.out.println("───────────────────────────────────────────────");
					System.out.println("결과 : key값 " + key + "가 첫번재 나타난 것은 " + temp + "번째 이다.");
					System.out.println("───────────────────────────────────────────────");
					isRunning = false;
				}
				
				else {
					System.out.println("───────────────────────────────────────────────");
					System.out.println("결과 : key값 " + key + "    [  -- not found --  ]");
					System.out.println("───────────────────────────────────────────────");
					isRunning = false;
				}
			}
		}
		scan.close();
	}

}
