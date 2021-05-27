package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val arrayListResult = mutableListOf<Int>()
        val arrayListTemp = sadArray.toMutableList()
        var flag = true
        while (true) {
            for ((index, item) in arrayListTemp.withIndex()) {
                if ((index == 0) || (index == arrayListTemp.size - 1)) {
                    arrayListResult.add(item)
                    continue
                }
                if (arrayListTemp[index - 1] + arrayListTemp[index + 1] >= arrayListTemp[index]) {
                    arrayListResult.add(item)
                } else {
                    flag = false
                }
            }
            if (flag) {
                return arrayListResult.toIntArray()
            } else {
                flag = true
            }
            arrayListTemp.clear()
            arrayListTemp.addAll(arrayListResult)
            arrayListResult.clear()
        }
    }

}
