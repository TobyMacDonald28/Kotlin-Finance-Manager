//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner
fun main() {
    val user = makeUser()

}

fun makeUser(): User{
    var password1 = ""
    var password2 = "!"
    val scanner = Scanner(System.`in`)
    println("Please Make an Account")
    println("Please Enter a Username: ")
    val username = scanner.next()
    while (password1 != password2) {
        println("Please Enter a Password: ")
        password1 = scanner.next()
        println("Please Re-enter Password: ")
        password2 = scanner.next()
        if (password1 == "userchange" || password2 == "userchange") {
            return makeUser()
        }
    }
    return User(username, password1)
}
