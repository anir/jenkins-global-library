#!/usr/bin/groovy
package org.foo
import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.Permission
import hudson.EnvVars
import hudson.FilePath

    def downloadFile(filepath){
    println("downloading file----------------")
    try {

    File file = new File("${filepath}" + "/newfile.txt");

    if (file.createNewFile()){
      println("File is created!");
    }else{
      println("File already exists.");
    }

  } catch (IOException e) {
    e.printStackTrace();
}
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
