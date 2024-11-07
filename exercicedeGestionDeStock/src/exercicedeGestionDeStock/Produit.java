package exercicedeGestionDeStock;

public interface Produit {
	 double calculerValeurStock();

}
class ProduitAlimentaire implements Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

    public ProduitAlimentaire(String nom, double prixUnitaire, int quantite) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    @Override
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }
}

class ProduitElectronique implements Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

    public ProduitElectronique(String nom, double prixUnitaire, int quantite) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    @Override
    public double calculerValeurStock() {
        return prixUnitaire * quantite;
    }
}

public class TestGestionStock {
    public static void main(String[] args) {
        Produit produitAlimentaire = new ProduitAlimentaire("Pomme", 1.5, 100);
        Produit produitElectronique = new ProduitElectronique("Téléphone", 300.0, 50);

        System.out.println("Valeur stock produits alimentaires : " + produitAlimentaire.calculerValeurStock());
        System.out.println("Valeur stock produits électroniques : " + produitElectronique.calculerValeurStock());
    }
}
