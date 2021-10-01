package co.micol.exam1001;

public class RankAgorithm {
	private int[] grade = { 80, 100, 80, 55, 75, 42, 10 };
	private int[] rank;
	
	private void rank() {
		rank = new int[grade.length]; // 기존 배열 크기와 똑같은 배열 생성
		for (int i = 0; i < rank.length; i++) { // rank 배열의 초기화
			rank[i] = 1;
		}
		
//		for(int i: rank) { // 값초기화할땐(값입력단엔) 쓰지않고 출력할때만 씀
//			i = 1;
//		}

		for (int i = 0; i < grade.length; i++) {
			for (int j = i + 1; j < grade.length; j++) {
				if(grade[i] > grade[j]) {
					rank[j] ++;  
				}else if(grade[i] < grade[j]) {
					rank[i] ++;
				}
			}
		}
	}
	
	
	public String toString() {
		rank();
		for(int g : grade) {  //보다 나은 for문, forEach구문 => 주로 값을 읽을때
			System.out.print(g + " ");
		}
		System.out.println();
		for(int r : rank) {
			System.out.print(r + " ");
		}
		
		
		return null;
	}
}
