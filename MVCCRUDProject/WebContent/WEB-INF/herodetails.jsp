<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- TODO: Add the @taglib for form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="intro.css">
<title>Character Sheet</title>
</head>
<body>
	<div class="container">
		<form action="updateHero.do" method="POST">
			<span class="headings">Hero ID: </span><input type="text" name="id"
				value="${hero.id}" readonly /><br> <span class="headings">Name:
			</span> <input type="text" type="text" name="name" value="${hero.name}" /> <br>
			<select name="dndClass" name="classList" id="classList"
				value=${hero.dndClass }}>
				<c:forEach items="${classList}" var="option">
					<c:choose>
						<c:when test="${hero.dndClass.fieldDescription == option.fieldDescription }">

							<option value="${option}" selected>
								<c:out value="${option.fieldDescription}"></c:out>
							</option>
						</c:when>
						<c:otherwise>
							<option value="${option}">
								<c:out value="${option.fieldDescription}"></c:out>
							</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select><br> <span class="headings">Level: </span><input type="number"
				name="level" value="${hero.level }" /><br> <span
				class="headings">Race: </span> <select name="race" name="raceList"
				id="raceList" value=${hero.race }>
				<c:forEach items="${raceList}" var="option">
					<c:choose>
						<c:when test="${hero.race.fieldDescription == option.fieldDescription }">

							<option value="${option}" selected>
								<c:out value="${option.fieldDescription}"></c:out>
							</option>
						</c:when>
						<c:otherwise>
							<option value="${option}">
								<c:out value="${option.fieldDescription}"></c:out>
							</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select><br> <span class="headings">Max HP: </span> <input type="number"
				name="maxHP" value="${hero.maxHP}" /><br> <span
				class="headings">Current HP: </span><input type="number"
				name="currentHP" step="any" value="${hero.currentHP}" /><br> <span
				class="headings">Temporary HP: </span> <input type="number"
				name="tempHP" value="${hero.tempHP}" /><br> <span
				class="headings">Strength: </span><input type="number"
				name="strength" step="any" value="${hero.strength}" /><br>
			${strRoll} <span class="headings">Dexterity: </span><input
				type="number" name="dexterity" step="any" value="${hero.dexterity}" /><br>
			${dexRoll} <span class="headings">Constitution: </span><input
				type="number" name="constitution" step="any"
				value="${hero.constitution}" /><br> ${conRoll} <span
				class="headings">Intelligence: </span><input type="number"
				name="intelligence" step="any" value="${hero.intelligence}" /><br>
			${intRoll} <span class="headings">Wisdom: </span><input type="number"
				name="wisdom" step="any" value="${hero.wisdom}" /><br>
			${wisRoll} <span class="headings">Charisma: </span><input
				type="number" name="charisma" step="any" value="${hero.charisma}" /><br>
			${chaRoll}



			<div class="btn-group">
				<input type="hidden" name="hero" value="${hero}" />
				<button type="submit" class="btn btn-primary">Update</button>
		</form>
		<form:form action="deleteHero.do" method="POST">
			<input type="hidden" name="heroid" value="${hero.id}" />
			<button type="submit" class="btn btn-primary" value="Delete">Delete</button>
		</form:form>
		<form:form action="index.do" method="GET">
			<button type="submit" class="btn btn-primary" value="Back">Back</button>
		</form:form>
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
</body>
</html>