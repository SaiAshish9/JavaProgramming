package com.javaprogramming;

//  database stores data in a single file
//  flat file database stores all data in a single table
//  this results in data duplication

// view is a selection of rows and columns
// possible from more than one table.
// sqlite3
// sqlite3 test.db
// create table contacts(name text);

// .schema <>
// .quit
// .help
// .headers on -> column names
// .backup <>
// .restore <>
// .tables
// .dump lists insert select and transactions
// .exit,.quit

//(INNER) JOIN: Returns records that have matching values in both tables
//        LEFT (OUTER) JOIN: Returns all records from the left table, and the matched records from the right table
//        RIGHT (OUTER) JOIN: Returns all records from the right table, and the matched records from the left table
//        FULL (OUTER) JOIN: Returns all records when there is a match in either left or right table
// select songs.title from songs INNER JOIN albums ON songs.album = albums._id;

// JDBC consists of two packages
// java.sql(core JDBC) and javax.sql(optional JDBC)

// JDK ships with database driver called derby which is used for
// desktop applications or when prototyping
// derby JDBC driver is also included in JDK

public class Main1 {

    public static void main(String[] args) {
	// write your code here
    }
}
