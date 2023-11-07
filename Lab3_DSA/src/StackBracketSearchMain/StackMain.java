package StackBracketSearchMain;

import StackBracketSearchAlgorithm.BracketBalenceCheckFunctions;

public class StackMain {

    public static void main(String[] args)
    {
    	
    	// string of brackets to check for balance
       String bracketExpression = "{(([[{}]])}";

       // flag to display result wether string is balenced or not
        Boolean result;
        
        // function to check balence in brackets
        result = BracketBalenceCheckFunctions.checkingIfBracketsBalanced(bracketExpression);
        
        if (result)
            System.out.println("The entered Brackets string is Balenced");
        else
            System.out.println("The entered Bracket string is not Balanced");
    }
	
}
