import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<customer> customerList = new ArrayList<customer>();

		int option = 0;

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// Add items
				String name = Helper.readString("Enter name> ");
				int number = Helper.readInt("Enter phone number> ");

				int points = Helper.readInt("Enter points> ");

				customerList.add(new customer(name, number, points));

			} else if (option == 2) {
				C206_CaseStudy.viewAll(customerList);

			}

			else if (option == 3) {
				String name = Helper.readString("Enter name> ");
				for (int i = 0; i < customerList.size(); i++) {
					if(name==customerList.get(i).getName()) {
						customerList.remove(i).getName();
						customerList.remove(i).getNumber();
						customerList.remove(i).getPoints();
						
						
					}else {
						System.out.println("Does not exist");
					}
						
				}
				

			

			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("Customer List");
		System.out.println("1. Add new customer");
		System.out.println("2. View all customer");
		System.out.println("3. Delete details");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String retrieveAll(ArrayList<customer> customerList) {
		String output = "";

		for (int i = 0; i < customerList.size(); i++) {

			output += String.format("%d %-10s %-20d  %-20d\n", (i + 1), customerList.get(i).getName(),
					customerList.get(i).getNumber(), customerList.get(i).getPoints());

		}

		return output;
	}

	public static void viewAll(ArrayList<customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		String output = String.format("%s %-10s %-20s  %10s\n", "No.", "Name", "Phone number", "Reward points");
		output += retrieveAll(customerList);
		System.out.println(output);
	}

}
