# Tutorial 3: Decorator & Composite Method

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Your main task in this tutorial is to complete classes in two Java packages
(`decorator` & `composite`) in order to demonstrate a working implementation of
Decorator and Composite Method patterns. There are several classes and methods that
left blank in both packages (and subpackages) that you need to complete. Also 
there are some classes that you need to create in order to complete the tutorial.

The problem set used in this tutorial is based on example written in Head First
Design Pattern **chapter 3 & 9** that has been customized. Please read the book, 
specifically sections that discuss pattern implementation, to know how to
complete the classes and methods in this problem set.

The evaluation of your work will be based on number of passing unit tests,
code style issues, and your understanding on each patterns. Feel free to check
the unit tests to know methods and classes you need to implement in order
to pass the tests. Code style issues can be checked from test report generated
by Gradle. Your understanding will be verified by teaching team during in-person
demo session and/or merge request review.

**Caution: You are not allowed to modify the unit tests without permission from
the teaching team!**

## Mandatory Tasks Description

There are two Java packages that contain partial implementation of Decorator and
Composite Method patterns. The first package, `decorator` contains classes that
demonstrate implementation of Decorator pattern. The latter, `composite`, is
similar to the first package but it contains classes that demonstrate
implementation of Composite Method pattern.

The following sections describe the tasks required in order to complete
each pattern implementation.

### Decorator Pattern

The code follows the example in Head First Design Pattern chapter 3 that
simulates how to make a coffee with some additional condiment, but in this tutorial
you'll implement the same concept into creating a burger & sandwich. Here's the collection
of burger, sandwich, and it's filling:

1. Burger
    - Thin Bun Burger - $1.5
    - Thick Bun Burger - $2.5
1. Sandwich
    - Crusty Sandwich - $1.0
    - No Crust Sandwich - $2.0
1. Filling
    - Beef Meat - $6.0
    - Cheese - $2.0
    - Chicken Meat - $4.5
    - Chili Sauce - $0.3
    - Cucumber - $0.4
    - Lettuce - $0.75
    - Tomato - $0.5
    - TomatoSauce - $0.2

Your tasks in completing Decorator pattern implementation in this tutorial
are as follow:

1. Create a Class (or Complete if the Class is already available) for each Bread and Filling
that already mentioned above. 
2. Create and Implement the required method `getDescription` and `getCost` to complete the
Class. You can see Head First Design Pattern Book Chapter 3 as a guidance for method implementation. 
3. To help you test your implementation, you can use the test case that had been prepared.

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

### Composite Method Pattern

The code is an example of problem set for Composite Method Pattern. You may not seen it as an
example in Head First Design Pattern Book. But for implementation, you should read it first in your book
so you may understand how to implement it 

Your main task in completing Composite Method implementation in this tutorial
by completing the implementation of:

1. `higherups` Package
    - CEO Class
    - CTO Class
1. `techexpert` package
    - BackendProgrammer Class
    - FrontendProgrammer Class
    - NetworkExpert Class
    - SecurityExpert Class
    - UiUxDesigner Class
1. Company Class

To complete this part of tutorial, you may refer to the test case that had been
prepared.

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

## Additional Tasks Description

Similar to the previous tutorial, you need to ensure that your code does not
contain any style/linter issues. You can run the linter (Checkstyle) by
executing `checkstyleMain` Gradle task.

> Tips: You can also find Checkstyle plugin for your IDE of choice and let
> the plugin handle the checking.

There are also some additional tasks to be done:

1. You need to make sure that every test in `MultipleFillingTest` class all passed.
1. You need to make sure that every test in `AdditionalCompanyTest` class all passed.

## Running & Testing the Program

It is recommended to use IDE that can import Gradle-based project to complete this
tutorial. If you are using IDE, **please import `build.gradle` located in the
parent directory (root) of this tutorial.** The tutorials are structured as
Gradle multi-projects and the content of `build.gradle` in each tutorial
directories is defined in the main (root) `build.gradle` file.

You can run the unit tests by executing `test` Gradle task from your IDE. If you
prefer terminal/shell:

```bash
gradle :tutorial-3:test
```

> Explanation: Run `test` task available in `tutorial-3` Gradle (sub)project

If you want to run code linter (Checkstyle) to check find code style issues in
your work, execute `checkstyleMain` Gradle task from your IDE or via
terminal/shell:

```bash
gradle :tutorial-3:checkstyleMain
```

> Explanation: Run `checkstyleMain` tasks available in `tutorial-3` Gradle
> (sub)project

> Tips: You can run both linter and unit tests sequentially by executing `check`
> Gradle task. If you prefer terminal/shell: `gradle :tutorial-3:check`

## Mandatory Tasks Checklist

- Decorator Pattern Checklist
    - [ ] Make at least 1 commit that contains your progress in completing
    Decorator pattern
    - [ ] Push your commits to online Git repository on your GitLab project
    - [ ] Complete the imeplementation over required Class
    - [ ] Create a main class that demonstrate your implementation 
    - [ ] Pass all test in `bread` and `filling` package
- Composite Pattern Checklist
    - [ ] Make at least 1 commit that contains your progress in completing
    Composite Method pattern
    - [ ] Push your commits to online Git repository on your GitLab project
    - [ ] Complete the implementation over required classes
    - [ ] Create a main class that demonstrate your implementation
    - [ ] Pass all test in `higherups` and `techexpert` package

## Additional Tasks Checklist

- [ ] Make sure there are no code style issues, i.e. Checkstyle did not
produce any warning when you execute `check` or `checkstyleMain` Gradle
tasks
- Decorator Pattern Checklist
    - [ ] Pass all tests in `MultipleFillingTest` Class
    - [ ] Explain why decorator pattern is helpful in this particular problem set?
        - Write your answer in [My Notes](#my-notes) section in this document
- Composite Pattern Checklist
    - [ ] Pass all tests in `AdditionalCompanyTest` Class
    - [ ] If you look carefully, both decorator and composite pattern have a same
    particular topic (creating an object that comes from two or more supporting object).
    Explain what is the difference between composite and decorator purpose.
        - Write your answer in [My Notes](#my-notes) section in this document
    modified to use Stream API

## My Notes

> Feel free to use this section to write your own notes related to your attempt
> in doing the tutorial. You can also use this section to write text for
> answering question(s) mentioned in the task checklists.
