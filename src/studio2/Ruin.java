package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is your start amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("What is your total simulations?");
		int totalSimulations = in.nextInt();
		int a=startAmount;
		int i=0;
		int L=0;
		for (int d=1; d<=totalSimulations; d++) {
			a=startAmount;
			i=0;
			while (a<winLimit && a>0) {
			
				if (Math.random()<0.7) 
					a++;
				else 
					a--;
				i++;}
			if (a==0) {
				System.out.println("Simulation "+d+": "+i+" LOSE");
				L++;
			}
			if (a==winLimit) {
				System.out.println("Simulation "+d+": "+i+" WIN");
			}
		}
		double rr = L*1.0/totalSimulations;
		double err;
		double z = (1-winChance)/winChance;
		if (winChance==0.5) {
			err = 1-(startAmount/winLimit);
		}
		else {
			err = (Math.pow(z,startAmount)-Math.pow(z,winLimit))/(1-Math.pow(z,winLimit));
		}
		
		System.out.println("Losses: "+L+" Simulations: "+totalSimulations);
		System.out.println("Ruin Rate from Simulations: "+rr+ " Expected Ruin Rate:"+err);
		
	}

	}

