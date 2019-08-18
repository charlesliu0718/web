package com.chaos.app.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaos.app.person.entity.Person;
import com.chaos.app.person.entity.PersonExample;
import com.chaos.app.person.mapper.PersonMapper;
import com.chaos.app.person.service.PersonQryServer;

@Service
public class PersonQryServerImpl implements PersonQryServer{
    @Autowired
    PersonMapper personMapper;
    
    @Override
    public List<Person> personInfoQry() {
        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andPersonIdBetween(1, 10);
        
        return personMapper.selectByExample(personExample);
    }
    
}
