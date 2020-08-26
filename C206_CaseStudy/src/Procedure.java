//Done by Daryl 
public class Procedure {
	private String procedure;
	private String date;
	private int procedureID;
	private String description;
	
	
	public Procedure(String procedure, String date, int procedureID, String description) {
		this.procedure = procedure;
		this.date = date;
		this.procedureID = procedureID;
		this.description = description;
	}
	public void setProcedure (String procedure) {
		this.procedure = procedure;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setDate (String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setProcedureID (int procedureID) {
		this.procedureID = procedureID;
	}
	public int getProcedureID() {
		return procedureID;
	}
	public void setDescription (String description) {
		this.description = description;
	}
	public String getDescription () {
		return description;
	}
	 
	
}
