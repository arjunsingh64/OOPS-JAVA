class Test { } 

class MainInstanceOf 
{ 
	public static void main(String[] args) 
	{ 
		Test tobj = new Test(); 
		//Test tobj = null;
		// A simple case 
		if (tobj instanceof Test) 
		System.out.println("tobj is instance of Test"); 
		else
		System.out.println("tobj is NOT instance of Test"); 
	} 
} 
