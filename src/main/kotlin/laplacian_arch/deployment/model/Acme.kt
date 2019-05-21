package laplacian_arch.deployment.model


import laplacian.util.*

/**
 * acme
 */
interface Acme {
    /**
     * The name of this acme.
     */
    val name: String
    /**
     * The provider of this acme.
     */
    val provider: String
    /**
     * The email of this acme.
     */
    val email: String
    /**
     * The api_key of this acme.
     */
    val apiKey: String
}