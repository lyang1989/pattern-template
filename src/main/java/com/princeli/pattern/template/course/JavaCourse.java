package com.princeli.pattern.template.course;

/**
 * @author : princeli
 * @version 1.0
 * @className JavaCourse
 * @date 2019-09-09 20:45
 * @description: TODO
 */
public class JavaCourse extends NetworkCourse{
    @Override
    protected void checkHomework() {
        System.out.println("检查java架构的课件");
    }
}
