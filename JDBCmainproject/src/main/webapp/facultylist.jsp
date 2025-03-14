<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jdbc.Facultymodel"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facultyjsp</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<script type="text/javascript">
	    function confirmDeletion() {
	        return confirm("Are you sure you want to delete?");
	    }
	    function confirmUpdation() {
	        return confirm("Are you sure you want to update?");
	    }
	</script>

</head>
<body>
	<h1>List of faculty</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h2>Faculty List Page</h2>
			</div>
			<div class="col-md-2">
				<a href="admin.html"><button type="button" class="btn btn-primary">Back</button></a>
			</div>
		</div>
	</div>
	
	 <%
        List<Facultymodel> list = (List<Facultymodel>) request.getAttribute("faculty");
	 %>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Mobile</th>
			<th>Qualification</th>
			<th>YearsofExperience</th>		
			<th>MailId</th>
			<th>UserName</th>
			<th>Password</th>
			<th>ConfirmPassword</th>
		</tr>
			<% 
            if (list != null) {
                for (Facultymodel fm : list) { 
        %>
		<tr>
			<td><%= fm.getFirstname() %></td>
			<td><%= fm.getLastname() %></td>
			<td><%= fm.getGender() %></td>
			<td><%= fm.getMobile() %></td>
			<td><%= fm.getQualification() %></td>
			<td><%= fm.getYearsofexperience() %></td>
			<td><%= fm.getMailid() %></td>
			<td><%= fm.getUsername() %></td>
			<td><%= fm.getPassword() %></td>
			<td><%= fm.getConfirmpassword() %></td>
			
			
			<td>
			<p>
					<form action="facultyupdating" method="post" style="display: inline;" onsubmit="return confirmUpdation();">
						<input type="hidden" name="fname" value="<%= fm.getFirstname() %>">
						<button type="submit">Edit</button>
					</form>
					<form action="facultyDeleting" method="post" style="display: inline;" onsubmit="return confirmDeletion();">
						<input type="hidden" name="fname" value="<%= fm.getFirstname() %>">
						<button type="submit" >Delete</button>
					</form>
				</p>
			</td>
			
		</tr>
		<% 
                }
            } else { 
        %>
		<tr>
			<td colspan="4">No faculty available.</td>
		</tr>
		<% 
            } 
        %>
	</table>

</body>
</html>