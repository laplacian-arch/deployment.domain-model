package laplacian_arch.deployment.record
import com.github.jknack.handlebars.Context
import laplacian.gradle.task.generate.model.Project
import laplacian_arch.deployment.model.Acme
import laplacian_arch.deployment.model.AcmeList
import laplacian.util.*
/**
 * acme
 */
data class AcmeRecord (
    private val __record: Record,
    private val _context: Context,
    private val _record: Record = __record.normalizeCamelcase()
): Acme, Record by _record {
    /**
     * The laplacian module project definition.
     */
    private val project: Project
        get() = _context.get("project") as Project


    /**
     * The name of this acme.
     */
    override val name: String
        get() = getOrThrow("name")

    /**
     * The provider of this acme.
     */
    override val provider: String
        get() = getOrThrow("provider") {
            "letsencrypt"
        }

    /**
     * The email of this acme.
     */
    override val email: String
        get() = getOrThrow("email")

    /**
     * The api_key of this acme.
     */
    override val apiKey: String
        get() = getOrThrow("apiKey")

    companion object {
        /**
         * creates record list from list of map
         */
        fun from(_context: Context): AcmeList {
            return _context.get("acmes") as AcmeList
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcmeRecord) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        return result
    }

    override fun toString(): String {
        return "AcmeRecord(" +
            "name=$name" +
        ")"
    }
}