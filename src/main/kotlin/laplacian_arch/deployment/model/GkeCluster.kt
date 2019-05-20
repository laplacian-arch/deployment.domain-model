package laplacian_arch.deployment.model


import laplacian.util.*

/**
 * gke_cluster
 */
interface GkeCluster : DeploymentNode {
    /**
     * The number_of_nodes of this gke_cluster.
     */
    val numberOfNodes: Int
}