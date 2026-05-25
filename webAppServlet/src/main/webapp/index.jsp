<%@page
	import="jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput"%>
<%@page import="java.util.Date"%>
<html>
<body>
	<%-- <h2><%!Date date = new Date();

	Date getDate() {
		System.out.println("In gate date method");
		return date;
	}%></h2>
	<a href="myFirst">My First servlet <%=getDate()%></a>
	
	
 --%>
 <form action="myFirst" method="get">
 	<h2>SendRedirect()</h2>	
 		For more learning about Java <input type="submit" value="Click Me">
 </form>
 </body>
</html>
