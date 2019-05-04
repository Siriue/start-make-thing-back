package com.dlmu.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends UserPass{
    private Integer userId;
    private String sex;
    private Date birthday;
    private String tel;
    private String comment;
}
