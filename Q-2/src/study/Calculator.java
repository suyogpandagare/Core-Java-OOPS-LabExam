package study;

public class Calculator {

	public static int calculator(int number1, int number2, String operator) throws WrongOperatorException
	{
		
		switch(operator)
		{
		
		case "+" : {
			return number1 + number2;
			
		}
		
		case "-" : {
			return number1 - number2;
			
		}
		
		case "*" : {
			return number1 * number2;
			
		}
		
		case "/" : {
			return number1 / number2;
			
		}
		
		case "%" : {
			return number1 % number2;
			
		}
		default : {
			
			throw new WrongOperatorException();
		}
		}//end of switch
		
	}//function end
	
}//class end
