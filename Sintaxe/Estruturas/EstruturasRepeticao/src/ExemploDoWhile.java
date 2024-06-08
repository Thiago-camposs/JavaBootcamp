import java.util.Random;
/* A estrutura DoWhile tem como premisssa que o bloco de repetição 
irá ser executado pelo menos uma vez */
public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1; //simula se a pessoa atendeu, se for 1 siginifica que atendeu
		System.out.println("Atendeu? " + atendeu);
		return !atendeu;
	}
}
