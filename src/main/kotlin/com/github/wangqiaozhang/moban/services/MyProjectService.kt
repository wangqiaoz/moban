package com.github.wangqiaozhang.moban.services

import com.intellij.openapi.project.Project
import com.github.wangqiaozhang.moban.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
