void call(){ 
    def env = stageContext.config.env
    println env
    println "environment = " + env.long_name
}
