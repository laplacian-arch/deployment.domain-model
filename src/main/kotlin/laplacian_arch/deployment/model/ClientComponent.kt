package laplacian_arch.deployment.model

import laplacian_arch.client_app_arch.model.Client


import laplacian.util.*

/**
 * client_component
 */
interface ClientComponent : Container {
    /**
     * spec
     */
    val spec: Client
}