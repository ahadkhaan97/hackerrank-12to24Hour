fun main() {
    print(timeConversion("12:00:00PM"))
}

fun timeConversion(s: String): String {
    var time = ""
    val temp = s.split(":")
    if (s.contains("AM")) {
        time += if (temp[0].toInt() == 12) {
            "00"
        } else {
            temp[0]
        }
    } else {
        if (temp[0].toInt() == 12) {
            time += "12"
        } else {
            time += temp[0].toInt() + 12
        }
    }

    time += ":${temp[1]}:${temp[2]}"
    time = time.substring(0, time.length - 2)

    return time
}