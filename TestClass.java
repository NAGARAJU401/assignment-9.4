package myPack;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
public class TestClass {

	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
		

	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
				
		//Creating the object of FixedStack

        FixedStack fs = new FixedStack(3);

        fs.push(1);

        fs.push(2);

        fs.push(3);

        //ERROR

        fs.push(0);

        //Created the object of  VariableStack

        VariableStack vs = new VariableStack(3);

        vs.push(1);

        vs.push(2);

        vs.push(3);

        vs.push(0);

        vs.push(9);

        //no error

    }
}
