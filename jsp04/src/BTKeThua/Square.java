package BTKeThua;

public class Square extends Rectangle {
	
	float adge;
	 public Square(float adge) {
		 super(adge, adge);
		 this.adge = adge;
	}

	@Override
	public void outPut() {
		System.out.println("----------Square----------");
		System.out.println(" Adge : " + adge);
		System.out.println(" Area : " + getArea());
		System.out.println(" Perimeter : " + getPerimeter());
		
	}

}
