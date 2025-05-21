package com.tka.may21;

public class Icecream {
		    private String flavor;
	    private String size;
	    private double price;
	    private boolean containsNuts;
	   	    
	    public Icecream(String f, String s, double p, boolean cn) {
	        flavor = f;
	        size = s;
	        price = p;
	        containsNuts = cn;
	    }

	    public String getFlavor() {
	        return flavor;
	    }

	    public void setFlavor(String nf) {
	         flavor=nf;
		    return nf;
	    }

	    public String getSize() {
	        return size;
	    }

	    public void setSize(String ns) {
	        size = ns;
		    return ns;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double np) {
	    price = np;
	    }

	    public boolean isContainsNuts() {
	        return containsNuts;
	    }

	    public void setContainsNuts(boolean ncn) {
	   containsNuts = ncn;
	    }

		@Override
		public String toString() {
			return "IceCream [flavor=" + flavor + ", size=" + size + ", price=" + price + ", containsNuts="
					+ containsNuts + "]";
		}

	    	    }
	



