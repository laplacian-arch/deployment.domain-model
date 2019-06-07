package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.ClientComponent
import laplacian_arch.client_app_arch.model.Client
import laplacian_arch.client_app_arch.record.ClientRecord
import laplacian_arch.deployment.model.DeploymentNode
import laplacian.util.*
/**
 * client_component
 */
data class ClientComponentRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the node which aggregates this client_component
     */
    override val node: DeploymentNode,
    private val _record: Record = __record.normalizeCamelcase()
): ContainerRecord(__record, _context,node), ClientComponent, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * spec
     */
    override val spec: Client
        get() = ClientRecord.from(_context).find {
            it.name == name
        } ?: throw IllegalStateException(
            "There is no client which meets the following condition(s): "
            + "ClientComponent.name == client.name (=$name) "
            + "Possible values are: " + ClientRecord.from(_context).map {
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
                ClientComponentRecord(it, _context, node = node)
            }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClientComponentRecord) return false
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
        return "ClientComponentRecord(" +
            "node=$node, " +
            "name=$name" +
        ")"
    }
}