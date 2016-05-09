package ExerciseBeans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FlightTicket {
	
	private String firstName;
	private String lastName;
	private String occupation;
	private String destination;
	private String travelClass;
	private ArrayList<String> destinationOptions;
	private ArrayList<String> travelClassOptions;
	
	//	CONSTRUCTOR
	public FlightTicket(){
		
		firstName = "First name";
		lastName = "Last name";
		occupation = "Private";
		
		destinationOptions = new ArrayList<>();
		destinationOptions.add("Copenhagen");
		destinationOptions.add("Barcelona");
		destinationOptions.add("New York");
		destinationOptions.add("Halifax");
		destinationOptions.add("Hong Kong");
		
		travelClassOptions = new ArrayList<>();
		travelClassOptions.add("First");
		travelClassOptions.add("Business");
		travelClassOptions.add("Economy");
	}

	//	GETTERS / SETTERS
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public ArrayList<String> getDestinationOptions() {
		return destinationOptions;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String flightClass) {
		this.travelClass = flightClass;
	}

	public ArrayList<String> getTravelClassOptions() {
		return travelClassOptions;
	}
	
}
