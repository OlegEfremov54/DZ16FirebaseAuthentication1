package com.example.dz16firebaseauthentication1

data class Email(val title: String, val content: String) {
    companion object {
        val emailList = listOf(

            Email("Сессия заканчивается!", "Внимание! Деканат предупреждает что все не сдавшие экзамены в срок будут отчислены"),
            Email("Срочная задача", "Срочно! На кафедре закончились орешки. Белочки могут сдохнуть"),
            Email("Закупка товара", "Подтвердите данные заказа: Шампанское Новый свет - 2 бутылки, конфеты ассорти 3 упаковки")

        )
    }
}