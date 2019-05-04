package com.dlmu.VO;

import com.dlmu.Entity.Car;
import com.dlmu.Entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserVO extends User {
    private List<Car> carList;
}
