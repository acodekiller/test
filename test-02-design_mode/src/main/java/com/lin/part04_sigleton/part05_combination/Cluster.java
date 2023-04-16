package com.lin.part04_sigleton.part05_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/16 22:21
 */
public class Cluster extends Component{

    private List<Component> datarea;

    public Cluster(String id, String name){
        this.id = id;
        this.name = name;
        this.datarea = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        datarea.add(component);
    }

    @Override
    public void remove(Component component) {
        datarea.remove(component);
    }

    @Override
    public Component getChild(int i) {
        if(i > datarea.size()){
            throw new RuntimeException("不可能的操作！！！");
        }
        System.out.println("----获取集群中第"+i+"个数据区信息:" + datarea.get(i));
        return datarea.get(i);
    }

    @Override
    public List<Component> getAllChild() {
        return datarea;
    }

    @Override
    public void operation(int n) {
        System.out.println("----展开数据区信息-----");
        System.out.println(this.getAllChild());
    }


    @Override
    public String toString() {
        return "Cluster{" +
                "datarea=" + datarea +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
