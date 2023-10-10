package org.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
	
		int a[] =new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		a[4]=60;
		
		int b[]= {10,20,60,30,80};
		System.out.println(a[1]);
		
		// reverse of array
		System.out.println("Reverse of array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
		
		List<Integer> li=new LinkedList<Integer>();
		for (int x:a) {
			li.add(x);
		}
		System.out.println(li);
		Collections.reverse(li);
		System.out.println("Reverse using Collections\n"+li);
		
		Collections.sort(li);
		System.out.println("Sort using Collections\n"+li);
		System.out.println("Min--->"+li.get(0));
		System.out.println("Max--->"+li.get(li.size()-1));
		System.out.println("Mini using collections\n"+Collections.min(li));
		System.out.println("Max using collections\n"+Collections.max(li));
		
		//Arrays---->utility class for array
		Arrays.sort(a);
		System.out.println("Min using arrays\n"+a[0]);
		System.out.println("Max using arrays\n"+a[a.length-1]);
		
		//Ascending order
		System.out.println("Ascending order.....");
		int a1[]= {9,1,4,2};
		
		int t=0;
		int ln=a1.length;
		for(int i=0;i<ln;i++) {
			for(int j=i+1;j<ln;j++) {
				if(a1[i]>a1[j]) {
					t=a1[i];
					a1[i]=a1[j];
					a1[j]=t;
				}
			}
		}
		
		for (int i:a1) {
			System.out.println(i+" ");
		}
		System.out.println("Min--->"+a1[0]);
		System.out.println("2nd Min--->"+a1[1]);
		System.out.println("Max--->"+a1[a1.length-1]);
		System.out.println("2nd Max--->"+a1[a1.length-2]);
		
		//descending order
		System.out.println("Descending order.....");
		int t1=0;
		for(int i=0;i<ln;i++) {
			for(int j=i+1;j<ln;j++) {
				if(a1[i]<a1[j]) {
					t=a1[i];
					a1[i]=a1[j];
					a1[j]=t;
				}
			}
		}
		for (int i:a1) {
			System.out.println(i+" ");
		}
		System.out.println("Min--->"+a1[0]);
		System.out.println("2nd Min--->"+a1[1]);
		System.out.println("Max--->"+a1[a1.length-1]);
		System.out.println("2nd Max--->"+a1[a1.length-2]);
		
		
		
		
		
		
		
		
	}
}