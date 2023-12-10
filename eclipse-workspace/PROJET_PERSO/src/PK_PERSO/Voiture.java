package PK_PERSO;

import java.util.Objects;

public class Voiture extends Vehicule {
	public int nbrportes;
    public Voiture(String modele, int annee,int nbr) {
		super(modele, annee);
		// TODO Auto-generated constructor stub
		this.nbrportes=nbr;
	}
	@Override
	public String toString() {
		return "Voiture [nbrportes=" + nbrportes + ", modele=" + modele + ", annee=" + annee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nbrportes);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		return nbrportes == other.nbrportes;
	}
	public int compareTo(Voiture vo)
	{
		return this.nbrportes=vo.nbrportes;
	}
	

	
    
    

}
