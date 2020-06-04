void call(){ 
    def env = stageContext.args.env
    println env
    println "environment = " + env.long_name
}
