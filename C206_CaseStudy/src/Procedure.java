
public class Procedure {
	private String procedure;
	
	public Procedure(String procedure) {
		this.procedure = procedure;
	}
	public void setProcedure (String procedure) {
		this.procedure = procedure;
	}
	public String getProcedure() {
		return procedure;
	}
	public void viewProcedure() {
		String output = "";
		output += String.format("%-20s \n", getProcedure());
		System.out.println(output);
	}
	
	
}
