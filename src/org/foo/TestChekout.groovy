#!/usr/bin/groovy
package org.foo

    def downloadFile(filepath){
        File file = new File("${filepath}/newfile.txt");
        if(file.createNewFile()){
          println("creating new file.....")
        }
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
