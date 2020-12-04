<!DOCTYPE html>
<head>
        <meta charset="UTF-8"/>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ page isELIgnored="false" %>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>dd-architects</title>
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
          <a class="dropdown-item" href="<%=request.getContextPath() %>/blogs">List Blog</a>
          <a class="dropdown-item" href="<%=request.getContextPath() %>/blogaddform">Add Blog</a>
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

    <div class="container">
       <form action="blogeditform" method="post">
        <div class="row">
             <div class="col-md-6 col-sm-12">
                 <input type="text"  value="${blog.getId()}" name="blog-id"  hidden>

                <div class="col-md-6">
                    <div class="form-group">
                        <label for="feature image" id="lblfeatureimage">Feature Image:</label>
                        <input type="file" name="feature-UrI-Image" class="form-control" id="feature-image">
                    </div>
                        <div class="file-path-wrapper">
                            <img src=" " class="rounded float-right" alt="Responsive image" placeholder="Upload your image">
                        </div>

                </div>

                    <div class="form-group">
                        <label for="blog title">Blog Title:</label>
                        <input type="blog title" name="blog-title" value="${blog.getBlogTitle()}"  class="form-control" id="blog title">
                     </div>
                    <div class="form-group">
                        <label for="blog short text">Blog Short Text:</label>
                        <input type="blog short text" name="blog-short-text" value="${blog.getShortText()}" class="form-control" id="blog short text">
                    </div>

             </div>
        </div>

                        <div class="form-group">
                            <label for="blog description">Blog Description</label>
                            <textarea class="form-control" id="blog-description"  name="blog-description" value="${blog.getBlogDescription()}" rows="5"></textarea>
                        </div>
                           <div class="form-group">
                                  <div class="dropdown">
                                        <select id="Author" name="author">

                                              <option>Select Author</option>
                                              <c:forEach var="user" items="${users}">
                                              <option value="${user.id}">${user.fName}</option>
                                          </c:forEach>
                                        </select>
                                  </div>
                              </div>
                            <div class="form-group">
                            <input class="btn btn-primary" type="submit" value="edit">
                            </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

 </form>
</body>
</html>
