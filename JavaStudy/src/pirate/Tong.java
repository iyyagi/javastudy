package pirate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 통 클래스 생성
public class Tong {
	Scanner sc = new Scanner(System.in);
	boolean[] stabbed; // 찌를때 사용하는 변수
	boolean[] knifeHole; // 칼을 찌르는 곳
//	List<Boolean> knifeHole = new ArrayList<>();
	// kkwang 꽝의 개수
	public Tong(int size, int kkwang) {
		knifeHole = new boolean[size];
		stabbed = new boolean[size];
		for (int i = 0; i < kkwang; ++i) {
			knifeHole[i] = true;
		}

		// shuffle 칼 찌르는 곳을 섞는다.
		
		
		for (int i = 0; i < 1000; ++i) {
			int randex = (int)(Math.random() * knifeHole.length);
			boolean tmp = knifeHole[0];
			knifeHole[0] = knifeHole[randex];
			knifeHole[randex] = tmp;
		}
	}
	
	/** 
	 	true가 리턴되면 아저씨가 발사됨, false는 발사하지 않음
	 	@param num - 칼을 꼽고 싶은 번호를 전달
	 */
	
	// 칼을 찔렀던 곳인지 판별하는 코드
	public boolean stab(int num) {
		while (stabbed[num]) {
			System.out.println("이미 찔렀던 곳입니다. 다시 입력해 주세요.");
			System.out.print(">");
			num = sc.nextInt();
		}
		stabbed[num] = true;
		return knifeHole[num];
	}
	
	// 통에 대한 정보를 화면에 출력
	public void view() {
		for (int i = 0; i < stabbed.length; ++i) {
			if (!stabbed[i]) {
				System.out.printf("%02d ", i);
			} else {
				System.out.printf("%s", "XX");
			}
			
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		System.out.println();
	}

}
