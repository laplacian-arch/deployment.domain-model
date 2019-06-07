package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.GkeCluster
import laplacian_arch.deployment.model.DeploymentEnvironment
import laplacian.util.*
/**
 * gke_cluster
 */
data class GkeClusterRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the environment which aggregates this gke_cluster
     */
    override val environment: DeploymentEnvironment,
    private val _record: Record = __record.normalizeCamelcase()
): DeploymentNodeRecord(__record, _context,environment), GkeCluster, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The number_of_nodes of this gke_cluster.
     */
    override val numberOfNodes: Int
        get() = getOrThrow("numberOfNodes")

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, environment: DeploymentEnvironment) = records
            .mergeWithKeys("name")
            .map {
                GkeClusterRecord(it, _context, environment = environment)
            }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GkeClusterRecord) return false
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
        return "GkeClusterRecord(" +
            "environment=$environment, " +
            "name=$name" +
        ")"
    }
}