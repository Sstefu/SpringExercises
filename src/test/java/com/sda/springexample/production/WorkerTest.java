package com.sda.springexample.production;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/test-application-content.xml")
public class WorkerTest {

    @Autowired
    private Worker worker;

    @Test
    public void getTools()
    {
        Assert.assertNotNull(worker);
        Assert.assertNotNull(worker.getTools());

    }


}