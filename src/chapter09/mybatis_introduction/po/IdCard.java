package chapter09.mybatis_introduction.po;

/**
 * User: Johnny Miller
 * Site: https://github.com/johnnymillergh
 * Date: 6/5/2018
 * Time: 10:10 PM
 */

public class IdCard {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
