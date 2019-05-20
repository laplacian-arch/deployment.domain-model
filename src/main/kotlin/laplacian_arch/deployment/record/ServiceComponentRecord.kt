package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.ServiceComponent
import laplacian_arch.service_api_arch.model.Service
import laplacian_arch.service_api_arch.record.ServiceRecord
import laplacian_arch.deployment.model.DeploymentNode
import laplacian.util.*
/**
 * service_component
 */
data class ServiceComponentRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the node which aggregates this service_component
     */
    override val node: DeploymentNode,
    private val _record: Record = __record.normalizeCamelcase()
): ContainerRecord(__record, _context,node), ServiceComponent, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * spec
     */
    override val spec: Service
        get() = ServiceRecord.from(_context).find {
            it.name == name
        } ?: throw IllegalStateException(
            "There is no service which meets the following condition(s): "
            + "ServiceComponent.name == service.name (=$name) "
            + "Possible values are: " + ServiceRecord.from(_context).map {
              "(${ it.name })"
            }.joinToString()
        )

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, node: DeploymentNode) = records.map {
            ServiceComponentRecord(it, _context, node = node)
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceComponentRecord) return false
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
        return "ServiceComponentRecord(" +
            "node=$node, " +
            "name=$name" +
        ")"
    }
}