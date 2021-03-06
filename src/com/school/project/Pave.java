package com.school.project;

/**
 * Created on 05/02/2015.
 */
public class Pave {
    public enum TypeCours {
        CM("Cours Magistral"),
        TD("Travaux Dirigés"),
        TP("Travaux Pratiques"),
        PROJET("Projet"),
        DS("Devoir Surveillé");

        private String name = "";

        TypeCours(String name) {
            this.name = name;

        }
        @Override
        public String toString() {
            return name;
        }
    }
    private TypeCours type;
    private Salle salle;
    private java.util.ArrayList<Intervenant> intervenants;
    private java.util.ArrayList<GroupeEtudiants> groupes;
    private PlageHoraire plage;
    private java.util.GregorianCalendar jour;
    private Matiere matiere;
}
