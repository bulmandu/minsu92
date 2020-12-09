package test5;


public class Test5Main {

	public static void main(String[] args) {
		int[][] pond = {
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int depth = 0;
		boolean change = true;
		int[][] changedPond = null;
		while(change) {
			change = false; //초기Boolean=false
			changedPond = new int[pond.length][pond.length]; //재배치할 배열 생성
			for(int i=0; i<pond.length; i++) {
				
				for(int j=0; j<pond[i].length; j++) {
					changedPond[i][j] = pond[i][j];	//배열복사
					if(pond[i][j]!=0) { //연못일때
						
						int point = pond[i][j];
						int left = pond[i][j-1];
						int right = pond[i][j+1];
						int top = pond[i-1][j];
						int bottom = pond[i+1][j];
						
						if(left>=point && right>=point && top>=point && bottom>=point) { //상하좌우조건 만족할때 +1
							changedPond[i][j] +=1;
							change = true;
						}
					}
				}
			}
			for(int i=0; i<pond.length; i++) {
				for(int j=0; j<pond.length; j++) {
					pond[i][j] = changedPond[i][j]; //비교배열 재초기화
				}
			}
		}
		
		for(int i=0; i<changedPond.length; i++) { //최종 연못 출력
			for(int j=0; j<changedPond.length; j++) {
				System.out.print(pond[i][j] + " ");
				depth+=pond[i][j];
			}
			System.out.println();
		}
		System.out.println("연못 물깊이의 총합 : " + depth);
	}




}
