class Demo2{
	int a=10;
	static int b=20;
	public void show(){
		static int c;
		c= a+b;
		System.out.println(c);
	}
	public static void main(String args[]){
		
		/*Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
		Demo2 d3 = new Demo2();*/
		
		
		b=100;
		
		show();
		
		/*d1.show();
		d2.show();
		d3.show();*/
	}
}	