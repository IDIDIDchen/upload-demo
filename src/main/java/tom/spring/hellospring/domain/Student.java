package tom.spring.hellospring.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Student {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int age;

    @JsonIgnore
    private String pwd;

    @JsonProperty("account")
    private String phone;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone="GTM+8")
    private Date createTime;

    public Student(int age, String pwd, String phone, Date createTime) {
//        this.age = age;
        this.pwd = pwd;
        this.phone = phone;
        this.createTime = createTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
