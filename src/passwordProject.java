import java.util.Random;

public class passwordProject {

	public static void main(String[] args) {

		int length =19;
		System.out.println(mot_De_Passe(length));

	}

	static char[] mot_De_Passe(int len) {

		System.out.println(" Génération de votre mot de passe aléatoire() : ");

		System.out.println("Votre nouveau mot de passe est : ");

		String Capital_char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String Small_char = "abcdefghijklmnopqrstuvwxyz";

		String number = "0123456789";

		String symbole = "!@#$§^&*_+=-/.?<>";

		String valeurs = Capital_char + Small_char + number + symbole;
		Random rndm_methode = new Random();
		char[] password = new char[len];
		for (int i = 0; i < len; i++)

		{
//
			password[i] = valeurs.charAt(rndm_methode.nextInt(valeurs.length()));
		}
		return password;
	}
}
