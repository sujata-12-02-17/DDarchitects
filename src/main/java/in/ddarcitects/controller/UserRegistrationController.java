package in.ddarcitects.controller;

import in.ddarcitects.dao.UserDao;
import in.ddarcitects.daoImpl.UserDaoImpl;
import in.ddarcitects.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/user/adduser")
public class UserRegistrationController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao = new UserDaoImpl();

    public UserRegistrationController() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//            Long  userId= Long.parseLong(req.getParameter("id"));
            String  firstName= req.getParameter("firstName");
            String  lastName= req.getParameter("lastName");
            String  emailId= req.getParameter("emailId");

            String  password= req.getParameter("password");
            String  userRole= req.getParameter("userRole");
             boolean  isActive= req.getParameterMap().containsValue(1);



        User user = new User(firstName,lastName,emailId,password,userRole,isActive);
            if(emailId!=null|| !emailId.isEmpty()){
                if(password!=null|| !password.isEmpty()){
                    if(userDao.saveUser(user)==1){
                        resp.sendRedirect(req.getContextPath()+"/");
                    }
                }
            }
        }



    }



