package com.awesomeness

import org.scalatest._

class TestAwesome extends FunSpec with Matchers {
 val awesome = new Awesomeness

 it("sample test") {
    // awesome.square(1) should be (1)
    awesome.multiple(2,3) should be (6)
    Thread.sleep(1000)
  }
}
