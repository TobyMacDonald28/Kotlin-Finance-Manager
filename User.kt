data class User(
     private var username: String,
     private var password: String,
     private val accounts: MutableList<Account> = mutableListOf()
) {
    override fun toString() = "Username: $username"

    fun changePassword(){
    }
    fun accessAccount(){}
}