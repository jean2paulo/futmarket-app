import extensions.applyDefault

allprojects {
    repositories.applyDefault()
}

// register clean task
tasks.register("clean").configure {
    delete("build")
}