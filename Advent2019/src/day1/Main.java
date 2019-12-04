package day1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//take its mass, divide by three, round down, and subtract 2.
		String in = "120333\r\n" + 
				"142772\r\n" + 
				"85755\r\n" + 
				"90217\r\n" + 
				"74894\r\n" + 
				"86021\r\n" + 
				"66768\r\n" + 
				"147353\r\n" + 
				"67426\r\n" + 
				"145635\r\n" + 
				"100070\r\n" + 
				"88290\r\n" + 
				"110673\r\n" + 
				"109887\r\n" + 
				"91389\r\n" + 
				"121365\r\n" + 
				"52760\r\n" + 
				"58613\r\n" + 
				"130918\r\n" + 
				"57842\r\n" + 
				"80622\r\n" + 
				"50466\r\n" + 
				"80213\r\n" + 
				"85816\r\n" + 
				"149832\r\n" + 
				"133813\r\n" + 
				"60211\r\n" + 
				"69491\r\n" + 
				"129415\r\n" + 
				"141471\r\n" + 
				"77916\r\n" + 
				"98907\r\n" + 
				"63440\r\n" + 
				"109545\r\n" + 
				"80183\r\n" + 
				"143073\r\n" + 
				"77783\r\n" + 
				"88546\r\n" + 
				"149648\r\n" + 
				"128010\r\n" + 
				"55530\r\n" + 
				"54878\r\n" + 
				"103885\r\n" + 
				"57312\r\n" + 
				"81011\r\n" + 
				"148450\r\n" + 
				"137947\r\n" + 
				"67252\r\n" + 
				"106264\r\n" + 
				"149860\r\n" + 
				"71677\r\n" + 
				"101209\r\n" + 
				"128477\r\n" + 
				"112159\r\n" + 
				"56027\r\n" + 
				"53313\r\n" + 
				"118916\r\n" + 
				"98057\r\n" + 
				"131668\r\n" + 
				"61605\r\n" + 
				"107488\r\n" + 
				"65517\r\n" + 
				"63594\r\n" + 
				"84072\r\n" + 
				"79214\r\n" + 
				"141606\r\n" + 
				"137375\r\n" + 
				"112525\r\n" + 
				"64572\r\n" + 
				"126216\r\n" + 
				"57013\r\n" + 
				"130003\r\n" + 
				"122450\r\n" + 
				"50642\r\n" + 
				"136844\r\n" + 
				"96272\r\n" + 
				"97861\r\n" + 
				"59071\r\n" + 
				"106870\r\n" + 
				"116595\r\n" + 
				"144966\r\n" + 
				"88723\r\n" + 
				"124038\r\n" + 
				"63629\r\n" + 
				"105304\r\n" + 
				"52928\r\n" + 
				"92917\r\n" + 
				"147571\r\n" + 
				"120553\r\n" + 
				"113823\r\n" + 
				"85524\r\n" + 
				"71152\r\n" + 
				"95199\r\n" + 
				"102000\r\n" + 
				"118874\r\n" + 
				"133317\r\n" + 
				"146849\r\n" + 
				"60450\r\n" + 
				"103307\r\n" + 
				"117162\r\n";
		String[] list = (in.split("\r\n",0));
		double ans = 0;
		for(String s: list) {
			double fuelForPart = Math.floor(Integer.valueOf(s)/3)-2;
			ans += fuelForPart;
			
		}
		System.out.println(ans);
		ans=0;
		for(String s: list) {
			double fuelForPart = Math.floor(Integer.valueOf(s)/3)-2;
			ans += fuelForPart;
			while(fuelForPart>0) {
			fuelForPart = Math.floor(fuelForPart/3)-2;
			if(fuelForPart > 0) ans += fuelForPart;
			}
			
		}
		System.out.println(ans);
	}

}
