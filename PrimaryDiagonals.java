public class PrimaryDiagonals {

	public static void main(String[] args) {
		
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		PrimaryDiagonals pd=new PrimaryDiagonals();
		pd.printDiagonals(row, col);
	}
		
		void printDiagonals(int row, int col) {
			for(int row=0; row<=5; row++) {
				for(int col=0; col<=5; col++) {
					if(row==col) {
						System.out.println(row+""+col+"\t");
						
					}
				else {
					System.out.println("\t");
				}
			}
		System.out.println();
	}
		}
	}
	
