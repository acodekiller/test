package com.lin.part04_sigleton.part05_combination;

import java.util.List;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/16 22:34
 */
public class Job extends Component{

    public Job(String id,String name){
        this.id = id;
        this.name = name;
    }

    public void add(Component component) {
        throw new RuntimeException("No operation of Add");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("No operation of remove");
    }

    @Override
    public Component getChild(int i) {
        throw new RuntimeException("No operation of getChild");
    }

    @Override
    public List<Component> getAllChild() {
        throw new RuntimeException("No operation of getAllChild");
    }

    @Override
    public void operation(int n) {
        System.out.println("展示作业信息");
    }

}
