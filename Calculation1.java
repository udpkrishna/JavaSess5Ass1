package Basic;

public class Calculation1 extends Figure{
double res;
	@Override
	
		public void AreaRec(int x, int y){
			res= x*y;
			System.out.println("Area of Rectangle is "+ res);
		}

		public void AreaTri(int x, int y){
			res = 0.5*x*y;
			System.out.println("Area of Triangle is "+ res);	
		}
		
	}

