<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscrire</title>
<link rel="stylesheet" href="/MonServletJsp/index.css">
</head>
<body>
	
		<h2>VEUI</h2>
		<form action="Accueil" method="post">
			<div class="form">
				<p>
					
					<input type="text" name="nom" id="nom" placeholder="Nom">
				</p>
				 <p>
					
					<input type="text" name="prenom" id="prenom" placeholder="Prenom">
				 </p>
				
				<p>
					
					<input type="email" name="email" id="email" placeholder="Email">
				 </p>
				
				 <p>
					
					<input type="text" name="pseudo" id="pseudo" placeholder="Pseudo">
				 </p>
				
				 <p>
					
					<input type="password" name="mot_de_passe" id="mot_de_passe" placeholder="Mot De Passe">
				</p>
				
				 <p>
					
					<input type="password" name="repete_mot_de_passe" id="repete_mot_de_passe" placeholder="Confirme Mot De Passe">
				</p>
				
				<% if (request.getAttribute("erreur")!=null) { %>
					<p class="error"> <%= request.getAttribute("erreur") %></p>
				<%} %>
				<p class="p"><input type="submit" value="Envoyer" class="envoyer"/></p>
			</div>
		</form>
	

	
	<!--  <ul>
		<c:forEach var="utilisateur" items="${ utilisateurs }">
			<li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" />
			
			</li>
		</c:forEach>
	</ul>-->
	
</body>
</html>