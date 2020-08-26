//Done by Yufan
public class Outlet {
private String location;
private int outlet_id;
private int number_of_staff;
private int number_of_return;

public Outlet(String location, int outlet_id,int number_of_staff, int number_of_return) {
  this.location = location;
  this.outlet_id = outlet_id;
  this.number_of_staff=number_of_staff;
  this.number_of_return=number_of_return;
  
}
public String getLocation() {
  return location;
}
public void setLocation(String location) {
  this.location = location;
}
public int getOutlet_id() {
  return outlet_id;
}
public void setOutlet_id(int outlet_id) {
  this.outlet_id = outlet_id;
}

public int getNumber_of_staff() {
  return number_of_staff;
}
public void setNumber_of_staff(int number_of_staff) {
  this.number_of_staff = number_of_staff;
}
public int getNumber_of_return() {
  return number_of_return;
}
public void setNumber_of_return(int number_of_return) {
  this.number_of_return = number_of_return;
}

}