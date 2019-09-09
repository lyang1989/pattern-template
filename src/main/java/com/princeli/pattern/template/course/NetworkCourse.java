package com.princeli.pattern.template.course;

/**
 * @author : princeli
 * @version 1.0
 * @className NetworkCourse
 * @date 2019-09-09 20:39
 * @description: TODO
 */
public abstract class NetworkCourse {


    protected final void createCourse(){

        this.postPreResource();

        this.createPPT();

        this.liveVideo();

        this.postNote();

        this.postSource();

        if (needHomework()){
            checkHomework();
        }
    }

    protected abstract void checkHomework();

    /**
     * 钩子方法：实现过程微调
     * @return
     */
    protected boolean needHomework(){
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    final void postNote() {
        System.out.println("提交课件和笔记");
    }

    final void liveVideo() {
        System.out.println("在线直播");
    }

    final void createPPT() {
        System.out.println("创建备课课件");
    }

    final void postPreResource() {
        System.out.println("分发预习资料");
    }
}
