package org.foo;

class TestCheckout{
    def checkOutFrom(repo) {
      git url: "git@github.com:anir/${repo}"
    }
}
