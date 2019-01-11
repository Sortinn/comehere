package tinytest.statictest;


/**
 * @author sortinn
 * 解析阶段类的加载
 * <p>
 * **静态变量是否用final修饰，输出结果是不同的。**
 * 用 static final 修饰的常量在编译期就将其结果放入了调用它的类的常量池中。
 */
public class ParsingStageInClassLoading {

  public static void main(String[] args) {
    System.out.println(Son.m);
  }
}

class Super {
  static int m = 10;

  static {
    System.out.println("Super class' static statement");
  }
}

class Father extends Super {
//  static int m = 20;

  static {
    System.out.println("Father class' static statement");
  }
}

class Son extends Father {
  static {
    System.out.println("Son class' static statement");
  }
}
