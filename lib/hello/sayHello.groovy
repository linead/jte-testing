void call(){ 
    def env = stageContext.args.env
    println env
    println "test2: environment = " + env.long_name
}
