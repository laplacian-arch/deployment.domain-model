package laplacian_arch.deployment.model
import com.github.jknack.handlebars.Context

import laplacian.util.*

/**
 * A container for records of deployment_environment
 */
class DeploymentEnvironmentList(
    list: List<DeploymentEnvironment>,
    val context: Context
) : List<DeploymentEnvironment> by list {
}