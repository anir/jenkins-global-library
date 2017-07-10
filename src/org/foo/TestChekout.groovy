#!/usr/bin/groovy
package org.foo
import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.Permission
import hudson.EnvVars
import hudson.FilePath

    def downloadFile(filepath){
        File f = new File("${filepath}\newtest.txt")
        f.createNewFile()
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
