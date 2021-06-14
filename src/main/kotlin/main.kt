
const val MIN_AMOUNT_DISC1 = 1_000
const val MIN_AMOUNT_DISC2 = 10_000
const val STANDART_DISC = 100
const val SUPER_DISC = 0.95
const val REGULAR_DISC = 0.99

fun main() {

    print("Введите сумму ваших покупок (руб): ")
    val amount = readLine()!!.toInt()

    print("Вы постоянный покупатель? (Да Нет): ")
    val str = readLine()

    val regularCustomer : Boolean = str == "Да"

    val regularDisc : Double = if (regularCustomer) REGULAR_DISC else 1.0

    val result : Double = if (amount <= MIN_AMOUNT_DISC1){
                            amount.toDouble() * regularDisc
                          } else if (amount <= MIN_AMOUNT_DISC2){
                            (amount - STANDART_DISC).toDouble() * regularDisc
                          } else {
                            amount * SUPER_DISC * regularDisc
                          }

    val finishResult : Int = (result * 100).toInt() // В копейках
    print("Сумма с учетом скидок: ${finishResult / 100} рублей ${finishResult % 100} копеек")

}