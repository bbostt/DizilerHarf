
public class DizilerleAHarfiYazdirma {

	public static void main(String[] args) {
		
		String[][] letter = new String[6][4];
		
		for(int i=0; i<letter.length; i++) { // satýrlarý gezer
			for(int j=0; j<letter[0].length; j++) { // sütunlarý gezer
				if(i == 0 || i == 2) {
					letter[i][j] = " * ";
				}else if(j == 0 || j == 3) {
					letter[i][j] = " * ";
				}else {
					letter[i][j] = "   ";
				}
			}
			
		}
		
		for(int i=0; i<letter.length; i++) {
			for(int j=0; j<letter[0].length; j++) {
				System.out.print(letter[i][j] + " ");
			}
			System.out.println();
		}

	}

}
