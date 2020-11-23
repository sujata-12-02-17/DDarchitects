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
@WebServlet(value="/")
public class HomeController  extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserDao userDao = new UserDaoImpl();

    public HomeController() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> users = userDao.findAllUser();
        req.setAttribute("userList", users);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
