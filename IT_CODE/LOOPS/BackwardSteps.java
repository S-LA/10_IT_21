
public class BackwardSteps {

	public static void main(String[] args) {
		int yMax = 50;
		int xMax = 50;

		int yCur = 1;
		int xCur = 0;
		
		char symbol = '#';
		// this

		for (int i = 0; i < xMax; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int j = yMax; j > 0; j--) {
				
				if (j <= yCur) {
					System.out.print(symbol);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {					
					System.out.print(" ");
				}
				if (j == 1) {
					System.out.println("");
					yCur++;
				}
			}
		}
	}
}
