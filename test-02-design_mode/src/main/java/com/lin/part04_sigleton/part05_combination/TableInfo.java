package com.lin.part04_sigleton.part05_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/16 22:31
 */
public class TableInfo extends Component{

    private List<Component> jobs;

    public TableInfo(String id,String name){
        this.id = id;
        this.name = name;
        jobs = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        jobs.add(component);
    }

    @Override
    public void remove(Component component) {
        jobs.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return jobs.get(i);
    }

    @Override
    public List<Component> getAllChild() {
        return jobs;
    }

    @Override
    public void operation(int n) {
        if(n == 1){
            System.out.println("-----展示表数据信息-----");
            System.out.println(this.jobs);
        }else{
            System.out.println("展开作业信息");
        }

    }
}
