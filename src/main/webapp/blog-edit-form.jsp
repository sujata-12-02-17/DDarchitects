<!DOCTYPE html>
<head>
        <meta charset="UTF-8"/>
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
          <a class="dropdown-item" href="<%=request.getContextPath() %>/blogs">List Blog</a>
          <a class="dropdown-item" href="blog-add-form.jsp">Add Blog</a>
        </div>
      </li>
    </ul>
  </div>
</nav>

    <div class="container">
       <form action="blogeditform" method="post">
        <div class="row">
             <div class="col-md-6 col-sm-12">

                 <div class="form-group">
                     <input type="text" class="form-control" hidden>
                 </div>

                <div class="col-md-6">
                    <div class="form-group">
                        <label for="feature image" id="lblfeatureimage">Feature Image:</label>
                        <input type="file" class="form-control" id="feature-image">
                    </div>
                        <div class="file-path-wrapper">
                        <img src=" " class="rounded float-right" alt="Responsive image" placeholder="Upload your image">
                    </div>

                </div>

                    <div class="form-group">
                        <label for="blog title">Blog Title:</label>
                        <input type="blog title" class="form-control" id="blog title">
                     </div>
                    <div class="form-group">
                        <label for="blog short text">Blog Short Text:</label>
                        <input type="blog short text" class="form-control" id="blog short text">
                    </div>

                </div>
             </div>

                        <div class="form-group">
                            <label for="blog description">Blog Description</label>
                            <textarea class="form-control" id="blog description" rows="5"></textarea>
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
