package laplacian_arch.deployment.model

import laplacian_arch.service_api_arch.model.Service


import laplacian.util.*

/**
 * service_component
 */
interface ServiceComponent : Container {
    /**
     * spec
     */
    val spec: Service
}