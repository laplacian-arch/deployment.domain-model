package laplacian_arch.deployment.model


import laplacian.util.*

/**
 * container
 */
interface Container : DeploymentComponent {
    /**
     * The image_name of this container.
     */
    val imageName: String
    /**
     * The container_registry of this container.
     */
    val containerRegistry: String
    /**
     * The image_tag of this container.
     */
    val imageTag: String
    /**
     * The image of this container.
     */
    val image: String
        get() = (if (containerRegistry.isNullOrEmpty()) "" else containerRegistry + "/") + "$imageName:$imageTag"
}