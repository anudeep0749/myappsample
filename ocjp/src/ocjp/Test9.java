package ocjp;

public class Test9 {
	
	//What is the purpose of below lambda expression?

			(x, y) -> x + y; 

}

/*
 * Lambda expression doesn't work without target type and target type must be a
 * functional interface.
 * 
 * 
 * 
 * In this case as the given lambda expression is not assigned to any target
 * type, hence its purpose is not clear.
 * 
 * In fact, given lambda expression causes compilation error without its target
 * type.
 */