package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.DeploymentEnvironment
import laplacian_arch.deployment.model.DeploymentEnvironmentList
import laplacian_arch.deployment.model.DeploymentNode
import laplacian.util.*
/**
 * deployment_environment
 */
data class DeploymentEnvironmentRecord (
    private val __record: Record,
    private val _context: Context,
    private val _record: Record = __record.normalizeCamelcase()
): DeploymentEnvironment, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The name of this deployment_environment.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * nodes
     */
    override val nodes: List<DeploymentNode>
        = DeploymentNodeRecord.from(_record.getList("nodes"), _context, this)

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(_context: Context): DeploymentEnvironmentList {
            return _context.get("deployment_environments") as DeploymentEnvironmentList
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeploymentEnvironmentRecord) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        return result
    }

    override fun toString(): String {
        return "DeploymentEnvironmentRecord(" +
            "name=$name" +
        ")"
    }
}