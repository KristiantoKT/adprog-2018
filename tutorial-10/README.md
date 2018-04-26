# Tutorial 9: Profiling

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Your main task in this tutorial is to check whether the currently used algorithm is optimal,
meaning that the currently used algorithm will reach an optimum running time given benchmark test. 
After you check it, you also have a responsibility to use another algorithm if the currently used 
algorithm is not a good one and explain the reason why your new algorithm is a better algorithm.
As a reminder of what benchmark testing is and what you can do with it, you may refer to this
[video](https://www.youtube.com/watch?v=Bi0E7w1ZFFA) (You are encouraged to watch the first ten
minutes of this video, if you want to know more complex thing then you may proceed to finish the
video). You may also want to quickly read this [article](http://tutorials.jenkov.com/java-performance/jmh.html)
to gain more knowledge about Java performance.

> Attention: In this tutorial *you are not required* to use JMH (Java
> Microbenchmark Harness). You only need to know about JMH, but not required
> to implement it in this tutorial.

## Mandatory Tasks Description

You are currently given a template code in package `sorting` that already implementing one
kind of sorting and searching algorithm (The name of algorithm is hidden on purpose. You
have to analyze it purely based on how the algorithm perform). You are currently given a 
large sequence of integer (You can check it in folder 
`plainTextDirectory/input/sortingProblem.txt`) approximately 50000 integer. Your task now is
to check whether the current algorithm is already the best algorithm, if not then you have to
implement a better one. You don't have to delete the available template code, but you may add 
the new code at the same file as the template code.

> Tips: You must not compare the running time printed in your console with your
> friend because the running time may vary for different hardware specification.

## Additional Tasks Description

You are currently given a template code in package `matrix` that already implementing two
kind of matrix multiplication algorithm (Basic and Strassen Matrix Multiplication Algorithm).
Basic Algorithm is an algorithm that implementing the sequence of how we do matrix multiplication,
you may need to re-open or find how to multiply 2 matrix before continuing this task. Strassen 
Algorithm is also a matrix multiplication algorithm with a different approach, you may need
to search this algorithm in some book or internet webpage. If you run the `Main`
class, you can see that both of this algorithm giving almost the same running time.

### Requested Task

In this problem set, you have to do these step :

1. Currently, the `convertInputFileToMatrix` method in `Main` class can only create a square matrix, eventhough that
matrix multiplication also can be executed for non-square matrix (read again matrix multiplication
procedure to understand more about this rule). You have to change this method so that we can have
a non-square matrix to be multiplied. As a test case, you can use file
`plainTextDirectory/input/matrixProblemB`.
2. Please design a benchmark test that can test the performance of each algorithm. You must explain why your benchmark
test was designed as it is and then report the result of your benchmark test (for example, which algorithm is a better 
one).

### Code Styling (As Additional Task)

Similar to the previous tutorial, you need to ensure that your code does not
contain any style/linter issues. You can run the linter (Checkstyle) by
executing `checkstyleMain` Gradle task. However, since you have begin writing
your own test, please ensure that the test code does not contain style issues
as well. You can check for lint issues in test code by executing
`checkstyleTest` Gradle task.

> Tips: You can also find Checkstyle plugin for your IDE of choice and let
> the plugin handle the checking. Do not forget to configure the plugin to
> use `google_csui_checks.xml` Checkstyle configuration in the `config`
> directory.

## Running & Testing the Program

It is recommended to use IDE that can import Gradle-based project to complete this
tutorial. If you are using IDE, **please import `build.gradle` located in the
parent directory (root) of this tutorial.** The tutorials are structured as
Gradle multi-projects and the content of `build.gradle` in each tutorial
directories is defined in the main (root) `build.gradle` file.

> For Eclipse users: If you are using Eclipse, you might want to generate
> Eclipse project file for this tutorial and import it into Eclipse.
> Before starting the tutorial, you can invoke `gradle :tutorial-7:eclipse`
> to create the Eclipse project file.

You can run the unit tests by executing `test` Gradle task from your IDE. If you
prefer terminal/shell:

```bash
gradle :tutorial-10:test
```

> Explanation: Run `test` task available in `tutorial-6` Gradle (sub)project

If you want to run code linter (Checkstyle) to check find code style issues in
your work, execute `checkstyleMain` or `checkstyleTest` Gradle task from your IDE
or via terminal/shell:

```bash
gradle :tutorial-10:checkstyleMain
gradle :tutorial-10:checkstyleTest
```

Beside doing a unit testing and linter, you also expected to show your benchmark test
result in Gitlab runner. You may use tools for calculating elapsed time (running time) 
provided by OS (e.g. time in Unix-based OS) or by measuring it directly in code 
(e.g. System.currentTimeMillis() calls).

> Explanation: Run `checkstyleMain` and `checkstyleTest` tasks available in
> `tutorial-10` Gradle (sub)project

> Tips: You can run both linter and unit tests sequentially by executing `check`
> Gradle task. If you prefer terminal/shell: `gradle :tutorial-10:check`

## Mandatory Tasks Checklist

- [ ] Check and Optimizing Sorting Algorithm
    - [ ] Check whether the currently used algorithm is optimal or not.
    - [ ] Implement a better algorithm (if you think that the currently used algorithm
    is not optimal)
    - [ ] Create a test case to check whether your algorithm is successfully 
    sort the sequence
- [ ] Check and Optimizing Searching Algorithm
    - [ ] Check whether the currently used algorithm is optimal or not.
    - [ ] Implement a better algorithm (if you think that the currently used algorithm
    is not optimal). You may combine the process by sorting the sequence first
    before searching.
    - [ ] Create a test case to check whether your algorithm is successfully 
    search a speficic value in the sequence
- [ ] Explain in [My Notes](#my-notes) section, whether the current benchmark
test design is already good to measure the elapsed time of algorithm and explain why!
    - Hint: Recall how processes and threads are executed (from your OS course)
    and do research about how JVM runs and compiles Java code
- [ ] Push your commits to online Git repository on your GitLab project

## Additional Tasks Checklist

- [ ] Make sure there are no code style issues, both in production code and
test code
- [ ] Refactor `convertInputFileToMatrix` to handle non-square matrix input
- [ ] Provide Unit Test to check whether your implementation is correct
- [ ] Define your benchmark test for basic and Strassen multiplication algorithm to measure
elapsed time.
    - [ ] Explain why you decided to design your benchmark test as it is in My notes section.
    - [ ] Report the result of your benchmark test in My notes section 

## My Notes

> Feel free to use this section to write your own notes related to your attempt
> in doing the tutorial. You can also use this section to write text for
> answering question(s) mentioned in the task checklists.
