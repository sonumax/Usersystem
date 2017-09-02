package systems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import systems.dao.UserDao;
import systems.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
