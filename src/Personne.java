import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe Personne
class Personne {
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String telephone;

    public Personne(String nom, String prenom, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }
}

class Salarie extends Personne {
    private String matricule;
    private String departement;
    private String poste;
    private double salaire;

    public Salarie(String nom, String prenom, String adresse, String telephone,
                   String matricule, String departement, String poste, double salaire) {
        super(nom, prenom, adresse, telephone);
        this.matricule = matricule;
        this.departement = departement;
        this.poste = poste;
        this.salaire = salaire;
    }
}

class Client extends Personne {
    private String numeroClient;
    private List<Achat> historiqueAchats;

    public Client(String nom, String prenom, String adresse, String telephone,
                  String numeroClient, List<Achat> historiqueAchats) {
        super(nom, prenom, adresse, telephone);
        this.numeroClient = numeroClient;
        this.historiqueAchats = historiqueAchats != null ? historiqueAchats : new ArrayList<>();
    }
}

class Fournisseur extends Personne {
    private String numeroFournisseur;
    private List<Produit> produitsFournis;

    public Fournisseur(String nom, String prenom, String adresse, String telephone,
                       String numeroFournisseur, List<Produit> produitsFournis) {
        super(nom, prenom, adresse, telephone);
        this.numeroFournisseur = numeroFournisseur;
        this.produitsFournis = produitsFournis != null ? produitsFournis : new ArrayList<>();
    }
}

class Produit {
    private String reference;
    private String nom;
    private double prix;
    private Fournisseur fournisseur;

    public Produit(String reference, String nom, double prix, Fournisseur fournisseur) {
        this.reference = reference;
        this.nom = nom;
        this.prix = prix;
        this.fournisseur = fournisseur;
    }
}

class Achat {
    private String numeroAchat;
    private List<Produit> produitsAchetes;
    private Client client;
    private Date dateAchat;

    public Achat(String numeroAchat, List<Produit> produitsAchetes, Client client, Date dateAchat) {
        this.numeroAchat = numeroAchat;
        this.produitsAchetes = produitsAchetes != null ? produitsAchetes : new ArrayList<>();
        this.client = client;
        this.dateAchat = dateAchat != null ? dateAchat : new Date();
    }
}

class Entreprise {
    private String nom;
    private String siret;
    private String adresse;
    private List<Salarie> salaries;
    private List<Client> clients;
    private List<Fournisseur> fournisseurs;
    private List<Produit> produits;
    private List<Achat> achats;

    public Entreprise(String nom, String siret, String adresse) {
        this.nom = nom;
        this.siret = siret;
        this.adresse = adresse;
        this.salaries = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.fournisseurs = new ArrayList<>();
        this.produits = new ArrayList<>();
        this.achats = new ArrayList<>();
    }

    public void ajouterSalarie(Salarie salarie) {
        salaries.add(salarie);
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void ajouterFournisseur(Fournisseur fournisseur) {
        fournisseurs.add(fournisseur);
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void effectuerAchat(Achat achat) {
        achats.add(achat);
    }
}
