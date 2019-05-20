package laplacian_arch.deployment.model


import laplacian.util.*

/**
 * deployment_environment
 */
interface DeploymentEnvironment {
    /**
     * The name of this deployment_environment.
     */
    val name: String
    /**
     * nodes
     */
    val nodes: List<DeploymentNode>
}