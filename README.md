# java8-tutorial
Java8 Features



##### 

Java provides at least two ways to exit an iteration before reaching the end of a collection—limit() 
and takeWhile(), where the latter was added in the JDK 9.


skip() and dropWhile() functions, the limit() and takeWhile() methods also behave like a door. But instead of initially being shut, these methods behave like a door that is open and then shut forever when the given criteria isn’t met.

The Optional class is useful whenever the result may be absent

Streams have two types of methods: intermediate and terminal


Exception handling is fundamentally an imperative style of programming idea, 


```
package interview.example;


import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private int id;
    private  String firstName;
    private  String lastName;
    private int age;
    private String gender;
    private  String departmentName;
    private int joinedYear;
    private String city;
    private int rank;

    public static void main(String[] args) {
        List<Student> list =
                Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),

                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),

                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),

                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),

                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),

                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),

                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),

                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),

                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),

                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));



        // Find list of students whose first name starts with alphabet A

        List<Student> studentList= list.stream().
                filter(s -> s.getFirstName().
                        startsWith("A")).
                toList();

        System.out.println(studentList);


        // Group The Student By Department Names

        Map<String, List<Student>> studentListMap = list.stream().
                collect(Collectors.groupingBy(Student::getDepartmentName));


        for (Map.Entry<String,List<Student>> ele:studentListMap.entrySet()) {
            System.out.println("---");
            System.out.println(ele.getKey()+" "+ele.getValue());
            System.out.println("---");

        }

        //  Find the max age of student

        OptionalInt maxAge = list.stream().mapToInt(Student::getAge).max();
        System.out.println(maxAge);

        //Find all departments names
        Set<String> deptName = list.stream().map(Student::getDepartmentName).collect(Collectors.toSet());
        System.out.println(deptName);

       // Find the count of student in each department

        Map<String, Long> countStudentInDepartment = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        System.out.println(countStudentInDepartment);

        System.out.println(list.size());

        //Find the list of students whose age is less than 30
        List<Student> studentAgeList = list.stream().
                filter(x -> x.getAge() < 30).
                toList();

        System.out.println(studentAgeList);

        //Find the list of students whose rank is in between 50 and 100

        List<Student> studentRank = list.stream().
                filter(x -> x.getRank() >= 50 && x.getRank() <= 100).
                toList();

        System.out.println(studentRank);

        //Find the average age of male students
        double maleAge = list.stream().filter(x -> Objects.equals(x.getGender(), "Male")).
                mapToInt(Student::getAge).average().orElse(0);

        System.out.println(maleAge);

        //Find the average age of male and female students

        Map<String, Double> mapAvg = list.stream().collect(
                Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge))
        );
        System.out.println(mapAvg);

        // count the no of student in each department
        Map<String,Long> studentNo=list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.counting()));
        System.out.println(studentNo);

        // Find the department who is having maximum number of students
        Map.Entry<String, Long> stringLongEntry = list.stream().
                collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).
                entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry);



        // Find the list of students and sort them by their rank

        System.out.println();
        System.out.println("Find the list of students and sort them by their rank");
        System.out.println();
        List<Student> list1 = list.stream().sorted(Comparator.comparing(Student::getRank)).toList();
        System.out.println(list1);

        // Find the student who has second rank

        Student student = list.stream().
                sorted(Comparator.comparing(Student::getRank)).
                skip(1).findFirst().get();
        System.out.println(student);

        // Find the highest rank in each department
        System.out.println();
        System.out.println("Find the highest rank in each department");
        System.out.println();
        Map<String, Optional<Student>> highestRankInDept = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(highestRankInDept);


        // Find the average rank in all departments
        System.out.println();
        System.out.println(" Find the average rank in all departments");
        System.out.println();

        Map<String, Double> avgRank = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingInt(Student::getRank)));
        System.out.println(avgRank);

        // Find the Students who stays in Delhi and sort them by their names
        System.out.println();
        System.out.println("Find the Students who stays in Delhi and sort them by their names");
        System.out.println();

        List<Student> stList = list.stream().filter(x -> x.getCity().equalsIgnoreCase("DElhi")).sorted(Comparator.comparing(Student::getFirstName)).toList();

        System.out.println(stList);


    }


}


```


```


1. LocalDate
2. LocalTime
3. LocalDateTime
4. ZonedDateTime
5. Instant
6. Period
7. Duration
8. DateTimeFormatter
9. 


```
















```agsl
@FuntionalInterface



Contains Only one abstract method but can have multiple default and static 
method is called Functional Interface


Runnable - run()<br/>
Callable - call()<br/>
Comparable - compareTO()<br/> Natural Sorting
Compartor - compare()<br/>

Predefined Functional Interface in java8

Consumer
Predicate
Supplier


forEach -- Accepting Consumer interface
filter --- Predicate interface




Supplier: No parameters, returns a value.

Runnable: No parameters, no return value (often used in threading).

BiFunction: Takes two parameters, returns a value.

Consumer: Takes one parameter, no return value.





 


```


```agsl
Method References are a special type of lambda expression
:: scope resoultion operator in cpp  (Method references in java)

Static Methods
Instance Methods of particular objects
Constructor




 

```



### Java8 Concepts

```declarative


1) Remove duplicates from string and return in same order".

	String s = "dabfcadef"; -> dabfce


s.chars().distinct().mapToObj( c-> (char)  c ).forEach(System.out::println);

Arrays.stream(s.split("")).distinct().forEach(System.out::print);


2)  Given a sentence find the word that has the highest length. The solution is:

String s = "I am interested123455 to grow in my organization";

     String maxString = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
    System.out.println("The maxString is: " + maxString);

3) Given a sentence find the word that has the 2nd (Nth) highest length.

	Answer is below: skip(N). N =0 (highest) N =1 (2nd Highest) N =2 (3rd Highest...)

String a =  Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();

 System.out.println(a);

This question asked in SNP. They will tweak the same question with list of Employee Objects. But this is the base logic.


Q4) Find the length of the longest word

Solution : Arrays.stream(s.split(" ")).mapToInt(l -> l.length()).max().getAsInt();

Q5). Find the 2nd highest length word in the given sentence

Solution : Arrays.stream(s.split(" ")).map(l -> l.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();


Q6) Given a sentence, find the number of occurrence of each word.



String input = "the quick brown fox jumps right over the little lazy dog little";
            Map<String, Long> collect = Arrays.stream(input.split(" "))
                           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(collect);

Q7) Given a word, find the occurrence of Each Character

Q8) There is a list of Employees and Employee object has a field called e-mail. Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain.

Q9) Given a string, find the words with the maximum number of vowels.

       "The quick brown fox jumps right over the little lazy dog."
        Maximum Number of Vowels: 2
        output Words: quick, over, little  ( because each word has maximum of 2 vowels)



Solution is:

String s = "The quick brown fox jumps right over the little lazy dog.";
        Arrays.stream(s.split(" "))
            .filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
            .forEach(System.out::println);



NOTE: Please understand the REGEX solution here


Q10) Reverse a string with speical characters and Speical characters position shouldn't be changed".



Solution is:



 public static String reverseString(String input) {

        String reversedString = new StringBuffer(input.replaceAll("[^a-zA-Z]", "")).reverse().toString();
        String replacedString = input.replaceAll("[a-zA-Z]", "_");

        char ch[] = reversedString.toCharArray();
        for(char c:ch) {
            replacedString = replacedString.replaceFirst("_", String.valueOf(c));
        }
        System.out.println("-------> " + replacedString);
        return replacedString;
    }


	public static void main(String[] args) {
           String input = "Swa$pn&il";
            String[] arr = input.split("");
            String regex = "[^0-9a-zA-Z]";

            StringBuilder reversed=new StringBuilder(input.replaceAll(regex, "")).reverse();

            IntStream.range(0, input.length()-1)
            .filter(i->arr[i].matches(regex))
            .forEach(i->reversed.insert(i, arr[i]));

            System.out.println(reversed);
    }


Q11) Given a list of integers, divide into two lists one having even numbers and other having odd numbers.


Solutions:

 List<List<Integer>> lists = intList.stream()
        .collect(Collectors.groupingBy(key->key%2==0,Collectors.toList()))
        .entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
        System.out.println(lists);

2. intList.stream()
                .collect(Collectors.partitioningBy(integerValue->integerValue%2==0))
                .entrySet().stream().map(mapValue->mapValue.getValue()).collect(Collectors.toList());

3. Map<Boolean, List<Integer>> partitions = ints.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> evens = partitions.get(true);
        List<Integer> odds = partitions.get(false);
The entryset logic in solution 1 and 2 is to process the map. and also please know the difference between partitionBy and groupBy and when to use.



Q12) Given an array of integers (2, 34, 54, 23, 33, 20, 59, 11, 19, 37 ) group the numbers by the range they belong to. The put put should be {0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}

Solution is:
Map<Integer, List<Integer>> map = 
 Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19,37).collect(Collectors.groupingBy (i -> i/10 * 10 )); 
                System.out.println(map);


Q13) Given a List of Strings  ["as", "123", "32", "2as"], create another Integer list that contains only integers. The output shoul be: List<Integer> iList = [123,32]
Solution:
 listOfStrings.stream().filter( ss -> ss.matches("[0-9]*")).map(Integer::valueOf).collect(Collectors.toList());


Q14) Given an array of integers arr = {5,6,7,8,5,5,8,8,7) find the sum of the unique elements. The output should be in this case is: 26.

Solution : Arrays.stream(arr).distinct().sum();


Q15 ) Given a numeric array , re arrange the elements to form a smallest possible value.

input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

output is: 133444576998

Solution is: Arrays.stream(arr).mapToObj(i-> i+"").sorted().forEach(System.out::print);


Q16) Given a numeric array , re arrange the elements to form a highest possible value.

input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};

output is: 998764543431


Solution is: Arrays.stream(arr).mapToObj(i-> i+"").sorted((o1,o2) -> (o2+o1).compareTo(o1+o2)).forEach(System.out::print)


	2) Arrays.stream(arr12).mapToObj(i-> i+"").sorted(Collections.reverseOrder()).forEach(System.out::print); ( solution is wrong. Associates need to fix it).


Q17)  Given a String = The quick brown fox jumps over the lazy dog, find the first non repeated character. (Google interview)


	Solution with java 8 :

	String res = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
	System.out.println(res);



______________________________________________________________________________________________________________________________________________________________________________
1) Find the longest word in a sentence?

	Input: I am interested to grow in my organization
	output is: organization

2) Find the lenght of the longest word.

	Input: I am interested to grow in my organization
	output is: 	12

3) Find the 2nd highest length in the sentence.

4) FInd the length of the 2nd longest word.


5) List of cities

	"Mumbai"
	"Munnar"
	"chennai"
	"Hyderabad"

	Calcullate the lenght of each city where the city name starts with 'm' or 'M' and create a list.


Can you  write a program to create another list that contains the cities start with "m"?


6)  I have to arrays
	 int arr1[] = {21,6,8,9,10,5};
	 int arr2[] = {10,21,5,8,6,9};

	 write a program to check whether both arrays are equal or not.

7)  Given a string, find the words with the maximum number of vowels.

		"The quick brown fox jumps right over the little lazy dog."
		Maximum Number of Vowels: 2

		output Words: quick, over, little  ( because each word has maximum of 2 vowels)

8)  I have an array.  Find the next greatest element for each element in a given array.

   {15, 10, 16, 20, 8, 9, 7, 50}

   OutPut:

   15 -16
   10 -16
   16-20
   20-50
   8-9
   9-50
   7-50
   50 - Max Integer

   Solution : 
           int[] intArray = {15, 10, 16, 20, 8, 9, 7, 50};

           for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] > intArray[i]) {
                    System.out.println(intArray[i] + " - " + intArray[j]);
                    break;
                }
            }
        }
        System.out.println(intArray[intArray.length - 1] + " - Max Integer");

9) I have two sorted arrays. Need to merge those.


10) A List<String> contains alpha, numeric and alpha numeric values as strings. Write a program to create a List<Integer>s from the original List.

		input :  List <String> ls =  ["as", "123", "32", "2as"]
		output : List<Integer> iList = [123,32]


11) How to remove duplicates from an arrayList?


12)	I have a passenger Object. that has an e-mail.  So given the list of passenger Objects
	I need to find the list of domains and the no of times each domain occured.



13)

Student class 
sting name
string subject
int marks
List of student
student - A - hindi - 50
student - A - maths - 90
student - A - science - 70

student - B - hindi - 80
student - B - maths - 90
student - B - science - 70
output - 
student a hindi 50 (least for student A)
student a maths 90 (hightest for student A)

student b scice 70 (least for student b)
student b maths 90 (hightest for student b)



14)

Left Rotate array :

[28-07 04:44 pm] Anurag Prajapati
input : 1 2 3 4 5 6
number: 3 -
output: 4 5 6 1 2 3



				Work on recursion problems.

15. Fibonacci series.

	Input: N = 10
	Output: 0 1 1 2 3 5 8 13 21 34

	Input: N = 15
	Output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377



16. Permutations from a string.

	Input is: ABC
	Output is:
		ABC ACB
		BAC BCA
		CBA CAB

17. Reversal program with special characters.

		Input : Swa$pn&il
		Output : lin$pa&wS



	98413211 47



1)

Given 2 numbers as list, add the numbers and store the result in a new list.
	2->3->5->7->NULL
	8->2->7->NULL
	Output : 3->1->8->4->NULL

2) [04-08 02:08 pm] Damodara Gottipalli
Input Array is: {15, 10, 16, 20, 8, 9, 7, 50 }

[04-08 02:08 pm] Damodara Gottipalli
   15 -16
   10 -16
   16-20
   20-50
   8-9
   9-50
   7-50
   50 -1

[04-08 02:13 pm] Damodara Gottipalli
Find the next greatest element for each element in the Array.



3)


Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.

Input : A[] = {l, 3, 15, 11, 2}
        B[] = {23, 127, 235, 19, 8}

Output : 3
the pair is: 11, 8








insertion sort.
quick sort
selection sort
merge sort
bubble sort.



100)
	For a given string, like "aabbccdeff", count each char and declare winner or loser by following rules
· Winner char will have max number of char count and no other char will have same count
· Loser will have min number of char count and no other char will have same count.
Input: aabbccdeff
Output: winner: none, loser: e


101)
	The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.

	https://www.geeksforgeeks.org/java-program-for-stock-buy-sell-to-maximize-profit/



```
