package PK_PERSO;

import java.util.Arrays;
import java.util.Comparator;

public class TableauDesVehicules {
	int taille;
	int cpt=0;
	 Vehicule[] vehicules = new Vehicule[taille];
	 public TableauDesVehicules(Vehicule[] tabV)
	 {
		        this.vehicules = tabV;
		        cpt++;
		    
	 }
	 public void trier(Comparator<Vehicule> cmp)
	{
			Arrays.sort(vehicules,cmp);
			
	}
	 public void ajouter_vehicule(Vehicule v,int pos)
	 {
		 for(int i=0;i<taille;i++)
		 {
			 if(i==pos-1)
			 {
				 vehicules[i]=v;
			 }
			 cpt++;
		 }
		
	 }
	 public void supprimer_vehicule(int pos)
	 {
		 for(int i=0;i<taille;i++)
		 {
			 if(i==pos-1)
			 {
				 vehicules[i]=vehicules[i+1];
			 }
		 }
	 }
	 public int compter_vehicule()
	 {
		 int cpt=0;
		 for(int i=0;i<taille;i++)
		 {
			 if(vehicules[i]!=null)
			 {
				 cpt++;
			 }
				 
		 }
		 return cpt;
	 }
	 public void inverserOrdre()
	 {
	       
	        int j = cpt - 1;
	        int i=0;
	        while(i<j) {
	            Vehicule temp = vehicules[i];
	            vehicules[i] = vehicules[j];
	            vehicules[j] = temp;
	            i++;j--;
	        }
	  }
	 public void afficher_Vehicule()
	 {
		 for(int i=0;i<taille;i++)
		 {
			 System.out.println("le tableau des vehicules : "+vehicules[i]);
		 }
		 
	 }
	 public Vehicule affiche_max()
	 {
		 Vehicule max=vehicules[0];
		 for(int i=0;i<taille;i++)
		 {
			 if(vehicules[i].compareTo(max)>0)
			 {
				 max=vehicules[i];
			 }
		 }
		 return max;
	 }
	 public int egalite_vehicule(Vehicule[] v1)
	 {
		 int cptv=0;
		 for(int i=0;i<taille;i++)
		 {
			 if(vehicules[i].compareTo(v1[i])==0)
			 {
				 cptv++;
			 }
		 }
		 if(cptv==cpt)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
		  
	 }
	 
}
