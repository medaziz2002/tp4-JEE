package metier.entities;

import javax.persistence.*;

@Entity
public class Produit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRODUIT")
    private Long idProduit;
    @Basic
    @Column(name = "NOM_PRODUIT")
    private String nomProduit;
    @Basic
    @Column(name = "PRIX")
    private Double prix;
    
   
    private Categorie categorie;
    public Produit(String nomProduit, double prix,Categorie cat) {

    super();
    this.nomProduit = nomProduit;
    this.prix = prix;
    this.setCategorie(cat);
    }
    public Produit() {
    }
    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long id) {
        this.idProduit = id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Categorie getCategorie() {
    	return categorie;
    	}
    	public void setCategorie(Categorie categorie) {
    	this.categorie = categorie;
    	}
}