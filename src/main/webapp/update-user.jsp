<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
        <a class="nav-link" href="<%=request.getContextPath() %>/">Home <span class="sr-only">(current)</span></a>
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
                    <a class="dropdown-item" href="<%=request.getContextPath() %>/users">List Blogs</a>
                    <a class="dropdown-item" href="add-user.jsp">Add Blog</a>
                  </div>
      </li>
    </ul>
  </div>
   <div class="col-4 d-flex justify-content-end align-items-center">
                  <a class="text-muted" href="#">
                  <a class="btn btn-sm btn-outline-secondary" href="#"> LogOut</a>
                  </a>

                </div>
</nav>

<form action="/update" method="post">
<tr><td><input type="text" name="id" size="45" value="<c:out value='${user.id}' />" /></td>


<td><input type='text' name='fName' value="${user.getfName()}"/></td>

<td><input type='text' name='lName' value="${user.getlName()}"/></td></tr>
<td><input type='text' name='emailId' value="${user.getEmailId()}"/></td></tr>
<td><input type='text' name='password' value="${user.getPassword()}"/></td></tr>
<td><input type='text' name='userRole' value="${user.getUserRole()}"/></td></tr>
<td><input type='text' name='isActive' value="${user.getIsActive()}"/></td></tr>
<input type="submit" value="edit"/>
</form>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

</body>
</html>