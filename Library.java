package com.tka.may21;

public class Library {
	private String name;
    private String location;
    private int numberOfBooks;

       public Library() {}

    public Library(String name, String location, int numberOfBooks) {
        this.name = name;
        this.location = location;
        this.numberOfBooks = numberOfBooks;

    }

    public String getName() {
        return name;
    }

    public void setName(String nn) {
        name = nn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String nl) {
        location = nl;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int nno) {
       numberOfBooks = nno;
    }

	@Override
	public String toString() {
		return "Library [name=" + name + ", location=" + location + ", numberOfBooks=" + numberOfBooks + "]";
	}

   
}
