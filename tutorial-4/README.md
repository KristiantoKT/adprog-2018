# Tutorial 4: Abstract Factory & Singleton

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Your main task in this tutorial is to complete classes in two Java packages
(`exercise1` & `exercise2`) in order to demonstrate a working implementation of
Abstract Factory and Singleton patterns. There are several classes and methods
that left blank in both packages (and subpackages) that you need to complete.

The problem set used in this tutorial is based on example written in Head First
Design Pattern **chapter 4 & 5**. Please read the book, specifically sections that
discuss pattern implementation, to know how to complete the classes and
methods in this problem set.

The evaluation of your work will be based on number of passing unit tests,
code style issues, and your understanding on each patterns. Feel free to check
the unit tests to know methods and classes you need to implement in order
to pass the tests. Code style issues can be checked from test report generated
by Gradle. Your understanding will be verified by teaching team during in-person
demo session and/or merge request review.

**Caution: Unless noted otherwise, you are not allowed to modify the _existing_
unit tests without permission from the teaching team!**

## Mandatory Tasks Description

There are two Java packages that contain partial implementation of Abstract
Factory and Singleton patterns. The first package, `exercise1` contains classes
that demonstrate implementation of Abstract Factory pattern. The latter,
`exercise2`, is similar to the first package but it only contains a single,
empty class that should be implemented as a Singleton class.

The following sections describe the tasks required in order to complete
each pattern implementation.

### Abstract Factory Pattern

The code follows the example in Head First Design Pattern chapter 4 that
simulates a pizza store with its own ingredient factory. The code was organised
into two packages: `factory` and `pizza`. It also included a runner program,
`PizzaTestDrive`, abstraction of `PizzaStore` and one concrete implementation of
`PizzaStore` in the root `exercise1` package.

The pattern implementation is already working. You can run the runner program
to see the result. However, there are tasks that you have to complete as part
of the exercise. The tasks are as follow:

1. In each ingredient packages (i.e. `cheese`, `clam`, `dough`, `sauce`, and 
`veggies`), create a new concrete ingredient class
2. Create a new concrete `PizzaStore` named `DepokPizzaStore`
3. Create a new concrete implementation of `PizzaIngredientFactory` that will
be used in providing ingredients for the pizza store at Depok
4. Make sure your implementation of `DepokPizzaIngredientFactory` does not use
the same ingredients provided by `NewYorkPizzaIngredientFactory`
5. Modify the `PizzaTestDrive` program to demonstrate your new `DepokPizzaStore`
that uses `DepokPizzaIngredientFactory`

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

### Singleton Pattern

Your main task in completing Singleton Pattern implementation in this tutorial
is to correctly implement the given class skeleton for `Singleton` class.

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

## Additional Tasks Description

Similar to the previous tutorial, you need to ensure that your code does not
contain any style/linter issues. You can run the linter (Checkstyle) by
executing `checkstyleMain` Gradle task.

> Tips: You can also find Checkstyle plugin for your IDE of choice and let
> the plugin handle the checking.

There are two additional tasks in this tutorial. The tasks are described in
following subsections.

### Write Unit Tests

At its current state, this tutorial does not have unit tests for testing code
in `exercise1`. In this additional task, you are asked to explore JUnit 4 test
framework and create several unit tests for testing Java code in `exercise1`
package.

### Eager vs. Lazy Instantiation

There are two approaches in instantiating a Singleton object. You are asked to
research how to instantiate Singleton object in eager- and lazy-way. Furthermore,
you have to describe the pros/cons of each approaches.

## Running & Testing the Program

It is recommended to use IDE that can import Gradle-based project to complete this
tutorial. If you are using IDE, **please import `build.gradle` located in the
parent directory (root) of this tutorial.** The tutorials are structured as
Gradle multi-projects and the content of `build.gradle` in each tutorial
directories is defined in the main (root) `build.gradle` file.

You can run the unit tests by executing `test` Gradle task from your IDE. If you
prefer terminal/shell:

```bash
gradle :tutorial-4:test
```

> Explanation: Run `test` task available in `tutorial-4` Gradle (sub)project

If you want to run code linter (Checkstyle) to check find code style issues in
your work, execute `checkstyleMain` Gradle task from your IDE or via
terminal/shell:

```bash
gradle :tutorial-4:checkstyleMain
```

> Explanation: Run `checkstyleMain` tasks available in `tutorial-4` Gradle
> (sub)project

> Tips: You can run both linter and unit tests sequentially by executing `check`
> Gradle task. If you prefer terminal/shell: `gradle :tutorial-4:check`

## Mandatory Tasks Checklist

- [ ] Make at least 1 commit that contains your progress in completing
Abstract Factory pattern
- [ ] Make at least 1 commit that contains your progress in completing
Singleton pattern
- [ ] Push your commits to online Git repository on your GitLab project
- [ ] Create a new ingredient class in `cheese`, `clam`, `dough`, `sauce`,
and `veggies` package
- [ ] Create a new `DepokPizzaIngredientFactory` class and implement it
correctly by following specifications described above
- [ ] Create a new `DepokPizzaStore` class and implement it correctly by
following specifications described above
- [ ] Implement `Singleton` class correctly
- [ ] Pass all tests related to Singleton class

## Additional Tasks Checklist

- [ ] Make sure there are no code style issues, i.e. Checkstyle did not
produce any warning when you execute `check` or `checkstyleMain` Gradle
tasks
- [ ] Create several JUnit 4-based unit test classes (and the test cases,
obviously) **that cover at least 50% lines of code** in `exercise1` package
    - Hint: Please see unit tests in 1st and 3rd tutorial to see the overall
    structure of developing JUnit 4-based unit tests
    - You can check the code coverage using your IDE, e.g. in IntelliJ, you can
    right-click the test package and choose *Run All Tests with Coverage*
- [ ] Compare lazy-instantiation and eager-instantiation approach in instantiating
a Singleton object and describe the pros/cons of both approaches
    - Write your answer in [My Notes](#my-notes) section in this document

## My Notes

> Feel free to use this section to write your own notes related to your attempt
> in doing the tutorial. You can also use this section to write text for
> answering question(s) mentioned in the task checklists.
