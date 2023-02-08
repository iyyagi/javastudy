
public class B14_Array {

	/*
	  # 배열 (Array)

	  - 같은 타입 변수를 한번에 여러개 선언하는 문법
	  - 같은 이름으로 변수를 여러개 선언한 후에 각 변수를 방 번호(index)로 구분한다
	  - 배열은 반드시 선언과 동시에 크기를 정해야 한다.
	  - 크기가 정해지고 나면 크기를 변경할 수 없다.
	  - 배열의 인덱스는 0부터 길이-1번 까지 있다. +1로 더할 수 있다.
	  - 배열의 값은 생성과 동시에 자동으로 초기화 되어 있다.
	  - (정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null)
	  # 배열 선언 방법
	  1. 타입[] 변수명 = new 타입[크기];
	  2. 타입[] 변수명 = {값1, 값2, 값3, 값4,...};
	  3. 타입[] 변수명 = new 타입[]{값1, 값2, 값3, ...};
	 */
	public static void main(String[] args) {
		int[] numbers = new int[10]; // 
		// 배열 이름에 방번호로 접근하면 값을 사용할 수 있다.
		numbers[0] = 77;
		numbers[5] = 9999;
		numbers[9] = 1;

		// 배열의 값 꺼내서 사용하기
		System.out.println(numbers[5]);
		System.out.println(numbers[0] + numbers[9]);




		char[] str = new char[10]; // 문자들의 배열 -> 문자열 char형 변수 10개 선언
		int[] arr1 = new int[100];
		int[] arr2 = {1, 2, 3, 4, 55, 6, 7, 8, 9, 11};
		int[] arr3 = new int[] {3, 4, 5, 5, 5, 1, 2, 1};
		System.out.println(arr2[4]);
		System.out.println(arr3[1]);

		// 배열에 .을 찍고 length를 통해 길이를 구할 수 있다.
		// (String과 다르게 ()를 쓰지 않는다)
		String[] animals = {"zibra", "monkey", "pig", "car", "dog"};

		System.out.println("동물은 모두 몇마리 ? " + animals.length);
		System.out.println("마지막 인덱스 ?" + (animals.length -1));
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		//System.out.println(animals[999]);

		// 변수는 반드시 초기화해야 사용할 수 있다.
		int a=0;
		System.out.println(a);
		
		String fruit = "Dragon Fruits";
		System.out.println(fruit);
		
		// 배열의 값은 초기화 한적 없어도 사용할 수 있다.
		String[] fruits = new String[15];
		
		fruits[0] = "Initialized Fruit";
		
		// 초기화 한적 없는 fruits[7]도 사용할 수 있다.
		System.out.println(fruits[0]);
		System.out.println(fruits[7]);
		
		boolean[] complete = new boolean[22]; // 0 ~ 21
		System.out.println(complete[5]);
		//System.out.println(complete[22]);
		
		// 배열은 반복문과 사용하기 아주 좋은 형태로 설계되어 있다.
		for (int index = 0; index < animals.length; ++index) {
			System.out.println(animals[index]);
		}
		// String 타입은 char[]로 변환하여 사용할 수 있다.
		String message = "Welcome to my web server";
		// char 배열
		char[] messageArr = message.toCharArray();
		System.out.println(messageArr[0]);
		System.out.println(messageArr[1]);
		System.out.println(messageArr[messageArr.length-1]);
	}

}
