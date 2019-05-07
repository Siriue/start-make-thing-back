package com.dlmu.Dao;

import com.dlmu.Entity.Car;
import com.dlmu.Entity.Relation;
import com.dlmu.Entity.User;
import com.dlmu.VO.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    List<UserVO> queryUser();

    Integer login(@Param("userName") String userName, @Param("password") String password);

    List<Car> queryCarByUserId(Integer userId);

    void insertUser(User user);

    void deleteUser(Integer userId);

    void updateUser(User user);

    List<Car> queryAllCar();

    void addCarByUserId(@Param("userId") Integer userId, @Param("carId") Integer carId);

    void deleteRelation(Relation relation);
}
