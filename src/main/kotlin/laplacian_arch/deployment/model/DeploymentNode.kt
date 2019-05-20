package laplacian_arch.deployment.model


import laplacian.util.*

/**
 * deployment_node
 */
interface DeploymentNode {
    /**
     * The name of this deployment_node.
     */
    val name: String
    /**
     * The type of this deployment_node.
     */
    val type: String
    /**
     * db_migration_jobs
     */
    val dbMigrationJobs: List<DbMigrationJobComponent>
        get() = components.filter{ it is DbMigrationJobComponent } as List<DbMigrationJobComponent>
    /**
     * environment
     */
    val environment: DeploymentEnvironment
    /**
     * components
     */
    val components: List<DeploymentComponent>
    /**
     * clients
     */
    val clients: List<ClientComponent>
        get() = components.filter{ it is ClientComponent } as List<ClientComponent>
    /**
     * services
     */
    val services: List<ServiceComponent>
        get() = components.filter{ it is ServiceComponent } as List<ServiceComponent>
    /**
     * datastores
     */
    val datastores: List<DatastoreComponent>
        get() = components.filter{ it is DatastoreComponent } as List<DatastoreComponent>
}