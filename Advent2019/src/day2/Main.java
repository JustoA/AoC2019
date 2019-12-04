package day2;
import java.util.ArrayList;

import toolbox.Input;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input in = new Input("2,9,27,31,1,5,31,35,1,35,10,39,1,39,10,43,2,43,9,47,1,6,47,51,2,51,6,55,1,5,55,59,2,59,10,63,1,9,63,67,1,9,67,71,2,71,6,75,1,5,75,79,1,5,79,83,1,9,83,87,2,87,10,91,2,10,91,95,1,95,9,99,2,99,9,103,2,10,103,107,2,9,107,111,1,111,5,115,1,115,2,119,1,119,6,0,99,2,0,14,0");
		Input in = new Input("1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,19,5,23,1,23,6,27,2,9,27,31,1,5,31,35,1,35,10,39,1,39,10,43,2,43,9,47,1,6,47,51,2,51,6,55,1,5,55,59,2,59,10,63,1,9,63,67,1,9,67,71,2,71,6,75,1,5,75,79,1,5,79,83,1,9,83,87,2,87,10,91,2,10,91,95,1,95,9,99,2,99,9,103,2,10,103,107,2,9,107,111,1,111,5,115,1,115,2,119,1,119,6,0,99,2,0,14,0");
		//System.out.println(in);
		ArrayList<Integer> input = in.asInts();
		for(int i = 0; i<input.size(); i+=4) {
			if(input.get(i) == 1) {
				input.set(input.get(i+3), input.get(input.get(i+1)) + input.get(input.get(i+2)));
				continue;
			}
			if(input.get(i) == 2) {
				input.set(input.get(i+3), input.get(input.get(i+1)) * input.get(input.get(i+2)));
				continue;
			}
			if(input.get(i) == 99) {
				System.out.println(input.get(0));
				break;
			}
			else {
				System.out.println("invalid op code");
			}
			
		}
		
		
		//hehe brute force time
		for(int h = 0; h<100; h++) {
			for(int j = 0; j<100; j++) {
				input = in.asInts();
				ArrayList<Integer> test = new ArrayList<Integer>();
				test.addAll(input);
				test.set(1, h);
				test.set(2, j);
				for(int i = 0; i<test.size(); i+=4) {
					if(test.get(i) == 1) {
						test.set(test.get(i+3), test.get(test.get(i+1)) + test.get(test.get(i+2)));
						continue;
					}
					if(test.get(i) == 2) {
						test.set(test.get(i+3), test.get(test.get(i+1)) * test.get(test.get(i+2)));
						continue;
					}
					if(test.get(i) == 99) {
						if(test.get(0) == 19690720) {
							System.out.println(h);
							System.out.println(j);
						}
						//System.out.println(input.get(0));
						break;
					}
					else {
						System.out.println("invalid op code");
					}
			}
		}
	
	}	
}
}
