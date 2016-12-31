package com.indus.lambda.Intermediate;

import com.indus.lambda.Intermediate.ClosuresExample.Process;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {

		doProcess(10, i -> {
			System.out.println(i);
			System.out.println(this); // it will work here bcoz it is not in the
										// static context
		});
	}

	public static void main(String[] args) {

		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

		/*
		 * thisReferenceExample.doProcess(10, new Process() {
		 * 
		 * @Override public void process(int i) {
		 * 
		 * System.out.println(i); System.out.println(this);
		 * 
		 * }
		 * 
		 * public String toString() { return "This is anonymous"; } });
		 */

		thisReferenceExample.execute();

		thisReferenceExample.doProcess(10, i -> {
			System.out.println(i);
			// System.out.println(this); this will not work
		});

	}

	public String toString() {
		return "This is the main ThisReferenceExample class instance";
	}
}
