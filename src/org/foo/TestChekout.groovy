package org.foo;

def checkOutFrom(repo) {
  git url: "git@github.com:anir/${repo}"
}
