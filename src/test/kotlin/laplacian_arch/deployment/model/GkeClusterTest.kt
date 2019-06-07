package laplacian_arch.deployment.model

import laplacian_arch.deployment.DeploymentModelTestContext
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class GkeClusterTest {

    companion object {
        val DEPLOYMENT_ENVIRONMENT_EXAMPLE = """
        |deployment_environments:
        |- name: prod
        |  nodes:
        |  - name: main_cluster
        |    type: gke_cluster
        |    number_of_nodes: 3
        |    components:
        |    - name: postgres
        |      type: container
        """.trimMargin()
    }

    @Test
    fun `each properties of a gke_cluster model returns the appropriate value`() {
        val context = DeploymentModelTestContext().models(
        DEPLOYMENT_ENVIRONMENT_EXAMPLE,
        """
        |deployment_environments:
        |- name: prod
        |  nodes:
        |  - name: main_cluster
        |    type: gke_cluster
        |    number_of_nodes: 3
        """.trimMargin())
        val model = context
            .deploymentEnvironments[0]
            .nodes[0]
            as GkeCluster

        assertAll(
            { assertEquals(3, model.numberOfNodes) }
        )
    }

}