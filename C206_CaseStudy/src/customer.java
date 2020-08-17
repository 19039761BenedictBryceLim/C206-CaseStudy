
public class customer {
private String name;
private int number;

private int points;

public customer(String name, int number, int points) {
	
	this.name = name;
	this.number = number;
	this.points = points;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public int getPoints() {
	return points;
}

public void setPoints(int points) {
	this.points = points;
}



}
