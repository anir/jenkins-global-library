package org.foo

class TestCheckout implements Serializable {
    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
}
