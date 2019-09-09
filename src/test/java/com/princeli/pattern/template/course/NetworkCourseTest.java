package com.princeli.pattern.template.course;

/**
 * @author : princeli
 * @version 1.0
 * @className NetworkCourseTest
 * @date 2019-09-09 20:49
 * @description: TODO
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("--java架构师课程--");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("--大数据课程--");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
