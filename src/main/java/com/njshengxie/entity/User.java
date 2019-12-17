/*
 * Copyright (C) 2017--2019, 微笑的丁总 All rights reserved
 * Author: DingJie
 * FileName: User
 * Date: 2019/12/17 9:56 AM
 * Description: 随机用户类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号             描述
 */
package com.njshengxie.entity;

/**
 * 〈一句话功能简述〉<br> 随机用户类
 *
 * @author dogjay
 * @create 2019/12/17
 * @since 1.0.0
 */
public class User {
    private String id;
    private String name;
    private String passwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
