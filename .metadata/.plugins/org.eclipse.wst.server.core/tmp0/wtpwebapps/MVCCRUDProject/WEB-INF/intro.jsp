<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Home</title>
</head>
<body>
	<div class="container">
		<table>
			<thead>
		</table>
		<h1>Menu</h1>
		<form action="getHero.do" method="GET">
			Search for Hero by ID <input type="number" id="searchherobyid"
				name="heroid" placeholder="Type in Hero ID" required /> <input
				type="submit" value="Submit" />
		</form>
		<br>
		<form action="createHero.do" method="POST">
			<input type="submit" value="Create Hero" />
		</form>
		<br> <br>
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<c:if test="${empty heroes}">
						<td>No Heroes Found</td>
					</c:if>
					<c:forEach items="${heroes}" var="hero">
					<a href="getHero.do?heroid=${hero.id}">
						<td><span class="headings">Name: </span>
						<c:out value="${hero.name}" />
						<td><br>
						<td><span class="headings">Class: </span>
						<c:out value="${hero.dndClass}" />
						<br>
						<td><br> <br>
						</a>
					</c:forEach>
				</div>

				
			</div>

			<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
				integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
				crossorigin="anonymous"></script>
			<script
				src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
				integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
				crossorigin="anonymous"></script>
			<script
				src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
				integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
				crossorigin="anonymous"></script>
			<script src="js/main.js"></script>
</body>
</html>