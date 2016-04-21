<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Set!</title>
</head>
<body>


	<div class="tablewhole">

		<div id="card-table5">
			<table id="table1">

				<thead>
					<tr>
						<th colspan="3">Result!</th>
					</tr>
					<tr>
						<c:forEach var="head" items="${tableHeader}">
							<th>"${head}"</th>
						</c:forEach>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="test" items="${TABLE}">
						<tr>
							<c:forEach var="cell" items="${name}">
								<td>"${cell}"</td>
							</c:forEach>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


</body>
</html>