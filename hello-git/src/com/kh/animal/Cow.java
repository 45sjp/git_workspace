package com.kh.animal;

/**
 * reset : 지정 버전으로 돌아감
 * 	- hard : 이후 변경사항 모두 제거
 * 	- mixed : 이후 변경사항을 unstaged changes에서 관리
 * 	- soft : 이후 변경사항을 staging area에 추가
 * 
 * 		=> 원격에 push된 것까지 해결할 수는 없으므로 협업할 때 위험함
 * 
 * revert : 지정한 버전의 취소 버전을 새로 추가
 * 	- history를 변경할 수 없는 경우 유용함
 * 	- conflict 발생가능성 있음
 */
public class Cow {
	private String name; // animal에서 추가
	
	public void run() {
		System.out.println("소가 달립니다.");
	}
	
}
