package com.linli.test;

import com.linli.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestIdea {
    public static void main(String [] args){

        TestIdea ti = new TestIdea();
       // ti.forExample();

       // ti.listForNullExample();
        ti.listForNullExample();
        Person p = new Person();
    }



    public void testKjj(Integer x,Integer y){
        ArrayList ar = new ArrayList();
        System.out.println("Hello World!!");
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void testTempleates(){
        int args =0 ;
        System.out.println();
        System.out.println("TestIdea.testTempleates");
        boolean flag = true;
        System.out.println("flag = " + flag);
        System.out.println(flag);
    }

    public void forExample(){
        int [] nums = new int[]{1,5,3,34,52,42};
        System.out.println("-----------fori-----------");
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("-----------iter-----------");
        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println("-----------itar-----------");
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

        }
    }

    public void listForNullExample(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("linlin");
        arrayList.add("Lucy");
        arrayList.add("Tom");
        arrayList.add("Jacky");
        arrayList.add("Lucas");
        System.out.println("-----------listfor-----------");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("-----------list.fori-----------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        System.out.println("-----------list.forr-----------");
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

        if (arrayList == null) {
            System.out.println("集合为空");
        }
        if (arrayList != null) {
            System.out.println("集合不为空！");
        }
        if (arrayList != null) {
            System.out.println("not null");
        }
        if (arrayList == null) {
            System.out.println("null");
        }
    }

    private static final int prsf = 0;
    public static final double psfd = 1.0;
    public static final int psfi = 2;
    public static final String psfs = "linli";

    public void psfExample(){
        System.out.println(prsf);
        System.out.println(psfd);
        System.out.println(psfi);
        System.out.println(psfs);
    }
}
