package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDaoHib;

    @Override
    @Transactional(readOnly = true)
    public List<User> index() {
        return userDaoHib.index();
    }

    @Override
    @Transactional(readOnly = true)
    public User show(int id){
        return userDaoHib.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDaoHib.save(user);
    }

    @Override
    @Transactional
    public void update(User updatedUser){ userDaoHib.update(updatedUser); }

    @Override
    @Transactional
    public void delete(int id) {
        userDaoHib.delete(id);}
}
