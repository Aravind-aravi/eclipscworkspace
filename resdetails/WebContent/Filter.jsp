<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@page language="java" import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="700px" align="center" border=1">
		<tr>
		 
			<td><b>UNIQUEID</b></td>
			<td><b>URL</b></td>
			<td><b>NAME</b></td>
			<td><b>ADDRESS</b></td>
			<td><b>LOCATION</b></td>
			<td><b>CUISINE</b></td>
			<td><b>DISHES</b></td>
			<td><b>PRICE</b></td>
			<td><b>RATING</b></td>
			<td><b>VOTES</b></td>
			
		</tr>
		<%
                int count = 0;
                if (request.getAttribute("ll") != null) {
                    ArrayList a1 = (ArrayList) request.getAttribute("ll");
                    System.out.println(a1);
                    Iterator itr = a1.iterator();
                    while (itr.hasNext()) {

                        if ((count % 2) == 0) {
                          
                        }
                        count++;
                        ArrayList pList = (ArrayList) itr.next();
            %>
		<tr>
	        <td><%=pList.get(9)%></td>
			<td><%=pList.get(0)%></td>
			<td><%=pList.get(1)%></td>
			<td><%=pList.get(2)%></td>
			<td><%=pList.get(3)%></td>
			<td><%=pList.get(4)%></td>
			<td><%=pList.get(5)%></td>
			<td><%=pList.get(6)%></td>
			<td><%=pList.get(7)%></td>
			<td><%=pList.get(8)%></td>
			
		
			
		</tr>
		<%
                    }
                }
                if (count == 0) {
            %>
		<tr>
			<td colspan=4 align="center"><b>No
					Record Found..</b></td>
		</tr>
		<%            }
                
            %>
            <a href ="ShowRestaurentDataServlet">Back</a>
	</table>





</body>
</html>