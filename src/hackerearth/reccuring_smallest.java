package hackerearth;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class reccuring_smallest {
	/**
	 * @param args
	 */
	public static void main(String[] args){Scanner scan = new Scanner(System.in);int noOfTC = scan.nextInt();TreeMap<Integer, Integer> countMap = new TreeMap<Integer, Integer>();for(int i=0;i<noOfTC;i++){
			int num = scan.nextInt();int count = 0;if(countMap.containsValue(num)){count = countMap.get(num);}countMap.put(num,count+1);}for(Integer o:countMap.keySet()){if(countMap.get(o).equals(countMap.get(Collections.max(countMap.keySet())))){System.out.println(o);break;}}}}
