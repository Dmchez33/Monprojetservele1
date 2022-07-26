<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import ="java.util.ArrayList" %>
<%@ page import ="java.util.List" %>
<%@ page import ="com.test.bean.Utilisateur" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/MonServletJsp/accueil.css">
</head>
<body>
	<div class="button">
		<form action="login" method="post">
			<button type="submit" >
				Deconnecter
			</button>
		</form>
	
	</div>
	<% 
			
			HttpSession sess= request.getSession();
			Utilisateur u =(Utilisateur) sess.getAttribute("utilisateur");
		%>
	<h1><marquee behavior="alternate" width="50%">
   		Bienvenu <%= u.getNom() %>
	</marquee></h1>
	<table border="1" cellpadding="5">
	        <caption><h2>List des utilisateurs</h2></caption>
	        <tr>
	            <th>Nom</th>
	            <th>Prénom</th>
	            <th>Pseudo</th>
	            <th>Email</th>
	        </tr>
			<%  HttpSession ses = request.getSession();
			    List<Utilisateur> us = (List) ses.getAttribute("utilisateurs"); %>
			<% for(Utilisateur user: us) { %> 			
		 		<tr>
				    <td><%=user.getNom() %></td>
				 	<td><%=user.getPrenom() %></td>
				 	<td><%=user.getPseudo() %></td>
				    <td><%=user.getEmail() %></td>
			 
			 	</tr>
			<%} %>
		</table>
	 
</body>
</html>