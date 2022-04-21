package com.hty.htyjavaadmin.controller;

import com.hty.htyjavaadmin.entity.User1;
import com.hty.htyjavaadmin.mapper.UserMapper1;
import com.hty.htyjavaadmin.service.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/user2")  //所有访问url，添加user
@RestController
public class UserController1 {
    @Autowired
    UserMapper1 userMapper;
    @Autowired
    UserService1 userService;

    /**
     * get请求，使用url拼接参数的方式
     * @return
     */
    @GetMapping("/cs")
    public String ceShi(){
        return  "OK";
    }

    /**
     * 查询所有内容
     * @return
     */
    @RequestMapping()
    public List<User1> findAll(){
        return userMapper.findAll();
    };
    /**
     * 添加数据或者更新数据，用一个接口
     */
    @PostMapping("/save")
    public int save(@RequestBody User1 user){
       return userService.save1(user);
    };

    @PostMapping("/dtSave")
    public int dtSave(@RequestBody User1 user){
        return userMapper.updataUser(user);
    };

    @PostMapping("/insertUser")
    public int insertUser(@RequestBody User1 user){
        return userMapper.insertUser(user);
    }

    @PostMapping("/updataUser")
    public int updataUser(@RequestBody User1 user){
        return userMapper.updataUser(user);
    }

    /**
     * 分页查询
     * 用户春过来，第几页的数据 pageNum   pagesize
     *
     */
    @GetMapping("/selectPage")
    public Map<String,Object> selectPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        pageNum=(pageNum-1)*pageSize;
        //返回总个数
        int tatal = userMapper.selectTotal();
        //返回数据
        List<User1> data = userMapper.selectPage(pageNum, pageSize);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",tatal);
        map.put("data",data);
        return map;
    }
    @GetMapping("/deleteUserById")
    public int deleteUserById(@RequestParam Integer id){
        return userMapper.deleteUserById(id);
    }

    @GetMapping("/selectByCondition")
    public List<User1> selectByCondition(@RequestParam String name, @RequestParam String telPhone, @RequestParam String address){
        return userMapper.selectByCondition(name,telPhone,address);
    }

    @PostMapping("/savaUserMybitisPlus")
    public Boolean savaUserMybitisPlus(@RequestBody User1 user){
       return userService.save(user);
    }








}
