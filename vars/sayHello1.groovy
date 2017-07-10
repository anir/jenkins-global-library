import jenkins.model.Jenkins

def call(body) {
// evaluate the body block, and collect configuration into the object
 def config = [:]
 body.resolveStrategy = Closure.DELEGATE_FIRST
 body.delegate = config
 body()
 // def z = new org.foo.TestCheckout()
 // z.checkOutFrom("myrepo")
 echo "Hello World from " + "${config.name}"



println("All Nodes - executor count:")
println()
Jenkins.instance.computers.eachWithIndex() { c, i -> println " [${i+1}] ${c.displayName}: ${c.numExecutors}" };
println()
println("Total nodes: [" + Jenkins.instance.computers.size() + "]")
println("Total executors: [" + Jenkins.instance.computers.inject(0, {a, c -> a + c.numExecutors}) + "]")
}
