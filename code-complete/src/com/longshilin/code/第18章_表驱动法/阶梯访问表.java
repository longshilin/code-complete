package com.longshilin.code.第18章_表驱动法;


/**
 * 
 * @author LongShiLin
 *
 */
public class 阶梯访问表 {

  public static void main(String[] args) {
    System.out.println(method(78));
  }
  
  /**
   * 阶梯表查询
   * 通过输入分数，得到学习的等级
   * 
   * 延伸：当需要将数值转换成表的键值时，可以将其封装为method这样的子程序；输入数值，得到键值对；
   * @param studentScore
   */
  public static String method(int studentScore) {

    Double[] rangeLimit = {50.0, 65.0, 75.0, 90.0, 100.0};
    String[] grade = {"F", "D", "C", "B", "A"};
    int maxGradeLevel = grade.length - 1;
    int gradeLevel = 0;
    String studentGrade = "A";

    while (studentGrade == "A" && gradeLevel < maxGradeLevel) {
      if (studentScore < rangeLimit[gradeLevel])
        studentGrade = grade[gradeLevel];
      gradeLevel++;
    }
    
    return studentGrade;
  }


}
