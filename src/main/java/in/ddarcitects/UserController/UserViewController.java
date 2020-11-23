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
import java.util.List;

@WebServlet(value = "/users")
public class UserViewController  extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private UserDao userDao = new UserDaoImpl();

    public UserViewController() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users =userDao.findAllUser();
        //System.out.println(customers.get(2).getfName());
        req.setAttribute("users",users);
        req.getRequestDispatcher("display-users.jsp").forward(req,resp);
    }
}
