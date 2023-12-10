package PK_PERSO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListeDesVoitures {
	List<Voiture> listvoitures = new ArrayList<Voiture>();
	public void alimenterList() {
		listvoitures.add(new Voiture("ford",2010,4));
		listvoitures.add(new Voiture("toyota",2011,2));
		listvoitures.add(new Voiture("Renault",2018,4));
	}
	public void afficherList() {
		for ( Voiture v : listvoitures) {
			System.out.println(v);
		}
	}
	public void parcourirListvoiture() {
		Iterator<Voiture> it = listvoitures.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public void insererVoiture(Voiture e) {
		listvoitures.add(0,e);
	}
	public Voiture recupererVoiture(int index) {
		if (index >= 0 && index <= listvoitures.size())
			return listvoitures.get(index);
		throw new IllegalArgumentException("Index doit être compris entre 0 et "+ listvoitures.size());
	}
	public boolean supprimerVoiture(Voiture e) {
		return  listvoitures.remove(e);
	}
	public boolean rechercherVoiture(Voiture e) {
		return listvoitures.contains(e);
			
	}
	public void triervoiture(Comparator<Voiture> cmp ){
		Collections.sort(listvoitures , cmp);
	}
	public ArrayList<Voiture> copiervoiture() {
		ArrayList<Voiture> listnv = new ArrayList<Voiture>();
		listnv.addAll(listvoitures);
		return listnv;
	}
	public void melangervoiture() {
		Collections.shuffle(listvoitures);
	}
	public void inverserList() {
		Collections.reverse(listvoitures);
	}
	public ArrayList<Voiture> listsecovoiture(int debut , int fin){
		if (debut >= 0 && debut < fin && fin < listvoitures.size())
			return new ArrayList<Voiture>(listvoitures.subList(debut, fin));
		throw new IllegalArgumentException();
	}
	public boolean comparelistvoiture(ArrayList<Voiture> list) {
		return this.listvoitures.equals(list);
	}
	public void echangervoiture(int index1 , int index2) {
		Collections.swap(listvoitures, index1, index2);
	}
	public void viderListvoiture() {
		listvoitures.clear();
	}
	public boolean estVide() {
		return listvoitures.isEmpty();
	}


}
