package laplacian_arch.deployment.model


import laplacian.util.*

/**
 * deployment_component
 */
interface DeploymentComponent {
    /**
     * The name of this deployment_component.
     */
    val name: String
    /**
     * The type of this deployment_component.
     */
    val type: String
    /**
     * node
     */
    val node: DeploymentNode
}