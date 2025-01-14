
	// Water Bill Calculation using Factory Design Pattern

	abstract class WaterBill {
	    public abstract double calculateBill(int units);
	}

	class DomesticBill extends WaterBill {
	    @Override
	    public double calculateBill(int units) {
	        double rate = 1.50; // rate per unit
	        return units * rate;
	    }
	}

	class CommercialBill extends WaterBill {
	    @Override
	    public double calculateBill(int units) {
	        double rate = 2.00; // rate per unit
	        return units * rate;
	    }
	}

	class IndustrialBill extends WaterBill {
	    @Override
	    public double calculateBill(int units) {
	        double rate = 3.00; // rate per unit
	        return units * rate;
	    }
	}

	class WaterBillFactory {
	    public static WaterBill createWaterBill(String billType) {
	        switch (billType.toLowerCase()) {
	            case "domestic":
	                return new DomesticBill();
	            case "commercial":
	                return new CommercialBill();
	            case "industrial":
	                return new IndustrialBill();
	            default:
	                throw new IllegalArgumentException("Unknown bill type");
	        }
	    }
	}

	public class  WaterBill {
	    public static void main(String[] args) {
	        java.util.Scanner scanner = new java.util.Scanner(System.in);

	        System.out.print("Enter the bill type (domestic/commercial/industrial): ");
	        String billType = scanner.nextLine();
	        System.out.print("Enter the number of units consumed: ");
	        int units = scanner.nextInt();

	        try {
	            WaterBill bill = WaterBillFactory.createWaterBill(billType);
	            double totalCost = bill.calculateBill(units);
	            System.out.printf("The total water bill for %s is: $%.2f%n", billType, totalCost);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
	}


