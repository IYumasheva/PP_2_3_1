package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDAO userDao;

    @Transactional(readOnly = true)
    public List<User> index() {
        return userDao.index();
    }

    @Transactional(readOnly = true)
    public User show(int id){
        return userDao.show(id);
    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void update(User updatedUser){ userDao.update(updatedUser); }

    @Transactional
    public void delete(int id) {userDao.delete(id);}
}
