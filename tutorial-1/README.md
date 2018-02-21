# Tutorial 1: Strategy & Observer Pattern

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Your main task in this tutorial is to complete classes in two Java packages
(`strategy` & `observer`) in order to demonstrate a working implementation of
Strategy and Observer pattern. There are several class and method headers left
blank in both packages that you need to complete.

The problem set used in this tutorial is based on example written in Head First
Design Pattern chapter 1 & 2. Please read the book, specifically sections that
discuss pattern implementation, to know how to complete the classes and
methods in this problem set.

The evaluation of your work will be based on number of passing unit tests,
code style issues, and your understanding on each patterns. Feel free to check
the unit tests to know methods and class header you need to implement in order
to pass the tests. Code style issues can be checked from test report generated
by Gradle. Your understanding will be verified by teaching team during in-person
demo session and/or merge request review.

**Caution: You are not allowed to modify the unit tests without permission from
the teaching team!**

## Mandatory Tasks Description

There are two Java packages that contain partially implemented classes. As
their name imply, `strategy` package contains classes that will be used for
demonstrating an example of Strategy pattern implementation. Similarly,
`observer` package contains classes that will be used for demonstrating
Observer pattern.

The following sections describe the tasks required in order to complete
each pattern implementation.

### Strategy Pattern

The code follows the example in Head First Design Pattern book about duck
simulator. It contains three separate class hierarchies: `Duck`, `FlyBehavior`,
and `QuackBehavior`. `Duck` represents the concept of duck, whether it alive
or not, in the simulation. It also acts as the abstract base class for every
variant of duck in the simulation. `FlyBehavior` and `QuackBehavior` represent
behaviors that can be assigned to an instance of `Duck`. Both behaviors have
variant such as `FlyNoWay` that defines a non-flying duck and `Quack` that
defines a quacking duck.

Your tasks in implementing Strategy pattern in this tutorial are as follow:

1. Add behavior setter methods in `Duck` class
2. Complete all classes that represent variant of `Duck`, i.e. `MallardDuck`
and `ModelDuck`
3. Complete all classes that use `FlyBehavior` to implement flying behavior
in duck, i.e. `FlyNoWay`, `FlyRocketPowered`, and `FlyWithWings`
4. Complete all classes that use `QuackBehavior` to implement quacking behavior
in duck, i.e. `Quack`, `Squeak`, and `MuteQuack`
5. Fix `MiniDuckSimulator` program so it can demonstrate new behavior
assignment during runtime

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

### Observer Pattern

The code follows the example in chapter 2 of Head First Design Pattern that
uses `java.util.Observer` and `java.util.Observable` to represent classes
that act as Observer and Subject, respectively. The display objects (`*Display`
classes) currently has a method (i.e. `update()`) that is not working properly
and you need to fix it. Similarly, the getter/setter methods in `WeatherData`
also left blank and you need to complete them.

Your tasks in implementing Observer pattern in this tutorial are as follow:

1. Fix `update()` method in every `*Display` class
2. Complete getter and setter methods in `WeatherData`

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

## Additional Tasks Description

Since the tests are not yet possible to check correctness of strings produced
by `println` calls, the teaching team asks you to ensure that every methods that
you wrote are implemented correctly according to the examples in Head First
Design Pattern.

You also need to ensure that your code follows the predefined code writing style. 
We follow Google's Java code writing style with minor modification: we use 4
whitespaces instead of 2 whitespaces in an indentation.

If you still have some time during lab session or in your spare time, please look
up for other Strategy pattern example. Please also read the explanation about
difference in rolling out your own Observer pattern vs. using Java's Observer
pattern package in Head First Design Pattern.

## Running & Testing the Program

It is recommended to use an IDE (e.g. IntelliJ, Eclipse) that can import Gradle
project. To run programs in each patterns, choose the program class from the
Project Explorer panel in your IDE of choice and pick option to run the program
class' `main` method.

If you want to run the unit tests, you can do so by executing `test` Gradle task
from your IDE or via terminal/shell:

```bash
gradle test
```

If you want to run code linter (Checkstyle) to check find code style issues in
your work, execute `checkstyleMain` Gradle task from your IDE or via
terminal/shell:

```bash
gradle checkstyleMain
```

> Tips: You can run both linter and unit tests sequentially by executing `check`
> Gradle task. If you prefer terminal/shell: `gradle check`

## Mandatory Tasks Checklist

- [x] Make at least 1 commit that contains your progress in completing
`strategy` pattern
- [x] Make at least 1 commit that contains your progress in completing
`observer` pattern
- [x] Push your commits to online Git repository on your GitLab project
- [x] Fix `MiniDuckSimulator` program in `strategy` package
- [x] Pass all tests in `strategy` package
- [x] Pass all tests in `observer` package

## Additional Tasks Checklist

- [x] Make sure there are no code style issues, i.e. Checkstyle did not
produce any warning when you execute `check` or `checkstyleMain` Gradle
tasks
- [x] Implement all required methods correctly
    - **Hint: Make sure the implementation follows the example in Head First
    Design Pattern book!**
- [x] Describe another example of Strategy pattern you found in the wild, e.g.
Java's standard library, 3rd party framework, etc., and write it in the
provided space in this document (i.e. [My Notes](#my-notes) section)
    - **Reminder: Do not forget to `add`, `commit`, and `push` this document
    as well if you made some changes!**
- [x] Describe the difference between implementing Observer pattern by creating
your own Subject and Observer from scratch vs. reusing Java's `java.util.Observable`
and `java.util.Observer`
    - Write your answer in [My Notes](#my-notes) section in this document

## My Notes

> Feel free to use this section to write your own notes related to your attempt
> in doing the tutorial. You can also use this section to write text for
> answering question(s) mentioned in the task checklists.
- Salah satu contoh dari pattern Strategy adalah moda kendaraan untuk ke bandara,
beberapa opsi di antaranya mengendarai kendaraan pribadi, naik taksi, bus bandara, bus kota, dll. 

- Perbedaan antara mengimplementasikan pattern Observer dengan membuat sendiri Subject dan
Observer dari scratch dan menggunakan bawaan Java adalah lebih mudah dengan menggunakan bawaan Java,
kita cukup menggunakan method-method yang sudah tersedia, jika kurang kita bisa menambahkannya sendiri. 
    