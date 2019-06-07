package laplacian_arch.deployment.model

import laplacian_arch.deployment.DeploymentModelTestContext
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class ContainerTest {

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
    fun `each properties of a container model returns the appropriate value`() {
        val context = DeploymentModelTestContext().models(
        DEPLOYMENT_ENVIRONMENT_EXAMPLE,
        """
        |deployment_environments:
        |- name: prod
        |  nodes:
        |  - name: main_cluster
        |    components:
        |    - name: postgres
        |      type: container
        """.trimMargin())
        val model = context
            .deploymentEnvironments[0]
            .nodes[0]
            .components[0]
            as Container

        assertAll(
            { assertEquals("postgres", model.imageName) },
            { assertEquals("", model.containerRegistry) },
            { assertEquals("latest", model.imageTag) },
            { assertEquals("postgres:latest", model.image) }
        )
    }
    @Test
    fun `each properties of a container model returns the appropriate value - alternative case 1`() {
        val context = DeploymentModelTestContext().models(
        DEPLOYMENT_ENVIRONMENT_EXAMPLE,
        """
        |deployment_environments:
        |- name: prod
        |  nodes:
        |  - name: main_cluster
        |    components:
        |    - name: pv-container
        |      type: container
        |      container_registry: gcr.io
        |      image_name: google_containers/volume-nfs
        |      image_tag: 0.8
        """.trimMargin())
        val model = context
            .deploymentEnvironments[0]
            .nodes[0]
            .components[0]
            as Container

        assertAll(
            { assertEquals("postgres", model.imageName) },
            { assertEquals("", model.containerRegistry) },
            { assertEquals("latest", model.imageTag) },
            { assertEquals("postgres:latest", model.image) }
        )
    }

}