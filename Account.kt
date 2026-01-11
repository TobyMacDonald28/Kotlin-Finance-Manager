enum class AccType {
    Savings,
    Current,
    Student
}

interface Account {
    val accName: String
    val accType: AccType
    val freeze: Boolean

    fun currentBalance(): Double

    fun updateBalance(change: Double)
}

class StudentAccount(
    override val accName: String,
    private var balance: Double,
    override val freeze: Boolean = false
) : Account {

    override val accType = AccType.Student

    override fun updateBalance(change: Double) {
        balance += change
    }

    override fun currentBalance(): Double = balance
}
