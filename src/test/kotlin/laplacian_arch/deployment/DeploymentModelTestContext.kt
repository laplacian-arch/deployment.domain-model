package laplacian_arch.deployment

import laplacian.gradle.task.generate.ExecutionContext
import laplacian.gradle.task.generate.ProjectEntryResolver
import laplacian_arch.deployment.gradle.DeploymentModelEntryResolver
import laplacian_arch.deployment.model.DeploymentEnvironmentList
import laplacian_arch.deployment.model.AcmeList
import java.io.File

class DeploymentModelTestContext {
    val deploymentEnvironments: DeploymentEnvironmentList
        get() = executionContext.currentModel["deployment_environments"] as DeploymentEnvironmentList
    val acmes: AcmeList
        get() = executionContext.currentModel["acmes"] as AcmeList
    var executionContext: ExecutionContext = ExecutionContext().also { context ->
        val projectModel = File("laplacian-module.yml")
        if (projectModel.exists()) context.addModel(projectModel)
        context.addModelEntryResolver(
            DeploymentModelEntryResolver()
        )
    }

    fun models(vararg models: String): DeploymentModelTestContext {
        executionContext.addModel(*models).build()
        return this
    }
}