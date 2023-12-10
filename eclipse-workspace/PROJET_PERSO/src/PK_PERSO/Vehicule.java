package PK_PERSO;

import java.util.Objects;

public class Vehicule implements Cloneable,Comparable<Vehicule> {
	String modele;
	int annee;
	public Vehicule(String modele,int annee)
	{
		super();
		this.modele=modele;
		this.annee=annee;
	}
	@Override
	public String toString() {
		return "Vehicule [modele=" + modele + ", annee=" + annee + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(annee, modele);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicule other = (Vehicule) obj;
		return annee == other.annee && Objects.equals(modele, other.modele);
	}
	public Vehicule clone(){
		try {
		return (Vehicule)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.err.println("probleme de clonage");
			return null;
		}
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	@Override
	public int compareTo(Vehicule o) {
		// TODO Auto-generated method stub
		return this.annee=o.annee;
	}
	
	

}
