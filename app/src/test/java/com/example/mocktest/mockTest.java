package com.example.mocktest;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

public class mockTest {

    @Test
    public void testIsNotNull() {//普通方法
        Person mPerson = mock(Person.class);
        assertNotNull(mPerson);
    }

}

//Mock注解
class MockAnnotationsTest {

    @Mock  //使用@Mock注解
    Person mPerson;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);//初始化
    }

    @Test
    public void testIsNotNull() {
        assertNotNull(mPerson);
    }
}


//运行器方法
@RunWith(MockitoJUnitRunner.class)
class MockitoJunitRunnerTest {

    @Mock
    Person mPerson;

    @Test
    public void testIsNotNull() {
        assertNotNull(mPerson);
    }
}


