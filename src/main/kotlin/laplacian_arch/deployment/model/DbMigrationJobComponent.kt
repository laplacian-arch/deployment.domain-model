package laplacian_arch.deployment.model

import laplacian_arch.datasource.model.Datasource


import laplacian.util.*

/**
 * db_migration_job_component
 */
interface DbMigrationJobComponent : Container {
    /**
     * target_datasource
     */
    val targetDatasource: Datasource
}