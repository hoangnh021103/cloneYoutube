package com.example.ASM1;

import com.example.ASM1.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> list = new ArrayList<>();
    public UserService(){
        list.add(new User("S1","nguyena@gmail.com","1","nguyenA",true));
        list.add(new User("S2","nguyenB@gmail.com","2","nguyenB", false));
        list.add(new User("S3","nguyenC@gmail.com","3","nguyenC", false));
    }
    public List<User> getAll(){return list;}
    public void add(User u){
        list.add(u);
    }
    public User findByid(String id){
        for (User u :list){
            if (u.getId().equals(id));
            return u;
        }
        return null;
    }
    public void deleteByID(String id){
        User u = findByid(id);
        if (u!=null){
            list.remove(u);
        }
    }
    public void update(User u){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(u.getId())){
                list.set(i,u);
            }
        }
    }
}
