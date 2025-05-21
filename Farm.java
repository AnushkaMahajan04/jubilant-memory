package com.tka.may21;

public class Farm {
	private int size;
	private String owner;
	private String location;
		Farm(int s,String o,String l){
		size=s;
		owner=o;
		location=l;
	}
	public int getsize() {
		return size;
	}
	public int setsize(int ns) {
		size=ns;
		return ns;
	}
	public String getowner() {
		return owner;
	}
	public String setowner(String no) {
		owner=no;
		return no;
	}
	public String getlocation() {
		return location;
	}
	public String setloc(String nl) {
		location=nl;
		return nl;
	}
	@Override
	public String toString() {
		return "Farm [size=" + size + ", owner=" + owner + ", location=" + location + "]";
	}
	
	


}
