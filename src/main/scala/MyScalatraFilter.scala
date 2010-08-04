package com.example

import org.scalatra._

class MyScalatraFilter extends ScalatraFilter {
  get("/") {
    <h1>Hello, world!</h1>
  }
}
