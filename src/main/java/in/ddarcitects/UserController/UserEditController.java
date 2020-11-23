package in.ddarcitects.UserController;

import in.ddarcitects.dao.UserDao;
import in.ddarcitects.daoImpl.UserDaoImpl;
import in.ddarcitects.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value ="/edit")
public class UserEditController extends HttpServlet {

   private static final long serialVersionUID = 1L;
    UserDao userDao = new UserDaoImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = null;
        Long id = Long.parseLong(req.getParameter("id"));
        if(!id.equals(0)){

            user = userDao.findUserById(id);
            req.setAttribute("user",user);
            req.getRequestDispatcher("edit-user.jsp").forward(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    User user =null;
     String userId =  req.getParameter("id");
        System.out.println("inside dopost.."+userId);
     if(!userId.isEmpty()){
         user =userDao.findUserById(Long.parseLong(userId));

     }
     String firstName = req.getParameter("fName");
     String lastName =  req.getParameter("lName");
     String email = req.getParameter("emailId");
        System.out.println(email);
     String password=req.getParameter("password");
     String userRole=req.getParameter("userRole");
     boolean  isActive= req.getParameterMap().containsValue(1);


        user.setfName(firstName);
        user.setlName(lastName);
        user.setUserRole(userRole);
        user.setIsActive(isActive);
        user.setEmailId(email);
        user.setPassword(password);
        userDao.updateUser(user);

     resp.sendRedirect(req.getContextPath()+"/users");
    }
}


