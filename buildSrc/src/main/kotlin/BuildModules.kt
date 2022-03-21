
/**
 * Configuration of all gradle build plugins
 */
object BuildModules {
    const val APP = ":app"
    const val CORE = ":core"
    const val COMMONS = ":commons"

    object Features {
        const val HOME = ":features:home"
        const val PLAYER_DETAIL = ":features:player_detail"
    }
}
