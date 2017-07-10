def call(body) {
// evaluate the body block, and collect configuration into the object
 def config = [:]
 body.resolveStrategy = Closure.DELEGATE_FIRST
 body.delegate = config
 body()
 def z = new org.foo.TestCheckout()
 z.checkOutFrom("myrepo")
 echo "Hello World from " + "${config.name}"
}
