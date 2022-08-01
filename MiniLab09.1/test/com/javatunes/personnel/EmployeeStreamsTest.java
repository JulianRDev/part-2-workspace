/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeStreamsTest {
  
  private Collection<Employee> allEmployees;
  

  public void setUp() {
    allEmployees = Department.getDepartment().getEmployees();
  }
  
  /**
   * TASK: find all Employees with salary < 40000.0 and sort them by natural order.
   * Employee implements Comparable: natural order is id increasing.
   * 
   * RESULT: Employees 2 and 15, in that order.
   */

  public void testSalaryLessThanSortNaturalOrder() {
    List<Employee> employees = allEmployees.stream()
      .filter(emp -> emp.getSalary() < 40000.0)
      .sorted()  // natural order
      .collect(Collectors.toList());
  }
}