package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.Container
import laplacian_arch.deployment.model.DeploymentNode
import laplacian.util.*
/**
 * container
 */
open class ContainerRecord (
    private val __record: Record,
    private val _context: Context,
    /**
     * the node which aggregates this container
     */
    override val node: DeploymentNode,
    private val _record: Record = __record.normalizeCamelcase()
): DeploymentComponentRecord(__record, _context,node), Container, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The image_name of this container.
     */
    override val imageName: String
        get() = getOrThrow("imageName") {
            name
        }

    /**
     * The container_registry of this container.
     */
    override val containerRegistry: String
        get() = getOrThrow("containerRegistry") {
            ""
        }

    /**
     * The image_tag of this container.
     */
    override val imageTag: String
        get() = getOrThrow("imageTag") {
            "latest"
        }

    /**
     * The image of this container.
     */
    override val image: String
        get() = (if (containerRegistry.isNullOrEmpty()) "" else containerRegistry + "/") + "$imageName:$imageTag"

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(records: RecordList, _context: Context, node: DeploymentNode) = records
            .mergeWithKeys("name")
            .map {
                ContainerRecord(it, _context, node = node)
            }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerRecord) return false
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
        return "ContainerRecord(" +
            "node=$node, " +
            "name=$name" +
        ")"
    }
}