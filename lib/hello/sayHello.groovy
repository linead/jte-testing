void call(){ 
    def env = stageContext.env
    println env
    println "environment = " + env.long_name
}
