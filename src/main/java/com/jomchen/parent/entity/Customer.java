package com.jomchen.parent.entity;

import com.jomchen.parent.entity.common.BaseEntity;

import java.util.Date;

/**
 * create by Jomchen on 2018/2/9
 */
public class Customer extends BaseEntity {

    private Integer cid;                        // 用户 id
    private Integer age;                        // 用户年龄
    private String cname;                       // 用户名字
    private Date birthday;                      // 用户生日
    private String address;                     // 用户地址

    public Customer() {
    }

    public Customer(Integer cid, Integer age, String cname, Date birthday, String address) {
        this.cid = cid;
        this.age = age;
        this.cname = cname;
        this.birthday = birthday;
        this.address = address;
    }

    public Integer getCid() {
        return cid;
    }

    public Integer getAge() {
        return age;
    }

    public String getCname() {
        return cname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
