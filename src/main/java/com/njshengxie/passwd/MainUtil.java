/*
 * Copyright (C) 2017--2019, 微笑的丁总 All rights reserved
 * Author: DingJie
 * FileName: MainUtil
 * Date: 2019/12/17 9:55 AM
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号             描述
 */
package com.njshengxie.passwd;

import com.njshengxie.entity.User;
import com.njshengxie.util.ExcelUtils;

import java.util.ArrayList;
import java.util.List;

import static com.njshengxie.util.PasswdUtil.getRandomUsers;
import static com.njshengxie.util.PasswdUtil.getUserIds;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author dogjay
 * @create 2019/12/17
 * @since 1.0.0
 */
public class MainUtil {
    public static void main(String[] args) {
        List<User> list = getRandomUsers(new ArrayList(), 100000);
        for (User user : list) {
            System.out.println("["+user.getId()+"\t\t"+user.getName()+"："+user.getPasswd()+"]");
        }
        ExcelUtils.generateExcel(list);
//		List<String> list=getPasswords(100,8);
//		for(String s:list){
//			System.out.println(s);
//		}
    }
}
