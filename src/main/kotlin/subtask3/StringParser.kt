package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var arrayString = mutableListOf<String>()
        var coincidence = 0
        for (i in inputString.indices) {
            coincidence = 0
            if (inputString[i] == '<') {
                for (j in i until inputString.length) {
                    if (inputString[j] == '<') {
                        coincidence++
                    }
                    if (inputString[j] == '>') {
                        coincidence--
                        if (coincidence == 0) {
                            arrayString.add(inputString.substring(i + 1, j))
                            break
                        }
                    }
                }
            }
            coincidence = 0
            if (inputString[i] == '(') {
                for (j in i until inputString.length) {
                    if (inputString[j] == '(') {
                        coincidence++
                    }
                    if (inputString[j] == ')') {
                        coincidence--
                        if (coincidence == 0) {
                            arrayString.add(inputString.substring(i + 1, j))
                            break
                        }
                    }
                }
            }
            coincidence = 0
            if (inputString[i] == '[') {
                for (j in i until inputString.length) {
                    if (inputString[j] == '[') {
                        coincidence++
                    }
                    if (inputString[j] == ']') {
                        coincidence--
                        if (coincidence == 0) {
                            arrayString.add(inputString.substring(i + 1, j))
                            break
                        }
                    }
                }
            }
        }
        return arrayString.toTypedArray()
    }

}
