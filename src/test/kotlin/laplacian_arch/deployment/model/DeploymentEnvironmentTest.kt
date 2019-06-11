package laplacian_arch.deployment.model

import laplacian_arch.deployment.DeploymentModelTestContext
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class DeploymentEnvironmentTest {


    @Test
    fun `each properties of a deployment_environment model returns the appropriate value`() {
        val context = DeploymentModelTestContext().models(
        """
        |deployment_environments:
        |- name: prod
        |  nodes:
        |  - name: main_cluster
        |    type: gke_cluster
        |    number_of_nodes: 3
        |    components:
        |    - name: postgres
        |      type: container
        """.trimMargin())
        val model = context
            .deploymentEnvironments.find {
                it.name == "prod"
            }!!
            as DeploymentEnvironment

        assertAll(
            { assertEquals("prod", model.name) }
        )
    }
}