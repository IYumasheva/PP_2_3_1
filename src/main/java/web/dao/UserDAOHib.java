package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOHib implements UserDAO{

    @PersistenceContext
    private final EntityManager em;

    public UserDAOHib(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> index() {
        TypedQuery<User> query= em.createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public User show(int id) {
        User user = em.find(User.class, id);
        return user;
    }

    @Override
    public void save(User user){
        em.persist(user);
    }

    @Override
    public void update(User updatedUser){
        em.merge(updatedUser);
    }

    @Override
    public void delete(int id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }
}
