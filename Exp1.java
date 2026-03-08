public class Exp1{
	String model;
	int year;
	public Exp1(String model,int year){
		this.model=model;
		this.year=year;
	}

	public void displayinfo(){
		System.out.println("Model:"+model+"\nYear:"+year);
	}	

public static void main(String[] args){
		Exp1 c=new Exp1("BMW",2025);
		c.displayinfo();
}
}