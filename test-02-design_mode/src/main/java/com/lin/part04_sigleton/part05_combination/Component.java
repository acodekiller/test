package com.lin.part04_sigleton.part05_combination;

import java.util.List;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/16 22:21
 */
public abstract class Component {

    protected String id;

    protected String name;

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int i);

    public abstract List<Component> getAllChild();

    public abstract void operation(int n);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
