package com.syntax.class106;

public class LogicalOperator {

	public static void main(String[] args) {

boolean programmer=true;
boolean manualTester=true;
boolean knowFramework=false;

if(programmer&&manualTester&&knowFramework) {
	System.out.print("You can be automation engineer");
}else {
	System.out.print("You must know a programming language and manual testing" + " to be an automation engineer);");
}

	}

}
