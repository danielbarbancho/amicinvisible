
public class ClasePrincipal {

	public static void main(String[] args) {
		
		String arrayPersones [] = {"DanielBarbancho","JoelBerrocal","MarcBouzas","XavierBermudez","NilCarvajal","QuimComas","AleixDeumal","AdrianGil","SergioGarcia","PauRiera","RubenRecolons","GerardFernandez","GerardPedrero","CarlosAbelSilva","OriolPacheco","PauDomenech","PolPavon","JosepRecolons","MartiPuig","MarcelJosepPauli","JoanPardo"};
		String arrayInvisible [] = new String [21];
		int numrandom = (int) (21*Math.random()+1);
		int numrandomas;
		
		
		for(int fila = 0; fila < arrayInvisible.length;fila++) {
				numrandomas = numrandom;
				if(arrayPersones[(numrandomas - 1)].equals(" ")) {
					numrandom = (int) (21*Math.random()+1);
					numrandomas = numrandom;
					fila--;
				} else {
					arrayInvisible [fila] = arrayPersones [(numrandomas - 1)];
				arrayPersones[(numrandomas - 1)] = " ";
			}
		}

		for(int fila = 0; fila < arrayInvisible.length;fila++) {
			if(fila == 20) {
				break;
			} else {
			System.out.println(arrayInvisible[fila]);
			System.out.println("|");
			System.out.println("V");
			}
		}
		System.out.println(arrayInvisible[20]);
		System.out.println("|");
		System.out.println("V");
		System.out.print(arrayInvisible[0]);
	}
		

}
