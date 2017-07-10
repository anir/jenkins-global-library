#!/usr/bin/groovy
package org.foo

    def downloadFile(filepath){
        println("${filepath}/newfile.txt")
        File file = new File("${filepath}/newfile.txt")
        //file.createNewFile()
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
