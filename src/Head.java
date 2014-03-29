
public class Head {

	static long MultTest(Matrix m,Matrix m2,Matrix m3){
		long start = System.nanoTime();
		m.transpone();
		m = m.transMult(m2, m3);
		long end = System.nanoTime();
		long traceTime = end-start;
		return traceTime;
	}
	
	static long RegularTest(Matrix m,Matrix m2,Matrix m3){
		long start = System.nanoTime();
		m = m.regularMult(m2, m3);
		long end = System.nanoTime();
		long traceTime = end-start;
		return traceTime;
	}

	public static void main(String[] args) {

		Matrix m = new Matrix(800);
		Matrix m2 = new Matrix(800);
		Matrix m3 = new Matrix(800);		
		m.loadMatrix();
		m2.loadMatrix();		

		long transTime = (long)MultTest(m3,m,m2)/1000000;
		long regularTime = (long)RegularTest(m3,m,m2)/1000000;
		
		System.out.println("trans   "+transTime);
		System.out.println("regular "+regularTime);
	}

}
