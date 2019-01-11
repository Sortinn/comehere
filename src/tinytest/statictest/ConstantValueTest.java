package tinytest.statictest;

import java.lang.reflect.Field;

/**
 *  ConstantValue 属性，即同时被 final 和 static 修饰
 * @author sortinn
 */
public class ConstantValueTest {
  public static final int num = 10;


  public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
    Class constantValueClass = ConstantValueTest.class;
    ConstantValueTest object = (ConstantValueTest) constantValueClass.newInstance();
    ClassLoader classLoader = constantValueClass.getClassLoader();
    Field num = constantValueClass.getField("num");
    System.out.println(num.getType());
  }
}
