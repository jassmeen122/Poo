package exercicedeGestionDeStock;

public abstract class Vehicule {
	 protected String nom;
	    protected String typeCarburant;

	    public Vehicule(String nom, String typeCarburant) {
	        this.nom = nom;
	        this.typeCarburant = typeCarburant;
	    }

	    public abstract void demarrer();
	    public abstract void arreter();


	    public void afficherInfos() {
	        System.out.println("Nom du vehicule: " + nom + ", Carburant: " + typeCarburant);
	    }
	}


	interface Roulant {
	    void rouler();
	}


	interface Flottant {
	    void flotter();
	}

	interface Volant {
	    void voler();
	}

	class Voiture extends Vehicule implements Roulant {
	    public Voiture(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("La voiture démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("La voiture s’arrête.");
	    }

	    @Override
	    public void rouler() {
	        System.out.println("La voiture est en train de rouler.");
	    }
	}
	class Bateau extends Vehicule implements Flottant {
	    public Bateau(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("Le bateau démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("Le bateau s’arrête.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println("Le bateau flotte.");
	    }
	}
	class Hydravion extends Vehicule implements Flottant, Volant {
	    public Hydravion(String nom, String typeCarburant) {
	        super(nom, typeCarburant);
	    }

	    @Override
	    public void demarrer() {
	        System.out.println("L'hydravion démarre.");
	    }

	    @Override
	    public void arreter() {
	        System.out.println("L'hydravion s’arrête.");
	    }

	    @Override
	    public void voler() {
	        System.out.println("L'hydravion vole.");
	    }

	    @Override
	    public void flotter() {
	        System.out.println("L'hydravion flotte.");
	    }
	}
	public class TestVehicules {
	    public static void main(String[] args) {
	        Vehicule[] vehicules = {
	            new Voiture("Tesla", "Électrique"),
	            new Bateau("Yacht", "Diesel"),
	            new Hydravion("HydroJet", "Kérosène")
	        };
	        for (Vehicule vehicule : vehicules) {
	            vehicule.demarrer();
	            vehicule.afficherInfos();
	            vehicule.arreter();
	            if (vehicule instanceof Roulant) {
	                ((Roulant) vehicule).rouler();
	            }
	            if (vehicule instanceof Flottant) {
	                ((Flottant) vehicule).flotter();
	            }
	            if (vehicule instanceof Volant) {
	                ((Volant) vehicule).voler();
	            }
	            System.out.println("-----");
	        }
	    }
	}

}
