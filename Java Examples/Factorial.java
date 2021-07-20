import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Arrays;

class Factorial{
	
	public static void main(String []args){
		int row = 120;
		for(int i=1;i<=row;i++){
			if(row % i == 0){
				 row = row / i;
			}
			if(row==1){
				System.out.println(i);
			}	
		}
		if(row != 1){
			System.out.println("-1");
		}	
	}
}