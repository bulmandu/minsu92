package test5;


public class Test5Main {

	public static void main(String[] args) {
		int[][] fond = {
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
		int[][] changedFond = null;
		while(change) {
			change = false; //�ʱ�Boolean=false
			changedFond = new int[fond.length][fond.length]; //���ġ�� �迭 ����
			for(int i=0; i<fond.length; i++) {
				
				for(int j=0; j<fond[i].length; j++) {
					changedFond[i][j] = fond[i][j];	//�迭����
					if(fond[i][j]!=0) { //�����϶�
						
						int point = fond[i][j];
						int left = fond[i][j-1];
						int right = fond[i][j+1];
						int top = fond[i-1][j];
						int bottom = fond[i+1][j];
						
						if(left>=point && right>=point && top>=point && bottom>=point) { //�����¿����� �����Ҷ� +1
							changedFond[i][j] +=1;
							change = true;
						}
					}
				}
			}
			for(int i=0; i<fond.length; i++) {
				for(int j=0; j<fond.length; j++) {
					fond[i][j] = changedFond[i][j]; //�񱳹迭 ���ʱ�ȭ
				}
			}
		}
		
		for(int i=0; i<changedFond.length; i++) { //���� ���� ���
			for(int j=0; j<changedFond.length; j++) {
				System.out.print(fond[i][j] + " ");
				depth+=fond[i][j];
			}
			System.out.println();
		}
		System.out.println("���� �������� ���� : " + depth);
	}




}