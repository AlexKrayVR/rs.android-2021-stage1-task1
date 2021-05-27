package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var summ: Int = 0
        for (i in bill.indices) {
            if (i == k) {
                continue
            }
            summ += bill[i]
        }
        summ /= 2
        if (summ == b) {
            return ("Bon Appetit")
        } else {
            return "" + (b - summ)
        }
    }
}
