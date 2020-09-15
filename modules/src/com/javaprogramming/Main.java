package com.javaprogramming;

// module system of JDK 9 was
// developed under a project jigsaw.

// java application is a collection of modules
// module system was designed to have a
// reliable configuration,strong encapsulation,and a
// modular JDK/JRE.The purpose is to solve problems
// typically involved with developing and deploying java
// applications before Java 9

// These modularity features in Java 9 are collectively
// known as Java Platform Module System (JPMS)

// module is a named collection of data and code
// Every module needs to have some configuration :
// name -> unique name of the module
// inputs -> what the module needs to use and
// what is required
// for the module to be compiled and run
// outputs -> what the module outputs or
// exports to other modules

// java SE 9 platform is divided
// into a set of modules that are known as
// platform modules. This provides
// scalable java Runtime.Standard modules
// have named prefixed with java.
// for e.g. java.base,java.sql
// java JavaF module names are prefixed with javafx
// inputs -> module(module definition + module code) -> output

// every module comes with module descriptor file
// that describes the module and contains metadata
// about the module

// module descriptor file is always located directly
// at the module root folder and always has the name
// module-info.java

// module declaration introduces a module name
// that can be used in other module declarations
// to express relationships between modules

// module name consists of one or more java
// identifiers separated by "." tokens

// there are two kind of modules: normal and open

// normal module without open modifier grants
// access at compile time
// and run time to only those packages which
// are explicitly exported.

// open module with open modifier grants access at
// compile time to types in only those packages which are
// explicitly exported, but grant access at run time to types
// in all its packages,as if packages had been exported

// requires statement is used to specify module that is
// required by current module, in other words
// module depends on the some other module we have to
// specify it using the requires statement.

// jigsaw provides scalable platform,security,application
// performance,
// easier developer experience etc
// the ability to scale platform down to smaller
// computing device
// is achieved by moving from a
// monolithic runtime



// requires statements depends on how only modules
// are needed in our module

// exports statement is used to specify packages
// that are exported by current module

// provides statement is used to specify service
// implementations that the current module provides

// uses statement is used to specify the service that
// the current module consumes

// opens statement can't be used in open modules
// because all packages are open in a open module


// project jigsaw defines two types of modules
// named and unnamed
// named modules can be normal or automatic
// named modules are modules declared in module-info.java
// file
// normal module has a module descriptor file(module-info.java)
// while automatic module does not have a module
// descriptor file

// normal module is declared using keyword module
// and does not export any of its packages by default.
// normal module is divided into basic and open modules

// automatic module is created after adding JAR file to
// module path
// automatic module is not explicitly declared by the developer
// inside descriptor , it is automatically created when a JAR file
// is placed into the module path.
// it exports all its packages by default
// they are useful for third-party code

// basic modules don't officially exist in JDK 9
// it has same characteristic as a normal module except
// it is not an open module

// many third party libraries like Spring and Hibernate
// use reflection to access the internals of JDK at runtime


// open module is makes all packages inside module
// accessible for deep reflection


// keyword open can be used to declare an open module
// or to declare specific packages as open

// unnamed module does not have a name and it is not declared

// it exports all of its packages
// it reads all modules in JDK and on the module path

//Aggregator

// These exist for convenience
// Usually they have no code of their own they just
// have a module descriptor
// they collect and export the contents of other modules
// this is the reason they are named as aggregator

// Module Path and Class Path

// Class Path can represent
// a path to a sequence of folders that contains modules
// a path to modular JAR files
// a path to JMOD file(extended version of a JAR)

// module path
// is used by compiler to find and resolve modules
// every module from a module path needs to have a
// module declaration (module-info.java)

public class Main {

    public static void main(String[] args) {

    }
}
