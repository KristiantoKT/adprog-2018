# Tutorial 2: Command & Template Method

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Your main task in this tutorial is to complete classes in two Java packages
(`exercise1` & `exercise2`) in order to demonstrate a working implementation of
Command and Template Method patterns. There are several classes and methods that
left blank in both packages (and subpackages) that you need to complete.

The problem set used in this tutorial is based on example written in Head First
Design Pattern **chapter 6 & 8**. Please read the book, specifically sections that
discuss pattern implementation, to know how to complete the classes and
methods in this problem set.

The evaluation of your work will be based on number of passing unit tests,
code style issues, and your understanding on each patterns. Feel free to check
the unit tests to know methods and classes you need to implement in order
to pass the tests. Code style issues can be checked from test report generated
by Gradle. Your understanding will be verified by teaching team during in-person
demo session and/or merge request review.

**Caution: You are not allowed to modify the unit tests without permission from
the teaching team!**

## Mandatory Tasks Description

There are two Java packages that contain partial implementation of Command and
Template Method patterns. The first package, `exercise1` contains classes that
demonstrate implementation of Command pattern. The latter, `exercise2`, is
similar to the first package but it contains classes that demonstrate
implementation of Template Method pattern.

The following sections describe the tasks required in order to complete
each pattern implementation.

### Command Pattern

The code follows the example in Head First Design Pattern chapter 6 that
simulates a home automation system controlled by a remote control object.
The code was organised into three packages: `command`, `invoker`, and
`receiver`. It also included a runner program, `RemoteLoader`, in the
root `exercise1` package.

The first package (`command`) contains the `Command` interface and its
respective implementation classes. To make the tutorial completable under
2 hours, the package only contains `Command` implementation classes for
operating `CeilingFan` and `Light` objects.

The second package (`invoker`) contains two classes that serve as Invoker
in Command pattern: `RemoteControlWithUndo` and `SimpleRemoteControl`.

The third package (`receiver`) contains the *smart* devices that will
be controlled via *remote control*. The devices are represented as Java
classes. There are two devices in this tutorial: `CeilingFan` and `Light`.

In overall, the code in exercise about Command pattern is similar to the
example in the book. There are several modifications such as:

- Additional instance variable and its respective getter method that
responsible for keeping the receiver object's state
- `CeilingFanCommand` class and its subclasses are a form of Template
Method implementation
- `MacroCommand` uses `List` instead of array for storing `Command` objects

Your tasks in completing Command pattern implementation in this tutorial
are as follow:

1. Complete all classes in `receiver` package
2. Complete `LightOffCommand`, `LightOnCommand`, and `MacroCommand` classes in
`command` package
3. Fix implementation of `RemoteControlWithUndo` and `SimpleRemoteControl`
classes in `invoker` package

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

### Template Method Pattern

The code follows the example in Head First Design pattern chapter 8 that
simulates beverage brewing algorithm. Since the example only consists of
three classes, the classes are not organised into packages.

Your main task in completing Template Method implementation in this tutorial
is to correctly implement template/skeleton of the beverage brewing algorithm
in `prepareRecipe()` method at `CaffeineBeverage` class.

**Reminder: When attempting each task, do not forget to `commit` your latest
state of work to your local Git repository and `push` it to GitLab!**

## Additional Tasks Description

Similar to the previous tutorial, you need to ensure that your code does not
contain any style/linter issues. You can run the linter (Checkstyle) by
executing `checkstyleMain` Gradle task.

> Tips: You can also find Checkstyle plugin for your IDE of choice and let
> the plugin handle the checking.

There are two additional tasks related to pattern implementation. The tasks
are described in following subsections.

### Template Method at CeilingFanCommand

As mentioned in the respective mandatory tasks description, the Command object
for operating `CeilingFanObject` is designed to follow Template Method pattern.
At its current state, it is still not implemented correctly and you need to
make it work.

Your tasks are as follow:

1. Run the unit test and take note of the failing tests related to
`CeilingFanCommand` and its subclasses
2. Complete `execute()` method in `CeilingFanCommand` class
    - The failing tests give clues on how the `execute()` should be implemented
3. Complete `undo()` method in `CeilingFanCommand` class
4. Complete all methods in every subclass of `CeilingFanCommand` class
5. Compare your final version of `CeilingCommand` class and its subclasses with
their counterparts that follow the old design in the book

### Batch Execution using Java 8's Stream API

One way to implement `execute()` method in `MacroCommand` class is as follows:

```java
for (int i = 0; i < commands.size(); i++) {
    Command command = commands.get(i);
    command.execute();
}
```

The code above can be more readable and concise if we use Java's
for-each/enhanced for-loop construct:

```java
for (Command command: commands) {
    command.execute();
}
```

Since Java 8, there are several new features introduced into Java. One of them
is Stream API that allows programmers to use Java Collections API in declarative
way.

Your task is to explore Java Stream API and try to modify your implementation of
`execute()` method in `MacroCommand` to use Stream API. Ensure your modification
still pass the unit tests related to `MacroCommand`.

## Running & Testing the Program

It is recommended to use IDE that can import Gradle-based project to complete this
tutorial. If you are using IDE, **please import `build.gradle` located in the
parent directory (root) of this tutorial.** The tutorials are structured as
Gradle multi-projects and the content of `build.gradle` in each tutorial
directories is defined in the main (root) `build.gradle` file.

You can run the unit tests by executing `test` Gradle task from your IDE. If you
prefer terminal/shell:

```bash
gradle :tutorial-2:test
```

> Explanation: Run `test` task available in `tutorial-2` Gradle (sub)project

If you want to run code linter (Checkstyle) to check find code style issues in
your work, execute `checkstyleMain` Gradle task from your IDE or via
terminal/shell:

```bash
gradle :tutorial-2:checkstyleMain
```

> Explanation: Run `checkstyleMain` tasks available in `tutorial-2` Gradle
> (sub)project

> Tips: You can run both linter and unit tests sequentially by executing `check`
> Gradle task. If you prefer terminal/shell: `gradle :tutorial-2:check`

## Mandatory Tasks Checklist

- [ ] Make at least 1 commit that contains your progress in completing
Command pattern
- [ ] Make at least 1 commit that contains your progress in completing
Template Method pattern
- [ ] Push your commits to online Git repository on your GitLab project
- [ ] Complete all classes in `receiver` and `invoker` packages
- [ ] Complete `LightOffCommand`, `LightOnCommand`, and `MacroCommand`
classes in `command` package
- [ ] Pass all tests for classes in `receiver` and `invoker` packages
- [ ] Pass all tests for `CaffeineBeverage` class

## Additional Tasks Checklist

- [ ] Make sure there are no code style issues, i.e. Checkstyle did not
produce any warning when you execute `check` or `checkstyleMain` Gradle
tasks
- [ ] Implement `CeilingFanCommand` and its subclasses correctly
- [ ] Pass all tests for classes in `command` package
- [ ] Compare the template method version of `CeilingFanCommand` with the
old design used by code examples in Head First Design Patterns chapter 6
and describe the differences
    - Write your answer in [My Notes](#my-notes) section in this document
- [ ] Implement `execute()` method in `MacroCommand` class using Stream API
- [ ] All tests for `MacroCommand` still pass after `execute()` method was
modified to use Stream API

## My Notes

> Feel free to use this section to write your own notes related to your attempt
> in doing the tutorial. You can also use this section to write text for
> answering question(s) mentioned in the task checklists.
