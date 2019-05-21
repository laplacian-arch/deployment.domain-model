package laplacian_arch.deployment.model
import com.github.jknack.handlebars.Context

import laplacian.util.*

/**
 * A container for records of acme
 */
class AcmeList(
    list: List<Acme>,
    val context: Context
) : List<Acme> by list {
}