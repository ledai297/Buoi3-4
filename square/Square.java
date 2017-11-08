package samsung.java.week2.square;

public class Square {
	float edge;
	
	public void displayEdge(){
		System.out.println("\tCanh hinh vuong la : "+this.getEdge());
	}
	
	public void getPerimeter(){
		float cv= (this.getEdge())*2;
		System.out.println("\tChu vi hinh vuong la: "+cv);
	}

	public void getArea(){
		float area=(this.getEdge())*(this.getEdge());
		System.out.println("\tDIen tich hinh vuong la: "+area);
	}
	
	public Square(float edge) {
		super();
		this.edge = edge;
	}

	public void displayAll(){
		Square square = new Square(this.edge);
		square.displayEdge();
		square.getPerimeter();
		square.getArea();
	}
	
	public float getEdge() {
		return edge;
	}

	public void setEdge(float edge) {
		this.edge = edge;
	}
}
