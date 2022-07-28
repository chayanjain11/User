package com.User.services;


import java.util.List;
import com.User.dao.UserRepository;
import com.User.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        List<User> list=(List<User>)this.userRepository.findAll();
        return list;
    }

    public User getUserById(int id) {
        User user = null;
        try {
            user=this.userRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

     public User addUser(User b) {
        User result=userRepository.save(b);
        return result;
    }

    
    public void deleteUser(int bid) {
        
        userRepository.deleteById(bid);
    }

    
    public void updateUser(User user, int userId){
        user.setId(userId);
        userRepository.save(user);
    }

}
