package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.D4dLocalCluster
import laplacian_arch.deployment.model.DeploymentEnvironment
import laplacian.util.*
/**
 * d4d_local_cluster
 */
data class D4dLocalClusterRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the environment which aggregates this d4d_local_cluster
     */
    override val environment: DeploymentEnvironment,
    private val _record: Record = __record.normalizeCamelcase()
): DeploymentNodeRecord(__record, _context,environment), D4dLocalCluster, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The domain_name of this d4d_local_cluster.
     */
    override val domainName: String
        get() = "localhost"

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, environment: DeploymentEnvironment) = records.map {
            D4dLocalClusterRecord(it, _context, environment = environment)
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D4dLocalClusterRecord) return false
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
        return "D4dLocalClusterRecord(" +
            "environment=$environment, " +
            "name=$name" +
        ")"
    }
}