stages{
  hello{
    echoEnv
    sayHello 
    printSomething
    dancingStep
  }
}

libraries{
  merge = true 
  echo
  hello
  something
  dancing {
    projects {
        Infrastructure {
            id = 'My.Project.Infrastructure'
            threshold = 74
        }
        Api {
            id = 'My.Project.Api' 
            threshold = 72
        }
        Application {
            id = 'My.Project.Application' 
            threshold = 90
        }
    }
  }
}
