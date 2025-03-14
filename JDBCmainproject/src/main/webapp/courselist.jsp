<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.jdbc.Coursemodel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coursejsp</title>
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
	<h1>List of courses</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h2>Courses List Page</h2>
			</div>
			<div class="col-md-2">
				<a href="admin.html"><button type="button" class="btn btn-primary">Back</button></a>
			</div>
		</div>
	</div>
	
	 <%
        List<Coursemodel> list = (List<Coursemodel>) request.getAttribute("course");
	 %>
	 <table border="1">
		<tr>
			<th>CourseId</th>
			<th>CourseName</th>
			<th>Trainer</th>
			<th>Fee</th>
			<th>Duration</th>
			<th>Location</th>		
		</tr>
			<% 
            if (list != null) {
                for (Coursemodel cm : list) { 
        %>
        <tr>
			<td><%= cm.getCourseid() %></td>
			<td><%= cm.getCoursename() %></td>
			<td><%= cm.getTrainer() %></td>
			<td><%= cm.getFee() %></td>
			<td><%= cm.getDuration() %></td>
			<td><%= cm.getLocation() %></td>
			
			
			
			<td>
			<p>
					<form action="courseupdating" method="post" style="display: inline;" onsubmit="return confirmUpdation();">
						<input type="hidden" name="cid" value="<%= cm.getCourseid() %>">
						<button type="submit">Edit</button>
					</form>
					<form action="courseDeleting" method="post" style="display: inline;" onsubmit="return confirmDeletion();">
						<input type="hidden" name="cid" value="<%= cm.getCourseid() %>">
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
			<td colspan="4">No courses available.</td>
		</tr>
		<% 
            } 
        %>
	</table>

</body>
</html>