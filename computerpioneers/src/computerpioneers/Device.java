package computerpioneers;

import java.util.Objects;

class Device {
	private String name;
	private int inventionYear;
	
	
	public Device(String name, int inventionYear) {
	   this.name = name;
	   this.inventionYear = inventionYear;
	}
	
	
	@Override
	public String toString() {
	    return name +" was invented in "+inventionYear+".";
	}


	@Override
	public int hashCode() {
		return Objects.hash(inventionYear, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return inventionYear == other.inventionYear && Objects.equals(name, other.name);
	}
}