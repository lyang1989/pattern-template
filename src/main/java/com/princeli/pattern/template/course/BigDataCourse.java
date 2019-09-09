package com.princeli.pattern.template.course;

/**
 * @author : princeli
 * @version 1.0
 * @className BigDataCourse
 * @date 2019-09-09 20:46
 * @description: TODO
 */
public class BigDataCourse extends NetworkCourse{

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
