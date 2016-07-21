package Basic;

public class Calculation {
	public double res;
	
public void areaRec(int x, int y){
	res= x*y;
	System.out.println("Area of Rectangle is "+ res);
}

public void areaTri(int x, int y){
	res = 0.5*x*y;
	System.out.println("Area of Triangle is "+ res);	
}
}
