fun main() {
    println("Willkommen beim einfachen Rechner!")
    while (true) {
        println("Bitte gib eine Rechnung im Format 'Zahl1 Operator Zahl2' ein (oder 'exit' zum Beenden):")
        val input = readLine() ?: break
        if (input.lowercase() == "exit") break

        val parts = input.split(" ")
        if (parts.size != 3) {
            println("Ungültiges Format. Bitte versuche es erneut.")
            continue
        }

        val num1 = parts[0].toDoubleOrNull()
        val operator = parts[1]
        val num2 = parts[2].toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Ungültige Zahlen. Bitte versuche es erneut.")
            continue
        }

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) num1 / num2 else "Division durch Null ist nicht erlaubt."
            }
            else -> "Unbekannter Operator."
        }

        println("Ergebnis: $result")
    }
    println("Programm beendet.")
}
