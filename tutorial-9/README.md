# Tutorial 9: RESTful Web Service

CSCM602023 Advanced Programming @ Faculty of Computer Science Universitas
Indonesia, Term 2 2017/2018

* * *

Your main task in this tutorial is to create a RESTful Web service using
[Spring](https://spring.io) framework. The Web service will provide simple
CRUD (Create-Read-Update-Delete) functions for managing a lis of animal
collection in a zoo.

The initial starter code used in this tutorial is based on a tutorial named
[Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
that can be found in Guides section at Spring framework documentation Web site.
The starter code is licensed under Apache 2.0 license.

## Mandatory Tasks Description

The starter code already contains a working example of a Web service
implemented using Spring framework. Your task is to create new Web service
endpoints that will provide CRUD functionality for managing records of animals.
The data class for representing animal is taken from the starter code used
in Programming Foundations 2 course assignments in this semester. The records
can be read and written into a CSV text file instead of database to simplify
this tutorial.

The URI for new endpoints in this exercise must be prefixed with `/javari` to
separate them from existing `/greeting` service. The endpoints that you have to
implement is as follows:

- Get list of animals
    - When a client send a **HTTP GET** message to `/javari`, then the
    service shall return an array of JSON object containing animal information
    - If the list is empty, the returned JSON object must contain a warning
    message
- Get information of an animal
    - When a client send a **HTTP GET** message to `/javari/ID` where `ID` is
    an integer representing unique identifier of an animal, then the service
    shall return a JSON object containing single animal information
    - If given `ID` does not exist, the returned JSON object must contain a
    warning message
- Remove an animal from the list
    - When a client send an **HTTP DELETE** message to `/javari/ID` where `ID`
    is an integer representing unique identifier of an animal, then the service
    shall remove the animal from the list and return a JSON object of the
    deleted animal
    - If given `ID` does not exist, the returned JSON object must contain a
    warning message
- Add a new animal into the list
    - When a client send an **HTTP POST** message to `/javari` and the message
    contains JSON object that describe a new animal , then the service shall
    parse the received data payload (JSON) into animal object and store it into
    the list

## Additional Tasks Description

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

There are two additional tasks in this tutorial and described in the following
subsections.

### Testing Controller in Isolation

The existing `/greeting` service has set of unit tests that are able to test
controller class in **isolation**. The methods in controller can be tested
without having to instantiate the whole framework and deploy it on Web server.
It employs mock testing to ensure the controller can be tested independently
without the required dependencies.

Your additional task in this exercise is to look how the controller in
`/greeting` service is tested and try to create similar tests for testing
controller in your new `/javari` service.

### Investigating JSON Serialization in Spring Framework

Serialization may have different meanings depending on the context. In context
of concurrency, serialization means concurrent accesses to a critical section
has to happen in sequential order. However, in data persistence, serialization
means the process of making a data object in runtime into another format for
storage or communication purpose.

Your additional task in this exercise is to research on how controllers in
Spring Framework use object serialization to automatically "translate" Java
object into JSON object when returning the response back to client.

## Running & Testing the Program

> Note: Please check the [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
> document to see how to run Spring application on your IDE or Gradle.

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
gradle :tutorial-9:test
```

> Explanation: Run `test` task available in `tutorial-6` Gradle (sub)project

If you want to run code linter (Checkstyle) to check find code style issues in
your work, execute `checkstyleMain` or `checkstyleTest` Gradle task from your IDE
or via terminal/shell:

```bash
gradle :tutorial-9:checkstyleMain
gradle :tutorial-9:checkstyleTest
```

> Explanation: Run `checkstyleMain` and `checkstyleTest` tasks available in
> `tutorial-9` Gradle (sub)project

> Tips: You can run both linter and unit tests sequentially by executing `check`
> Gradle task. If you prefer terminal/shell: `gradle :tutorial-9:check`

## Mandatory Tasks Checklist

- [ ] Prepare sample CSV file containing animal records
- [ ] Create required class(es) for managing (CRUD) animal records
- [ ] Implement all required Web service endpoints
- [ ] Push your commits to online Git repository on your GitLab project

## Additional Tasks Checklist

- [ ] Make sure there are no code style issues, both in production code and
test code
- [ ] Create unit tests for testing `JavariController`
- [ ] Do some research on how the controllers in Spring Framework can return
a JSON object while the actual data was taken from a Java object, e.g.
`Greeting` and `Animal` objects
    - Your report, at minimum, must contains information about: libraries that
    Spring Framework use in serializing JSON and how the libraries are used
    by the framework to seamlessly "translating" Java object into JSON
    - Write your report in 2 - 3 paragraphs in My Notes section

## My Notes

> Feel free to use this section to write your own notes related to your attempt
> in doing the tutorial. You can also use this section to write text for
> answering question(s) mentioned in the task checklists.
