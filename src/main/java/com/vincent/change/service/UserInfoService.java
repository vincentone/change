package com.vincent.change.service;

import com.vincent.change.entity.userinfo;
import com.vincent.change.mapper.UserinfoMapper;
import com.vincent.change.service.impl.UserinfoServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements UserinfoServiceimpl {

    @Autowired
    UserinfoMapper userinfoMapper;

    @Override
    public List<userinfo> findList(){
        List<userinfo> list = userinfoMapper.findList();
        return list;
    }
}
