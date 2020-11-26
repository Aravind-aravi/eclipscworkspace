<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page language="java" import="java.util.*" %>
  <%@page import="connection.EstablishingConnection"%>
<%@page language="java" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<div>
<form name="search" method="POST" action="FindUniqueDataServlet">
<label>FindUniqueData:</label>
<input type="text" name="uniqueid" value="Enter Unique ID">
<input type="submit" value="go">
</form>
</div>


<div>
<form action="${ pageContext.request.contextPath}/FilterRestaurentDataServlet" method="post">
<%
Connection con;
PreparedStatement ps;
try
{
con = EstablishingConnection.getCon();
String sql = "SELECT * FROM details";
ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
%>
<p>Fliter by location :
<select name="location">
<%
while(rs.next())
{
String location = rs.getString("location"); 
%>
<option value="<%=location %>"><%=location%></option>
<%
}
%>
</select>
<input type="submit" value="fliter" >
</p>


<%
}
catch(SQLException sqe)
{ 
out.println(sqe);
}
%>
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
</form>
</body>
</html>