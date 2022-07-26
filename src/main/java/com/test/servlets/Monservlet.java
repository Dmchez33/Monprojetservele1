package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.bean.Utilisateur;
//import com.test.BDD.Identify;

/**
 * Servlet implementation class Monservlet
 */
@WebServlet("/Monservlet")
public class Monservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Monservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String nom =  request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String pseudo = request.getParameter("pseudo");
		String passe = request.getParameter("passe");
		String repeat_pass = request.getParameter("repeat_pass");
		Utilisateur user = new Utilisateur(nom,prenom,email,pseudo,passe,repeat_pass);*/
		/*user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setMot_de_passe(passe);
		user.setRepete_mot_de_passe(repeat_pass);*/
		
		 
		//Identify tabUser = new Identify();
		//request.setAttribute("utilisateurs", user);
		//utilisateur.add(user);
		
		//request.setAttribute("us", Utilisat);
		//request.setAttribute("USER", Utilisat);
		
		
		
		//this.getServletContext().getRequestDispatcher("MonServletJspInscrire.jsp").forward(request, response);
		//this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
		HttpSession session=request.getSession();
		Utilisateur user=(Utilisateur) session.getAttribute("utilisateur");
		
		if(user==null) {
			//si l'utilisateur recuperer est null => qu'il n'existe pas ds la session => on va aller ds la page d'inscription
			this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);

		}else {
			
			//S'il existe => qu'il a deja un compte donc on va aller dans l'acceuil
			this.getServletContext().getRequestDispatcher("/Acceuil.jsp").forward(request, response);

		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		/*Utilisateur utilisateur = new Utilisateur();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String pseudo = request.getParameter("pseudo");
		String passe = request.getParameter("passe");
		String repeat_pass = request.getParameter("repeat-pass");*/
		/*String nom =  request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String pseudo = request.getParameter("pseudo");
		String passe = request.getParameter("passe");
		String repeat_pass = request.getParameter("repeat_pass");
		Utilisateur user = new Utilisateur(nom,prenom,email,pseudo,passe,repeat_pass);*/
        /*utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        utilisateur.setEmail(email);
        utilisateur.setPseudo(pseudo);
        utilisateur.setMot_de_passe(passe);
        utilisateur.setRepete_mot_de_passe(repeat_pass);*/
        
        //Identify tabUser = new Identify();
       
        
        //tabUser.ajouterUtilisateur(utilisateur);
		
		/*utilisateur.add(user);
        
        request.setAttribute("utilisateurs", utilisateur);
        
        //this.getServletContext().getRequestDispatcher("MonServletJsp/Inscrire.jsp").forward(request, response);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").include(request, response);*/
		
		String nom,prenom,pseudo,repete_mot_de_passe,mot_de_passe,email;
		
		nom=request.getParameter("nom");
		prenom=request.getParameter("prenom");
		pseudo=request.getParameter("pseudo");
		email=request.getParameter("email");
		mot_de_passe=request.getParameter("mot_de_passe");
		repete_mot_de_passe=request.getParameter("repete_mot_de_passe");
		
		HttpSession session= request.getSession();
		
		List<Utilisateur> utilisateurs =(List)session.getAttribute("utilisateurs");
		if(utilisateurs==null) {
			
			utilisateurs = new ArrayList<Utilisateur>();
			
		}
		
		
		if(nom.trim().equals("") || prenom.trim().equals("") || pseudo.trim().equals("") || email.trim().equals("") || mot_de_passe.trim().equals("")|| repete_mot_de_passe.trim().equals("") ) {
			request.setAttribute("erreur","Veuillez remplir tout les champs !");
	        this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
		
		}else {
			if(!mot_de_passe.equals(repete_mot_de_passe)) {

				request.setAttribute("erreur","Vos mots de passe ne correspondent pas !");
		        this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
		        
			}else {
				
				for(Utilisateur u:utilisateurs) {
					
					if(pseudo.equals(u.getPseudo()) || email.equals(u.getEmail())) {
						
						request.setAttribute("erreur","Cet utilisateur existe deja !");
						this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
						break;
					}
				}
				
				Utilisateur user=new Utilisateur(nom,prenom,pseudo,email,mot_de_passe,repete_mot_de_passe);
				utilisateurs.add(user);
				session.setAttribute("utilisateurs", utilisateurs);
				session.setAttribute("utilisateur", user);
				//System.out.println(utilisateurs);
				this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);

			}
		
		}
	}
        
	

}
