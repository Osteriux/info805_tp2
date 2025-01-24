package fr.usmb.m1isc.compilation.tp;

import java.util.ArrayList;

public class Node {
	protected String nom;
	protected ArrayList<Node> fils = new ArrayList<Node>();

	/**
	 * Constructeur Node
	 * @param nom
	 */
	public Node(String nom) {
		this.nom = nom;
		this.fils = new ArrayList<Node>();
	}

	/**
	 * Constructeur Unary Node 
	 * @param nom
	 * @param fils1
	 */
	public Node(String nom, Object fils1) {
		this.nom = nom;
		this.fils = new ArrayList<Node>();
		this.fils.add((Node) fils1);
	}

	/**
	 * Constructeur Binary Node
	 * @param nom
	 * @param fils1
	 * @param fils2
	 */
	public Node(String nom, Object fils1, Object fils2) {
		this.nom = nom;
		this.fils = new ArrayList<Node>();
		this.fils.add((Node) fils1);
		this.fils.add((Node) fils2);
	}

	/**
	 * Constructeur Ternary Node
	 * @param nom
	 * @param fils1
	 * @param fils2
	 * @param fils3
	 */
	public Node(String nom, Object fils1, Object fils2, Object fils3) {
		this.nom = nom;
		this.fils = new ArrayList<Node>();
		this.fils.add((Node) fils1);
		this.fils.add((Node) fils2);
		this.fils.add((Node) fils3);
	}

	/**
	 * Ajoute un fils à la liste des fils
	 * @param fils
	 */
	public void addFils(Object fils) {
		this.fils.add((Node) fils);
	}
	public void addFils(Node fils) {
		this.fils.add(fils);
	}

	@Override
	public String toString() {
		if(fils == null){
			return nom;
		}
		String res = fils.isEmpty() ? nom : "("+ nom;
		for (Node fils : fils) {
			res += " " + fils.toString();
		}
		if (!fils.isEmpty()) {
			res += ")";
		}
		return res;
	}

	public void afficher() {
		System.out.println(this.toString());
	}
}
