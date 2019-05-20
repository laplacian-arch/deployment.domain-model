package laplacian_arch.deployment.model

import laplacian_arch.datasource.model.Datasource


import laplacian.util.*

/**
 * datastore_component
 */
interface DatastoreComponent : Container {
    /**
     * spec
     */
    val spec: Datasource
}