package com.github.218012004.coffemachine.services

import com.intellij.openapi.project.Project
import com.github.218012004.coffemachine.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
