import jenkins.model.Jenkins
import java.io.File
import groovy.io.FileType
import hudson.model.*
//import org.foo.*
//import org.foo.TestCheckout

def call(body) {
// evaluate the body block, and collect configuration into the object
 def config = [:]
 body.resolveStrategy = Closure.DELEGATE_FIRST
 body.delegate = config
 body()
 println ("config object :" + "${config}")
 def z = new org.foo.TestChekout()
 // z.checkOutFrom("myrepo")
 sh 'chmod -R 777 .'
 z.downloadFile()
 sh 'ls -la'
 sh 'pwd'
 echo "Hello World from " + "${config.name}"



println("All Nodes - executor count:")
println()
Jenkins.instance.computers.eachWithIndex() { c, i -> println " [${i+1}] ${c.displayName}: ${c.numExecutors}" };
println()
println("Total nodes: [" + Jenkins.instance.computers.size() + "]")
println("Total executors: [" + Jenkins.instance.computers.inject(0, {a, c -> a + c.numExecutors}) + "]")

}
