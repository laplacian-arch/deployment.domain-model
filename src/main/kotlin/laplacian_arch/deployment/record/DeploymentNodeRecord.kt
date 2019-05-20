package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.DeploymentNode
import laplacian_arch.deployment.model.DbMigrationJobComponent
import laplacian_arch.deployment.model.DeploymentEnvironment
import laplacian_arch.deployment.model.DeploymentComponent
import laplacian_arch.deployment.model.ClientComponent
import laplacian_arch.deployment.model.ServiceComponent
import laplacian_arch.deployment.model.DatastoreComponent
import laplacian.util.*
/**
 * deployment_node
 */
open class DeploymentNodeRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the environment which aggregates this deployment_node
     */
    override val environment: DeploymentEnvironment,
    private val _record: Record = __record.normalizeCamelcase()
): DeploymentNode, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The name of this deployment_node.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The type of this deployment_node.
     */
    override val type: String
        get() = getOrThrow("type")

    /**
     * components
     */
    override val components: List<DeploymentComponent>
        = DeploymentComponentRecord.from(_record.getList("components", emptyList()), _context, this)

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, environment: DeploymentEnvironment) = records.map {
            when (val type = it["type"]) {
                "gke_cluster" -> GkeClusterRecord(it, _context, environment = environment)
                "d4d_local_cluster" -> D4dLocalClusterRecord(it, _context, environment = environment)
                else -> throw IllegalArgumentException(
                    "Undefined type $type. It is should be one of [gke_cluster, d4d_local_cluster]"
                )
            }
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeploymentNodeRecord) return false
        if (environment != other.environment) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = environment.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "DeploymentNodeRecord(" +
            "environment=$environment, " +
            "name=$name" +
        ")"
    }
}