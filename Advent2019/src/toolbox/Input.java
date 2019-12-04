package toolbox;

import java.util.ArrayList;

public class Input {
	String in;
	public ArrayList<String> inList;
	public Input(String in) {
		inList = new ArrayList<String>();
		for(String s : in.split(",",0)) {
			inList.add(s);
		}
	}
	public ArrayList<Integer> asInts(){
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for(String s: inList) {
			ints.add(Integer.valueOf(s));
		}
		return ints;
	}
}
