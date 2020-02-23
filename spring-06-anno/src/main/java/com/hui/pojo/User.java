package com.hui.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.hui.pojo.User"/>

@Component
public class User {
    @Value("灰灰")
    public String name;

}
