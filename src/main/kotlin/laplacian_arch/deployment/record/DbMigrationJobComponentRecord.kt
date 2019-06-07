package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.DbMigrationJobComponent
import laplacian_arch.datasource.model.Datasource
import laplacian_arch.datasource.record.DatasourceRecord
import laplacian_arch.deployment.model.DeploymentNode
import laplacian.util.*
/**
 * db_migration_job_component
 */
data class DbMigrationJobComponentRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the node which aggregates this db_migration_job_component
     */
    override val node: DeploymentNode,
    private val _record: Record = __record.normalizeCamelcase()
): ContainerRecord(__record, _context,node), DbMigrationJobComponent, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * target_datasource
     */
    override val targetDatasource: Datasource
        get() = DatasourceRecord.from(_context).find {
            it.name == name
        } ?: throw IllegalStateException(
            "There is no datasource which meets the following condition(s): "
            + "DbMigrationJobComponent.name == datasource.name (=$name) "
            + "Possible values are: " + DatasourceRecord.from(_context).map {
              "(${ it.name })"
            }.joinToString()
        )

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, node: DeploymentNode) = records
            .mergeWithKeys("name")
            .map {
                DbMigrationJobComponentRecord(it, _context, node = node)
            }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbMigrationJobComponentRecord) return false
        if (node != other.node) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = node.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "DbMigrationJobComponentRecord(" +
            "node=$node, " +
            "name=$name" +
        ")"
    }
}