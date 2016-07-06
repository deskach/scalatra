package com.hello

import org.scalatra._

class HelloWorld extends HelloworldStack {

  get("/") {
    <html>
      <body>
        <h1>Hello World!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
