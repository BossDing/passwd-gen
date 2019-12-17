/*
 * Copyright (C) 2017--2019, 微笑的丁总 All rights reserved
 * Author: DingJie
 * FileName: ExcelUtil
 * Date: 2019/12/17 10:19 AM
 * Description: 写数据到excel中
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号             描述
 */
package com.njshengxie.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.poi.excel.BigExcelWriter;
import cn.hutool.poi.excel.ExcelUtil;
import com.njshengxie.entity.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 写数据到excel中
 *
 * @author dogjay
 * @create 2019/12/17
 * @since 1.0.0
 */
public class ExcelUtils {
    
    public static void generateExcel(List<User> users){
        List<?> row0 = CollUtil.newArrayList("ID","账号","密码");
        List<List<?>> rows = CollUtil.newArrayList();
        rows.add(row0);
        for (User user:users) {
            List<?> row1 = CollUtil.newArrayList(user.getId(),user.getName(),user.getPasswd());
            rows.add(row1);
        }
        BigExcelWriter writer= ExcelUtil.getBigWriter("随机账号.xlsx");
// 一次性写出内容，使用默认样式
        writer.write(rows);
// 关闭writer，释放内存
        writer.close();

    }
}
