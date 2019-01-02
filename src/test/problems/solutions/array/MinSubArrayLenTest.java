package test.problems.solutions.array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import problems.arrayAndstring.MinSubArrayLen;

/** 
* MinSubArrayLen Tester. 
* 
* @author <Authors name> 
* @since <pre>Jul 31, 2018</pre> 
* @version 1.0 
*/ 
public class MinSubArrayLenTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: minSubArrayLen(int s, int[] nums) 
* 
*/ 
@Test
public void testMinSubArrayLen() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: min(int a, int b) 
* 
*/ 
@Test
public void testMin() throws Exception {

    MinSubArrayLen test = new MinSubArrayLen();
    int actual = test.min(1, 2);
    int expected = 1;
    Assert.assertEquals(expected, actual);
    actual = test.min(2, 2);
    expected = 2;
    Assert.assertEquals(expected, actual);
//TODO: Test goes here... 
/* 
try { 
   Method method = MinSubArrayLen.getClass().getMethod("min", int.class, int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
