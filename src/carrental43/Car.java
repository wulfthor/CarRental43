/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package carrental43;

/**
 *
 * @author thor
 */
public class Car {
	
	String make;
	String model;
	String type;
	int doors;
	int cyl;
	int HK;
	int MPG;
	int weight;
	int length;
	int year;
	int milage;
	int id;
	
	public Car(String make, String model, String type, int doors, int cyl, int HK, int MPG, int weight, int length, int year, int milage) {
		this.make = make;
		this.model = model;
		this.type = type;
		this.doors = doors;
		this.cyl = cyl;
		this.HK = HK;
		this.MPG = MPG;
		this.weight = weight;
		this.length = length;
		this.year = year;
		this.milage = milage;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getType() {
		return type;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public int getCyl() {
		return cyl;
	}
	
	public int getHK() {
		return HK;
	}
	
	public int getMPG() {
		return MPG;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getYear() {
		return year;
	}

	public int getId() {
		return id;
	}
	
	public int getMilage() {
		return milage;
	}
	public String toStringAll() {
		String retVal = "";
		retVal+="MAKE:" + make;
		retVal+="\nMODEL:" + model;
		retVal+="\nTYPE:" + type;
		retVal+="\nDOORS:" + doors;
		retVal+="\nCYL:" + cyl;
		retVal+="\nHK:" + HK;
		retVal+="\nMilesPerGallon:" + MPG;
		retVal+="\nWEIGHT:" + weight;
		retVal+="\nLENGTH:" + length;
		retVal+="\nYEAR:" + year;
		retVal+="\nMILAGE:" + milage;
		return retVal;
	}
	public String toString() {
		String retVal = "";
		retVal+="ID: " + id;
		retVal+=" MAKE:" + make;
		retVal+=" MODEL:" + model;
		retVal+=" DOORS:" + doors;
		retVal+=" MilesPerGallon:" + MPG;
		retVal+=" YEAR:" + year;
		retVal+=" MILAGE:" + milage ;
		return retVal;
	}
}
