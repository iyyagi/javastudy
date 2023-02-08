package myobj2;

import java.util.Arrays;

// 제네릭은 나중에 인스턴스 생성시 결정되고 결정하지 않으면 Object 타입으로 사용이 된다
public class MyCollection<MyType> {
	
	MyType data;
	Object[] array = new Object[10] ;
	
	int index = 0;
	
	public void print() {
		System.out.println(data);
	}
	
	public void add(MyType data) {
		// 계속 추가하다 보면 배열의 자리가 차게된다. 그럴경우 사용하는 로직
		// 쓰던 배열이 가득 차면 새로운 배열을 2배 크기로 만든 후 데이터를 옭긴다.
		if (index == array.length) {
			// 2배 크기의 새로운 배열을 생성
			Object[] newArray = new Object[array.length * 2];
			// 데이터 복사
			for (int i = 0; i < array.length; ++i) {
				newArray[i] = array[i];
			}
			// 새로 생성한 배열로 교체
			array = newArray;
		}
		array[index++] = data;
	}
	
	public MyType get(int index) {
		return (MyType)array[index];
	}
	
	
}
