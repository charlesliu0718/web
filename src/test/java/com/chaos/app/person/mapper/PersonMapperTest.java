package com.chaos.app.person.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaos.app.person.common.SpringTest;
import com.chaos.app.person.entity.Person;

public class PersonMapperTest extends SpringTest{
  @Autowired
  PersonMapper personMapper;
  
  @Test
  public void test1() {
    Person person = personMapper.selectByPrimaryKey(1);
    System.out.println(person.toString());
    Assert.assertEquals("刘超", person.getPersonName());
  }
}
