package entities;

public class Student {
	
	public String name,result;
	public double n1,n2,n3,nf;
	
	public double finalGrade() {
		return nf = ((n1/30*100)+(n2/35*100)+(n3/35*100))/3;
	}
	
	public String result() {
		if(nf >= 60) {
			return result = "FINAL GRADE = " + nf; 
		}else {
			return result = "FAILED "+"\n"+"MISSING "+(60-nf)+" POINT`S";
		}
	}

}
