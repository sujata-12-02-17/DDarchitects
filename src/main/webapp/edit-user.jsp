<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>


    </title>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <%@ page isELIgnored="false" %>
         <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


</head>
<body style="background-color:#fff8db">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            User
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="<%=request.getContextPath() %>/users">List User</a>
            <a class="dropdown-item" href="add-user.jsp">Add User</a>
          </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Blog
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="<%=request.getContextPath() %>/users">List Blog</a>
          <a class="dropdown-item" href="add-user.jsp">Add Blog</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
<div class="container">
<h1>update list</h1>
<form action="edit" method="post">

<tr>

<td><input type="text" name="id" size="45" value="<c:out value='${user.id}'/>"/></td>
<td><input type='text' name='fName' value="${user.getfName()}"/></td>

<td><input type='text' name='lName' value="${user.getlName()}"/></td></tr>
<td><input type='text' name='emailId' value="${user.getEmailId()}"/></td></tr>
<td><input type='text' name='password' value="${user.getPassword()}"/></td></tr>
<td><input type='text' name='userRole' value="${user.getUserRole()}"/></td></tr>
<td><input type='text' name='isActive' value="${user.getIsActive()}"/></td></tr>
<button type="submit" value="edit">Edit</button>

</form>
</div>
</body>
</html>