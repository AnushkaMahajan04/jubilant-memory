package com.tka.may21;

public class Office {
    private String officeName;
    private String address;
    private int numberOfEmployees;
    public Office() {}
    public Office(String oname, String add, int num) {
        officeName = oname;
        address = add;
        numberOfEmployees = num;
            }
    public String getOfficeName() {
        return officeName;
    }

    public String setOfficeName(String noname) {
        officeName = noname;
        return noname;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String nadd) {
        address = nadd;
        return nadd;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int  setNumberOfEmployees(int nnum) {
       numberOfEmployees = nnum;
       return nnum;
    }
	@Override
	public String toString() {
		return "Office [officeName=" + officeName + ", address=" + address + ", numberOfEmployees=" + numberOfEmployees
				+ "]";
	}

    

}
