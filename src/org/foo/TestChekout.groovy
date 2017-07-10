#!/usr/bin/groovy
package org.foo
import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.Permission
import hudson.EnvVars
import hudson.FilePath

    def downloadFile(filepath){
    if(build.workspace.isRemote())
      {
      channel = build.workspace.channel;
      fp = new FilePath(channel, build.workspace.toString() + "/node_details.txt")
      } else {
      fp = new FilePath(new File(build.workspace.toString() + "/node_details.txt"))
      }

      if(fp != null)
      {
      fp.write("test data", null); //writing to file
      }
    }


    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
