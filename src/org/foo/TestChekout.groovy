#!/usr/bin/groovy
package org.foo

    def downloadFile(){
        File file = new File("newfile.txt");
        if(file.createNewFile()){
          println("creating new file.....")
        }
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
