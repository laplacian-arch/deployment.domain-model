package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.DeploymentComponent
import laplacian_arch.deployment.model.DeploymentNode
import laplacian.util.*
/**
 * deployment_component
 */
open class DeploymentComponentRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the node which aggregates this deployment_component
     */
    override val node: DeploymentNode,
    private val _record: Record = __record.normalizeCamelcase()
): DeploymentComponent, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The name of this deployment_component.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The type of this deployment_component.
     */
    override val type: String
        get() = getOrThrow("type")

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, node: DeploymentNode) = records
            .mergeWithKeys("name")
            .map {
                when (val type = it["type"]) {
                    "container" -> ContainerRecord(it, _context, node = node)
                    "service_component" -> ServiceComponentRecord(it, _context, node = node)
                    "client_component" -> ClientComponentRecord(it, _context, node = node)
                    "db_migration_job_component" -> DbMigrationJobComponentRecord(it, _context, node = node)
                    "datastore_component" -> DatastoreComponentRecord(it, _context, node = node)
                    else -> throw IllegalArgumentException(
                        "Undefined type $type. It is should be one of [container]"
                    )
                }
            }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeploymentComponentRecord) return false
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
        return "DeploymentComponentRecord(" +
            "node=$node, " +
            "name=$name" +
        ")"
    }
}