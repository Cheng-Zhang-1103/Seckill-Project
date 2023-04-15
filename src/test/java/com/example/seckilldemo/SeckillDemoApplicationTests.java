package com.example.seckilldemo;

import com.example.seckilldemo.controller.TUserController;
import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.mapper.TUserMapper;
import com.example.seckilldemo.service.ITUserService;
import com.example.seckilldemo.utils.MD5Util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.script.RedisScript;

import javax.validation.Validator;
import java.util.*;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SeckillDemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisScript<Boolean> redisScript;

    @Test
    public void testLock01() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //Placeholder, if the key does not exist before you can set it successfully
        Boolean isLock = valueOperations.setIfAbsent("k1", "v1");
        if (isLock) {
            valueOperations.set("name", "xxx");
            String name = (String) valueOperations.get("name");
            System.out.println("name=" + name);
            //End of operation, delete lock
            redisTemplate.delete("k1");
        } else {
            System.out.println("There are threads in use, please try again later");
        }
    }

    @Test
    public void testLock2() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //Add an expiration time to the lock
        Boolean isLock = valueOperations.setIfAbsent("k1", "v1", 5, TimeUnit.SECONDS);
        if (isLock) {
            valueOperations.set("name", "xxx");
            String name = (String) valueOperations.get("name");
            System.out.println("name=" + name);
            //End of operation, delete lock
            redisTemplate.delete("k1");
        } else {
            System.out.println("There are threads in use, please try again later");
        }
    }

    @Test
    public void testLock3() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String value = UUID.randomUUID().toString();
        Boolean isLock = valueOperations.setIfAbsent("k1", value, 5, TimeUnit.SECONDS);
        if (isLock) {
            valueOperations.set("name", "xxx");
            String name = (String) valueOperations.get("name");
            System.out.println("name=" + name);
            //End of operation, delete lock
            System.out.println(valueOperations.get("k1"));
            Boolean result = (Boolean) redisTemplate.execute(redisScript, Collections.singletonList("k1"), value);
            System.out.println(result);
        } else {
            System.out.println("There are threads in use, please try again later");
        }
    }
}
