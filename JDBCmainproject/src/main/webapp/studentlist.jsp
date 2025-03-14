<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jdbc.Studentmodel"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
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
	<h1>List of students</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h2>Students List Page</h2>
			</div>
			<div class="col-md-2">
				<a href="admin.html"><button type="button" class="btn btn-primary">Back</button></a>
			</div>
		</div>
	</div>
	
	 <%
        List<Studentmodel> list = (List<Studentmodel>) request.getAttribute("student");
	 %>

	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>MobileNumber</th>
			<th>MailId</th>
			<th>Gender</th>
			<th>Graduation</th>
			<th>Branch</th>
			<th>YearofPassedout</th>
			<th>Course</th>
			<th>DateofBirth</th>
			<th>UserName</th>
			<th>Password</th>
		</tr>
			<% 
            if (list != null) {
                for (Studentmodel sm : list) { 
        %>
		<tr>
			<td><%= sm.getFirstname() %></td>
			<td><%= sm.getLastname() %></td>
			<td><%= sm.getMobilenumber() %></td>
			<td><%= sm.getMailid() %></td>
			<td><%= sm.getGender() %></td>
			<td><%= sm.getGraduation() %></td>
			<td><%= sm.getBranch() %></td>
			<td><%= sm.getYearofpassedout() %></td>
			<td><%= sm.getCourse() %></td>
			<td><%= sm.getDateofbirth() %></td>
			<td><%= sm.getUsername() %></td>
			<td><%= sm.getPassword() %></td>
			
			<td>
			<p>
					<form action="studentupdating" method="post" style="display: inline;" onsubmit="return confirmUpdation();">
						<input type="hidden" name="fname" value="<%= sm.getFirstname() %>">
						<button type="submit">Edit</button>
					</form>
					<form action="studentDeleting" method="post" style="display: inline;" onsubmit="return confirmDeletion();">
						<input type="hidden" name="fname" value="<%= sm.getFirstname() %>">
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
			<td colspan="4">No students available.</td>
		</tr>
		<% 
            } 
        %>
	</table>
	<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>MobileNumber</th>
			<th>MailId</th>
			<th>Gender</th>
			<th>Graduation</th>
			<th>Branch</th>
			<th>YearofPassedout</th>
			<th>Course</th>
			<th>Dateofbirth</th>
			<th>Username</th>
			<th>Password</th>
			
			
		</tr>
		<% 
            if (list != null) {
                for (Studentmodel sm : list) { 
        %>
        <tr>
		
			<td><%= sm.getFirstname() %></td>
			<td><%= sm.getLastname() %></td>
			<td><%= sm.getMobilenumber() %></td>
			<td><%= sm.getMailid() %></td>
			<td><%= sm.getGender() %></td>
			<td><%= sm.getGraduation() %></td>
			<td><%= sm.getBranch() %></td>
			<td><%= sm.getYearofpassedout() %></td>
			<td><%= sm.getCourse() %></td>
			<td><%= sm.getDateofbirth() %></td>
			<td><%= sm.getUsername() %></td>
			<td><%= sm.getPassword() %></td>
			
			
			<td>
		<p>
					<form action="studentupdating" method="post" style="display: inline;" onsubmit="return confirmUpdation();">
						<input type="hidden" name="fname" value="<%= sm.getFirstname() %>">
						<button type="submit">Edit</button>
					</form>
					<form action="studentDeleting" method="post" style="display: inline;" onsubmit="return confirmDeletion();">
						<input type="hidden" name="fname" value="<%= sm.getFirstname() %>">
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
			<td colspan="4">No students available.</td>
		</tr>
		<% 
            } 
        %>
	</table>
		
</body>
</html>