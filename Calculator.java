package week5.day1;

public class Calculator {
	public void add(int x, int y){
		   System.out.println("addition is:" +(x+y));
	}
		public void add(float x, float y) {
			System.out.println("addition is:" +(x+y));
			}
		public void add(long a, long b) {
			System.out.println("addition is:" +(a+b));
		}
		public void add(short c, int d) {
			System.out.println("addition is:" +(c+d));
		}
	
	 public static void main(String[] args) {
		 Calculator value=new Calculator();
		 value.add(12, 13);
		 value.add(2.5f, 3.6f);
		 value.add(2546l, 253l);
		 value.add(2, 3);

	}

}
