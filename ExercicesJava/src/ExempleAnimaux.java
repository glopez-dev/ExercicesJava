import java.util.ArrayList;
@SuppressWarnings("unused")

interface Animal
{
	// Setter pour le champ nom
	public void setNom(String nom);

	// Getter pour le champ nom
	public String getNom();

	// Retourne le cri de l'animal
	public String cri();
}

public class ExempleAnimaux
{
	public static void main(String[] args)
	{
		ArrayList<Animal> animaux = new ArrayList<>();
		animaux.add(new Chat("Ronron"));
		animaux.add(new Chien("Médor"));
		animaux.add(new Vache("Huguette"));
		for (Animal animal : animaux)
			System.out.println("Je m'appelle " + animal.getNom()
				+ " et je dis " + animal.cri() + "!");
	}
}


class Chat implements Animal
{
	public Chat(String nom)
	{
		this.nom = nom;
	}
	
	private String nom;

	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String cri() {
		return "Miaou !";
	}	
}

class Chien implements Animal 
{
	public Chien(String nom)
	{
		this.nom = nom;
	}
	
	private String nom;

	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String cri() {
		return "Ouaf !";
	}
	
	
}

class Vache implements Animal 
{
	public Vache(String nom)
	{
		this.nom = nom;
	}
	
	private String nom;

	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public String cri() {
		return "Meuh !";
	}
	
	
}
