#!/usr/bin/groovy
package org.foo
import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.Permission
import hudson.EnvVars
import hudson.FilePath

    def downloadFile(filepath){
    try {

    File file = new File("newfile.txt");

    if (file.createNewFile()){
      System.out.println("File is created!");
    }else{
      System.out.println("File already exists.");
    }

  } catch (IOException e) {
    e.printStackTrace();
}
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
