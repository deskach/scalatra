package com.hello

import org.scalatra._

/**
  * Created by Dzianis on 6/07/2016.
  */
class MyHello extends ScalatraServlet {
  get("/") {
    "My Hello."
  }
}
