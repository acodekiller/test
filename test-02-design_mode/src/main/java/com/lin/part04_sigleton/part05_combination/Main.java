package com.lin.part04_sigleton.part05_combination;

import java.util.List;

/**
 * description:
 * author: Code_Lin
 * date:2023/4/16 22:21
 */
public class Main {

    public static void main(String[] args) {
        Component cluster1 = new Cluster("OFA","Hadoop1");
        Component cluster2 = new Cluster("OFB","Hadoop2");

        Component datarea1 = new Datarea("PDM", "Datarea1");
        Component datarea2 = new Datarea("ACCI", "Datarea2");
        Component datarea3 = new Datarea("AEES", "Datarea3");
        Component datarea4 = new Datarea("RAW", "Datarea4");
        Component datarea5 = new Datarea("ACHP", "Datarea5");

        Component table1 = new TableInfo("t1", "Table1");
        Component table2 = new TableInfo("t2", "Table2");
        Component table3 = new TableInfo("t3", "Table3");
        Component table4 = new TableInfo("t4", "Table4");
        Component table5 = new TableInfo("t5", "Table5");
        Component table6 = new TableInfo("t6", "Table6");
        Component table7 = new TableInfo("t7", "Table7");
        Component table8 = new TableInfo("t8", "Table8");
        Component table9 = new TableInfo("t9", "Table9");
        Component table10 = new TableInfo("t10", "Table10");
        Component table11 = new TableInfo("t11", "Table11");
        Component table12 = new TableInfo("t12", "Table12");
        Component table13 = new TableInfo("t13", "Table13");

        Component job1 = new Job("j1", "Job1");
        Component job2 = new Job("j2", "Job2");
        Component job3 = new Job("j3", "Job3");
        Component job4 = new Job("j4", "Job4");

        cluster1.add(datarea1);
        cluster1.add(datarea2);
        cluster1.add(datarea3);
        cluster2.add(datarea4);
        cluster2.add(datarea5);

        datarea1.add(table1);
        datarea1.add(table2);

        datarea2.add(table3);
        datarea2.add(table4);
        datarea2.add(table5);
        datarea2.add(table6);

        datarea3.add(table7);

        datarea4.add(table8);
        datarea4.add(table9);
        datarea4.add(table10);

        datarea5.add(table11);
        datarea5.add(table12);
        datarea5.add(table13);

        table1.add(job1);
        table1.add(job2);
        table1.add(job3);
        table1.add(job4);

        //-------对Cluser1进行操作
        System.out.println(cluster1);
        cluster1.operation(0);
        Component d1 = cluster1.getChild(0);
        d1.operation(0);
        Component t1 = d1.getChild(0);
        System.out.println("------对表进行操作-------");
        t1.operation(0);
        t1.operation(1);
    }


}
