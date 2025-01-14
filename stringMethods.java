

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringMethods str = new stringMethods();
		str.methods();
	}
	public void methods() {
		
		String a = "Edu Bridge";
		System.out.println("String a = "+a);
		
		//new operator
		String b = new String("MUMBAI");
		System.out.println("String b = "+b);
		
		//string methods
		System.out.println("The length of string: "+a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toUpperCase());
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println("Character at pos 5: "+a.charAt(5));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("X"));
		System.out.println("String without whitespace: " + a.replaceAll("\\s", ""));
	}

}


