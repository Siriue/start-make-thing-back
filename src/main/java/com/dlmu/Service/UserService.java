package com.dlmu.Service;

import com.dlmu.Dao.UserMapper;
import com.dlmu.Entity.Car;
import com.dlmu.Entity.Relation;
import com.dlmu.Entity.User;
import com.dlmu.VO.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<UserVO> queryUser() {
        List<UserVO> userList = userMapper.queryUser();
        userList.forEach(user -> {
            List<Car> carList = new ArrayList<>();
            carList = userMapper.queryCarByUserId(user.getUserId());
            user.setCarList(carList);
        });
        return userList;
    }

    public Integer login(String userName, String password) {
        return userMapper.login(userName,password);
    }

    public void insetUser(User user) {
        userMapper.insertUser(user);
    }

    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public List<Car> queryAllCar() {return userMapper.queryAllCar();}

    public void addCarByUserId(Integer userId, Integer carId) {
        userMapper.addCarByUserId(userId, carId);
    }

    public void deleteRelation(Relation relation) {
        userMapper.deleteRelation(relation);
    }
}
