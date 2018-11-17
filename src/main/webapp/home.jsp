<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<body background="https://images.wallpaperscraft.com/image/wood_background_texture_36573_300x168.jpg">
 
 <center>

<br>

<a href="index.jsp"><button style="background-color:teal;height:50px; width:200px;"><font size=3>Home</font size></button></a>

<a href="index.jsp"><button style="background-color:teal;height:50px; width:200px;"><font size=3>Vendor Dashboard	</font size></button></a>

<a href="index.jsp"><button style="background-color:teal;height:50px; width:200px;"><font size=3>Orders</font size></button></a>
<a href="index.jsp"><button style="background-color:teal;height:50px; width:200px;"><font size=3>My Account</font size></button></a>

<a href="index.jsp"><button style="background-color:teal;height:50px; width:200px;"><font size=3>Shop Settings</font size></button></a>
<hr>
</center>

 <form method="post" action="./getproduct">
 
 <header>
		<table border="border" width="100%" height="0" bgcolor="teal" bordercolor="teal" style="font: bold;">
			<tr>
				<th><h5><a href="#">Home</a></h5></th>
				<th><h5><a href="index.jsp">Vendor Dashboard</a></h5></th>
				<th><h5><a href="index.jsp">Orders</a></h5></th>
				<th><h5><a href="index.jsp">My Accounts</a></h5></th>
				<th><h5><a href="index.jsp">Shop Settings</a></h5></th>
			</tr>
		</table>
	</header>
	<br><br><br><br>

       <div class="SearchBar">
            <form>
            <center>   <img src="src/main/resources/1.jpg">
                  <center>   <input type="text"  name="search" placeholder="Search..." required> <input type="button" value="search" name="search" ></input> </center>
                  
            </form>
        </div>


</body>
</html>