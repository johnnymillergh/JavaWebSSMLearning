package chapter09.mybatis_introduction.po;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/5/2018
 * Time: 10:11 PM
 */

public class Person {
    private Integer id;
    private String name;
    private String age;
    private String sex;
    private IdCard idCard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard=" + idCard +
                '}';
    }
}
