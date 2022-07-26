package com.test.BDD;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.Utilisateur;

public class Identify {
	 private Connection connexion;
	 
	 public List<Utilisateur> recupererUtilisateurs() {
	        List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	        Statement statement = null;
	        ResultSet resultat = null;

	        loadDatabase();
	        
	        try {
	            statement = connexion.createStatement();

	            // Exécution de la requête
	            resultat = statement.executeQuery("SELECT nom, prenom,email,mot_de_passe,repete_mot_de_passe FROM Identify;");

	            // Récupération des données
	            while (resultat.next()) {
	                String nom = resultat.getString("nom");
	                String prenom = resultat.getString("prenom");
	                String email = resultat.getString("email");
	                String mot_de_passe = resultat.getString("mot_de_passe");
	                String repete_mot_de_passe = resultat.getString("repete_mot_de_passe");
	                
	                Utilisateur utilisateur = new Utilisateur();
	                utilisateur.setNom(nom);
	                utilisateur.setPrenom(prenom);
	                utilisateur.setEmail(email);
	                utilisateur.setMot_de_passe(mot_de_passe);
	                utilisateur.setRepete_mot_de_passe(repete_mot_de_passe);
	                
	                utilisateurs.add(utilisateur);
	            }
	        } catch (SQLException e) {
	        } finally {
	            // Fermeture de la connexion
	            try {
	                if (resultat != null)
	                    resultat.close();
	                if (statement != null)
	                    statement.close();
	                if (connexion != null)
	                    connexion.close();
	            } catch (SQLException ignore) {
	            }
	        }
	        
	        return utilisateurs;
	    }
	 
	 private void loadDatabase() {
	        // Chargement du driver
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	        }

	        try {
	            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public void ajouterUtilisateur(Utilisateur utilisateur) {
	        loadDatabase();
	        
	        try {
	            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO Identify(nom, prenom, email, mot_de_passe, repete_mot_de_passe ) VALUES(?, ?, ?, ?, ?);");
	            preparedStatement.setString(1, utilisateur.getNom());
	            preparedStatement.setString(2, utilisateur.getPrenom());
	            preparedStatement.setString(3, utilisateur.getEmail());
	            preparedStatement.setString(4, utilisateur.getMot_de_passe());
	            preparedStatement.setString(5, utilisateur.getRepete_mot_de_passe());
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

}
*/