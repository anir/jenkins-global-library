#!/usr/bin/groovy
package org.foo
import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.Permission
import hudson.EnvVars

    def downloadFile(filepath){
        EnvVars envVars = build.getEnvironment(listener);
        filename = envVars.get('WORKSPACE') + "\\node_details.txt";

        //filename = "${manager.build.workspace.remote}" + "\\node_details.txt"

        targetFile = new File(filename);

        println "attempting to create file: $targetFile"



        if (targetFile.createNewFile()) {

            println "Successfully created file $targetFile"

        } else {

            println "Failed to create file $targetFile"

        }

        print "Deleting ${targetFile.getAbsolutePath()} : "

        println targetFile.delete()
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
