package com.marko.vector;

public class Ex {
	private int x;
	private int y;
	
	public Ex(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// Data comparing means comparing X and Y values in both object
					// e2.equals(e1) this =e2, obj=e1
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Ex) {			//arg.equals("a");	--> false 	--> contains
			Ex e = (Ex) obj;			//arg.equals("b");	--> false 	--> contains
			return (this.x==e.x) &&		//arg.equals(5);  	--> false 	--> contains
					(this.y==e.y);		//....
										//....
		}								//....
		return false;					//....	
										////arg.equals(new Ex(5,6))--> true	--> contains --> return true
	}

	@Override
	public String toString() {
		return "Ex [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
