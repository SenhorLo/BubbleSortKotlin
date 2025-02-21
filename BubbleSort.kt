fun bubbleSort (arr: IntArray) {

    val i = arr.size
    var swapped = Boolean

    do {
        swapped = false

        for ( n in 0 until i - 1) {
            if (arr[n] > arr[n + 1]) {
                val temp = arr[n]
                arr[n] = arr[ n + 1]
                arr[ n + 1] = temp
                swapped = true
            }
        }
    } 
} while(swapped)

fun main () {
    val arr = intArrayOf(3,6,765,24,3,66,4567,23,4,56,43,5)
    bubbleSort(arr)
    println("Array organizada: ${arr.joinToString()}")
}