package user;

import java.util.UUID;

public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }
    public User[] getUsers(){
        return userDao.getUsers();
    }

    public User getuserById(UUID id){
        for (User user : getUsers()){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
