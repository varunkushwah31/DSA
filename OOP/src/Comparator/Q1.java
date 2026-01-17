package Comparator;

import java.util.*;

public class Q1 {
    static class Student{
        String name;
        int marks;
        Student(String name,int marks){
            this.name = name;
            this.marks = marks;
        }
        @Override
        public String toString(){
            return name + ": " + marks;
        }
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("polo",100));
        list.add(new Student("Hizru",67));
        list.add(new Student("Lolipop",100));
        list.add(new Student("Aviral",67));
        list.add(new Student("Muskan",78));
        list.add(new Student("Prachi",89));
        list.add(new Student("Anurag",98));
        System.out.println("Before Sorting the list :" + list);
        Comparator<Student> byMarks = new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                return s1.marks - s2.marks;
            }
        };
        Comparator<Student> byName = new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.name.compareTo(s2.name);
            }
        };
        Comparator<Student> byMarkThenByName = new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                if(s1.marks != s2.marks){
                    return s1.marks - s2.marks;
                }else{
                    return s1.name.compareTo(s2.name);
                }
            }
        };
        Collections.sort(list,byMarkThenByName);
        System.out.println(list);
    }
}
