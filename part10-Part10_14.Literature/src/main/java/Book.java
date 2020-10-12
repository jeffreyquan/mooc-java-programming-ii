/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Book {
    
    private String name;
    private int recommendedAge;
    
    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return this.name;
    }

    public int getRecommendedAge() {
        return this.recommendedAge;
    }
}

// Solution:
//public class Book implements Comparable<Book> {
// 
//    private String name;
//    private int age;
// 
//    public Book(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
// 
//    public String getName() {
//        return name;
//    }
// 
//    public void setName(String name) {
//        this.name = name;
//    }
// 
//    public int getAge() {
//        return age;
//    }
// 
//    public void setAge(int age) {
//        this.age = age;
//    }
// 
//    @Override
//    public String toString() {
//        return this.name + " (recommended for " + this.age + " year-olds or older)";
//    }
// 
//    @Override
//    public int compareTo(Book o) {
//        if (this.age == o.age) {
//            return this.name.compareTo(o.name);
//        }
// 
//        return this.age - o.age;
//    }
// 
//}