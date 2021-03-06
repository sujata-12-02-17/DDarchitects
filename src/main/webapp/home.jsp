<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">


      <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
     <!-- Custom styles for this template -->

</head>
<body style="background-color:#fff8db" >
<div class="container">
   <header>
    <div class="navbar navbar-dark bg-transparent border-success mb-4">
         <div class="container justify-content-between d-none d-xl-block">
                 <a href="#" class="navbar-brand  align-items-center">
                    <img src="assets/images/logo-homepage_transparent.svg" width="350px"/>
                 </a>
                 <button class="navbar-toggler btn bg-dark float-right" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
                   <span class="navbar-toggler-icon"></span>
                 </button>
         </div>
    </div>
    <div class="navbar navbar-dark bg-transparent border-success mb-4">
         <div class="container justify-content-between   d-md-none .d-lg-block">
              <a href="#" class="navbar-brand .d-none align-items-center">
                    <img src="assets/images/logo-homepage_transparent.svg" width=190px"/>

              </a>
               <button class="navbar-toggler btn bg-dark float-right" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
               </button>
         </div>
    </div>
  </header>
<div class="container">
    <div class="row">


         <c:forEach var="blog" items="${blogs}">

            <div class="col-md-3">
                 <div class="card mb-4 shadow-sm">
                        <svg class="bd-placeholder-img card-img-top" width="100%" height="180" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
                        <div class="card-body">
                        <div style="font-style:italic;" class="h5">  ${blog.blogTitle} </div>
                         <div>
                            by  ${blog.id}
                        </div>





                              <p class="card-text">${blog.shortText}</p>
                               <div class="d-flex justify-content-between align-items-center">
                                  <div class="btn-group">

                                    <a type="button" class="btn btn-sm btn-outline-secondary" href=" <%=request.getContextPath()%>/blogdetail?id=${blog.id}">Read More</a>
                                     <%   if (session.getAttribute("user")!=null){
                                    %>
                                        <a type="button" class="btn btn-sm btn-outline-secondary" href=" <%=request.getContextPath()%>/blogeditform?id=${blog.id}">Edit</a>
                                    <%
                                        }
                                    %>

                                     <%
                                         Date dNow = new Date( );
                                         SimpleDateFormat ft =
                                         new SimpleDateFormat ("yyyy.MM ");
                                         out.print( "<h6 align=\"center\">" + ft.format(dNow) + "</h6>");
                                              %>

                                  </div>
                               </div>
                        </div>
                 </div>
            </div>

        </c:forEach>

     </div>
</div>
</body>
</html>
