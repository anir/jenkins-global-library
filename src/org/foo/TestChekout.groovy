#!/usr/bin/groovy
package org.foo

    def downloadFile(filepath){
        println("${filepath}/newfile.txt")
        boolean success  = new File("${filepath}/newfile.txt").createNewFile()
        println("status : " + ${success})
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
