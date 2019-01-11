package tinytest.innerclasstest;

/**
 * @author sortinn
 * @create 2018.11.27 4:09 PM
 * @description 测试静态内部类的链式方法调用
 **/
public class InnerClassTest {
    private String id;
    private String name;
    private Integer age;
    private Double salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public InnerClassTest(IAmInnerClass innerClass) {
        this.id = innerClass.id;
        this.name = innerClass.name;
        this.age = innerClass.age;
        this.salary = innerClass.salary;
    }

    public static class IAmInnerClass {
        private String id;
        private String name;
        private Integer age;
        private Double salary;

        public IAmInnerClass() {
        }


        public IAmInnerClass setId(String id) {
            this.id = id;
            return this;
        }

        public IAmInnerClass setName(String name) {
            this.name = name;
            return this;
        }

        public IAmInnerClass setAge(Integer age) {
            this.age = age;
            return this;
        }

        public IAmInnerClass setSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public InnerClassTest build() {
            return new InnerClassTest(this);
        }
    }

    public static void main(String[] args) {
        InnerClassTest test = new InnerClassTest.IAmInnerClass().setId("New107").setName("gaotian").setSalary(1000.0).build();
        System.out.println(test.getAge() + " " + test.getSalary() + " " + test.getName());
    }
}
