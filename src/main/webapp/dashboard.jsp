<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body style="background-color:#fff8db">
<%
    if (session.getAttribute("user")==null){
        response.sendRedirect("login.jsp");
    }
%>
<%--<%--%>
<%--    String message = null;--%>
<%--    String sessionID =  null;--%>

<%--    Cookie[] cookies = request.getCookies();--%>
<%--    if(cookies!=null){--%>
<%--        for (Cookie cookie: cookies){--%>
<%--//            if (cookie.getName().equals("message")) message = cookie.getValue();--%>
<%--            if (cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">ddarchitects Blogs</a>
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
          <a class="dropdown-item" href="<%=request.getContextPath() %>/blogs">List Blog</a>
          <a class="dropdown-item" href="<%=request.getContextPath() %>/blogaddform">Add Blog</a>
        </div>
      </li>
    </ul>
    <div class="col-4 d-flex justify-content-end align-items-center">
                <h6 style="color: #FFF;">${user.firstName}</h6>
                <a class="text-muted" href="#">
                <a class="btn btn-sm btn-outline-secondary" href="<%=request.getContextPath() %>/logout"> LogOut</a>
                </a>

              </div>
  </div>

</nav>
   <div class="container mt-4">
   <div class="row">
          <div class="col-md-3">

           </div>

       <div class="col-md-3 mr-2 ">
        <div class="card" style="width: 18rem;">
          <div class="card-body">
            <h5 class="card-title"> User</h5>
            <button type="button" class="btn btn-primary">
              Count <span class="badge badge-light">${usersCount}</span>
            </button>
           <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="<%=request.getContextPath() %>/users" class="card-link" >Read more....</a>
            <a href="#" class="card-link">Views</a>
          </div>
        </div>
        </div>
        <div class="col-md-3 ml-1">
        <div class="card" style="width: 18rem;">
          <div class="card-body">
            <h5 class="card-title">Blog</h5>
            <button type="button" class="btn btn-primary">
              Count <span class="badge badge-light">${blogsCount}</span>
            </button>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="<%=request.getContextPath() %>/blogs" class="card-link" >Read more....</a>
           <a href="#" class="card-link">Views</a>
          </div>
        </div>
    </div>
    <div class="col-md-3">

               </div>

    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>

