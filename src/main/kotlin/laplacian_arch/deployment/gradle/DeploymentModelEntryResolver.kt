package laplacian_arch.deployment.gradle
import laplacian.gradle.task.generate.ExecutionContext
import laplacian.gradle.task.generate.ModelEntryResolver
import laplacian_arch.deployment.model.DeploymentEnvironmentList
import laplacian_arch.deployment.record.DeploymentEnvironmentRecord
import laplacian_arch.deployment.model.AcmeList
import laplacian_arch.deployment.record.AcmeRecord
import laplacian.util.*

class DeploymentModelEntryResolver: ModelEntryResolver {

    override fun resolves(key: String, model: Map<String, RecordList>): Boolean {
        return arrayOf(
            "deployment_environments",
            "acmes"
        ).any { it == key }
    }

    override fun resolve(key: String, model: Map<String, RecordList>, context: ExecutionContext): Any? {
        return when (key) {
            "deployment_environments" -> DeploymentEnvironmentList(
                model.getList<Record>("deployment_environments")
                     .mergeWithKeys("name")
                     .map{ DeploymentEnvironmentRecord(it, context.currentModel) },
                context.currentModel
            )
            "acmes" -> AcmeList(
                model.getList<Record>("acmes")
                     .mergeWithKeys("name")
                     .map{ AcmeRecord(it, context.currentModel) },
                context.currentModel
            )
            else -> throw IllegalArgumentException("Unknown key: $key")
        }
    }
}