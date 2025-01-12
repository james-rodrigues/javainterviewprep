package com.interviewprep.java.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortExample {
	public static void main(String[] args) {

		// Model Class - Inner Class
		class Employee implements Comparable<Employee> {

			private long id;
			private String name;
			private int age;

			public long getId() {
				return id;
			}

			public String getName() {
				return name;
			}

			public int getAge() {
				return age;
			}

			public Employee(long id, String name, int age) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}

			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
			}

			@Override
			public int compareTo(Employee e) {
				if (this.age > e.age) {
					return 1;
				}
				if (this.age < e.age) {
					return -1;
				}
				return 0;
			}

		}

		// Multi Field Comparator Class - Inner Class
		class EmployeeChainedComparator implements Comparator<Employee> {
			private List<Comparator<Employee>> comparatorList = new ArrayList<>();

			@SafeVarargs
			public EmployeeChainedComparator(Comparator<Employee>... comparators) {
				this.comparatorList = Arrays.asList(comparators);
			}

			@Override
			public int compare(Employee e1, Employee e2) {
				for (Comparator<Employee> comparator : comparatorList) {
					int result = comparator.compare(e1, e2);
					if (result != 0) {
						return result;
					}
				}
				return 0;
			}

		}

		// Comparator by Id
		Comparator<Employee> idComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getId() > e2.getId()) {
					return 1;
				}
				if (e1.getId() < e2.getId()) {
					return -1;
				}
				return 0;
			}
		};

		// Comparator by Age
		Comparator<Employee> ageComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.getAge() > e2.getAge()) {
					return 1;
				}
				if (e1.getAge() < e2.getAge()) {
					return -1;
				}
				return 0;
			}
		};

		// Comparator By Name
		Comparator<Employee> nameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};

		// Comparator By Name
		Comparator<Employee> combinedComparator = Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getAge).thenComparing(Employee::getId);

		System.out.println("=============================================================");
		System.out.println("Start Program");

		// primitive int array sort
		int[] count = new int[] { 12, 105, 58, 52, 59, 100 };

		System.out.println("Integer Array Before Sorting");
		Arrays.stream(count).forEach(System.out::println);
		System.out.println("Integer Array After Sorting");
		Arrays.sort(count);
		Arrays.stream(count).forEach(System.out::println);

		System.out.println("=============================================================");

		// String array sort
		String[] names = { "James", "Kevin", "Rovel", "Camy", "Meghna", "Peru", "Eric" };

		System.out.println("String Array Before Sorting");
		Arrays.stream(names).forEach(System.out::println);
		System.out.println("String Array After Sorting");
		Arrays.sort(names);
		Arrays.stream(names).forEach(System.out::println);

		System.out.println("=============================================================");

		// String arrayList Sort
		List<String> namesList = new ArrayList<>();
		namesList.add("James");
		namesList.add("Peru");
		namesList.add("Camy");
		namesList.add("Kevin");
		namesList.add("Rovel");
		namesList.add("Meghna");
		namesList.add("Eric");

		System.out.println("String ArrayList Before Sorting");
		System.out.println(namesList);
		Collections.sort(namesList);
		System.out.println("String ArrayList After Sorting");
		System.out.println(namesList);

		System.out.println("=============================================================");

		// Integer arrayList Sort
		List<Integer> numbers = new ArrayList<>();
		numbers.add(19);
		numbers.add(719);
		numbers.add(919);
		numbers.add(189);
		numbers.add(190);

		System.out.println("Integer ArrayList Before Sorting");
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println("String ArrayList After Sorting");
		System.out.println(numbers);

		System.out.println("=============================================================");

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1L, "Perumal", 27));
		empList.add(new Employee(2L, "James", 26));
		empList.add(new Employee(3L, "Camy", 24));
		empList.add(new Employee(4L, "Kevin", 30));
		empList.add(new Employee(5L, "Rovel", 29));
		empList.add(new Employee(5L, "Meghna", 28));
		empList.add(new Employee(5L, "Eric", 31));

		System.out.println("=============================================================");

		System.out.println("Employee List Before Sorting as per Comparable Interface");
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println("Employee List After Sorting as per Comparable Interface");
		System.out.println(empList);

		System.out.println("=============================================================");

		System.out.println("Employee List Before Sorting by Id Comparator");
		System.out.println(empList);
		Collections.sort(empList, idComparator);
		System.out.println("Employee List After Sorting by Id Comparator");
		System.out.println(empList);

		System.out.println("=============================================================");

		System.out.println("Employee List Before Sorting by Name Comparator");
		System.out.println(empList);
		Collections.sort(empList, nameComparator);
		System.out.println("Employee List After Sorting by Name Comparator");
		System.out.println(empList);

		System.out.println("=============================================================");

		System.out.println("Employee List Before Sorting by Age Comparator");
		System.out.println(empList);
		Collections.sort(empList, ageComparator);
		System.out.println("Employee List After Sorting by Age Comparator");
		System.out.println(empList);

		System.out.println("=============================================================");
		System.out.println("Sorting on Multiple Attributes");
		System.out.println("1. Using MultiComparator Separate class");

		System.out.println("Employee List Before Sorting by Employee Chained Comparator");
		System.out.println(empList);
		Collections.sort(empList, new EmployeeChainedComparator(ageComparator, idComparator, nameComparator));
		System.out.println("Employee List After Sorting by Employee Chained Comparator");
		System.out.println(empList);

		System.out.println("=============================================================");
		System.out.println("2. Using Java 8 comparing and thenComparing functions");
		System.out.println("Employee List Before Sorting by Employee Chained Comparator");
		System.out.println(empList);
		Collections.sort(empList, combinedComparator);
		// Another way to use the same comparator
		// empList.stream().sorted().collect(Collectors.toList());
		System.out.println("Employee List After Sorting by Employee Chained Comparator");
		System.out.println(empList);

		System.out.println("=============================================================");
		System.out.println("2. Using CompareBuilder class of Apache Commons");
		System.out.println(" Left to you to discover");

	}

}
