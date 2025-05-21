package com.tka.may21;

public class Movie {
	private int price;
	private String moviename;
	private int ticketno;
	Movie(){
	}
	public Movie(int p,String m,int t) {
		price=p;
		moviename=m;
		ticketno=t;
	}
	public int getprice() {
		return price;
	}
	public int setprice(int np) {
		price=np;
		return np;
	}
	public String getmovie() {
		return moviename;
	}
	public String setmovie(String nm) {
		moviename=nm;
		return nm;
	}
	public int getticket() {
		return ticketno;
	}
	public int setticket(int nt) {
		ticketno=nt;
		return nt;
	}
	@Override
	public String toString() {
		return "Movie [price=" + price + ", moviename=" + moviename + ", ticketno=" + ticketno + "]";
	}
	

}
