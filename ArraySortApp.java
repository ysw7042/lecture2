package oop;

import java.util.Arrays;

//�迭�� ��Ұ��� �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class ArraySortApp {
	public static void main(String[] args) {
		int[] array={30,50,10,40,20};
		
		/*
		System.out.print("���� �� >> ");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		//�迭�� ��Ұ����� ���� ���� �˰����� �̿��Ͽ� �������� ����
		for(int i=0;i<array.length-1;i++) {//�� ����� ÷�� : ó��~������-1
			for(int j=i+1;j<array.length;j++) {//�Ǻ� ����� ÷�� : ��+1~������
				//��Ұ��� ���Ͽ� ��ҿ� ����� ���� ���� ġȯ
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.print("���� �� >> ");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		*/
		
		System.out.print("���� �� >> ");
		//Arrays : �迭�� ���� �پ��� ���(�޼ҵ�)�� �����ϴ� Ŭ����
		//Arrays.toString(Object[] array) : �迭 ������ ���޹޾� �迭�� ��Ұ��� ���ڿ��� 
		//��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�  
		System.out.println(Arrays.toString(array));
		
		//Arrays.sort(Object[] array) : �迭 ������ ���޹޾� �迭�� ��Ұ��� �����ϴ� �޼ҵ�
		Arrays.sort(array);
		
		System.out.print("���� �� >> ");
		System.out.println(Arrays.toString(array));

	}
}
