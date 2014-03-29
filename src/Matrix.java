public class Matrix {

	private int[][] m;
	private int length;

	public Matrix(int n) {
		m = new int[n][n];
		length = n;
		
	}

	public void loadMatrix(){
		int n = length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = (int) ( Math.random()*10);
			}
		}
	}

	public void transpone() {
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				s += m[i][j] + " ";
			} s+="\n";
		}
		return s;
	}

	public Matrix regularMult(Matrix a, Matrix b){
		Matrix nm = new Matrix(a.length);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				for (int k = 0; k < length; k++){
					nm.m[i][j] += a.m[i][k]*b.m[k][j]; 
				}
			} 
		}
		return nm;
	}
	
	public Matrix transMult(Matrix a, Matrix b){
		Matrix nm = new Matrix(a.length);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				for (int k = 0; k < length; k++){
					nm.m[i][j] += a.m[i][k]*b.m[j][k]; 
				}
			} 
		}
		return nm;
	}


}
