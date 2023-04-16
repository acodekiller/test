package com.lin.part04_sigleton.part05_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/16 22:26
 */
public class Datarea extends Component{

    private List<Component> tables;

    public Datarea(String id,String name){
        this.id = id;
        this.name = name;
        this.tables = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        tables.add(component);
    }

    @Override
    public void remove(Component component) {
        tables.remove(component);
    }

    @Override
    public Component getChild(int i) {
        if(i > tables.size()){
            throw new RuntimeException("不可能的操作！！！");
        }
        System.out.println("----获取数据区中第"+i+"个表信息:" + tables.get(i));
        return tables.get(i);
    }

    @Override
    public List<Component> getAllChild() {
        return tables;
    }

    @Override
    public void operation(int n) {
        System.out.println("-----展开表数据信息-----");
        System.out.println(this.getAllChild());
    }

    @Override
    public String toString() {
        return "Datarea{" +
                "tables=" + tables +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
