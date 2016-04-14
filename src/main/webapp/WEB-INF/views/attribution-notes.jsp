<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="attribution-notes.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script>
		//A déplacer dans un meilleur endroit à terme,
		//peut être utile pour d'autres pages
		function toggleDisplay(e) {
			$(e.data).toggle();
		}
		
		$("#famille-intitule1").click("liste-comp1", toggleDisplay);
		$("#famille-intitule2").click("liste-comp2", toggleDisplay);
	</script>
<title>Mockup Formulaire attribution notes</title>
</head>
<body>
	<form>
	<ul>
		<li>
			<h3 class="famille-intitule" id="famille-intitule1">Famille de compétences #1</h3>
			<div class="liste-comp" id="liste-comp1">
				<table>
					<tr>
						<td>Compétence #1A</td>
						<td><select name="noteComp1A">
							<option value="-valeur par défaut-">-</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select></td>
						<td><input type="text" name="commentaireComp1A"></td>
					</tr>
					<tr>
						<td>Compétence #1B</td>
						<td><select name="noteComp1B">
							<option value="-valeur par défaut-">-</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select></td>
						<td><input type="text" name="commentaireComp1B"></td>
					</tr>
					<tr>
						<td>Compétence #1C</td>
						<td><select name="noteComp1C">
							<option value="-valeur par défaut-">-</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select></td>
						<td><input type="text" name="commentaireComp1C"></td>
					</tr>
				</table>
			</div>
		</li>
		<li>
			<h3 class="famille-intitule" id="famille-intitule1">Famille de compétences #2</h3>
			<div class="liste-comp" id="liste-comp2">
				<table>
					<tr>
						<td>Compétence #2A</td>
						<td><select name="noteComp2A">
							<option value="-valeur par défaut-">-</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select></td>
						<td><input type="text" name="commentaireComp2A"></td>
					</tr>
					<tr>
						<td>Compétence #2B</td>
						<td><select name="noteComp2B">
							<option value="-valeur par défaut-">-</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select></td>
						<td><input type="text" name="commentaireComp2B"></td>
					</tr>
					<tr>
						<td>Compétence #2C</td>
						<td><select name="noteComp2C">
							<option value="-valeur par défaut-">-</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select></td>
						<td><input type="text" name="commentaireComp2C"></td>
					</tr>
				</table>
			</div>
		</li>
	</ul>
	<input type="submit" name="Terminer"/>
	</form>
</body>
</html>