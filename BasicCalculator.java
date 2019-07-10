class BasicCalculator{
	public static void main(String args[]){
	float operand1=Float.parseFloat(args[0]);
	char operator=args[1].charAt(0);
	float operand2=Float.parseFloat(args[2]);
	switch(operator)
	{
		case '+' : System.out.println(operand1+operand2);
				   break;
		case '-' : System.out.println(operand1-operand2);
				   break;
		case '*' : System.out.println(operand1*operand2);
				   break;
		case '/' : System.out.println(operand1/operand2);
				   break;
		default :  System.out.println("invalid choice");
					break;
	}
	}
}
