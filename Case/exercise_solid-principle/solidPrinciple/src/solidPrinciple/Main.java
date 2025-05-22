package solidPrinciple;




public class Main {
	//----------SRP
//	public class Report {
//	    public String generateReport() {
//	        return "Report data";
//	    }
//
//	    public void saveToFile(String data) {
//	        // Logic to write to a file
//	    }
//
//	    public void printReport(String data) {
//	        // Logic to print the report
//	    }
//	}
	
	//----fix
//	public class GenerateReport {
//	    public String generateReport() {
//	        return "Report data";
//	    }
//	}
//	
//	public class SaveToFile{
//		public void saveToFile(String data) {
//	        // Logic to write to a file
//	    }
//	}
//
//	public class PrintReport{
//	    public void printReport(String data) {
//	        // Logic to print the report
//	    }
//	}
	
	//-----------OCP
//	public class DiscountCalculator {
//	    public double calculateDiscount(String customerType, double amount) {
//	        if (customerType.equals("Regular")) {
//	            return amount * 0.1;
//	        } else if (customerType.equals("Premium")) {
//	            return amount * 0.2;
//	        } else {
//	            return 0;
//	        }
//	    }
//	}
	
	//----fix
//	public interface IDiscount{
//		double calculateDiscount(double amount);
//	}
//
//	public class RegularCustomer implements IDiscount{
//		public double calculateDiscount(double amount) {
//			return amount * 0.1;
//		}
//	}
//	public class GoldCustomer implements IDiscount{
//		public double calculateDiscount(double amount) {
//			return amount * 0.2;
//		}
//	}
//	public class DiscountCalculator{
//		public double calculateDiscount(IDiscount customer, double amount) {
//			return customer.calculateDiscount(amount);
//		}
//	}
	
//	public class Main{
//		public static void main(String[] args) {
//			DiscountCalculator calculator = new DiscountCalculator();
//			
//			IDiscount customer = new GoldCustomer();
//			double discount = calculator.calculateDiscount(customer, 1000.0)
//		}
//	}
	
	//---------LSP
//	public class Bird {
//	    public void fly() {
//	        System.out.println("Flying");
//	    }
//	}
//
//	public class Ostrich extends Bird {
//	    @Override
//	    public void fly() {
//	        throw new UnsupportedOperationException("Ostrich can't fly");
//	    }
//	}
	
	//-----fix
//	public class Bird {
//	   public void chirp() {
//		   System.out.println("chirp");
//	   }
//		public void move() {
//			System.out.println("move");
//		}
//	}
//
//	public class Ostrich extends Bird {
//	    @Override
//	    public void chirp() {
//	    	System.out.println("chirpo");
//	    }
//		@Override
	//    public void move() {
	//    	System.out.println("run");
	//    }
//	}
	
	//----------ISP
//	public interface Worker {
//	    void work();
//	    void eat();
//	}
//
//	public class Robot implements Worker {
//	    public void work() {
//	        System.out.println("Robot working");
//	    }
//
//	    public void eat() {
//	        // Not applicable for robots
//	        throw new UnsupportedOperationException("Robots don't eat");
//	    }
//	}

	//---------fix
//	public interface IEat{
//		void eat();
//	}
//	public interface IWork {
//	    void work();
//	}
//
//	public class Robot implements IWork {
//	    public void work() {
//	        System.out.println("Robot working");
//	    }
//	}

	//------------------DIP
//	public class LightBulb {
//	    public void turnOn() {
//	        System.out.println("Bulb on");
//	    }
//
//	    public void turnOff() {
//	        System.out.println("Bulb off");
//	    }
//	}
//
//	public class Switch {
//	    private LightBulb bulb;
//
//	    public Switch() {
//	        this.bulb = new LightBulb(); // Direct dependency
//	    }
//
//	    public void operate(String command) {
//	        if (command.equals("ON")) {
//	            bulb.turnOn();
//	        } else {
//	            bulb.turnOff();
//	        }
//	    }
//	}
	
	//--------fix
	public interface ISwitchable{
		public void turnOn();
		public void turnOff();
	}
	
	public class LightBulb implements ISwitchable {
	    public void turnOn() {
	        System.out.println("Bulb on");
	    }

	    public void turnOff() {
	        System.out.println("Bulb off");
	    }
	}

	public class Switch {
	    private ISwitchable bulb;

	    public Switch(ISwitchable device) {
	        this.bulb = device; 
	    }

	    public void operate(String command) {
	        if (command.equals("ON")) {
	            bulb.turnOn();
	        } else {
	            bulb.turnOff();
	        }
	    }
	}
	
	public static void main(String[] args) {
		
	}

}
