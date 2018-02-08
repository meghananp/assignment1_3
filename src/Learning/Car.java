package Learning;

public class Car {
	
	int maxSpeed;
	int minSpeed=100;
	double weight=4095;
	boolean isCarOn=false;
	char condition='A';
	
	public void print(){
		System.out.println(minSpeed);
		System.out.println("This is the max speed "+maxSpeed);
		System.out.println(isCarOn);
		System.out.println(condition);
		
	}
	
	public void changeCondition(){
		condition='C';	
	}
	
	public void upgradeMaxSpeed(){
		//minSpeed=maxSpeed;
		maxSpeed=minSpeed+1;
	}
	
	public int getMaxSpeed(){
		return this.maxSpeed;
	}
	
	public void setMaxSpeed(int newMax){
		maxSpeed=this.maxSpeed;
	}
	
	public static void main(String args[])
	{
		Car familyCar=new Car();
		familyCar.print();
		Car aliceCar=familyCar;
		aliceCar.changeCondition();
		familyCar.upgradeMaxSpeed();
		aliceCar.print();
		aliceCar.setMaxSpeed(200);
		aliceCar.print();
	}

}
