import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

	
public class lambdaFunctionPrj {
	    public static void main(String[] args) {
	        // List of toy names
	        List<String> toys = new ArrayList<>();
	        toys.add("Car");
	        toys.add("Doll");
	        toys.add("Train");
	        toys.add("Drone");
	        toys.add("Teddy Bear");

	        // Filter toys that start with the letter 'D'
	        List<String> filteredToys = toys.stream()
	                                        .filter(toy -> toy.startsWith("D"))
	                                        .collect(Collectors.toList());

	        // Print the filtered list
	        System.out.println("Toys starting with 'D': " + filteredToys);
	    }
	}



