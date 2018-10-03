package com.sagan.javafxapp;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WarmUp {

	public static void main(String[] args){

		int[] numArray = new int[101];

		for(int i=0 ;i<101;i++){
			numArray[i]=i;
		}

		int[] numbersArray = IntStream.rangeClosed(0,100).toArray();

		List<Integer> numList = new ArrayList<>();
		for(int i=0;i<101;i++){
			numList.add(Integer.valueOf(i));
		}

		List<Integer> numbersList = IntStream.rangeClosed(0,100).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList());
	}
}
