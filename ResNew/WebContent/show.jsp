<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form name="search" method="POST" action="FindUniqueData">
<label>FindUniqueData:</label>
<input type="text" name="uniqueid" value="Enter Unique ID">
<input type="submit" value="go">
</form>
</div>


<div>
<form action="FilterResData" method="post">


	<p>Fliter by location :
	<select name="location">
	
	<option value="<%=location %>"><%=location%></option>
<input type="submit" value="fliter" >
</form>
</div>





<div> 
<table  id ="ResDetails" border=1>
<tr>
<th>uniqueid</th>
<th> url</th>
<th> name</th>
<th> address</th>
<th> location</th>
<th> cuisine</th>
<th> dishes</th>
<th> price</th>
<th> rating</th>
<th> no of votes</th>

<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");
for (itr=data.iterator(); itr.hasNext(); )
{
%>
<tr>
<td width="119"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
</tr>
<%}%>




</tr>
</table>
</div>

</body>
</html>