package cylinder;

public class Cylinder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c=new Cylinder();
		c.radius=7;
		c.height=10;
		
		System.out.println("Lid Area: "+c.lidArea());
		System.out.println("Total Area :"+c.totalSurfaceArea());
		System.out.println("Volume "+c.volume());
	}

}
