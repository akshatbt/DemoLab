//Program using classes and objects

class Engine{
	int ignition;
	Engine(int x){
		ignition = x;
	}
	void engine(){
		if(ignition==1)
			System.out.println("Engine is ignited.");
		else
			System.out.println("Engine is not ignited.");
	}

	public static void main(String args[]){
		Engine car_A = new Engine(1);
		car_A.engine();
	}
}