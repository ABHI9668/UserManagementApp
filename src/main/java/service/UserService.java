package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepo;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;



    public List<User> getAllUsers() {
      return userRepo.getUsers();
    }


    public String createUser(User user) {
     List<User> originalList=getAllUsers();
     originalList.add(user);
     return "New user Added";
    }

    public String getUser(Integer id) {
        List<User> originalList=getAllUsers();
       for(User myUserId : originalList){
           if(myUserId.getUserId().equals(id)){
                return "hhh";
           }
       }
       return "Id nor exist";
    }



}
