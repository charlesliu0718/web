package com.chaos.app.person.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chaos.app.person.common.SpringTest;
import com.chaos.app.person.entity.Person;

public class PersonQryServerTest extends SpringTest{
    @Autowired
    PersonQryServer personQryServer;

    @Test
    public void test() {
        List<Person> persons = personQryServer.personInfoQry();
        System.out.println(persons.toString());

        Assert.assertEquals(1, persons.size());
    }
}
